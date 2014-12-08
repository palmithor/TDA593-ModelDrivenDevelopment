package com.bodkink.hotel.persistence.dao;

import com.bodkink.hotel.persistence.MongoDB;
import com.bodkink.hotel.persistence.model.BookingBillEntity;
import com.google.inject.Singleton;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class BookingBillDAO extends BasicDAO<BookingBillEntity, ObjectId> {

    public BookingBillDAO() {
        super(BookingBillEntity.class, MongoDB.getDatastore());
    }
}