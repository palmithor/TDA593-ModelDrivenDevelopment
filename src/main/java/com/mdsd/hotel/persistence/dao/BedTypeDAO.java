package com.mdsd.hotel.persistence.dao;

import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.MongoDB;
import com.mdsd.hotel.persistence.model.BedTypeEntity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class BedTypeDAO extends BasicDAO<BedTypeEntity, ObjectId> {

    public BedTypeDAO() {
        super(BedTypeEntity.class, MongoDB.getDatastore());
    }
}
