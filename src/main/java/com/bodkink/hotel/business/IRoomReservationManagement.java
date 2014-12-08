package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.business.model.RoomReservationType;

import java.util.Date;

public interface IRoomReservationManagement {

    /**
     * @return
     */
    public RoomReservation listRoomReservations();

    /**
     * @param start
     * @param end
     * @return
     */
    public RoomReservation listRoomReservations(Date start, Date end);

    /**
     * @param start
     * @return
     */
    public RoomReservation listRoomReservations(Date start);

    /**
     * @param room
     * @param start
     * @param end
     * @param roomReservationType
     */
    public void create(Room room, Date start, Date end, RoomReservationType roomReservationType);

    /**
     * @param roomReservationId
     * @return
     */
    public RoomReservation findRoomReservation(String roomReservationId);

    /**
     * @param roomReservation
     * @return
     */
    public Boolean cancelRoomReservation(RoomReservation roomReservation);

}
