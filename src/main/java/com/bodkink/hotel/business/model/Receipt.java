package com.bodkink.hotel.business.model;

import java.util.List;

public class Receipt {

    /**
     *
     */
    public List<ReceiptItem> receiptItem;

    /**
     * Getter of receiptItem
     */
    public List<ReceiptItem> getReceiptItem() {
        return receiptItem;
    }

    /**
     * Setter of receiptItem
     */
    public void setReceiptItem(List<ReceiptItem> receiptItem) {
        this.receiptItem = receiptItem;
    }

}
