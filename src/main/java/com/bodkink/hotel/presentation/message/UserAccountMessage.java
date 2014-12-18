package com.bodkink.hotel.presentation.message;


/**
 * @author palmithor
 * @since 01/12/14.
 */
public class UserAccountMessage {


    private final String id;
    private final CustomerMessage customer;
    private final String username;
    private final String password;
    private final UserGroup userGroup;


    public UserAccountMessage() {
        this.id = null;
        this.customer = null;
        this.username = null;
        this.password = null;
        this.userGroup = null;
    }

    public UserAccountMessage(CustomerMessage customer, String username, String password, UserGroup userGroup) {
        this.id = null;
        this.customer = customer;
        this.username = username;
        this.password = password;
        this.userGroup = userGroup;
    }

    public UserAccountMessage(String id, CustomerMessage customer, String username, String password, UserGroup userGroup) {
        this.id = id;
        this.customer = customer;
        this.username = username;
        this.password = password;
        this.userGroup = userGroup;
    }

    public String getId() {
        return id;
    }

    public CustomerMessage getCustomer() {
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
