package com.mdsd.hotel.business;

import com.mdsd.hotel.business.model.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author palmithor
 * @since 30/11/14.
 */
public interface ICustomerBookingController {

    // TODO change models to presentation layer models

    List<Room> searchRoom(final int numberOfGuests, final int numberOfRooms, final LocalDate checkInDate,
                          final LocalDate checkOutDate);

    List<Room> searchRoom(final LocalDate checkInDate, final LocalDate checkOutDate);

    List<Room> searchRoom(final int numberOfGuests, final int numberOfRooms, final Classification classification,
                          final LocalDate checkInDate, final LocalDate checkOutDate);

    List<Room> searchRoom(final int numberOfRooms, final LocalDate checkInDate, final LocalDate checkOutDate);

    List<Service> listServices();

    void cancelBooking(final Long bookingNumber);

    void addRoomReservations(final Long bookingNumber, final String roomNumber, final LocalDate startDate, final LocalDate endDate);

    void addServices(final Long bookingNumber, final Long... serviceIdList);

    void createCustomerInformation(final Customer customer, final CardInformation cardInformation);

    void editCardInformation(final Long customerId, final CardInformation cardInformation);

    void addCustomer(final Long customerId, final Customer customer);

    boolean confirm(final Booking bookingNumber);


}
