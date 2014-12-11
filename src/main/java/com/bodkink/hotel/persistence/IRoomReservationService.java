package com.bodkink.hotel.persistence;

import com.bodkink.hotel.business.model.RoomReservation;

import java.util.List;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public interface IRoomReservationService {

    public List<RoomReservation> list();
}
