package com.bodkink.hotel.presentation.model;

import java.math.BigDecimal;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BillableItem {

    private final String id;
    private final String name;
    private final BigDecimal price;

    public BillableItem() {
        this.id = null;
        this.name = null;
        this.price = null;
    }

    public BillableItem(final String id, final String name, final BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
