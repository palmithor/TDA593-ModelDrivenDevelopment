package com.bodkink.hotel.business.model;

public class Bill implements IBill {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private BillStatusEnum billStatusEnum;
    /**
     *
     */
    private CardInformation cardInformation;

    /**
     * Getter of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter of id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter of billStatusEnum
     */
    public BillStatusEnum getBillStatusEnum() {
        return billStatusEnum;
    }

    /**
     * Setter of billStatusEnum
     */
    public void setBillStatusEnum(BillStatusEnum billStatusEnum) {
        this.billStatusEnum = billStatusEnum;
    }

    /**
     * Getter of cardInformation
     */
    public CardInformation getCardInformation() {
        return cardInformation;
    }

    /**
     * Setter of cardInformation
     */
    public void setCardInformation(CardInformation cardInformation) {
        this.cardInformation = cardInformation;
    }

}
