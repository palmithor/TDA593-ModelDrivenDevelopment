package com.mdsd.hotel.business.model;

import java.math.BigDecimal;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Service {

    private String title;
    private String description;
    private BigDecimal price; // per day

    public Service() {
    }

    public Service(String title, String description, BigDecimal price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
