package com.bodkink.hotel.business.logic;

import com.bodkink.hotel.business.IRoomManagement;
import com.bodkink.hotel.business.model.Classification;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomExtra;

import java.math.BigDecimal;
import java.util.Map;

public class RoomManagementImpl implements IRoomManagement {

    /**
     * @param roomNumber
     * @param description
     * @param allowedGuest
     * @param size
     * @param nightPrice
     * @param picUrls
     * @param classification
     * @param bedTypes
     * @param roomExtras
     * @return
     */
    public Room create(String roomNumber, String description, int allowedGuest, BigDecimal size, BigDecimal nightPrice, String picUrls, Classification classification, Map bedTypes, RoomExtra roomExtras) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @return
     */
    public Room listRooms() {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param room
     * @return
     */
    public Room editRoom(Room room) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param roomId
     * @return
     */
    public Boolean disableRoom(String roomId) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param roomId
     * @return
     */
    public Room findRoom(long roomId) {
        // TODO Auto-generated method
        return null;
    }

}
