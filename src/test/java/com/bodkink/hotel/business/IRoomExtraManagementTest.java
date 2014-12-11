package com.bodkink.hotel.business;

import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.logic.impl.RoomExtraManagementImpl;
import com.bodkink.hotel.persistence.IRoomExtraService;
import com.bodkink.hotel.persistence.model.RoomExtraEntity;
import com.bodkink.hotel.persistence.service.RoomExtraServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IRoomExtraManagementTest {

    private final List<RoomExtraEntity> roomExtrasDB = new ArrayList<>();

    private IRoomExtraManagement roomExtraManagement;

    @Before
    public void setUp() throws Exception {
        IRoomExtraService roomExtraService = mock(RoomExtraServiceImpl.class);

        when(roomExtraService.listAll()).thenReturn(roomExtrasDB);

        roomExtraManagement = LogicFactory.eINSTANCE.createRoomExtraManagement();
        ((RoomExtraManagementImpl) roomExtraManagement).setRoomExtraService(roomExtraService);
    }

    @Test
    public void testListAll() {
        //assertThat(roomExtraManagement.listRoomExtras().size(), is(0));
    }
}