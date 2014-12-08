package com.bodkink.hotel.business.model;

import java.math.BigDecimal;

public class BillableItem {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private BigDecimal price;

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

    /**
     * Getter of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter of price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Setter of price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
