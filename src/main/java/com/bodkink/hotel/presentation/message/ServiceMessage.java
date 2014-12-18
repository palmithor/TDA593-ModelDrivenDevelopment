package com.bodkink.hotel.presentation.message;


import org.mongodb.morphia.annotations.Entity;

import java.math.BigDecimal;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.SERVICE)
public class ServiceMessage {


    private final String id;
    private final String title;
    private final String description;
    private final BigDecimal price; // per day

    public ServiceMessage() {
        this.price = null;
        this.description = null;
        this.title = null;
        this.id = null;
    }

    public ServiceMessage(String title, String description, BigDecimal price) {
        this.id = null;
        this.title = title;
        this.description = description;
        this.price = price;
    }


    public ServiceMessage(String id, String title, String description, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
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
