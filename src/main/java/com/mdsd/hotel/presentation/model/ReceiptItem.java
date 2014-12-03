package com.mdsd.hotel.presentation.model;

import java.math.BigDecimal;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public class ReceiptItem {

    private final String description;
    private final Integer quantity;
    private final BigDecimal totalAmount;

    public ReceiptItem() {
        this.totalAmount = null;
        this.quantity = null;
        this.description = null;
    }

    public ReceiptItem(final BigDecimal totalAmount, final Integer quantity, final String description) {
        this.totalAmount = totalAmount;
        this.quantity = quantity;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
}
