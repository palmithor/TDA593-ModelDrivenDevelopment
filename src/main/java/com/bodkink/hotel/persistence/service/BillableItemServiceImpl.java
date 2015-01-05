package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.persistence.IBillableItemService;
import com.bodkink.hotel.persistence.dao.BillableItemDAO;
import com.bodkink.hotel.persistence.model.BillableItemEntity;
import com.google.inject.Inject;

import java.util.List;

/**
 * @author sarajohansson
 * @since 18/12/14
 */
public class BillableItemServiceImpl implements IBillableItemService {

    @Inject
    BillableItemDAO billableItemDAO;

    @Override
    public List<BillableItemEntity> listAll() {
        return billableItemDAO.find().asList();
    }

    @Override
    public BillableItemEntity edit(BillableItemEntity billableItemEntity) {
        BillableItemEntity fromDb = billableItemDAO.get(billableItemEntity.getId());
        if (fromDb != null) {
            billableItemDAO.save(billableItemEntity);
            return billableItemEntity;
        } else {
            return null;
        }
    }

    @Override
    public BillableItemEntity persist(BillableItemEntity billableItemEntity) {
        billableItemDAO.save(billableItemEntity);
        return billableItemEntity;
    }
}
