package com.bodkink.hotel.persistence.model;

import com.bodkink.hotel.business.model.BillStatusEnum;
import com.bodkink.hotel.business.model.BookingBillType;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.BOOKING_BILL)
public class BookingBillEntity {

    @Id
    private final ObjectId id;
    private final CardInformationEntity cardInformation;
    private final BillStatusEnum billStatus;
    private final BookingBillType bookingBillType;

    public BookingBillEntity() {
        this.id = null;
        this.cardInformation = null;
        this.billStatus = null;
        this.bookingBillType = null;
    }

    public BookingBillEntity(final CardInformationEntity cardInformation, final BillStatusEnum billStatus,
                             final BookingBillType bookingBillType) {
        this.id = null;
        this.cardInformation = cardInformation;
        this.billStatus = billStatus;
        this.bookingBillType = bookingBillType;
    }


    public BookingBillEntity(final ObjectId id, final CardInformationEntity cardInformation, final BillStatusEnum billStatus,
                             final BookingBillType bookingBillType) {
        this.id = id;
        this.cardInformation = cardInformation;
        this.billStatus = billStatus;
        this.bookingBillType = bookingBillType;
    }

    public ObjectId getId() {
        return id;
    }

    public CardInformationEntity getCardInformation() {
        return cardInformation;
    }

    public BillStatusEnum getBillStatus() {
        return billStatus;
    }

    public BookingBillType getBookingBillType() {
        return bookingBillType;
    }
}
