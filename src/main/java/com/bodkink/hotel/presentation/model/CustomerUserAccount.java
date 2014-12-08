package com.bodkink.hotel.presentation.model;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public class CustomerUserAccount extends UserAccount {

    private final Customer customer;

    public CustomerUserAccount() {
        super();
        this.customer = null;
    }

    public CustomerUserAccount(final String id, final String username, final String password, final UserGroup userGroup, final Customer customer) {
        super(id, username, password, userGroup);
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
