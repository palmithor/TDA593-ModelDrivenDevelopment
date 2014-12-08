package com.bodkink.hotel.business.logic;

import com.bodkink.hotel.business.IBillingManagement;
import com.bodkink.hotel.business.model.*;

public class BillingManagementImpl implements IBillingManagement {

    /**
     * @param roomReservation
     * @return
     */
    public RoomBill createRoomBill(RoomReservation roomReservation) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param booking
     * @param bookingBillType
     * @return
     */
    public BookingBill createBookingBill(Booking booking, BookingBillType bookingBillType) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param roomBill
     * @param item
     * @param quantity
     * @return
     */
    public boolean addBillableItem(RoomBill roomBill, BillableItem item, Integer quantity) {
        // TODO Auto-generated method
        return false;
    }

    /**
     * @param roomBillId
     * @return
     */
    public RoomBill findRoomBill(long roomBillId) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param bill
     * @param cardInformation
     * @return
     */
    public boolean makePayment(Bill bill, CardInformation cardInformation) {
        // TODO Auto-generated method
        return false;
    }

    /**
     * @param booking
     * @return
     */
    public Receipt generateReceipts(Booking booking) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param bill
     * @return
     */
    public Receipt generateReceipt(Bill bill) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param bill
     * @param customer
     * @return
     */
    public boolean makePayment(Bill bill, Customer customer) {
        // TODO Auto-generated method
        return false;
    }

    /**
     * @param booking
     * @param result
     */
    public void makePayment(Booking booking, boolean result) {
        // TODO Auto-generated method
    }

}
