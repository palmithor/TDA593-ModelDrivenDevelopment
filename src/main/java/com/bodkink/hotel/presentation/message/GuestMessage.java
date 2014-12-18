package com.bodkink.hotel.presentation.message;


import org.mongodb.morphia.annotations.Entity;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.GUEST)
public class GuestMessage extends Person {


    private final String id;

    public GuestMessage() {
        super();
        this.id = null;
    }

    public GuestMessage(final String firstName, final String lastName, final Integer birthYear) {
        super(firstName, lastName, birthYear);
        this.id = null;
    }

    public GuestMessage(final String id, final String firstName, final String lastName, final Integer birthYear) {
        super(firstName, lastName, birthYear);
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
