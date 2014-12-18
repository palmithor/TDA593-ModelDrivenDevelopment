package com.bodkink.hotel.persistence;

import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.persistence.model.RoomEntity;

import java.util.List;

/**
 * @author erik
 * @since 15/12/14.
 */
public interface IRoomService {

    public List<RoomEntity> listAll();

    public RoomEntity edit(RoomEntity roomEntity);

    public RoomEntity persist(RoomEntity roomEntity);
}
