package com.mdsd.hotel.business.model;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public class CustomerUserAccount extends UserAccount {
    private Customer customer;

    public CustomerUserAccount() {
        super();
    }

    public CustomerUserAccount(String username, String password, UserGroup userGroup, Customer customer) {
        super(username, password, userGroup);
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
