package com.mdsd.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.math.BigDecimal;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("BillableItem")
public class BillableItemEntity {

    @Id
    private final ObjectId id;
    private final String name;
    private final BigDecimal price;

    public BillableItemEntity() {
        this.id = null;
        this.name = null;
        this.price = null;
    }

    public BillableItemEntity(final ObjectId id, final String name, final BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
