package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.business.model.CustomerUserAccount;
import com.bodkink.hotel.business.model.UserAccount;
import com.bodkink.hotel.business.model.UserGroupEnum;

public interface IAccountManagement {

    /**
     * @param username
     * @param password
     * @param customer
     * @return
     */
    public CustomerUserAccount createCustomerAccount(String username, String password, Customer customer);

    /**
     * @param username
     * @param password
     * @param userGroup
     * @return
     */
    public UserAccount createEmployeeAccount(String username, String password, UserGroupEnum userGroup);

    /**
     * @param userAccount
     * @return
     */
    public UserAccount editUserAccount(UserAccount userAccount);

    /**
     * @param username
     * @param password
     * @return
     */
    public CustomerUserAccount login(String username, String password);

    /**
     * @return
     */
    public boolean isLoggedIn();

}
