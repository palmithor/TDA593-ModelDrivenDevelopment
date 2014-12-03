package com.mdsd.hotel.business.logic;

import com.mdsd.hotel.persistence.model.AddressEntity;
import com.mdsd.hotel.persistence.service.AddressService;
import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import org.mongodb.morphia.Key;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookingControllerTest {

    private BookingController bookingController;

    @Before
    public void before() {
        bookingController = new BookingController();

        AddressService addressService = mock(AddressService.class);
        when(addressService.save(anyObject())).thenReturn(new Key<>(AddressEntity.class, ObjectId.get()));
        bookingController.setAddressService(addressService);
    }

    @Test
    public void testBle() throws Exception {

    }
}