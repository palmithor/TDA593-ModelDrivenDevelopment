package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("Address")
public class AddressEntity {

    @Id
    private final ObjectId id;
    private final String addressLine1;
    private final String addressLine2;
    private final String zipCode;
    private final String city;
    private final String country;

    public AddressEntity() {
        this.id = null;
        this.country = null;
        this.city = null;
        this.zipCode = null;
        this.addressLine2 = null;
        this.addressLine1 = null;
    }

    public AddressEntity(final ObjectId id, final String country, final String city, final String zipCode, final String addressLine2, final String addressLine1) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.addressLine2 = addressLine2;
        this.addressLine1 = addressLine1;
    }

    public AddressEntity(final String country, final String city, final String zipCode, final String addressLine2, final String addressLine1) {
        this.id = null;
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.addressLine2 = addressLine2;
        this.addressLine1 = addressLine1;
    }

    public ObjectId getId() {
        return id;
    }

    public String getIdRaw() {
        return id.toString();
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
