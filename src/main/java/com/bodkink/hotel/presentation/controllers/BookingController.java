package com.bodkink.hotel.presentation.controllers;

import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.Receipt;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.Service;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.persistence.dao.RoomDAO;
import com.bodkink.hotel.persistence.dao.ServiceDAO;
import com.bodkink.hotel.presentation.message.BookingMessage;
import com.bodkink.hotel.presentation.message.BookingRequest;
import com.bodkink.hotel.util.MessageToModelConverter;
import com.bodkink.hotel.util.ModelToMessageConverter;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import ninja.Result;
import ninja.Results;
import org.bson.types.ObjectId;
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
    RoomDAO roomDAO;

    @Inject
    ServiceDAO serviceDAO;

    public Result create(final BookingRequest bookingRequest) {
        EList<Room> rooms = new BasicEList<>();
        bookingRequest.getRooms().forEach(room -> {
            rooms.add(EntityToModelConverter.convertRoom(roomDAO.get(new ObjectId(room.getId()))));
        });

        EList<Service> services = new BasicEList<>();
        if (bookingRequest.getServices() != null) {
            bookingRequest.getServices().forEach(service -> {
                services.add(EntityToModelConverter.convertService(serviceDAO.get(new ObjectId(service.getId()))));
            });
        }

        Booking b = bookingManagement.create(bookingRequest.getStart(), bookingRequest.getEnd(), rooms,
                services, MessageToModelConverter.convertCustomer(bookingRequest.getCustomer()));
        if (b != null) {
            return Results.json().render(ModelToMessageConverter.convertBooking(b));
        } else {
            return Results.json().status(403);
        }
    }

    public Result confirm(final BookingMessage bookingMessage) {
        Receipt r = bookingManagement.confirmAndPay(MessageToModelConverter.convertBooking(bookingMessage));
        return Results.json().render(ModelToMessageConverter.convertReceipt(r));
    }

}
