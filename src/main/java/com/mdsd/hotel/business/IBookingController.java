package com.mdsd.hotel.business;

import com.mdsd.hotel.business.model.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author palmithor
 * @since 30/11/14.
 */
public interface IBookingController {

    // TODO change models to presentation layer models

    List<Room> searchRoom(final int numberOfGuests, final int numberOfRooms, final LocalDate checkInDate,
                          final LocalDate checkOutDate);

    List<Room> searchRoom(final int numberOfGuests, final LocalDate checkInDate,
                          final LocalDate checkOutDate);

    List<Room> searchRoom(final int numberOfGuests, final int numberOfRooms, final Classification classification,
                          final LocalDate checkInDate, final LocalDate checkOutDate);

    void addRoom(final Room room);

    void addRooms(final Room... room);

    void addService(final Service service);

    void addServices(final Service... service);

    void addCustomerInformation(final Customer customer, final CardInformation cardInformation);

    boolean verify(final Booking booking);

    boolean confirm(final Booking booking);
}
