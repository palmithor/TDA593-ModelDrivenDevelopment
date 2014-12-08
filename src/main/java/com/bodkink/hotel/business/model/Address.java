package com.bodkink.hotel.business.model;

public class Address {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private String addressLine1;
    /**
     *
     */
    private String addressLine2;
    /**
     *
     */
    private String zipCode;
    /**
     *
     */
    private String city;
    /**
     *
     */
    private String country;

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
     * Getter of addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter of addressLine1
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Getter of addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter of addressLine2
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Getter of zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter of zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Getter of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter of city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter of country
     */
    public void setCountry(String country) {
        this.country = country;
    }

}
