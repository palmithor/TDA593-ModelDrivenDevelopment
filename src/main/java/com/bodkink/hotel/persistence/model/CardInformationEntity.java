package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.time.LocalDate;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("CardInformation")
public class CardInformationEntity {

    @Id
    private final ObjectId id;
    private final String cardNumber;
    private final String cardHolderName;
    private final LocalDate expirationDate;
    private final AddressEntity addressEntity;

    public CardInformationEntity() {
        this.addressEntity = null;
        this.expirationDate = null;
        this.cardHolderName = null;
        this.cardNumber = null;
        this.id = null;
    }

    public CardInformationEntity(String cardNumber, String cardHolderName, LocalDate expirationDate, AddressEntity addressEntity) {
        this.id = null;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.addressEntity = addressEntity;
    }

    public CardInformationEntity(ObjectId id, String cardNumber, String cardHolderName, LocalDate expirationDate, AddressEntity addressEntity) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.addressEntity = addressEntity;
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

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }
}
