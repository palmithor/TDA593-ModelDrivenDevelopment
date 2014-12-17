package com.bodkink.hotel.presentation.message;

import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.RoomReservationType;

import java.util.Date;
import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomReservationMessage {


    private final String id;
    private final Date startDate;
    private final Date endDate;
    private final RoomReservationType reservationType;
    private final RoomMessage room;
    private final List<GuestEntity> guests;
    private final RoomBillMessage roomBill;

    private final ReservationStatusEnum reservationStatus;

    public RoomReservationMessage() {
        this.id = null;
        this.startDate = null;
        this.endDate = null;
        this.reservationType = null;
        this.room = null;
        this.guests = null;
        this.roomBill = null;
        reservationStatus = null;
    }

    public RoomReservationMessage(final Date startDate, final Date endDate, final RoomReservationType RoomReservationType,
                                  final RoomMessage room, final List<GuestEntity> guests, final RoomBillMessage roomBill,
                                  final ReservationStatusEnum reservationStatus) {
        this.id = null;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservationType = RoomReservationType;
        this.room = room;
        this.guests = guests;
        this.roomBill = roomBill;
        this.reservationStatus = reservationStatus;
    }


    public RoomReservationMessage(final String id, final Date startDate, final Date endDate,
                                  final RoomReservationType RoomReservationType, final RoomMessage room,
                                  final List<GuestEntity> guests, final RoomBillMessage roomBill,
                                  final ReservationStatusEnum reservationStatus) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservationType = RoomReservationType;
        this.room = room;
        this.guests = guests;
        this.roomBill = roomBill;
        this.reservationStatus = reservationStatus;
    }

    public String getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public RoomReservationType getReservationType() {
        return reservationType;
    }

    public RoomMessage getRoom() {
        return room;
    }

    public List<GuestEntity> getGuests() {
        return guests;
    }

    public RoomBillMessage getRoomBill() {
        return roomBill;
    }

    public ReservationStatusEnum getReservationStatus() {
        return reservationStatus;
    }

}
