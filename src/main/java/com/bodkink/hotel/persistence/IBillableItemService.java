package com.bodkink.hotel.persistence;

import com.bodkink.hotel.persistence.model.BillableItemEntity;

import java.util.List;

/**
 * @author sarajohansson
 * @since 18/12/14
 */
public interface IBillableItemService {

    public List<BillableItemEntity> listAll();

    public BillableItemEntity edit(BillableItemEntity billableItemEntity);

    public BillableItemEntity persist(BillableItemEntity billableItemEntity);

}
