package com.mdsd.hotel.logic.model;

import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Booking {

    private Long number;
    private Customer customer;
    private BookingStatusEnum bookingStatus;
    private List<Service> services;
    private List<RoomReservation> roomReservations;
    private List<BookingBill> bookingBills; // At most 2
}