package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.IRoomManagement;
import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.model.ModelFactory;
import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.test.ModelTestDataMock;
import com.bodkink.hotel.util.DateInterval;
import org.bson.types.ObjectId;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookingManagementImplTest {

    private static DateTime now = DateTime.now();
    private static final DateInterval dateIntervalHalfAvailable = new DateInterval(now.minusDays(2).toDate(), now.plusDays(1).toDate());
    private static final DateInterval dateIntervalAllAvailable = new DateInterval(now.plusDays(20).toDate(), now.plusDays(23).toDate());
    private static final DateInterval dateIntervalNoAvailable = new DateInterval(now.minusDays(2).toDate(), now.plusDays(24).toDate());

    List<Room> rooms = ModelTestDataMock.getRooms();

    IBookingManagement bookingManagement;

    @Before
    public void setUp() throws Exception {
        bookingManagement = LogicFactory.eINSTANCE.createBookingManagement();

        IRoomReservationManagement roomReservationMock = mockRoomReservation();
        IRoomManagement roomManagementMock = mockRoomManagement();

        ((BookingManagementImpl) bookingManagement).setRoomReservationManagement(roomReservationMock);
        ((BookingManagementImpl) bookingManagement).setRoomManagement(roomManagementMock);
    }


    @Test
    public void testListAvailableRoomsHalfAvailable() {
        EList<Room> availableRooms = bookingManagement.listAvailableRooms(dateIntervalHalfAvailable.getStart(), dateIntervalHalfAvailable.getEnd());
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


    private IRoomReservationManagement mockRoomReservation() {
        IRoomReservationManagement roomReservationManagement = mock(IRoomReservationManagement.class);
        List<RoomReservation> roomReservations = new BasicEList<>();
        for (int i = 0; i < rooms.size(); i++) {
            RoomReservation r = ModelFactory.eINSTANCE.createRoomReservation();
            r.setId(ObjectId.get().toString());
            r.setEndDate(i % 2 == 0 ? dateIntervalHalfAvailable.getEnd() : dateIntervalAllAvailable.getEnd());
            r.setStartDate(i % 2 == 0 ? dateIntervalHalfAvailable.getStart() : dateIntervalAllAvailable.getStart());
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
                for (Room r : ModelTestDataMock.getRooms()) {
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