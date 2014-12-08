package com.bodkink.hotel.business.logic;

import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.business.model.RoomReservationType;

import java.util.Date;

public class RoomReservationManagementImpl implements IRoomReservationManagement {

    /**
     * @return
     */
    public RoomReservation listRoomReservations() {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param start
     * @param end
     * @return
     */
    public RoomReservation listRoomReservations(Date start, Date end) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param start
     * @return
     */
    public RoomReservation listRoomReservations(Date start) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param room
     * @param start
     * @param end
     * @param roomReservationType
     */
    public void create(Room room, Date start, Date end, RoomReservationType roomReservationType) {
        // TODO Auto-generated method
    }

    /**
     * @param roomReservationId
     * @return
     */
    public RoomReservation findRoomReservation(String roomReservationId) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param roomReservation
     * @return
     */
    public Boolean cancelRoomReservation(RoomReservation roomReservation) {
        // TODO Auto-generated method
        return null;
    }

}
