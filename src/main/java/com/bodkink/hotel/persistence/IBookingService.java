package com.bodkink.hotel.persistence;

import com.bodkink.hotel.persistence.model.BookingEntity;
import org.mongodb.morphia.Key;

/**
 * @author palmithor
 * @since 05/12/14.
 */
public interface IBookingService {

    Key<BookingEntity> persistBooking(final BookingEntity booking);
}
