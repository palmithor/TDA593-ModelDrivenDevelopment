package com.mdsd.hotel.business.logic;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.service.AddressService;
import com.mdsd.hotel.persistence.service.RoomService;
import ninja.cache.NinjaCache;


/**
 * @author palmithor
 * @since 02/12/14.
 */
@Singleton
public class BookingController implements IBookingController {

    @Inject
    NinjaCache bookingCache;

    @Inject
    AddressService addressService;

    @Inject
    RoomService roomService;

    public void ble() {
        addressService.createAddress("123", "123", "123", "123", "123");
        roomService.createRoom();
    }
}
