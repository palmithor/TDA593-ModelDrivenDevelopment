package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.persistence.IRoomService;
import com.bodkink.hotel.persistence.dao.RoomDAO;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.google.inject.Inject;

import java.util.List;

/**
 * @author erik
 * @since 15/12/14.
 */
public class RoomServiceImpl implements IRoomService {

    @Inject
    RoomDAO roomDAO;

    @Override
    public List<RoomEntity> listAll() {
        return roomDAO.find().asList();
    }

    @Override
    public RoomEntity edit(RoomEntity roomEntity) {
        RoomEntity fromDb = roomDAO.get(roomEntity.getId());
        if (fromDb != null) {
            roomDAO.save(roomEntity);
            return roomEntity;
        } else
            return null;
    }

    @Override
    public RoomEntity persist(RoomEntity roomEntity) {
        roomDAO.save(roomEntity);
        return roomEntity;
    }
}
