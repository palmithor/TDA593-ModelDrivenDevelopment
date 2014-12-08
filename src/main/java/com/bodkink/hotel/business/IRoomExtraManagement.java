package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.RoomExtra;

import java.util.List;

public interface IRoomExtraManagement {

    /**
     * @param name
     * @param description
     * @return
     */
    public RoomExtra createRoomExtra(String name, String description);

    /**
     * @param roomExtra
     * @return
     */
    public RoomExtra editRoomExtra(RoomExtra roomExtra);

    /**
     * @return
     */
    public List<RoomExtra> listRoomExtras();

}
