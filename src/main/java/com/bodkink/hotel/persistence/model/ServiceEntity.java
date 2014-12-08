package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.math.BigDecimal;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("Service")
public class ServiceEntity {

    @Id
    private final ObjectId id;
    private final String title;
    private final String description;
    private final BigDecimal price; // per day

    public ServiceEntity() {
        this.price = null;
        this.description = null;
        this.title = null;
        this.id = null;
    }

    public ServiceEntity(String title, String description, BigDecimal price) {
        this.id = null;
        this.title = title;
        this.description = description;
        this.price = price;
    }


    public ServiceEntity(ObjectId id, String title, String description, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public ObjectId getId() {
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
