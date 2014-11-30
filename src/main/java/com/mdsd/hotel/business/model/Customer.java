package com.mdsd.hotel.business.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Customer extends Person {
    private String phone;
    private String email;
    private List<String> notes;

    public Customer() {
        this.notes = new ArrayList<>();
    }

    public Customer(final String phone, final String email, final List<String> notes) {
        this.phone = phone;
        this.email = email;
        this.notes = notes;
    }

    public void addNote(final String note) {
        if (notes == null) {
            notes = new ArrayList<>();
        }
        notes.add(note);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }
}
