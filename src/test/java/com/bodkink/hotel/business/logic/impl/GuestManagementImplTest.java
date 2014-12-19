package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.IBillingManagement;
import com.bodkink.hotel.business.IGuestManagement;
import com.bodkink.hotel.business.IRoomManagement;
import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.persistence.IBookingService;
import com.bodkink.hotel.test.ModelTestDataMock;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.*;


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
    @Mock
    RoomReservation reservationMock;
    @Mock
    Guest guest;
    @Mock
    Customer cutomerMock;
    @Mock
    RoomReservation reservation1;
    @Mock
    RoomReservation reservation2;

    IGuestManagement guestManagement;
    Customer customer = ModelTestDataMock.getCustomer();

    @Before
    public void setUp() throws Exception {
        // Setup guest management.
        guestManagement = LogicFactory.eINSTANCE.createGuestManagement();
        ((GuestManagementImpl) guestManagement).billManager = billingManagementMock;
    }

    private Guest setupGuests(String id, String firstname, String surName){
        Guest guest =  ModelFactory.eINSTANCE.createGuest();
        guest.setFirstName(firstname);
        guest.setSurname(surName);
        guest.setId(id);
        return guest;
    }

    public void tearDown() throws Exception {
    }

    private EList<RoomReservation> setupRoomReservations1(){
        EList<RoomReservation> reservations = new BasicEList();
        EList<Guest> guests = new BasicEList();

        Guest guest1 = mock(Guest.class);
        when(guest1.getId()).thenReturn("5");
        Guest guest2 = mock(Guest.class);
        when(guest2.getId()).thenReturn("1");

        guests.add(guest1);
        guests.add(guest2);

        when(reservation1.getReservationStatusEnum()).thenReturn(ReservationStatusEnum.CHECKED_OUT);

        when(reservation1.getGuest()).thenReturn(guests);
        when(reservation1.getReservationStatusEnum()).thenReturn(ReservationStatusEnum.CHECKED_OUT);
        when(reservation2.getGuest()).thenReturn(guests);

        reservations.add(reservation1);
        reservations.add(reservation2);

        return reservations;
    }

    private EList<RoomReservation> setupRoomReservations2(){
        EList<RoomReservation> reservations = new BasicEList();
        EList<Guest> guests = new BasicEList();

        Guest guest1 = mock(Guest.class);
        when(guest1.getId()).thenReturn("5");
        Guest guest2 = mock(Guest.class);
        when(guest2.getId()).thenReturn("1");

        guests.add(guest1);
        guests.add(guest2);

        when(reservation1.getReservationStatusEnum()).thenReturn(ReservationStatusEnum.CHECKED_OUT);

        when(reservation1.getGuest()).thenReturn(guests);
        when(reservation2.getReservationStatusEnum()).thenReturn(ReservationStatusEnum.CHECKED_IN);
        when(reservation2.getGuest()).thenReturn(guests);

        reservations.add(reservation1);
        reservations.add(reservation2);

        return reservations;
    }

    // checkOut(Booking booking)
    @Test
    public void testCheckOutNotCheckedIn() throws Exception {
        // make sure that the payment is successful.
        when(billingManagementMock.makePayment(anyObject())).thenReturn(true);
        when(bookingMock.getCustomer()).thenReturn(cutomerMock);
        EList reservationListMock = setupRoomReservations1();
        when(bookingMock.getRoomReservation()).thenReturn(reservationListMock);

        when(bookingMock.getCustomer()).thenReturn(cutomerMock);
        when(cutomerMock.getId()).thenReturn("1");

        assertThat(guestManagement.checkOut(bookingMock), is(false));
    }

    @Test
    public void testCheckOutCheckedIn() throws Exception {
        // make sure that the payment is successful.
        when(billingManagementMock.makePayment(anyObject())).thenReturn(true);
        when(bookingMock.getCustomer()).thenReturn(cutomerMock);
        EList reservationListMock = setupRoomReservations2();
        when(bookingMock.getRoomReservation()).thenReturn(reservationListMock);

        when(bookingMock.getCustomer()).thenReturn(cutomerMock);
        when(cutomerMock.getId()).thenReturn("1");

        assertThat(guestManagement.checkOut(bookingMock), is(true));
        verify(reservation2).setReservationStatusEnum(ReservationStatusEnum.CHECKED_OUT);
        assertTrue(reservation2.getGuest().isEmpty());
    }

    @Test
    public void testCheckOutPaymentFailure() throws Exception {
        when(billingManagementMock.makePayment(anyObject())).thenReturn(false);
        when(bookingMock.getCustomer()).thenReturn(cutomerMock);
        EList reservationListMock = setupRoomReservations2();
        when(bookingMock.getRoomReservation()).thenReturn(reservationListMock);

        when(bookingMock.getCustomer()).thenReturn(cutomerMock);
        when(cutomerMock.getId()).thenReturn("1");

        assertThat(guestManagement.checkOut(bookingMock), is(false));
    }

    @Test
    public void testCheckOutRoomReservation() throws Exception {
        when(reservationMock.getReservationStatusEnum()).thenReturn(ReservationStatusEnum.CHECKED_IN);
        when(reservationMock.getGuest()).thenReturn(mock(BasicEList.class));
        assertThat(guestManagement.checkOut(reservationMock), is(true));
        verify(reservationMock).setReservationStatusEnum(ReservationStatusEnum.CHECKED_OUT);
        verify(reservationMock.getGuest()).clear();
    }

    @Test
    public void testCheckInRoomReservation() throws Exception {
        when(reservationMock.getReservationStatusEnum()).thenReturn(ReservationStatusEnum.CHECKED_OUT);
        when(reservationMock.getGuest()).thenReturn(mock(BasicEList.class));
        assertThat(guestManagement.checkIn(reservationMock, guest), is(true));
        verify(reservationMock).setReservationStatusEnum(ReservationStatusEnum.CHECKED_IN);
        verify(reservationMock.getGuest()).add(guest);
    }
}