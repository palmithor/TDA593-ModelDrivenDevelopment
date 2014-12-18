package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.*;
import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.business.util.BookingCache;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.persistence.IBookingService;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.test.DBTestDataMock;
import com.bodkink.hotel.test.ModelTestDataMock;
import org.bson.types.ObjectId;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class GuestManagementImplTest {

    @Mock
    IRoomReservationManagement roomReservationMock;
    @Mock
    IRoomManagement roomManagementMock;
    @Mock
    IBookingService bookingServiceMock;
    @Mock
    IBillingManagement billingManagementMock;
    @Mock
    Booking bookingMock;

    Booking booking;

    IGuestManagement guestManagement;

    List<RoomEntity> roomEntities = DBTestDataMock.getRoomEntities();
    List<Room> rooms;
    Customer customer = ModelTestDataMock.getCustomer();

    IBookingManagement bookingManagement;

    @Before
    public void setUp() throws Exception {
        setUpBooking();
        // Setup guest management.
        guestManagement = LogicFactory.eINSTANCE.createGuestManagement();
        ((GuestManagementImpl) guestManagement).billManager = billingManagementMock;
    }

    private void setUpBooking(){
        bookingManagement = LogicFactory.eINSTANCE.createBookingManagement();

        rooms = new BasicEList<>();
        roomEntities.forEach(entity -> {
            rooms.add(EntityToModelConverter.convertRoom(entity));
        });
        ((BookingManagementImpl) bookingManagement).roomReservationManagement = roomReservationMock;

        when(roomReservationMock.create(anyObject(), anyObject(), anyObject(), anyObject()))
                .thenReturn(ModelFactory.eINSTANCE.createRoomReservation());
        when(roomReservationMock.isAvailable(anyObject(), anyObject(), anyObject())).thenReturn(Boolean.TRUE);
        ((BookingManagementImpl) bookingManagement).roomManagement = roomManagementMock;
        ((BookingManagementImpl) bookingManagement).bookingService = bookingServiceMock;


        ((BookingManagementImpl) bookingManagement).bookingCache = new BookingCache();
        EList<Room> bookedRooms = new BasicEList<>();
        bookedRooms.add(rooms.get(0));
        bookedRooms.add(rooms.get(1));



        booking = bookingManagement.create(DBTestDataMock.dateIntervalAllAvailable.getStart(), DBTestDataMock.dateIntervalAllAvailable.getEnd(),
                bookedRooms, null, customer);
    }

    private Booking setUpBooking2(){
        Booking booking = ModelFactory.eINSTANCE.createBooking();
        booking.setId("testBooking1");

       // booking.getRoomReservation() = new BasicEList<>();


        RoomReservation roomReservation = ModelFactory.eINSTANCE.createRoomReservation();
        roomReservation.setStartDate(null);
        roomReservation.setEndDate(null);
        roomReservation.setRoom(null);
        roomReservation.setReservationStatusEnum(ReservationStatusEnum.RESERVED);
        roomReservation.setRoomReservationType(RoomReservationType.BOOKING);
        booking.getRoomReservation().add(roomReservation);

        roomReservation = ModelFactory.eINSTANCE.createRoomReservation();
        roomReservation.setReservationStatusEnum(ReservationStatusEnum.RESERVED);
        roomReservation.setRoomReservationType(RoomReservationType.BOOKING);
        Room room;

        booking.getRoomReservation().add(roomReservation);


        return booking;
    }

    public void tearDown() throws Exception {

    }

    // checkOut(Booking booking)
    @Test
    public void testCheckOutNotCheckedIn() throws Exception {
        // make sure that the payment is successful.
        when(billingManagementMock.makePayment(anyObject())).thenReturn(true);
        //assertTrue(guestManagement.checkOut(booking));

        assertThat(guestManagement.checkOut(booking),is(false));
    }

    @Test
    public void testCheckOutCheckedIn() throws Exception {
        // make sure that the payment is successful.
        when(billingManagementMock.makePayment(anyObject())).thenReturn(true);
        //assertTrue(guestManagement.checkOut(booking));

       // when(bookingMock.)

       // assertThat(guestManagement.checkOut(booking),is(true));
    }

    //checkOut(RoomReservation reservation)
    @Test
    public void testCheckOut1() throws Exception {

    }

    @Test
    public void testCheckIn() throws Exception {


    }
}