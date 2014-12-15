package com.bodkink.hotel.business;

import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.logic.RoomExtraManagement;
import com.bodkink.hotel.business.logic.impl.RoomExtraManagementImpl;
import com.bodkink.hotel.persistence.IRoomExtraService;
import com.bodkink.hotel.persistence.model.RoomExtraEntity;
import com.bodkink.hotel.persistence.service.RoomExtraServiceImpl;
import com.bodkink.hotel.test.DBTestDataMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class IRoomExtraManagementTest {

    @Mock
    IRoomExtraService roomExtraServiceMock;

    List<RoomExtraEntity> roomExtraEntities = DBTestDataMock.getRoomExtraEntities();

    IRoomExtraManagement roomExtraManagement;

    @Before
    public void setUp() throws Exception {

        roomExtraManagement = LogicFactory.eINSTANCE.createRoomExtraManagement();
        ((RoomExtraManagementImpl) roomExtraManagement).roomExtraService = roomExtraServiceMock;
    }

    @Test
    public void testListAll() {
        when(roomExtraServiceMock.listAll()).thenReturn(roomExtraEntities);
        //assertThat(roomExtraManagement.listRoomExtras().size(), is(0));
    }
}