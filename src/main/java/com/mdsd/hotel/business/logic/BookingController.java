package com.mdsd.hotel.business.logic;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.dao.AddressDAO;
import com.mdsd.hotel.persistence.model.AddressEntity;
import ninja.cache.NinjaCache;


/**
 * @author palmithor
 * @since 02/12/14.
 */
@Singleton
public class BookingController {

    NinjaCache bookingCache;

    AddressDAO addressDAO;

    public void ble() {
        addressDAO.save(new AddressEntity("123", "123", "123", "123", "123"));
    }

    @Inject
    public void setBookingCache(final NinjaCache bookingCache) {
        this.bookingCache = bookingCache;
    }

    @Inject
    public void setAddressDAO(final AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }

}
