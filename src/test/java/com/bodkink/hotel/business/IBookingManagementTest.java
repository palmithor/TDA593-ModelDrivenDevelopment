package com.bodkink.hotel.business;

import com.bodkink.hotel.persistence.IBookingService;
import com.bodkink.hotel.persistence.model.BookingEntity;
import com.bodkink.hotel.persistence.service.BookingServiceImpl;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class IBookingManagementTest {

    IBookingService bookingService;

    List<BookingEntity> bookingList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        bookingService = mock(BookingServiceImpl.class);

        /*when(bookingService.persistBooking(anyObject())).then(new Answer<Key<BookingEntity>>() {
            @Override
            public Key<BookingEntity> answer(InvocationOnMock invocation) throws Throwable {
                Object[] args = invocation.getArguments();

                BookingEntity bookingEntity = (BookingEntity) args[0];
                BookingEntity newEntity = new BookingEntity(ObjectId.get(), )
                bookingList.add(bookingEntity);
            }
        });*/

    }

}