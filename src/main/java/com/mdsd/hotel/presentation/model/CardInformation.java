package com.mdsd.hotel.presentation.model;

import java.time.LocalDate;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class CardInformation {

    private final String id;
    private final String cardNumber;
    private final String cardHolderName;
    private final LocalDate expirationDate;
    private final Address address;

    public CardInformation() {
        this.address = null;
        this.expirationDate = null;
        this.cardHolderName = null;
        this.cardNumber = null;
        this.id = null;
    }

    public CardInformation(Address address, LocalDate expirationDate, String cardHolderName, String cardNumber, String id) {
        this.address = address;
        this.expirationDate = expirationDate;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.id = id;
    }

    public String getId() {
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

    public Address getAddress() {
        return address;
    }
}
