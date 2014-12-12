package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.CUSTOMER)
public class CustomerEntity extends Person {

    @Id
    private final ObjectId id;
    private final String phone;
    private final String email;
    @Reference
    private final CardInformationEntity cardInformation;
    private final List<String> notes;

    public CustomerEntity() {
        super();
        this.id = null;
        this.phone = null;
        this.email = null;
        this.notes = null;
        this.cardInformation = null;
    }

    public CustomerEntity(final String firstName, final String lastName, final Integer age, final String phone,
                          final String email, final List<String> notes, final CardInformationEntity cardInformation) {
        super(firstName, lastName, age);
        this.id = null;
        this.phone = phone;
        this.email = email;
        this.notes = notes;
        this.cardInformation = cardInformation;
    }

    public CustomerEntity(final ObjectId id, final String firstName, final String lastName, final Integer age,
                          final String phone, final String email, final List<String> notes, final CardInformationEntity cardInformation) {
        super(firstName, lastName, age);
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.notes = notes;
        this.cardInformation = cardInformation;
    }

   /* public CustomerEntity(final ObjectId id, final Customer customer) {
        this.id = id;

    }*/

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

    public CardInformationEntity getCardInformation() {
        return cardInformation;
    }
}
