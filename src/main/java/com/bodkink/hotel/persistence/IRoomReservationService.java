package com.bodkink.hotel.persistence;

import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;

import java.util.Date;
import java.util.List;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public interface IRoomReservationService {

    public List<RoomReservationEntity> list();

    public List<RoomReservationEntity> list(Date start, Date end);

    public List<RoomReservationEntity> list(Date start);

    public List<RoomReservationEntity> list(RoomEntity room);

    public RoomReservationEntity find(String id);

    public boolean edit(RoomReservationEntity roomReservation);

    public RoomReservationEntity persist(RoomReservationEntity roomReservation);

    public boolean delete(RoomReservationEntity roomReservation);
}
