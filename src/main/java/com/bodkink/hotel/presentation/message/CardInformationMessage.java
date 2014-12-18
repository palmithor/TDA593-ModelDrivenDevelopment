package com.bodkink.hotel.presentation.message;


/**
 * @author palmithor
 * @since 27/11/14.
 */
public class CardInformationMessage {


    private final String id;
    private final String ccNumber;
    private final String ccv;
    private final Integer expiryMonth;
    private final Integer expiryYear;
    private final String firstName;
    private final String lastName;

    private final AddressMessage address;

    public CardInformationMessage() {
        this.id = null;
        this.ccNumber = null;
        this.ccv = null;
        this.expiryMonth = null;
        this.expiryYear = null;
        this.firstName = null;
        this.lastName = null;
        this.address = null;
    }

    public CardInformationMessage(final String ccNumber, final String ccv, final Integer expiryMonth, final Integer expiryYear, final String firstName, final String lastName, final AddressMessage address) {
        this.id = "";
        this.ccNumber = ccNumber;
        this.ccv = ccv;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public CardInformationMessage(final String id, final String ccNumber, final String ccv, final Integer expiryMonth, final Integer expiryYear, final String firstName, final String lastName, final AddressMessage address) {
        this.id = id;
        this.ccNumber = ccNumber;
        this.ccv = ccv;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getId() {
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

    public AddressMessage getAddress() {
        return address;
    }
}
