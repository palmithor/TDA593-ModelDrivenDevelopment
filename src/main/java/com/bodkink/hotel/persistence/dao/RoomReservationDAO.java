package com.bodkink.hotel.persistence.dao;

import com.bodkink.hotel.persistence.MongoDB;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;
import com.google.inject.Singleton;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

import java.util.List;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class RoomReservationDAO extends BasicDAO<RoomReservationEntity, ObjectId> {

    public RoomReservationDAO() {
        super(RoomReservationEntity.class, MongoDB.getDatastore());
    }

    public List<RoomReservationEntity> findByRoom(RoomEntity entity) {
        return getDs().find(RoomReservationEntity.class).filter("room", entity).asList();
    }
}