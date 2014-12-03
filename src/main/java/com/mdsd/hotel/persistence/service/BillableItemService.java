package com.mdsd.hotel.persistence.service;

import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.MongoDB;
import com.mdsd.hotel.persistence.model.BillableItemEntity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class BillableItemService extends BasicDAO<BillableItemEntity, ObjectId> {

    public BillableItemService() {
        super(BillableItemEntity.class, MongoDB.getDatastore());
    }
}
