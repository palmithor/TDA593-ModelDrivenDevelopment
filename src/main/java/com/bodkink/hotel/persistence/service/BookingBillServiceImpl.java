package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.business.model.BookingBill;
import com.bodkink.hotel.persistence.IBookingBillService;
import com.bodkink.hotel.persistence.dao.BookingBillDAO;
import com.bodkink.hotel.persistence.dao.CardInformationDAO;
import com.bodkink.hotel.persistence.model.BookingBillEntity;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;

/**
 * Created by Carl Jansson on 18/12/2014.
 */
public class BookingBillServiceImpl implements IBookingBillService{

    @Inject
    BookingBillDAO bookingBillDAO;

    @Inject
    CardInformationDAO cardInformationDAO;

    @Override
    public EList<BookingBillEntity> list() {
        return null;
    }

    @Override
    public BookingBill persist(BookingBillEntity bookingBillEntity) {
        cardInformationDAO.save(bookingBillEntity.getCardInformation());
        bookingBillDAO.save(bookingBillEntity);
        return null;
    }
}
