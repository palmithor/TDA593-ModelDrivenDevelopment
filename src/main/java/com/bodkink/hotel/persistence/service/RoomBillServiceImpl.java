package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.business.model.RoomBill;
import com.bodkink.hotel.persistence.IRoomBillService;
import com.bodkink.hotel.persistence.dao.RoomBillDAO;
import com.bodkink.hotel.persistence.model.RoomBillEntity;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;

/**
 * Created by Carl Jansson on 15/12/2014.
 */
public class RoomBillServiceImpl implements IRoomBillService {

    @Inject
    RoomBillDAO roomBillDAO;

    @Override
    public EList<RoomBillEntity> list() {
        return null;
    }

    @Override
    public RoomBill persist(RoomBillEntity roomBillEntity) {
        roomBillDAO.save(roomBillEntity);
        return null;
    }
}
