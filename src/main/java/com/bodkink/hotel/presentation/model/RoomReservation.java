package com.bodkink.hotel.presentation.model;

import java.time.LocalDate;
import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomReservation {

    private final String id;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final RoomReservationType type;
    private final Room room;
    private final List<Guest> guests;
    private final RoomBill roomBill;

    public RoomReservation() {
        this.roomBill = null;
        this.guests = null;
        this.id = null;
        this.startDate = null;
        this.endDate = null;
        this.type = null;
        this.room = null;
    }

    public RoomReservation(RoomBill roomBill, List<Guest> guests, String id, LocalDate startDate, LocalDate endDate, RoomReservationType type, Room room) {
        this.roomBill = roomBill;
        this.guests = guests;
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.room = room;
    }

    public String getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public RoomReservationType getType() {
        return type;
    }

    public Room getRoom() {
        return room;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public RoomBill getRoomBill() {
        return roomBill;
    }
}
