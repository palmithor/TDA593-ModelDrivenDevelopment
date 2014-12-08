package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.persistence.IBookingService;
import com.bodkink.hotel.persistence.dao.BookingBillDAO;
import com.bodkink.hotel.persistence.dao.BookingDAO;
import com.bodkink.hotel.persistence.dao.RoomReservationDAO;
import com.bodkink.hotel.persistence.model.BookingEntity;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.mongodb.morphia.Key;

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
    BookingBillDAO bookingBillDAO;

    @Override
    public Key<BookingEntity> persistBooking(final BookingEntity booking) {
        booking.getRoomReservations().forEach(roomReservationDAO::save);

        booking.getBookingBills().forEach(bookingBillDAO::save);

        return bookingDAO.save(booking);
    }
}
