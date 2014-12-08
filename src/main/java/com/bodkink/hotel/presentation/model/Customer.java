package com.bodkink.hotel.presentation.model;

import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Customer extends Person {

    private final String id;
    private final String phone;
    private final String email;
    private final List<String> notes;

    public Customer(String firstName, String lastName, Integer age, String id, String phone, String email, List<String> notes) {
        super(firstName, lastName, age);
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.notes = notes;
    }

    public Customer() {
        super();
        this.id = null;
        this.phone = null;
        this.email = null;
        this.notes = null;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getNotes() {
        return notes;
    }
}
