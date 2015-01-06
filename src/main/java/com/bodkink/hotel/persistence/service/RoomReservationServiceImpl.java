package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.persistence.IRoomReservationService;
import com.bodkink.hotel.persistence.dao.GuestDAO;
import com.bodkink.hotel.persistence.dao.RoomBillDAO;
import com.bodkink.hotel.persistence.dao.RoomReservationDAO;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;
import com.google.inject.Inject;
import com.mongodb.WriteResult;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * @author simon
 * @since 11/12/14.
 */
public class RoomReservationServiceImpl implements IRoomReservationService {

    @Inject
    RoomReservationDAO roomReservationDAO;

    @Inject
    RoomBillDAO roomBillDAO;

    @Inject
    GuestDAO guestDAO;

    @Override
    public List<RoomReservationEntity> list() {
        return roomReservationDAO.find().asList();
    }

    @Override
    public List<RoomReservationEntity> listByRoom(RoomEntity room) {
        return roomReservationDAO.findByRoom(room);
    }

    @Override
    public RoomReservationEntity find(String id) {
        return roomReservationDAO.get(new ObjectId(id));
    }

    @Override
    public boolean edit(RoomReservationEntity roomReservation) {
        RoomReservationEntity fromDb = roomReservationDAO.get(roomReservation.getId());

        if(fromDb != null) {
            roomReservationDAO.save(roomReservation);
            return true;
        }

        return false;
    }

    @Override
    public RoomReservationEntity persist(RoomReservationEntity roomReservation) {
        if(roomReservation.getRoomBill() != null)
         roomBillDAO.save(roomReservation.getRoomBill());
        if(roomReservation.getGuests() != null)
            roomReservation.getGuests().forEach(guestDAO::save);
        roomReservationDAO.save(roomReservation);

        return roomReservation;
    }

    @Override
    public boolean delete(RoomReservationEntity roomReservation) {
        WriteResult result = roomReservationDAO.delete(roomReservation);
        return result.getN() > 0;
    }
}
