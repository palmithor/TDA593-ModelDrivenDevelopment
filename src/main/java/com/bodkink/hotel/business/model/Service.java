package com.bodkink.hotel.business.model;

import java.math.BigDecimal;

public class Service {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private String title;
    /**
     *
     */
    private String description;
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
     * Getter of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter of description
     */
    public void setDescription(String description) {
        this.description = description;
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
