package com.mdsd.hotel.persistence.service;

import com.google.inject.Singleton;
import com.mdsd.hotel.persistence.MongoDB;
import com.mdsd.hotel.persistence.model.BookingBillEntity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * @author palmithor
 * @since 03/12/14.
 */
@Singleton
public class BookingBillService extends BasicDAO<BookingBillEntity, ObjectId> {

    public BookingBillService() {
        super(BookingBillEntity.class, MongoDB.getDatastore());
    }
}