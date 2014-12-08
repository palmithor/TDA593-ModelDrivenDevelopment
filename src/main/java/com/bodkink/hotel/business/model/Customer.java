package com.bodkink.hotel.business.model;

import java.util.List;

public class Customer extends Person {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private String phone;
    /**
     *
     */
    private String email;
    /**
     *
     */
    private List<String> notes;
    /**
     *
     */
    private CardInformation cardInformation;

    /**
     * Getter of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter of id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter of phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter of notes
     */
    public List<String> getNotes() {
        return notes;
    }

    /**
     * Setter of notes
     */
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    /**
     * Getter of cardInformation
     */
    public CardInformation getCardInformation() {
        return cardInformation;
    }

    /**
     * Setter of cardInformation
     */
    public void setCardInformation(CardInformation cardInformation) {
        this.cardInformation = cardInformation;
    }

}
