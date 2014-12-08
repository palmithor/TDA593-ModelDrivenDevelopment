package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;


/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.CLASSIFICATION)
public class ClassificationEntity {

    @Id
    private final ObjectId id;
    private final String title;
    private final String description;

    public ClassificationEntity() {
        this.id = null;
        this.title = null;
        this.description = null;
    }

    public ClassificationEntity(final String title, final String description) {
        this.id = null;
        this.title = title;
        this.description = description;
    }

    public ClassificationEntity(final ObjectId id, final String title, final String description) {
        this.id = id;
        this.title = title;
        this.description = description;
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
