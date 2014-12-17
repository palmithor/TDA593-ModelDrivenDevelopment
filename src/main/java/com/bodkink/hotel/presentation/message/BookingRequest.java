package com.bodkink.hotel.presentation.message;


import java.util.Date;
import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BookingRequest {

    private final Date start;
    private final Date end;
    private final CustomerMessage customer;
    private final List<ServiceMessage> services;
    private final List<RoomMessage> rooms;


    public BookingRequest() {
        this.start = null;
        this.end = null;
        this.customer = null;
        this.services = null;
        this.rooms = null;
    }

    public BookingRequest(Date start, Date end, CustomerMessage customer, List<ServiceMessage> services, List<RoomMessage> rooms) {
        this.start = start;
        this.end = end;
        this.customer = customer;
        this.services = services;
        this.rooms = rooms;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public CustomerMessage getCustomer() {
        return customer;
    }

    public List<ServiceMessage> getServices() {
        return services;
    }

    public List<RoomMessage> getRooms() {
        return rooms;
    }
}