package com.bodkink.hotel.business;

import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.logic.impl.RoomManagementImpl;
import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.IRoomService;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.persistence.model.RoomExtraEntity;
import com.bodkink.hotel.test.DBTestDataMock;
import org.bson.types.ObjectId;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class IRoomManagementTest {

    @Mock
    IRoomService roomServiceMock;

    List<RoomEntity> roomEntities = DBTestDataMock.getRoomEntities();

    IRoomManagement roomManagement = LogicFactory.eINSTANCE.createRoomManagement();

    Classification classification;
    Map<BedType, Integer> bedTypes;
    List<RoomExtraEntity> roomExtraEntities;
    EList<RoomExtra> roomExtras;

    @Before
    public void setUp() throws Exception {
        ((RoomManagementImpl) roomManagement).roomService = roomServiceMock;

        classification = ModelFactory.eINSTANCE.createClassification();

        bedTypes = new HashMap<BedType, Integer>();

        roomExtraEntities = DBTestDataMock.getRoomExtraEntities();
        roomExtras = new BasicEList<>(roomExtraEntities.size());

        roomExtraEntities.forEach(entity -> {
            roomExtras.add(EntityToModelConverter.convertRoomExtra(entity));
        });
    }

    @Test
    public void testCreateRoom() throws Exception {
        assertThat(roomEntities.size(), is(30));

        when(roomServiceMock.persist(anyObject())).then(invocationOnMock -> {
            RoomEntity roomEntityFromCall = (RoomEntity) invocationOnMock.getArguments()[0];
            RoomEntity roomEntityCreated = new RoomEntity(
                    ObjectId.get(),
                    roomEntityFromCall.getNumber(),
                    roomEntityFromCall.getDescription(),
                    roomEntityFromCall.getAllowedGuests(),
                    roomEntityFromCall.getSize(),
                    roomEntityFromCall.getNightPrice(),
                    roomEntityFromCall.getPictures(),
                    roomEntityFromCall.getClassification(),
                    roomEntityFromCall.getRoomExtras(),
                    roomEntityFromCall.getBedTypesCount()
            );
            roomEntities.add(roomEntityCreated);
            return roomEntityCreated;
        });

        Room room = roomManagement.create("12", "A room", 4, BigDecimal.ONE, BigDecimal.TEN, "http://www.google.com", classification, bedTypes, roomExtras);

        assertThat(roomEntities.size(), is(31));
    }

    @Test
    public void testListRooms() throws Exception {
        List<RoomEntity> roomEntities = DBTestDataMock.getRoomEntities();
        when(roomServiceMock.listAll()).thenReturn(roomEntities);
        assertThat(roomManagement.listRooms().size(), is(roomEntities.size()));

    }

    @Test
    public void testEditRoom() throws Exception {
        assertThat(roomEntities.get(0).getNumber(), is("000"));

        when(roomServiceMock.edit(anyObject())).then(invocationOnMock -> {
            RoomEntity roomEntityFromCall = (RoomEntity) invocationOnMock.getArguments()[0];
            RoomEntity roomEntityCreated = new RoomEntity(
                    roomEntityFromCall.getId(),
                    roomEntityFromCall.getNumber(),
                    roomEntityFromCall.getDescription(),
                    roomEntityFromCall.getAllowedGuests(),
                    roomEntityFromCall.getSize(),
                    roomEntityFromCall.getNightPrice(),
                    roomEntityFromCall.getPictures(),
                    roomEntityFromCall.getClassification(),
                    roomEntityFromCall.getRoomExtras(),
                    roomEntityFromCall.getBedTypesCount()
            );
            roomEntities.set(0, roomEntityCreated);
            return roomEntityCreated;
        });

        RoomEntity roomEntity = roomEntities.get(0);
        Room room = EntityToModelConverter.convertRoom(roomEntity);
        room.setNumber("666");
        roomEntity = ModelToEntityConverter.convertRoom(room);
        roomServiceMock.edit(roomEntity);

        assertThat(roomEntities.get(0).getNumber(), is("666"));
    }

    @Test
    public void testFindRoom() throws Exception {
        List<RoomEntity> roomEntities = DBTestDataMock.getRoomEntities();
        when(roomServiceMock.listAll()).thenReturn(roomEntities);
        Room room = roomManagement.findRoom(roomEntities.get(0).getId().toString());
        assertThat(room.getId(), is(roomEntities.get(0).getId().toString()));
    }
}