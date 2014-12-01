package com.mdsd.hotel.business;

import com.mdsd.hotel.business.model.Customer;
import com.mdsd.hotel.business.model.CustomerUserAccount;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public interface ICustomerAuthController {

    CustomerUserAccount signUp(final String username, final String password, final Customer customer);

    CustomerUserAccount login(final String username, final String password);

    void logout(final String username);
}
