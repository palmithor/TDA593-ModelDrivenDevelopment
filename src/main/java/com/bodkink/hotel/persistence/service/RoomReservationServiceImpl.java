package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.persistence.IRoomReservationService;
import com.bodkink.hotel.persistence.dao.RoomReservationDAO;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;
import com.google.inject.Inject;
import com.mongodb.WriteResult;
import org.eclipse.emf.common.util.EList;

import java.util.Date;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public class RoomReservationServiceImpl implements IRoomReservationService {

    @Inject
    RoomReservationDAO roomReservationDAO;

    @Override
    public EList<RoomReservationEntity> list() {
        return null;
    }

    @Override
    public EList<RoomReservationEntity> list(Date start, Date end) {
        return null;
    }

    @Override
    public EList<RoomReservationEntity> list(Date start) {
        return null;
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
    public RoomReservation persist(RoomReservationEntity roomReservation) {
        return null;
    }

    @Override
    public boolean delete(RoomReservationEntity roomReservation) {
        WriteResult result = roomReservationDAO.delete(roomReservation);
        return result.getN() > 0;
    }
}
