package com.bodkink.hotel.presentation.controllers;

import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.IRoomManagement;
import com.bodkink.hotel.business.IServiceManagement;
import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.Receipt;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.Service;
import com.bodkink.hotel.presentation.message.BookingMessage;
import com.bodkink.hotel.presentation.message.BookingRequest;
import com.bodkink.hotel.presentation.message.ReceiptMessage;
import com.bodkink.hotel.presentation.message.ServiceMessage;
import com.bodkink.hotel.util.MessageToModelConverter;
import com.bodkink.hotel.util.ModelToMessageConverter;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import ninja.Result;
import ninja.Results;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * @author palmithor
 * @since 13/12/14.
 */
@Singleton
public class BookingController {

    @Inject
    IBookingManagement bookingManagement;

    @Inject
    IRoomManagement roomManagement;

    @Inject
    IServiceManagement serviceManagement;


    public Result create(final BookingRequest bookingRequest) {
        EList<Room> rooms = new BasicEList<>();
        bookingRequest.getRooms().forEach(room -> {
            rooms.add(roomManagement.findRoom(room.getId()));
        });

        EList<Service> services = new BasicEList<>();
        EList<Service> savedServices = serviceManagement.listServices();
        if (bookingRequest.getServices() != null) {
            bookingRequest.getServices().forEach(service -> {
                services.add(getService(savedServices, service));
            });
        }

        Booking b = bookingManagement.create(bookingRequest.getStart(), bookingRequest.getEnd(), rooms,
                services, MessageToModelConverter.convertCustomer(bookingRequest.getCustomer()));
        if (b != null) {
            return Results.json().render(ModelToMessageConverter.convertBooking(b));
        } else {
            return Results.forbidden().json().renderRaw("".getBytes());
        }
    }

    private Service getService(final EList<Service> services, final ServiceMessage service) {
        for (Service s : services) {
            if (s.getId().equals(service.getId())) {
                return MessageToModelConverter.convertService(service);
            }
        }
        return null;
    }

    public Result confirm(final BookingMessage bookingMessage) {
        Receipt r = bookingManagement.confirmAndPay(MessageToModelConverter.convertBooking(bookingMessage));
        if (r == null) {
            return Results.forbidden().json().renderRaw("".getBytes());
        }
        ReceiptMessage receipt = ModelToMessageConverter.convertReceipt(r);

        return Results.json().render(receipt);
    }

}
