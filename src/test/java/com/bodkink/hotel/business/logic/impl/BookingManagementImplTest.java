package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.IRoomManagement;
import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.test.ModelTestDataMock;
import com.bodkink.hotel.util.DateInterval;
import ninja.cache.CacheEhCacheImpl;
import ninja.cache.NinjaCache;
import org.bson.types.ObjectId;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookingManagementImplTest {

    private static DateTime now = DateTime.now();
    private static final DateInterval dateIntervalHalfAvailable1 = new DateInterval(now.minusDays(2).toDate(), now.plusDays(1).toDate());
    private static final DateInterval dateIntervalHalfAvailable2 = new DateInterval(now.minusDays(6).toDate(), now.minusDays(4).toDate());
    private static final DateInterval dateIntervalAllAvailable = new DateInterval(now.plusDays(20).toDate(), now.plusDays(23).toDate());
    private static final DateInterval dateIntervalNoAvailable = new DateInterval(now.minusDays(7).toDate(), now.plusDays(24).toDate());

    List<Room> rooms = ModelTestDataMock.getRooms();
    Customer customer = ModelTestDataMock.getCustomer();

    IBookingManagement bookingManagement;

    @Before
    public void setUp() throws Exception {
        bookingManagement = LogicFactory.eINSTANCE.createBookingManagement();

        IRoomReservationManagement roomReservationMock = mockRoomReservation();
        IRoomManagement roomManagementMock = mockRoomManagement();

        ((BookingManagementImpl) bookingManagement).setRoomReservationManagement(roomReservationMock);
        ((BookingManagementImpl) bookingManagement).setRoomManagement(roomManagementMock);
        ((BookingManagementImpl) bookingManagement).setBookingCache(new NinjaCache(new CacheEhCacheImpl(LoggerFactory.getLogger(this.getClass().getName())) {
        }));
    }


    @Test
    public void testListAvailableRoomsHalfAvailable() {
        EList<Room> availableRooms = bookingManagement.listAvailableRooms(dateIntervalHalfAvailable1.getStart(), dateIntervalHalfAvailable1.getEnd());
        assertThat(availableRooms.size(), is(rooms.size() / 2));
    }

    @Test
    public void testListAvailableRoomsNoneAvailable() {
        EList<Room> availableRooms = bookingManagement.listAvailableRooms(dateIntervalNoAvailable.getStart(), dateIntervalNoAvailable.getEnd());
        assertThat(availableRooms.size(), is(0));
    }

    @Test
    public void testListAvailableRoomsAllAvailable() {
        EList<Room> availableRooms = bookingManagement.listAvailableRooms(dateIntervalAllAvailable.getStart(), dateIntervalAllAvailable.getEnd());
        assertThat(availableRooms.size(), is(30));
    }

    @Test
    public void testSearchRoomsTooManyRooms() {
        EList<Room> availableRooms = bookingManagement.searchRoom(1, 31, dateIntervalAllAvailable.getStart(), dateIntervalAllAvailable.getEnd());
        assertThat(availableRooms.size(), is(0));
    }

    @Test
    public void testSearchRoomsTooManyGuests() {
        EList<Room> availableRooms = bookingManagement.searchRoom(76, 2, dateIntervalAllAvailable.getStart(), dateIntervalAllAvailable.getEnd());
        assertThat(availableRooms.size(), is(0));
    }

    @Test
    public void testSearchSuccess() {
        EList<Room> availableRooms = bookingManagement.searchRoom(2, 4, dateIntervalAllAvailable.getStart(), dateIntervalAllAvailable.getEnd());
        assertThat(availableRooms.size(), is(30));
    }

    @Test
    public void testCreateBooking() {
        EList<Room> bookedRooms = new BasicEList<>();
        bookedRooms.add(rooms.get(0));
        bookedRooms.add(rooms.get(1));
        Booking booking = bookingManagement.create(dateIntervalAllAvailable.getStart(), dateIntervalAllAvailable.getEnd(),
                bookedRooms, null, 0, customer);
        assertThat(booking.getId(), is(notNullValue()));
        assertThat(booking.getCustomer().getEmail(), is(customer.getEmail()));
        assertThat(booking.getCustomer().getFirstName(), is(customer.getFirstName()));
        assertThat(booking.getService().size(), is(0));
        assertThat(((Booking) ((BookingManagementImpl) bookingManagement).getBookingCache().get(booking.getId())).getRoomReservation().size(), is(2));

    }

    private IRoomReservationManagement mockRoomReservation() {
        IRoomReservationManagement roomReservationManagement = mock(IRoomReservationManagement.class);
        List<RoomReservation> roomReservations = new BasicEList<>();
        for (int i = 0; i < rooms.size(); i++) {
            RoomReservation r = ModelFactory.eINSTANCE.createRoomReservation();
            r.setId(ObjectId.get().toString());
            r.setEndDate(i % 2 == 0 ? dateIntervalHalfAvailable1.getEnd() : dateIntervalHalfAvailable2.getEnd());
            r.setStartDate(i % 2 == 0 ? dateIntervalHalfAvailable1.getStart() : dateIntervalHalfAvailable2.getStart());
            r.setReservationStatusEnum(ReservationStatusEnum.RESERVED);
            r.setRoom(rooms.get(i));
            r.setRoomReservationType(ModelTestDataMock.getRoomReservationTypes().get(0));
            roomReservations.add(r);
        }
        when(roomReservationManagement.listRoomReservations(anyObject(), anyObject())).thenReturn((EList) roomReservations);
        return roomReservationManagement;
    }

    private IRoomManagement mockRoomManagement() {
        IRoomManagement roomManagementMock = mock(IRoomManagement.class);
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
        return roomManagementMock;
    }
}