package com.mdsd.hotel.presentation.model;

import java.math.BigDecimal;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Service {

    private final String id;
    private final String title;
    private final String description;
    private final BigDecimal price; // per day

    public Service() {
        this.price = null;
        this.description = null;
        this.title = null;
        this.id = null;
    }

    public Service(BigDecimal price, String description, String title, String id) {
        this.price = price;
        this.description = description;
        this.title = title;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
