package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.business.model.RoomReservationType;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.persistence.IRoomReservationService;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;
import com.bodkink.hotel.test.DBTestDataMock;
import com.bodkink.hotel.util.DateUtil;
import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

/**
 * Created by simon on 2014-12-15.
 */
@RunWith(MockitoJUnitRunner.class)
public class RoomReservationManagementImplTest {

    @Mock
    IRoomReservationService roomReservationServiceMock;

    IRoomReservationManagement roomReservationManagement = LogicFactory.eINSTANCE.createRoomReservationManagement();

    List<RoomEntity> roomEntities = DBTestDataMock.getRoomEntities();

    List<RoomReservationEntity> roomReservationEntities = DBTestDataMock.getRoomReservations(roomEntities);

    @Before
    public void setup() {
        ((RoomReservationManagementImpl)roomReservationManagement).roomReservationService = roomReservationServiceMock;
    }
    @Test
    public void testListRoomReservations() throws Exception {
        when(roomReservationServiceMock.list()).then(invocationOnMock -> {
            List<RoomReservationEntity> result = new ArrayList<>();
            roomReservationEntities.forEach((entity) -> result.add(entity));

            return result;
        });

        List<RoomReservation> reservationList = roomReservationManagement.listRoomReservations();
        assertThat(reservationList.size(), is(30));
    }

    @Test
    public void testListRoomReservationsByDateStart() throws Exception {
        when(roomReservationServiceMock.listByDate(anyObject())).then(invocationOnMock -> {
            Date startDate = (Date)invocationOnMock.getArguments()[0];
            List<RoomReservationEntity> result = new ArrayList<>();
            roomReservationEntities.forEach(entity -> {
                if(DateUtil.isSameDay(entity.getStartDate(), startDate))
                    result.add(entity);
            });

            return result;
        });

        List<RoomReservation> reservationList = roomReservationManagement.listRoomReservations(DBTestDataMock.dateIntervalHalfAvailable1.getStart());
        assertThat(reservationList.size(), is(15));
    }

    @Test
    public void testListRoomReservationsByDateStartEnd() throws Exception {
        when(roomReservationServiceMock.list()).then(invocationOnMock -> {
            List<RoomReservationEntity> result = new ArrayList<>();
            roomReservationEntities.forEach((entity) -> result.add(entity));

            return result;
        });

        List<RoomReservation> roomReservations = roomReservationManagement.listRoomReservations(DBTestDataMock.dateIntervalNoAvailable.getStart(), DBTestDataMock.dateIntervalNoAvailable.getEnd());
        assertThat(roomReservations.size(), is(30));
    }

    @Test
    public void testCreateRoomReservation() throws Exception {
        assertThat(roomReservationEntities.size(), is(30));

        when(roomReservationServiceMock.persist(anyObject())).then(invocationOnMock -> {
            RoomReservationEntity entityFromCall = (RoomReservationEntity) invocationOnMock.getArguments()[0];
            RoomReservationEntity entityCreated = new RoomReservationEntity(
                    ObjectId.get(),
                    entityFromCall.getStartDate(),
                    entityFromCall.getEndDate(),
                    entityFromCall.getReservationType(),
                    entityFromCall.getRoom(),
                    entityFromCall.getGuests(),
                    entityFromCall.getRoomBill(),
                    entityFromCall.getReservationStatus());

            roomReservationEntities.add(entityCreated);
            return entityCreated;
        });

        Room room = EntityToModelConverter.convertRoom(roomEntities.get(0));

        RoomReservation roomReservation = roomReservationManagement.create(room,
        new Date(System.currentTimeMillis()),
        new Date(System.currentTimeMillis() + TimeUnit.MILLISECONDS.convert(3, TimeUnit.DAYS)),
        RoomReservationType.BOOKING);

        assertThat(roomReservationEntities.size(), is(31));
    }

