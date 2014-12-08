package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("Customer")
public class CustomerEntity extends Person {

    @Id
    private final ObjectId id;
    private final String phone;
    private final String email;
    private final List<String> notes;

    public CustomerEntity() {
        super();
        this.id = null;
        this.phone = null;
        this.email = null;
        this.notes = null;
    }

    public CustomerEntity(String firstName, String lastName, Integer age, String phone, String email, List<String> notes) {
        super(firstName, lastName, age);
        this.id = null;
        this.phone = phone;
        this.email = email;
        this.notes = notes;
    }

    public CustomerEntity(ObjectId id, String firstName, String lastName, Integer age, String phone, String email, List<String> notes) {
        super(firstName, lastName, age);
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.notes = notes;
    }

    public ObjectId getId() {
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
