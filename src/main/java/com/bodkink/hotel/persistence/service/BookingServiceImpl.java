package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.persistence.IBookingService;
import com.bodkink.hotel.persistence.dao.*;
import com.bodkink.hotel.persistence.model.BookingEntity;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.mongodb.morphia.Key;

import java.util.List;

/**
 * @author palmithor
 * @since 05/12/14.
 */
@Singleton
public class BookingServiceImpl implements IBookingService {

    @Inject
    BookingDAO bookingDAO;

    @Inject
    RoomReservationDAO roomReservationDAO;

    @Inject
    CustomerDAO customerDAO;

    @Inject
    BookingBillDAO bookingBillDAO;

    @Inject
    CardInformationDAO cardInformationDAO;

    @Inject
    AddressDAO addressDAO;

    @Override
    public Key<BookingEntity> persist(final BookingEntity booking) {
        booking.getRoomReservations().forEach(roomReservationDAO::save);

        booking.getBookingBills().forEach(bookingBillDAO::save);

        persistCustomer(booking);

        return bookingDAO.save(booking);
    }

    @Override
    public List<BookingEntity> list() {
        return bookingDAO.find().asList();
    }

    private void persistCustomer(BookingEntity booking) {
        if (booking.getCustomer().getId() == null) {
            if (booking.getCustomer().getCardInformation() != null) {
                addressDAO.save(booking.getCustomer().getCardInformation().getAddress());
                cardInformationDAO.save(booking.getCustomer().getCardInformation());
            }
            customerDAO.save(booking.getCustomer());
        }

    }

}
