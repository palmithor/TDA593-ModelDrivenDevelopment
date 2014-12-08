package com.bodkink.hotel.business.logic;

import com.bodkink.hotel.business.IAccountManagement;
import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.business.model.CustomerUserAccount;
import com.bodkink.hotel.business.model.UserAccount;
import com.bodkink.hotel.business.model.UserGroupEnum;

public class AccountManagementImpl implements IAccountManagement {

    /**
     * @param username
     * @param password
     * @param customer
     * @return
     */
    public CustomerUserAccount createCustomerAccount(String username, String password, Customer customer) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param username
     * @param password
     * @param userGroup
     * @return
     */
    public UserAccount createEmployeeAccount(String username, String password, UserGroupEnum userGroup) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param userAccount
     * @return
     */
    public UserAccount editUserAccount(UserAccount userAccount) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param username
     * @param password
     * @return
     */
    public CustomerUserAccount login(String username, String password) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @return
     */
    public boolean isLoggedIn() {
        // TODO Auto-generated method
        return false;
    }

}
