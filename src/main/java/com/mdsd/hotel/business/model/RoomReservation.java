package com.mdsd.hotel.business.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomReservation {
    private LocalDate startDate;
    private LocalDate endDate;
    private RoomReservationType type;
    private Room room;
    private List<Guest> guests;
    private RoomBill roomBill;

    public RoomReservation() {
        this.guests = new ArrayList<>();
    }

    public RoomReservation(LocalDate startDate, LocalDate endDate, RoomReservationType type, Room room, List<Guest> guests, RoomBill roomBill) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.room = room;
        this.guests = guests;
        this.roomBill = roomBill;
    }

    public void addGuest(final Guest guest) {
        if (guests == null) {
            guests = new ArrayList<>();
        }
        guests.add(guest);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public RoomReservationType getType() {
        return type;
    }

    public void setType(RoomReservationType type) {
        this.type = type;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public RoomBill getRoomBill() {
        return roomBill;
    }

    public void setRoomBill(RoomBill roomBill) {
        this.roomBill = roomBill;
    }
}
