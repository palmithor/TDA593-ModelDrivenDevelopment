package com.bodkink.hotel.presentation.message;


import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BookingMessage {

    private final String id;
    private final CustomerMessage customer;
    private final List<ServiceMessage> services;
    private final List<RoomReservationMessage> roomReservations;
    private final List<BookingBillMessage> bookingBills; // At most 2

    public BookingMessage() {
        this.bookingBills = null;
        this.roomReservations = null;
        this.services = null;
        this.customer = null;
        this.id = null;
    }

    public BookingMessage(CustomerMessage customer, List<ServiceMessage> services, List<RoomReservationMessage> roomReservations, List<BookingBillMessage> bookingBills) {
        this.id = null;
        this.customer = customer;
        this.services = services;
        this.roomReservations = roomReservations;
        this.bookingBills = bookingBills;
    }

    public BookingMessage(String id, CustomerMessage customer, List<ServiceMessage> services, List<RoomReservationMessage> roomReservations, List<BookingBillMessage> bookingBills) {
        this.id = id;
        this.customer = customer;
        this.services = services;
        this.roomReservations = roomReservations;
        this.bookingBills = bookingBills;
    }

    public String getId() {
        return id;
    }

    public CustomerMessage getCustomer() {
        return customer;
    }

    public List<ServiceMessage> getServices() {
        return services;
    }

    public List<RoomReservationMessage> getRoomReservations() {
        return roomReservations;
    }

    public List<BookingBillMessage> getBookingBills() {
        return bookingBills;
    }
}