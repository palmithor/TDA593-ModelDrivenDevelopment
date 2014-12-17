package com.bodkink.hotel.presentation.message;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public abstract class Person {
    private final String firstName;
    private final String lastName;
    private final Integer birthYear;

    public Person() {
        this.firstName = null;
        this.lastName = null;
        this.birthYear = null;
    }

    public Person(final String firstName, final String lastName, final Integer birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }
}
