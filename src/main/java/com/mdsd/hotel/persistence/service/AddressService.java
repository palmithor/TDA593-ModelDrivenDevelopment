package com.mdsd.hotel.persistence.service;

import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.MongoDB;
import com.mdsd.hotel.persistence.model.AddressEntity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 02/12/14.
 */
@Singleton
public class AddressService extends BasicDAO<AddressEntity, ObjectId> {

    public AddressService() {
        super(AddressEntity.class, MongoDB.getDatastore());
    }

}
