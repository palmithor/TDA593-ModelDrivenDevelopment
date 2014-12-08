package com.bodkink.hotel.persistence.dao;

import com.bodkink.hotel.persistence.MongoDB;
import com.bodkink.hotel.persistence.model.BillableItemEntity;
import com.google.inject.Singleton;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class BillableItemDAO extends BasicDAO<BillableItemEntity, ObjectId> {

    public BillableItemDAO() {
        super(BillableItemEntity.class, MongoDB.getDatastore());
    }
}
