package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Classification;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomExtra;

import java.math.BigDecimal;
import java.util.Map;

public interface IRoomManagement {

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
    public Room create(String roomNumber, String description, int allowedGuest, BigDecimal size, BigDecimal nightPrice, String picUrls, Classification classification, Map bedTypes, RoomExtra roomExtras);

    /**
     * @return
     */
    public Room listRooms();

    /**
     * @param room
     * @return
     */
    public Room editRoom(Room room);

    /**
     * @param roomId
     * @return
     */
    public Boolean disableRoom(String roomId);

    /**
     * @param roomId
     * @return
     */
    public Room findRoom(long roomId);

}
