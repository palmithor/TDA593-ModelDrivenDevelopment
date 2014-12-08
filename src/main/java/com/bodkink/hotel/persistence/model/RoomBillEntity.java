package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity(CollectionNames.ROOM_BILL)
public class RoomBillEntity {

    @Id
    private final ObjectId id;
    private final CardInformationEntity cardInformation;
    private final List<BillableItemEntity> items;

    public RoomBillEntity() {
        this.id = null;
        this.cardInformation = null;
        this.items = null;
    }


    public RoomBillEntity(CardInformationEntity cardInformation, List<BillableItemEntity> items) {
        this.id = null;
        this.cardInformation = cardInformation;
        this.items = items;
    }

    public RoomBillEntity(ObjectId id, CardInformationEntity cardInformation, List<BillableItemEntity> items) {
        this.id = id;
        this.cardInformation = cardInformation;
        this.items = items;
    }

    public ObjectId getId() {
        return id;
    }

    public CardInformationEntity getCardInformation() {
        return cardInformation;
    }

    public List<BillableItemEntity> getItems() {
        return items;
    }
}
