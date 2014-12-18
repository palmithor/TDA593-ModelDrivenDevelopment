package com.bodkink.hotel.presentation.message;

import java.util.List;

/**
 * @author palmithor
 * @since 18/12/14.
 */
public class ReceiptMessage {

    private final List<ReceiptItem> items;

    public ReceiptMessage() {
        this.items = null;
    }

    public ReceiptMessage(List<ReceiptItem> items) {
        this.items = items;
    }
}
