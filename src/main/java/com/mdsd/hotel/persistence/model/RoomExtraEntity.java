package com.mdsd.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("RoomExtra")
public class RoomExtraEntity {

    @Id
    private final ObjectId id;
    private final String title;
    private final String description;

    public RoomExtraEntity() {
        this.description = null;
        this.title = null;
        this.id = null;
    }

    public RoomExtraEntity(final ObjectId id, final String title, final String description) {
        this.description = description;
        this.title = title;
        this.id = id;
    }

    public RoomExtraEntity(final String title, final String description) {
        this.description = description;
        this.title = title;
        this.id = null;
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
}
