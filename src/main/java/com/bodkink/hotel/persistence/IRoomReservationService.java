package com.bodkink.hotel.persistence;

import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;
import org.eclipse.emf.common.util.EList;

import java.util.Date;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public interface IRoomReservationService {

    public EList<RoomReservationEntity> list();

    public EList<RoomReservationEntity> list(Date start, Date end);

    public EList<RoomReservationEntity> list(Date start);

    public RoomReservationEntity find(String id);

    public boolean edit(RoomReservationEntity roomReservation);

    public RoomReservation persist(RoomReservationEntity roomReservation);

    public boolean delete(RoomReservationEntity roomReservation);
}
