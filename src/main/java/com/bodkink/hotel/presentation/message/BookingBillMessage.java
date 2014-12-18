package com.bodkink.hotel.presentation.message;

import com.bodkink.hotel.business.model.BillStatusEnum;
import com.bodkink.hotel.business.model.BookingBillType;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BookingBillMessage {

    private final String id;
    private final CardInformationMessage cardInformation;
    private final BillStatusEnum billStatus;
    private final BookingBillType bookingBillType;

    public BookingBillMessage() {
        this.id = null;
        this.cardInformation = null;
        this.billStatus = null;
        this.bookingBillType = null;
    }

    public BookingBillMessage(final CardInformationMessage cardInformation, final BillStatusEnum billStatus,
                              final BookingBillType bookingBillType) {
        this.id = null;
        this.cardInformation = cardInformation;
        this.billStatus = billStatus;
        this.bookingBillType = bookingBillType;
    }


    public BookingBillMessage(final String id, final CardInformationMessage cardInformation, final BillStatusEnum billStatus,
                              final BookingBillType bookingBillType) {
        this.id = id;
        this.cardInformation = cardInformation;
        this.billStatus = billStatus;
        this.bookingBillType = bookingBillType;
    }

    public String getId() {
        return id;
    }

    public CardInformationMessage getCardInformation() {
        return cardInformation;
    }

    public BillStatusEnum getBillStatus() {
        return billStatus;
    }

    public BookingBillType getBookingBillType() {
        return bookingBillType;
    }
}
