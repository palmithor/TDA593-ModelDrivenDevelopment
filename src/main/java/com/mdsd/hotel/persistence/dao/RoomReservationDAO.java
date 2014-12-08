package com.mdsd.hotel.persistence.dao;

import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.MongoDB;
import com.mdsd.hotel.persistence.model.RoomReservationEntity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class RoomReservationDAO extends BasicDAO<RoomReservationEntity, ObjectId> {

    public RoomReservationDAO() {
        super(RoomReservationEntity.class, MongoDB.getDatastore());
    }
}