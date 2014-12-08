package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.*;

public interface IBillingManagement {

    /**
     * @param roomReservation
     * @return
     */
    public RoomBill createRoomBill(RoomReservation roomReservation);

    /**
     * @param booking
     * @param bookingBillType
     * @return
     */
    public BookingBill createBookingBill(Booking booking, BookingBillType bookingBillType);

    /**
     * @param roomBill
     * @param item
     * @param quantity
     * @return
     */
    public boolean addBillableItem(RoomBill roomBill, BillableItem item, Integer quantity);

    /**
     * @param roomBillId
     * @return
     */
    public RoomBill findRoomBill(long roomBillId);

    /**
     * @param bill
     * @param cardInformation
     * @return
     */
    public boolean makePayment(Bill bill, CardInformation cardInformation);

    /**
     * @param booking
     * @return
     */
    public Receipt generateReceipts(Booking booking);

    /**
     * @param bill
     * @return
     */
    public Receipt generateReceipt(Bill bill);

    /**
     * @param bill
     * @param customer
     * @return
     */
    public boolean makePayment(Bill bill, Customer customer);

    /**
     * @param booking
     * @param result
     */
    public void makePayment(Booking booking, boolean result);

}
