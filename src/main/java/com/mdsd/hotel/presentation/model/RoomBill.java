package com.mdsd.hotel.presentation.model;

import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomBill extends Bill {

    private final List<BillableItem> items;

    public RoomBill() {
        super();
        this.items = null;
    }

    public RoomBill(final String id, final CardInformation cardInformation, final List<BillableItem> items) {
        super(id, cardInformation);
        this.items = items;
    }

    public List<BillableItem> getItems() {
        return items;
    }
}
