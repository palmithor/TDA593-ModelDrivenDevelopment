package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.IRoomManagement;
import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.persistence.IBookingService;
import com.bodkink.hotel.persistence.model.BookingEntity;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.test.DBTestDataMock;
import com.bodkink.hotel.test.ModelTestDataMock;
import ninja.cache.CacheEhCacheImpl;
import ninja.cache.NinjaCache;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookingManagementImplTest {


    @Mock
    IRoomReservationManagement roomReservationMock;

    @Mock
    IRoomManagement roomManagementMock;

    @Mock
    IBookingService bookingServiceMock;

    List<RoomEntity> roomEntities = DBTestDataMock.getRoomEntities();
    List<Room> rooms;
    Customer customer = ModelTestDataMock.getCustomer();
    IBookingManagement bookingManagement;

    @Before
    public void setUp() throws Exception {
        bookingManagement = LogicFactory.eINSTANCE.createBookingManagement();

        rooms = new BasicEList<>();
        roomEntities.forEach(entity -> {
            rooms.add(EntityToModelConverter.convertRoom(entity));
        });

        ((BookingManagementImpl) bookingManagement).roomReservationManagement = roomReservationMock;
        ((BookingManagementImpl) bookingManagement).roomManagement = roomManagementMock;
        ((BookingManagementImpl) bookingManagement).bookingService = bookingServiceMock;
        ((BookingManagementImpl) bookingManagement).bookingCache = new NinjaCache(new CacheEhCacheImpl(LoggerFactory.getLogger(this.getClass().getName())) {
        });
    }


    @Test
    public void testListAvailableRoomsHalfAvailable() {
        when(roomReservationMock.listRoomReservations(anyObject(), anyObject())).thenReturn(ModelTestDataMock.getRoomReservations(roomEntities));
        EList<Room> availableRooms = bookingManagement.listAvailableRooms(DBTestDataMock.dateIntervalHalfAvailable1.getStart(), DBTestDataMock.dateIntervalHalfAvailable1.getEnd());
        assertThat(availableRooms.size(), is(rooms.size() / 2));
    }

    @Test
    public void testListAvailableRoomsNoneAvailable() {
        when(roomReservationMock.listRoomReservations(anyObject(), anyObject())).thenReturn(ModelTestDataMock.getRoomReservations(roomEntities));
        EList<Room> availableRooms = bookingManagement.listAvailableRooms(DBTestDataMock.dateIntervalNoAvailable.getStart(), DBTestDataMock.dateIntervalNoAvailable.getEnd());
        assertThat(availableRooms.size(), is(0));
    }

    @Test
    public void testListAvailableRoomsAllAvailable() {
        when(roomReservationMock.listRoomReservations(anyObject(), anyObject())).thenReturn(ModelTestDataMock.getRoomReservations(roomEntities));
        EList<Room> availableRooms = bookingManagement.listAvailableRooms(DBTestDataMock.dateIntervalAllAvailable.getStart(), DBTestDataMock.dateIntervalAllAvailable.getEnd());
        assertThat(availableRooms.size(), is(30));
    }

    @Test
    public void testSearchRoomsTooManyRooms() {
        when(roomReservationMock.listRoomReservations(anyObject(), anyObject())).thenReturn(ModelTestDataMock.getRoomReservations(roomEntities));
        EList<Room> availableRooms = bookingManagement.searchRoom(1, 31, DBTestDataMock.dateIntervalAllAvailable.getStart(), DBTestDataMock.dateIntervalAllAvailable.getEnd());
        assertThat(availableRooms.size(), is(0));
    }

    @Test
    public void testSearchRoomsTooManyGuests() {
        when(roomReservationMock.listRoomReservations(anyObject(), anyObject())).thenReturn(ModelTestDataMock.getRoomReservations(roomEntities));
        mockRoomManagement();
        EList<Room> availableRooms = bookingManagement.searchRoom(76, 2, DBTestDataMock.dateIntervalAllAvailable.getStart(), DBTestDataMock.dateIntervalAllAvailable.getEnd());
        assertThat(availableRooms.size(), is(0));
    }

    @Test
    public void testSearchSuccess() {
        when(roomReservationMock.listRoomReservations(anyObject(), anyObject())).thenReturn(ModelTestDataMock.getRoomReservations(roomEntities));
        mockRoomManagement();
        EList<Room> availableRooms = bookingManagement.searchRoom(2, 4, DBTestDataMock.dateIntervalAllAvailable.getStart(), DBTestDataMock.dateIntervalAllAvailable.getEnd());
        assertThat(availableRooms.size(), is(30));
    }

    @Test
    public void testCreateBooking() {
        EList<Room> bookedRooms = new BasicEList<>();
        bookedRooms.add(rooms.get(0));
        bookedRooms.add(rooms.get(1));
        Booking booking = bookingManagement.create(DBTestDataMock.dateIntervalAllAvailable.getStart(), DBTestDataMock.dateIntervalAllAvailable.getEnd(),
                bookedRooms, null, 0, customer);
        assertThat(booking.getId(), is(notNullValue()));
        assertThat(booking.getCustomer().getEmail(), is(customer.getEmail()));
        assertThat(booking.getCustomer().getFirstName(), is(customer.getFirstName()));
        assertThat(booking.getService().size(), is(0));
        assertThat(((Booking) ((BookingManagementImpl) bookingManagement).bookingCache.get(booking.getId())).getRoomReservation().size(), is(2));
    }

    @Test
    public void testListBookings() {
        when(bookingServiceMock.list()).thenReturn(DBTestDataMock.getBookings(roomEntities));
        EList<Booking> bookings = bookingManagement.listBookings();
        assertThat(bookings.size(), is(30));
    }

    @Test
    public void testListBookingEmpty() {
        when(bookingServiceMock.list()).thenReturn(new ArrayList<BookingEntity>());
        EList<Booking> bookings = bookingManagement.listBookings();
        assertThat(bookings.size(), is(0));
    }

    private IRoomReservationManagement mockRoomReservation() {
        IRoomReservationManagement roomReservationManagement = mock(IRoomReservationManagement.class);

        return roomReservationManagement;
    }

    private void mockRoomManagement() {
        when(roomManagementMock.listRooms()).thenReturn((EList<Room>) rooms);


        when(roomManagementMock.findRoom(anyString())).then(new Answer<Room>() {
            @Override
            public Room answer(InvocationOnMock invocationOnMock) throws Throwable {
                String roomId = (String) invocationOnMock.getArguments()[0];
                for (Room r : rooms) {
                    if (r.getId().equals(roomId)) {
                        return r;
                    }
                }
                return null;
            }
        });
    }
}