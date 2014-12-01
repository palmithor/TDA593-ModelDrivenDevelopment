package com.mdsd.hotel.business;

import com.mdsd.hotel.business.model.UserAccount;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public interface IEmployeeAuthController {

    UserAccount login(final String username, final String password);
}
