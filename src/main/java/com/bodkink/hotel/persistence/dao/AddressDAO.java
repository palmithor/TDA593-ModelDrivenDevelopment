package com.bodkink.hotel.persistence.dao;

import com.bodkink.hotel.persistence.MongoDB;
import com.bodkink.hotel.persistence.model.AddressEntity;
import com.google.inject.Singleton;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 02/12/14.
 */
@Singleton
public class AddressDAO extends BasicDAO<AddressEntity, ObjectId> {

    public AddressDAO() {
        super(AddressEntity.class, MongoDB.getDatastore());
    }


}
