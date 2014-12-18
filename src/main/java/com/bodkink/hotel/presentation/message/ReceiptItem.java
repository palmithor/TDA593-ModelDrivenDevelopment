package com.bodkink.hotel.presentation.message;

import java.math.BigDecimal;

/**
 * @author palmithor
 * @since 18/12/14.
 */
public class ReceiptItem {

    private final String title;
    private final String description;
    private final Integer quantity;
    private final BigDecimal price;

    public ReceiptItem() {
        this.title = null;
        this.description = null;
        this.quantity = null;
        this.price = null;
    }

    public ReceiptItem(final String title, final String description, final Integer quantity, final BigDecimal price) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
