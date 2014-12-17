package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.business.model.RoomReservationType;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.persistence.IRoomReservationService;
import com.bodkink.hotel.persistence.model.GuestEntity;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;
import com.bodkink.hotel.test.DBTestDataMock;
import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    /**
     * final ObjectId id, final Date startDate, final Date endDate,
     final RoomReservationType roomReservationType, final RoomEntity room,
     final List<GuestEntity> guests, final RoomBillEntity roomBill,
     final ReservationStatusEnum reservationStatus
     * @throws Exception
     */
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
}
