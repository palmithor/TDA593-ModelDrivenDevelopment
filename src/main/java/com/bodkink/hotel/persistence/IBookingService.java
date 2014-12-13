package com.bodkink.hotel.persistence;

import com.bodkink.hotel.persistence.model.BookingEntity;
import org.mongodb.morphia.Key;

import java.util.List;

/**
 * @author palmithor
 * @since 05/12/14.
 */
public interface IBookingService {

    Key<BookingEntity> persist(final BookingEntity booking);

    List<BookingEntity> list();

    BookingEntity find(String bookingId);
}
