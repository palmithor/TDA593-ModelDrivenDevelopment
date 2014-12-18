package com.bodkink.hotel.presentation.message;

import com.bodkink.hotel.business.model.BillStatusEnum;

import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomBillMessage {


    private final String id;
    private final CardInformationMessage cardInformation;
    private final List<BillableItemMessage> items;
    private final BillStatusEnum billStatus;

    public RoomBillMessage() {
        this.id = null;
        this.cardInformation = null;
        this.items = null;
        this.billStatus = null;
    }


    public RoomBillMessage(final CardInformationMessage cardInformation, final List<BillableItemMessage> items,
                           final BillStatusEnum billStatus) {
        this.id = null;
        this.cardInformation = cardInformation;
        this.items = items;
        this.billStatus = billStatus;
    }

    public RoomBillMessage(final String id, final CardInformationMessage cardInformation,
                           final List<BillableItemMessage> items, final BillStatusEnum billStatus) {
        this.id = id;
        this.cardInformation = cardInformation;
        this.items = items;
        this.billStatus = billStatus;
    }

    public String getId() {
        return id;
    }

    public CardInformationMessage getCardInformation() {
        return cardInformation;
    }

    public List<BillableItemMessage> getItems() {
        return items;
    }

    public BillStatusEnum getBillStatus() {
        return billStatus;
    }
}
