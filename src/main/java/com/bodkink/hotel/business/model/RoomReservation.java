package com.bodkink.hotel.business.model;

import java.util.Date;
import java.util.List;

public class RoomReservation {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private Date startDate;
    /**
     *
     */
    private Date endDate;
    /**
     *
     */
    private List<Guest> guest;
    /**
     *
     */
    private RoomReservationType roomReservationType;
    private Room room;
    /**
     *
     */
    private RoomBill roomBill;
    /**
     *
     */
    private ReservationStatusEnum reservationStatusEnum;

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
     * Getter of startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Setter of startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter of endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Setter of endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter of guest
     */
    public List<Guest> getGuest() {
        return guest;
    }

    /**
     * Setter of guest
     */
    public void setGuest(List<Guest> guest) {
        this.guest = guest;
    }

    /**
     * Getter of roomReservationType
     */
    public RoomReservationType getRoomReservationType() {
        return roomReservationType;
    }

    /**
     * Setter of roomReservationType
     */
    public void setRoomReservationType(RoomReservationType roomReservationType) {
        this.roomReservationType = roomReservationType;
    }

    /**
     * Getter of room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Setter of room
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * Getter of roomBill
     */
    public RoomBill getRoomBill() {
        return roomBill;
    }

    /**
     * Setter of roomBill
     */
    public void setRoomBill(RoomBill roomBill) {
        this.roomBill = roomBill;
    }

    /**
     * Getter of reservationStatusEnum
     */
    public ReservationStatusEnum getReservationStatusEnum() {
        return reservationStatusEnum;
    }

    /**
     * Setter of reservationStatusEnum
     */
    public void setReservationStatusEnum(ReservationStatusEnum reservationStatusEnum) {
        this.reservationStatusEnum = reservationStatusEnum;
    }

}
