package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.*;

import java.util.Date;

public interface IBookingManagement {

    /**
     * @param start
     * @param end
     * @param rooms
     * @param numberOfGuests
     * @param customer
     * @return
     */
    public Booking create(Date start, Date end, Room rooms, int numberOfGuests, Customer customer);

    /**
     * @return
     */
    public Booking listBookings();

    /**
     * @param bookingId
     * @return
     */
    public Booking findBooking(long bookingId);

    /**
     * @param start
     * @return
     */
    public Booking listBooking(Date start);

    /**
     * @param start
     * @param endDate
     * @param rooms
     */
    public void listAvailableRooms(Date start, Date endDate, Room rooms);

    /**
     * @param booking
     * @return
     */
    public boolean cancelBooking(Booking booking);

    /**
     * @param id
     * @return
     */
    public ReservationStatusEnum getBookingStatus(long id);

    /**
     * @param booking
     * @param cardInformation
     * @return
     */
    public Receipt confirmAndPay(Booking booking, CardInformation cardInformation);

}
