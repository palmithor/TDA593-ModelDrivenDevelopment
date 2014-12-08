package com.bodkink.hotel.business.model;

import java.util.Date;

public class CardInformation {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private String cardNumber;
    /**
     *
     */
    private String CardHolderName;
    /**
     *
     */
    private Date expirationDate;
    /**
     *
     */
    private Address address;

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
     * Getter of cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Setter of cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Getter of CardHolderName
     */
    public String getCardHolderName() {
        return CardHolderName;
    }

    /**
     * Setter of CardHolderName
     */
    public void setCardHolderName(String CardHolderName) {
        this.CardHolderName = CardHolderName;
    }

    /**
     * Getter of expirationDate
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Setter of expirationDate
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Getter of address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Setter of address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

}
