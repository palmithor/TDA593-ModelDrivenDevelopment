package com.bodkink.hotel.business.model;

public class BookingBill extends Bill {

    /**
     *
     */
    private BookingBillType bookingBillType;

    /**
     * Getter of bookingBillType
     */
    public BookingBillType getBookingBillType() {
        return bookingBillType;
    }

    /**
     * Setter of bookingBillType
     */
    public void setBookingBillType(BookingBillType bookingBillType) {
        this.bookingBillType = bookingBillType;
    }

}
