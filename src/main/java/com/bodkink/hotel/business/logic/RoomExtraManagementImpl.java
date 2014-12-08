package com.bodkink.hotel.business.logic;

import com.bodkink.hotel.business.IRoomExtraManagement;
import com.bodkink.hotel.business.model.RoomExtra;
import com.bodkink.hotel.persistence.IRoomExtraService;
import com.bodkink.hotel.persistence.model.RoomExtraEntity;
import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.List;

public class RoomExtraManagementImpl implements IRoomExtraManagement {

    @Inject
    IRoomExtraService roomExtraService;

    /**
     * @param name
     * @param description
     * @return
     */
    public RoomExtra createRoomExtra(String name, String description) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param roomExtra
     * @return
     */
    public RoomExtra editRoomExtra(RoomExtra roomExtra) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @return
     */
    public List<RoomExtra> listRoomExtras() {
        List<RoomExtraEntity> roomExtraEntities = roomExtraService.listAll();
        List<RoomExtra> roomExtras = new ArrayList<>(roomExtraEntities.size());
        for (RoomExtraEntity roomExtraEntity : roomExtraEntities) {
            RoomExtra roomExtra = new RoomExtra();
            roomExtra.setDescription(roomExtraEntity.getDescription());
            roomExtra.setId(roomExtraEntity.getId().toString());
            roomExtra.setTitle(roomExtraEntity.getTitle());
            roomExtras.add(roomExtra);
        }

        return roomExtras;
    }

}
