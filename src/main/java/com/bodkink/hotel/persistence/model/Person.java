package com.bodkink.hotel.persistence.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public abstract class Person {
    private final String firstName;
    private final String lastName;
    private final Integer age;

    public Person() {
        this.firstName = null;
        this.lastName = null;
        this.age = null;
    }

    public Person(final String firstName, final String lastName, final Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
}
