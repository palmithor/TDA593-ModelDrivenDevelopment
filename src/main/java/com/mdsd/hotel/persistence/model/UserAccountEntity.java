package com.mdsd.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @author palmithor
 * @since 01/12/14.
 */
@Entity("UserAccount")
public class UserAccountEntity {

    @Id
    private final ObjectId id;
    private final CustomerEntity customer;
    private final String username;
    private final String password;
    private final UserGroup userGroup;


    public UserAccountEntity() {
        this.id = null;
        this.customer = null;
        this.username = null;
        this.password = null;
        this.userGroup = null;
    }

    public UserAccountEntity(CustomerEntity customer, String username, String password, UserGroup userGroup) {
        this.id = null;
        this.customer = customer;
        this.username = username;
        this.password = password;
        this.userGroup = userGroup;
    }

    public UserAccountEntity(ObjectId id, CustomerEntity customer, String username, String password, UserGroup userGroup) {
        this.id = id;
        this.customer = customer;
        this.username = username;
        this.password = password;
        this.userGroup = userGroup;
    }

    public ObjectId getId() {
        return id;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }
}
