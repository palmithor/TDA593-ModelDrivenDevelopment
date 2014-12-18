package com.bodkink.hotel.business.util;

import com.bodkink.hotel.business.model.Booking;

/**
 * @author palmithor
 * @since 13/12/14.
 */
public interface IBookingCache {

    Booking get(final String id);

    void put(final Booking booking);

    void remove(final String id);
}
