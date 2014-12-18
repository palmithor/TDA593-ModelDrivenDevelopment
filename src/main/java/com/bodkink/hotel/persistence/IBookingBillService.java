package com.bodkink.hotel.persistence;

import com.bodkink.hotel.business.model.BookingBill;
import com.bodkink.hotel.business.model.RoomBill;
import com.bodkink.hotel.persistence.model.BookingBillEntity;
import com.bodkink.hotel.persistence.model.RoomBillEntity;
import org.eclipse.emf.common.util.EList;

/**
 * Created by Carl Jansson on 18/12/2014.
 */
public interface IBookingBillService {

    public EList<BookingBillEntity> list();

    public BookingBill persist(BookingBillEntity bookingBillEntity);
}
