package com.bodkink.hotel.persistence.model;

import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.RoomReservationType;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.utils.IndexDirection;

import java.util.Date;
import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.ROOM_RESERVATION)
public class RoomReservationEntity {

    @Id
    private final ObjectId id;
    @Indexed(value = IndexDirection.ASC, name = "upc")
    private final Date startDate;
    private final Date endDate;
    private final RoomReservationType reservationType;
    @Reference
    private final RoomEntity room;
    @Reference
    private final List<GuestEntity> guests;
    @Reference
    private final RoomBillEntity roomBill;

    private final ReservationStatusEnum reservationStatus;

    public RoomReservationEntity() {
        this.id = null;
        this.startDate = null;
        this.endDate = null;
        this.reservationType = null;
        this.room = null;
        this.guests = null;
        this.roomBill = null;
        reservationStatus = null;
    }

    public RoomReservationEntity(final Date startDate, final Date endDate, final RoomReservationType RoomReservationType,
                                 final RoomEntity room, final List<GuestEntity> guests, final RoomBillEntity roomBill,
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


    public RoomReservationEntity(final ObjectId id, final Date startDate, final Date endDate,
                                 final RoomReservationType RoomReservationType, final RoomEntity room,
                                 final List<GuestEntity> guests, final RoomBillEntity roomBill,
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

    public ObjectId getId() {
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

    public RoomEntity getRoom() {
        return room;
    }

    public List<GuestEntity> getGuests() {
        return guests;
    }

    public RoomBillEntity getRoomBill() {
        return roomBill;
    }

    public ReservationStatusEnum getReservationStatus() {
        return reservationStatus;
    }

}
