package com.bodkink.hotel.persistence;

import com.bodkink.hotel.business.model.RoomBill;
import com.bodkink.hotel.persistence.model.RoomBillEntity;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;
import org.eclipse.emf.common.util.EList;

/**
 * Created by Carl Jansson on 15/12/2014.
 */
public interface IRoomBillService {

    public EList<RoomBillEntity> list();

    public RoomBill persist(RoomBillEntity roomBillEntity);

}
