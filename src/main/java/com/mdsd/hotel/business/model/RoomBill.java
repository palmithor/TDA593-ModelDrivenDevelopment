package com.mdsd.hotel.business.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomBill extends Bill {
    private List<BillableItem> items;


    public RoomBill() {
        super();
        this.items = new ArrayList<>();
    }

    public RoomBill(final List<BillableItem> items) {
        this.items = items;
    }

    public RoomBill(final CardInformation cardInformation, final List<BillableItem> items) {
        super(cardInformation);
        this.items = items;
    }

    public void addBillableItem(final BillableItem billableItem) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(billableItem);
    }

    public List<BillableItem> getItems() {
        return items;
    }

    public void setItems(final List<BillableItem> items) {
        this.items = items;
    }
}
