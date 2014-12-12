package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.Date;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.CARD_INFORMATION)
public class CardInformationEntity {

    @Id
    private final ObjectId id;
    private final String cardNumber;
    private final String cardHolderName;
    private final Date expirationDate;
    @Reference
    private final AddressEntity address;

    public CardInformationEntity() {
        this.address = null;
        this.expirationDate = null;
        this.cardHolderName = null;
        this.cardNumber = null;
        this.id = null;
    }

    public CardInformationEntity(final String cardNumber, final String cardHolderName, final Date expirationDate,
                                 final AddressEntity address) {
        this.id = null;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.address = address;
    }

    public CardInformationEntity(final ObjectId id, final String cardNumber, final String cardHolderName,
                                 final Date expirationDate, final AddressEntity address) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.address = address;
    }

    public ObjectId getId() {
        return id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public AddressEntity getAddress() {
        return address;
    }
}
