package com.bodkink.hotel.business.model;

import java.math.BigDecimal;

public class ReceiptItem {

    /**
     *
     */
    private String description;
    /**
     *
     */
    private Integer quantity;
    /**
     *
     */
    private BigDecimal totalAmount;

    /**
     * Getter of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter of description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter of quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter of quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter of totalAmount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter of totalAmount
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

}
