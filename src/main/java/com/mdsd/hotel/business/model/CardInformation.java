package com.mdsd.hotel.business.model;

import java.time.LocalDate;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class CardInformation {

    private String cardNumber;
    private String cardHolderName;
    private LocalDate expirationDate;
    private Address address;

    public CardInformation() {
    }

    public CardInformation(final String cardNumber, final String cardHolderName, final LocalDate expirationDate, final Address address) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(final String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(final String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(final LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }
}
