package com.mdsd.hotel.persistence.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.IBookingService;
import com.mdsd.hotel.persistence.dao.BookingBillDAO;
import com.mdsd.hotel.persistence.dao.BookingDAO;
import com.mdsd.hotel.persistence.dao.RoomReservationDAO;
import com.mdsd.hotel.persistence.model.BookingEntity;
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
