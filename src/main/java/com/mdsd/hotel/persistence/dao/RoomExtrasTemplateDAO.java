package com.mdsd.hotel.persistence.dao;

import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.MongoDB;
import com.mdsd.hotel.persistence.model.RoomExtrasTemplateEntity;
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