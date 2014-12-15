package com.bodkink.hotel.persistence;

import com.bodkink.hotel.persistence.model.BedTypeEntity;

import java.util.List;

/**
 * @author palmithor
 * @since 09/12/14.
 */
public interface IBedTypeService {

    public List<BedTypeEntity> listAll();

    public BedTypeEntity edit(BedTypeEntity bedTypeEntity);

    public BedTypeEntity persist(BedTypeEntity bedTypeEntity);

}
