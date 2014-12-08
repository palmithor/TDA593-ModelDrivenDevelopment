package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.persistence.IRoomExtraService;
import com.bodkink.hotel.persistence.dao.RoomExtraDAO;
import com.bodkink.hotel.persistence.model.RoomExtraEntity;
import com.google.inject.Inject;

import java.util.List;

/**
 * @author palmithor
 * @since 08/12/14.
 */
public class RoomExtraServiceImpl implements IRoomExtraService {

    @Inject
    RoomExtraDAO roomExtraDAO;

    @Override
    public List<RoomExtraEntity> listAll() {
        return roomExtraDAO.find().asList();
    }
}
