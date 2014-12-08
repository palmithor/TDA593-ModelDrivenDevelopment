package com.bodkink.hotel.persistence.dao;

import com.bodkink.hotel.persistence.MongoDB;
import com.bodkink.hotel.persistence.model.RoomExtrasTemplateEntity;
import com.google.inject.Singleton;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class RoomExtrasTemplateDAO extends BasicDAO<RoomExtrasTemplateEntity, ObjectId> {

    public RoomExtrasTemplateDAO() {
        super(RoomExtrasTemplateEntity.class, MongoDB.getDatastore());
    }
}