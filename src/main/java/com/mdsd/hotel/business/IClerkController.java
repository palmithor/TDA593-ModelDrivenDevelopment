package com.mdsd.hotel.business;

import com.mdsd.hotel.business.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public interface IClerkController {

    List<RoomReservation> listRoomReservations(final Long bookingNumber);

    List<IBill> listBills();

    List<IBill> listUnpaidBills();

    List<RoomReservation> listRoomReservations(final LocalDate startDate, final LocalDate endDate);

    List<Booking> listBookings(final LocalDate startDate, final LocalDate endDate);

    List<Booking> listBookings();

    void checkInBooking(final Long bookingNumber, final Guest... guests);

    void checkInRoom(final Long roomReservationNumber, final Guest... guests);

    void reserveRoom(final Long roomId, LocalDate startDate, LocalDate endDate, final RoomReservationType roomReservationType);

    void addItemToBill(final Long billableItem, final Long roomNumber);

    void payBill(final Long billId, final CardInformation cardInformation);

    void payBill(final Long billId);

    BigDecimal calculateBookingPrice(final Long bookingNumber);

    BigDecimal calculateBillPrice(final Long billId);

    Receipt getReceipt(final Long billId);


}
