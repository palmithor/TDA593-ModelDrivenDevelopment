package com.bodkink.hotel.persistence;

import com.bodkink.hotel.persistence.model.BookingEntity;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;

import java.util.List;

/**
 * @author palmithor
 * @since 05/12/14.
 */
public interface IBookingService {

    BookingEntity persist(final BookingEntity booking);

    List<BookingEntity> list();

    BookingEntity find(String bookingId);

    List<BookingEntity> findByRoomReservation(List<RoomReservationEntity> roomReservations);
}
