package com.mdsd.hotel.business.model;

import java.math.BigDecimal;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BillableItem {

    private String name;
    private BigDecimal price;

    public BillableItem() {
    }

    public BillableItem(final String name, final BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }
}
