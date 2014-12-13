package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.GUEST)
public class GuestEntity extends Person {

    @Id
    private final ObjectId id;

    public GuestEntity() {
        super();
        this.id = null;
    }

    public GuestEntity(final String firstName, final String lastName, final Integer birthYear) {
        super(firstName, lastName, birthYear);
        this.id = null;
    }

    public GuestEntity(final ObjectId id, final String firstName, final String lastName, final Integer birthYear) {
        super(firstName, lastName, birthYear);
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }
}
