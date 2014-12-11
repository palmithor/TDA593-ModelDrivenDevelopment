package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.persistence.IRoomReservationService;
import org.eclipse.emf.common.util.EList;

import java.util.Date;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public class RoomReservationServiceImpl implements IRoomReservationService {
    @Override
    public EList<RoomReservation> list() {
        return null;
    }

    @Override
    public EList<RoomReservation> list(Date start, Date end) {
        return null;
    }

    @Override
    public EList<RoomReservation> list(Date start) {
        return null;
    }

    @Override
    public RoomReservation find(String id) {
        return null;
    }

    @Override
    public boolean edit(RoomReservation roomReservation) {
        return false;
    }

    @Override
    public RoomReservation persist(RoomReservation roomReservation) {
        return null;
    }
}
