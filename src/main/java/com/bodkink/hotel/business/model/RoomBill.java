package com.bodkink.hotel.business.model;

import java.util.List;

public class RoomBill extends Bill {

    /**
     *
     */
    private List<BillableItem> billableItem;
    /**
     *
     */
    private String id;

    /**
     * Getter of billableItem
     */
    public List<BillableItem> getBillableItem() {
        return billableItem;
    }

    /**
     * Setter of billableItem
     */
    public void setBillableItem(List<BillableItem> billableItem) {
        this.billableItem = billableItem;
    }

    /**
     * Getter of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter of id
     */
    public void setId(String id) {
        this.id = id;
    }

}
