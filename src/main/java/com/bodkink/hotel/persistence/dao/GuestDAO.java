package com.bodkink.hotel.persistence.dao;

import com.bodkink.hotel.persistence.MongoDB;
import com.bodkink.hotel.persistence.model.GuestEntity;
import com.google.inject.Singleton;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class GuestDAO extends BasicDAO<GuestEntity, ObjectId> {

    public GuestDAO() {
        super(GuestEntity.class, MongoDB.getDatastore());
    }
}