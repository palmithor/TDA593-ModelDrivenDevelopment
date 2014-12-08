package com.mdsd.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("BookingBill")
public class BookingBillEntity {

    @Id
    private final ObjectId id;
    private final CardInformationEntity cardInformation;

    public BookingBillEntity() {
        this.id = null;
        this.cardInformation = null;
    }

    public BookingBillEntity(CardInformationEntity cardInformation) {
        this.id = null;
        this.cardInformation = cardInformation;
    }

    public BookingBillEntity(ObjectId id, CardInformationEntity cardInformation) {
        this.id = id;
        this.cardInformation = cardInformation;
    }

    public ObjectId getId() {
        return id;
    }

    public CardInformationEntity getCardInformation() {
        return cardInformation;
    }
}
