package com.mdsd.hotel.business.logic;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.model.AddressEntity;
import com.mdsd.hotel.persistence.service.AddressService;
import ninja.cache.NinjaCache;


/**
 * @author palmithor
 * @since 02/12/14.
 */
@Singleton
public class BookingController {

    NinjaCache bookingCache;

    AddressService addressService;

    public void ble() {
        addressService.save(new AddressEntity("123", "123", "123", "123", "123"));
    }

    @Inject
    public void setBookingCache(final NinjaCache bookingCache) {
        this.bookingCache = bookingCache;
    }

    @Inject
    public void setAddressService(final AddressService addressService) {
        this.addressService = addressService;
    }

}
