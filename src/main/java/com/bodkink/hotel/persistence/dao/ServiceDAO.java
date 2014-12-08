package com.bodkink.hotel.persistence.dao;

import com.bodkink.hotel.persistence.MongoDB;
import com.bodkink.hotel.persistence.model.ServiceEntity;
import com.google.inject.Singleton;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class ServiceDAO extends BasicDAO<ServiceEntity, ObjectId> {

    public ServiceDAO() {
        super(ServiceEntity.class, MongoDB.getDatastore());
    }
}
