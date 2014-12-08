package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.BillableItem;

import java.math.BigDecimal;

public interface IBillableItemManagement {

    /**
     * @param name
     * @param price
     * @return
     */
    public BillableItem createBillableItem(String name, BigDecimal price);

    /**
     * @param billableItem
     * @return
     */
    public BillableItem editBillableItem(BillableItem billableItem);

    /**
     * @param items
     */
    public void listBillableItems(BillableItem items);

}
