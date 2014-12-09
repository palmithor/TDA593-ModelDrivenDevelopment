package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.persistence.IBedTypeService;
import com.bodkink.hotel.persistence.dao.BedTypeDAO;
import com.bodkink.hotel.persistence.model.BedTypeEntity;
import com.google.inject.Inject;

import java.util.List;

/**
 * @author palmithor
 * @since 08/12/14.
 */
public class BedTypeServiceImpl implements IBedTypeService {

    @Inject
    BedTypeDAO bedTypeDAO;

    @Override
    public List<BedTypeEntity> listAll() {
        return bedTypeDAO.find().asList();
    }
}
