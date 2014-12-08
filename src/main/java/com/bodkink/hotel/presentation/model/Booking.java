package com.bodkink.hotel.presentation.model;

import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Booking {

    private final String id;
    private final Long number;
    private final Customer customer;
    private final List<Service> services;
    private final List<RoomReservation> roomReservations;
    private final List<BookingBill> bookingBills; // At most 2

    public Booking() {
        this.bookingBills = null;
        this.roomReservations = null;
        this.services = null;
        this.customer = null;
        this.number = null;
        this.id = null;
    }

    public Booking(List<BookingBill> bookingBills, List<RoomReservation> roomReservations, List<Service> services, Customer customer, Long number, String id) {
        this.bookingBills = bookingBills;
        this.roomReservations = roomReservations;
        this.services = services;
        this.customer = customer;
        this.number = number;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Long getNumber() {
        return number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Service> getServices() {
        return services;
    }

    public List<RoomReservation> getRoomReservations() {
        return roomReservations;
    }

    public List<BookingBill> getBookingBills() {
        return bookingBills;
    }
}