package com.bodkink.hotel.persistence;

import com.bodkink.hotel.persistence.model.RoomExtraEntity;

import java.util.List;

/**
 * @author palmithor
 * @since 08/12/14.
 */
public interface IRoomExtraService {

    public List<RoomExtraEntity> listAll();
}
