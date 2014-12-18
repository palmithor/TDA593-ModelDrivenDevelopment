package com.bodkink.hotel.presentation.message;


import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class CustomerMessage extends Person {


    private final String id;
    private final String phone;
    private final String email;
    private final CardInformationMessage cardInformation;
    private final List<String> notes;

    public CustomerMessage() {
        super();
        this.id = null;
        this.phone = null;
        this.email = null;
        this.notes = null;
        this.cardInformation = null;
    }

    public CustomerMessage(final String firstName, final String lastName, final Integer age, final String phone,
                           final String email, final List<String> notes, final CardInformationMessage cardInformation) {
        super(firstName, lastName, age);
        this.id = "";
        this.phone = phone;
        this.email = email;
        this.notes = notes;
        this.cardInformation = cardInformation;
    }

    public CustomerMessage(final String id, final String firstName, final String lastName, final Integer birthYear,
                           final String phone, final String email, final List<String> notes, final CardInformationMessage cardInformation) {
        super(firstName, lastName, birthYear);
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.notes = notes;
        this.cardInformation = cardInformation;
    }

   /* public CustomerEntity(final String id, final Customer customer) {
        this.id = id;

    }*/

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

    public CardInformationMessage getCardInformation() {
        return cardInformation;
    }
}