    @Test
    public void testFindRoomReservation() throws Exception {
        when(roomReservationServiceMock.find(anyObject())).then(invocationOnMock -> {
           String id = (String) invocationOnMock.getArguments()[0];

            for(RoomReservationEntity entity : roomReservationEntities) {
                if(entity.getId().toString().equals(id))
                    return entity;
            }

            return null;
        });

        RoomReservation reservation = roomReservationManagement.findRoomReservation(roomReservationEntities.get(0).getId().toString());
        assertThat(reservation.getId(), is(roomReservationEntities.get(0).getId().toString()));
    }

    @Test
    public void testFindroomReservationNonExistingId() throws Exception {
        when(roomReservationServiceMock.find(anyObject())).then(invocationOnMock -> {
            String id = (String) invocationOnMock.getArguments()[0];

            for(RoomReservationEntity entity : roomReservationEntities) {
                if(entity.getId().toString().equals(id))
                    return entity;
            }

            return null;
        });

        RoomReservation reservation = roomReservationManagement.findRoomReservation("-1");
        assertThat(reservation, is(nullValue()));
    }

    @Test
    public void testCancelRoomReservation() throws Exception {
        assertThat(roomReservationEntities.get(4).getReservationStatus(), is(ReservationStatusEnum.RESERVED));

        when(roomReservationServiceMock.find(anyObject())).then(invocationOnMock -> {
            String id = (String) invocationOnMock.getArguments()[0];

            for(RoomReservationEntity entity : roomReservationEntities) {
                if(entity.getId().toString().equals(id))
                    return entity;
            }

            return null;
        });

        when(roomReservationServiceMock.edit(anyObject())).then(invocationOnMock -> {
            RoomReservationEntity editedEntity = (RoomReservationEntity) invocationOnMock.getArguments()[0];

            RoomReservationEntity oldEntity = null;
            for(RoomReservationEntity entity : roomReservationEntities) {
                if(entity.getId().equals(editedEntity.getId())) {
                    oldEntity = entity;
                }
            }

            if(oldEntity == null)
                return false;
            else
                roomReservationEntities.set(roomReservationEntities.indexOf(oldEntity), editedEntity);

            return true;
        });

        RoomReservation reservation = EntityToModelConverter.convertRoomReservation(roomReservationEntities.get(4));
        roomReservationManagement.cancelRoomReservation(reservation.getId());
        assertThat(roomReservationEntities.get(4).getReservationStatus(), is(ReservationStatusEnum.CANCELED));
    }

    @Test
    public void testIsAvailableSuccess() throws Exception {
        when(roomReservationServiceMock.listByRoom(anyObject())).then(invocationOnMock -> {
            List<RoomReservationEntity> result = new ArrayList<>();
            RoomEntity room = (RoomEntity) invocationOnMock.getArguments()[0];
            roomReservationEntities.forEach(entity -> {
                if(entity.getRoom().getId().equals(room.getId()))
                    result.add(entity);
            });

            return result;
        });

        boolean isAvailable = roomReservationManagement.isAvailable(EntityToModelConverter.convertRoom(roomEntities.get(0)), DBTestDataMock.dateIntervalHalfAvailable2.getStart(), DBTestDataMock.dateIntervalHalfAvailable2.getEnd());

        assertThat(isAvailable, is(true));
    }

    @Test
    public void testIsAvailableFail() throws Exception {
        when(roomReservationServiceMock.listByRoom(anyObject())).then(invocationOnMock -> {
            List<RoomReservationEntity> result = new ArrayList<>();
            RoomEntity room = (RoomEntity) invocationOnMock.getArguments()[0];
            roomReservationEntities.forEach(entity -> {
                if(entity.getRoom().getId().equals(room.getId()))
                    result.add(entity);
            });

            return result;
        });

        boolean isAvailable = roomReservationManagement.isAvailable(EntityToModelConverter.convertRoom(roomEntities.get(0)), DBTestDataMock.dateIntervalHalfAvailable1.getStart(), DBTestDataMock.dateIntervalHalfAvailable1.getEnd());

        assertThat(isAvailable, is(false));
    }
}
