package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.time.LocalDate;
import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("RoomReservation")
public class RoomReservationEntity {

    @Id
    private final ObjectId id;
    private final LocalDate startDate;
    private final LocalDate endDate;
    @Reference
    private final RoomReservationTypeEntity type;
    @Reference
    private final RoomEntity room;
    @Reference
    private final List<GuestEntity> guests;
    @Reference
    private final RoomBillEntity roomBill;

    public RoomReservationEntity() {
        this.id = null;
        this.startDate = null;
        this.endDate = null;
        this.type = null;
        this.room = null;
        this.guests = null;
        this.roomBill = null;
    }

    public RoomReservationEntity(LocalDate startDate, LocalDate endDate, RoomReservationTypeEntity type, RoomEntity room, List<GuestEntity> guests, RoomBillEntity roomBill) {
        this.id = null;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.room = room;
        this.guests = guests;
        this.roomBill = roomBill;
    }


    public RoomReservationEntity(ObjectId id, LocalDate startDate, LocalDate endDate, RoomReservationTypeEntity type, RoomEntity room, List<GuestEntity> guests, RoomBillEntity roomBill) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.room = room;
        this.guests = guests;
        this.roomBill = roomBill;
    }

    public ObjectId getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public RoomReservationTypeEntity getType() {
        return type;
    }

    public RoomEntity getRoom() {
        return room;
    }

    public List<GuestEntity> getGuests() {
        return guests;
    }

    public RoomBillEntity getRoomBill() {
        return roomBill;
    }
}
