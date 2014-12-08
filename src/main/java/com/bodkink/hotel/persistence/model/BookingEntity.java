package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("Booking")
public class BookingEntity {

    @Id
    private final ObjectId id;
    private final Long number;
    private final CustomerEntity customer;
    @Reference
    private final List<ServiceEntity> services;
    @Reference
    private final List<RoomReservationEntity> roomReservations;
    @Reference
    private final List<BookingBillEntity> bookingBills; // At most 2

    public BookingEntity() {
        this.bookingBills = null;
        this.roomReservations = null;
        this.services = null;
        this.customer = null;
        this.number = null;
        this.id = null;
    }

    public BookingEntity(Long number, CustomerEntity customer, List<ServiceEntity> services, List<RoomReservationEntity> roomReservations, List<BookingBillEntity> bookingBills) {
        this.id = null;
        this.number = number;
        this.customer = customer;
        this.services = services;
        this.roomReservations = roomReservations;
        this.bookingBills = bookingBills;
    }

    public BookingEntity(ObjectId id, Long number, CustomerEntity customer, List<ServiceEntity> services, List<RoomReservationEntity> roomReservations, List<BookingBillEntity> bookingBills) {
        this.id = id;
        this.number = number;
        this.customer = customer;
        this.services = services;
        this.roomReservations = roomReservations;
        this.bookingBills = bookingBills;
    }

    public ObjectId getId() {
        return id;
    }

    public Long getNumber() {
        return number;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public List<ServiceEntity> getServices() {
        return services;
    }

    public List<RoomReservationEntity> getRoomReservations() {
        return roomReservations;
    }

    public List<BookingBillEntity> getBookingBills() {
        return bookingBills;
    }
}