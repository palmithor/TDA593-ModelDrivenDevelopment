package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.Guest;
import com.bodkink.hotel.business.model.RoomReservation;

public interface IGuestManagement {

    /**
     * @param booking
     * @param result
     */
    public void checkOut(Booking booking, boolean result);

    /**
     * @param roomReservation
     * @param guests
     * @return
     */
    public boolean checkIn(RoomReservation roomReservation, Guest guests);

    /**
     * @param roomReservation
     * @return
     */
    public boolean checkOut(RoomReservation roomReservation);

}
