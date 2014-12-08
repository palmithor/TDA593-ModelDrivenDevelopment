package com.bodkink.hotel.business.logic;

import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.model.*;

import java.util.Date;

public class BookingManagementImpl implements IBookingManagement {

    /**
     * @param start
     * @param end
     * @param rooms
     * @param numberOfGuests
     * @param customer
     * @return
     */
    public Booking create(Date start, Date end, Room rooms, int numberOfGuests, Customer customer) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @return
     */
    public Booking listBookings() {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param bookingId
     * @return
     */
    public Booking findBooking(long bookingId) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param start
     * @return
     */
    public Booking listBooking(Date start) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param start
     * @param endDate
     * @param rooms
     */
    public void listAvailableRooms(Date start, Date endDate, Room rooms) {
        // TODO Auto-generated method
    }

    /**
     * @param booking
     * @return
     */
    public boolean cancelBooking(Booking booking) {
        // TODO Auto-generated method
        return false;
    }

    /**
     * @param id
     * @return
     */
    public ReservationStatusEnum getBookingStatus(long id) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param booking
     * @param cardInformation
     * @return
     */
    public Receipt confirmAndPay(Booking booking, CardInformation cardInformation) {
        // TODO Auto-generated method
        return null;
    }

}
