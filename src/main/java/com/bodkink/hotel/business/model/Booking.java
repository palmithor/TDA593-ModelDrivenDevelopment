package com.bodkink.hotel.business.model;

import java.util.List;

public class Booking {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private Integer number;
    /**
     *
     */
    private Customer customer;
    /**
     *
     */
    private List<RoomReservation> roomReservation;
    /**
     *
     */
    private List<Service> service;
    /**
     *
     */
    private List<BookingBill> bookingBill;

    /**
     * Getter of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter of id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter of number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Setter of number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Getter of customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter of customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Getter of roomReservation
     */
    public List<RoomReservation> getRoomReservation() {
        return roomReservation;
    }

    /**
     * Setter of roomReservation
     */
    public void setRoomReservation(List<RoomReservation> roomReservation) {
        this.roomReservation = roomReservation;
    }

    /**
     * Getter of service
     */
    public List<Service> getService() {
        return service;
    }

    /**
     * Setter of service
     */
    public void setService(List<Service> service) {
        this.service = service;
    }

    /**
     * Getter of bookingBill
     */
    public List<BookingBill> getBookingBill() {
        return bookingBill;
    }

    /**
     * Setter of bookingBill
     */
    public void setBookingBill(List<BookingBill> bookingBill) {
        this.bookingBill = bookingBill;
    }

}
