package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Customer;

public interface ICustomerManagement {

    /**
     * @param firstName
     * @param lastName
     * @param phone
     * @param email
     * @param birthYear
     * @return
     */
    public Customer createCustomer(String firstName, String lastName, String phone, String email, int birthYear);

    /**
     * @param customer
     * @return
     */
    public Customer editCustomer(Customer customer);

}
