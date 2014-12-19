package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.CARD_INFORMATION)
public class CardInformationEntity {

    @Id
    private final ObjectId id;
    private final String ccNumber;
    private final String ccv;
    private final Integer expiryMonth;
    private final Integer expiryYear;
    private final String firstName;
    private final String lastName;

    @Embedded
    private final AddressEntity address;

    public CardInformationEntity() {
        this.id = null;
        this.ccNumber = null;
        this.ccv = null;
        this.expiryMonth = null;
        this.expiryYear = null;
        this.firstName = null;
        this.lastName = null;
        this.address = null;
    }

    public CardInformationEntity(final String ccNumber, final String ccv, final Integer expiryMonth, final Integer expiryYear, final String firstName, final String lastName, final AddressEntity address) {
        this.id = null;
        this.ccNumber = ccNumber;
        this.ccv = ccv;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public CardInformationEntity(final ObjectId id, final String ccNumber, final String ccv, final Integer expiryMonth, final Integer expiryYear, final String firstName, final String lastName, final AddressEntity address) {
        this.id = id;
        this.ccNumber = ccNumber;
        this.ccv = ccv;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public ObjectId getId() {
        return id;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public String getCcv() {
        return ccv;
    }

    public Integer getExpiryMonth() {
        return expiryMonth;
    }

    public Integer getExpiryYear() {
        return expiryYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public AddressEntity getAddress() {
        return address;
    }
}
