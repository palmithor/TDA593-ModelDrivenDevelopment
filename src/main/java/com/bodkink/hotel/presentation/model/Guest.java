package com.bodkink.hotel.presentation.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Guest extends Person {

    private final String id;

    public Guest() {
        super();
        this.id = null;
    }

    public Guest(final String id, final String firstName, final String lastName, final Integer age) {
        super(firstName, lastName, age);
        this.id = id;
    }


}
