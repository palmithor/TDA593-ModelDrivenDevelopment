package com.mdsd.hotel.business.logic;

import com.mdsd.hotel.persistence.dao.AddressDAO;
import com.mdsd.hotel.persistence.model.AddressEntity;
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

        AddressDAO addressDAO = mock(AddressDAO.class);
        when(addressDAO.save(anyObject())).thenReturn(new Key<>(AddressEntity.class, ObjectId.get()));
        bookingController.setAddressDAO(addressDAO);
    }

    @Test
    public void testBle() throws Exception {

    }
}