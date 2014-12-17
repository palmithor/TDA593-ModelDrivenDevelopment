package com.bodkink.hotel.presentation.controllers;

import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.persistence.dao.RoomDAO;
import com.bodkink.hotel.persistence.dao.ServiceDAO;
import com.bodkink.hotel.presentation.message.AddressMessage;
import com.bodkink.hotel.presentation.message.BookingRequest;
import com.bodkink.hotel.presentation.message.CardInformationMessage;
import com.bodkink.hotel.presentation.message.CustomerMessage;
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

    public Result post(final BookingRequest bookingRequest) {
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
                services, convertCustomer(bookingRequest.getCustomer()));
        return Results.text().render("WoooHoo");
    }

    public Customer convertCustomer(CustomerMessage customerMessage) {
        Customer customer = ModelFactory.eINSTANCE.createCustomer();
        customer.setId(customerMessage.getId() != null ? customerMessage.getId().toString() : null);
        customer.setFirstName(customerMessage.getFirstName());
        customer.setSurname(customerMessage.getLastName());
        customer.setEmail(customerMessage.getEmail());
        customer.setCardInformation(convertCardInformation(customerMessage.getCardInformation()));
        customer.setPhone(customerMessage.getPhone());
        customer.setBirthYear(customerMessage.getBirthYear());
        return customer;
    }

    public CardInformation convertCardInformation(CardInformationMessage cardInformationMessage) {
        CardInformation cardInformation = ModelFactory.eINSTANCE.createCardInformation();
        cardInformation.setId(cardInformationMessage.getId() != null ? cardInformationMessage.getId().toString() : null);
        cardInformation.setCcNumber(cardInformationMessage.getCcNumber());
        cardInformation.setCcv(cardInformationMessage.getCcv());
        cardInformation.setExpiryMonth(cardInformationMessage.getExpiryMonth());
        cardInformation.setExpiryYear(cardInformationMessage.getExpiryYear());
        cardInformation.setFirstName(cardInformationMessage.getFirstName());
        cardInformation.setLastName(cardInformationMessage.getLastName());
        cardInformation.setAddress(convertAddress(cardInformationMessage.getAddress()));

        return cardInformation;
    }

    public Address convertAddress(AddressMessage addressMessage) {
        Address a = ModelFactory.eINSTANCE.createAddress();
        a.setCountry(addressMessage.getCountry());
        a.setAddressLine1(addressMessage.getAddressLine1());
        a.setAddressLine2(addressMessage.getAddressLine2());
        a.setZipCode(addressMessage.getZipCode());
        a.setCity(addressMessage.getCity());
        a.setCountry(addressMessage.getCountry());
        return a;
    }
}
