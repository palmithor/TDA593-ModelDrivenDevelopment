package com.mdsd.hotel.presentation.model;

import java.util.List;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public class Receipt {

    private final List<ReceiptItem> items;
    private final CardInformation cardInformation;

    public Receipt() {
        this.items = null;
        this.cardInformation = null;
    }

    public Receipt(List<ReceiptItem> items, CardInformation cardInformation) {
        this.items = items;
        this.cardInformation = cardInformation;
    }

    public List<ReceiptItem> getItems() {
        return items;
    }

    public CardInformation getCardInformation() {
        return cardInformation;
    }
}
