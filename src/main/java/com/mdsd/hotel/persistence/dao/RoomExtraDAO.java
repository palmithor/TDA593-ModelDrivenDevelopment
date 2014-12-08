package com.mdsd.hotel.persistence.dao;

import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.MongoDB;
import com.mdsd.hotel.persistence.model.RoomExtraEntity;
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