package com.bodkink.hotel.presentation.message;

/**
 * @author palmithor
 * @since 18/12/14.
 */
public class ReceiptItem {

    private final String title;
    private final String description;
    private final String quantity;
    private final String price;

    public ReceiptItem() {
        this.title = null;
        this.description = null;
        this.quantity = null;
        this.price = null;
    }

    public ReceiptItem(String title, String description, String quantity, String price) {
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }
}
