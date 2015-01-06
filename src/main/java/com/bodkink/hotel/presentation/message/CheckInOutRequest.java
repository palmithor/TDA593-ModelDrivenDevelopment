package com.bodkink.hotel.presentation.message;

/**
 * @author palmithor
 * @since 06/01/15.
 */
public class CheckInOutRequest {
    private final RoomReservationMessage roomReservationMessage;
    private final GuestMessage guest;

    public CheckInOutRequest() {
        this.roomReservationMessage = null;
        this.guest = null;
    }

    public CheckInOutRequest(RoomReservationMessage roomReservationMessage, GuestMessage guest) {
        this.roomReservationMessage = roomReservationMessage;
        this.guest = guest;
    }

    public RoomReservationMessage getRoomReservationMessage() {
        return roomReservationMessage;
    }

    public GuestMessage getGuest() {
        return guest;
    }
}
