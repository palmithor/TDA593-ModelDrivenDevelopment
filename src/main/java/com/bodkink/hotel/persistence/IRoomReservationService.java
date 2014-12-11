package com.bodkink.hotel.persistence;

import com.bodkink.hotel.business.model.RoomReservation;
import org.eclipse.emf.common.util.EList;

import java.util.Date;
import java.util.List;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public interface IRoomReservationService {

    public EList<RoomReservation> list();

    public EList<RoomReservation> list(Date start, Date end);

    public EList<RoomReservation> list(Date start);
}
