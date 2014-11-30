package com.mdsd.hotel.business.model;

import java.util.ArrayList;
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

    public Booking() {
        services = new ArrayList<>();
        roomReservations = new ArrayList<>();
        bookingBills = new ArrayList<>();
    }

    public Booking(final Long number, final Customer customer, final BookingStatusEnum bookingStatus, final List<Service> services,
                   final List<RoomReservation> roomReservations, final List<BookingBill> bookingBills) {
        this.number = number;
        this.customer = customer;
        this.bookingStatus = bookingStatus;
        this.services = services;
        this.roomReservations = roomReservations;
        this.bookingBills = bookingBills;
    }

    public void addService(final Service service) {
        if (services == null) {
            services = new ArrayList<>();
        }
        services.add(service);
    }

    public void addRoomReservation(final RoomReservation roomReservation) {
        if (roomReservations == null) {
            roomReservations = new ArrayList<>();
        }
        roomReservations.add(roomReservation);
    }

    public void addBill(final BookingBill bill) {
        // TODO check bill size, not allowed to add more than two
        if (bookingBills == null) {
            bookingBills = new ArrayList<>();
        }
        bookingBills.add(bill);
    }


    public Long getNumber() {
        return number;
    }

    public void setNumber(final Long number) {
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public BookingStatusEnum getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(final BookingStatusEnum bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(final List<Service> services) {
        this.services = services;
    }

    public List<RoomReservation> getRoomReservations() {
        return roomReservations;
    }

    public void setRoomReservations(final List<RoomReservation> roomReservations) {
        this.roomReservations = roomReservations;
    }

    public List<BookingBill> getBookingBills() {
        return bookingBills;
    }

    public void setBookingBills(final List<BookingBill> bookingBills) {
        this.bookingBills = bookingBills;
    }
}