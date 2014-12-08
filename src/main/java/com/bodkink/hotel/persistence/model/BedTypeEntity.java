package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.BED_TYPE)
public class BedTypeEntity {

    @Id
    private final ObjectId id;
    private final String name;
    private final Integer length;
    private final Integer width;
    private final Integer places; // Allowed number of people

    public BedTypeEntity() {
        this.places = null;
        this.width = null;
        this.length = null;
        this.name = null;
        this.id = null;
    }

    public BedTypeEntity(Integer places, Integer width, Integer length, String name) {
        this.places = places;
        this.width = width;
        this.length = length;
        this.name = name;
        this.id = null;
    }

    public BedTypeEntity(final ObjectId id, Integer places, Integer width, Integer length, String name) {
        this.places = places;
        this.width = width;
        this.length = length;
        this.name = name;
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getPlaces() {
        return places;
    }
}
