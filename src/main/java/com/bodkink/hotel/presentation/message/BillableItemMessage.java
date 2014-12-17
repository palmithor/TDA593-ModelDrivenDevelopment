package com.bodkink.hotel.presentation.message;


import java.math.BigDecimal;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BillableItemMessage {


    private final String id;
    private final String name;
    private final BigDecimal price;

    public BillableItemMessage() {
        this.id = null;
        this.name = null;
        this.price = null;
    }

    public BillableItemMessage(final String name, final BigDecimal price) {
        this.id = null;
        this.name = name;
        this.price = price;
    }

    public BillableItemMessage(final String id, final String name, final BigDecimal price) {
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
