package com.bodkink.hotel.persistence.dao;

import com.bodkink.hotel.persistence.MongoDB;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.google.inject.Singleton;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class RoomDAO extends BasicDAO<RoomEntity, ObjectId> {

    public RoomDAO() {
        super(RoomEntity.class, MongoDB.getDatastore());
    }
}
