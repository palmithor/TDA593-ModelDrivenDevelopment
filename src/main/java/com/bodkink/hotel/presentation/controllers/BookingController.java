package com.bodkink.hotel.presentation.controllers;

import com.bodkink.hotel.business.IBookingManagement;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * @author palmithor
 * @since 13/12/14.
 */
@Singleton
public class BookingController {

    @Inject
    IBookingManagement bookingManagement;

}
