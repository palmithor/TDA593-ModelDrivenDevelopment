package com.mdsd.hotel.business;

import com.mdsd.hotel.business.model.Bill;
import com.mdsd.hotel.business.model.Booking;
import com.mdsd.hotel.business.model.CardInformation;
import com.mdsd.hotel.business.model.Customer;

import java.util.List;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public interface IAuthenticatedUserController {

    List<Booking> listBookings(final Long customerId);

    List<Bill> listBills(final Long customerId);

    void editCardInformation(final Long customerId, final CardInformation cardInformation);

    void editCustomerInformation(final Customer customer);
}
