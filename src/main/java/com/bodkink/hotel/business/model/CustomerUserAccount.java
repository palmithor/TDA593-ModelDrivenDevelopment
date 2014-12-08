package com.bodkink.hotel.business.model;

public class CustomerUserAccount extends UserAccount {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private Customer customer;
    /**
     *
     */
    private UserGroupEnum userGroupEnum;

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
     * Getter of customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter of customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Getter of userGroupEnum
     */
    public UserGroupEnum getUserGroupEnum() {
        return userGroupEnum;
    }

    /**
     * Setter of userGroupEnum
     */
    public void setUserGroupEnum(UserGroupEnum userGroupEnum) {
        this.userGroupEnum = userGroupEnum;
    }

}
