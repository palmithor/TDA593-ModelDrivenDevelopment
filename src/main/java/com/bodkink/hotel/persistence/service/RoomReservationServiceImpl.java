package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.persistence.IRoomReservationService;
import com.bodkink.hotel.persistence.dao.RoomReservationDAO;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;
import com.google.inject.Inject;
import com.mongodb.WriteResult;

import java.util.Date;
import java.util.List;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public class RoomReservationServiceImpl implements IRoomReservationService {

    @Inject
    RoomReservationDAO roomReservationDAO;

    @Override
    public List<RoomReservationEntity> list() {
        return null;
    }

    @Override
    public List<RoomReservationEntity> list(Date start, Date end) {
        return null;
    }

    @Override
    public List<RoomReservationEntity> list(Date start) {
        return null;
    }

    @Override
    public List<RoomReservationEntity> list(RoomEntity room) {
        return roomReservationDAO.find().asList();
    }

    @Override
    public RoomReservationEntity find(String id) {
        return null;
    }

    @Override
    public boolean edit(RoomReservationEntity roomReservation) {
        return false;
    }

    @Override
    public RoomReservationEntity persist(RoomReservationEntity roomReservation) {
        roomReservationDAO.save(roomReservation);
        return null;
    }

    @Override
    public boolean delete(RoomReservationEntity roomReservation) {
        WriteResult result = roomReservationDAO.delete(roomReservation);
        return result.getN() > 0;
    }
}
