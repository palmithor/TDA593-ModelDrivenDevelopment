package com.bodkink.hotel.persistence.dao;

import com.bodkink.hotel.persistence.MongoDB;
import com.bodkink.hotel.persistence.model.RoomExtraEntity;
import com.google.inject.Singleton;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class RoomExtraDAO extends BasicDAO<RoomExtraEntity, ObjectId> {

    public RoomExtraDAO() {
        super(RoomExtraEntity.class, MongoDB.getDatastore());
    }
}