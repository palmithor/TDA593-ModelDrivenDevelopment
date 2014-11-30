package com.mdsd.hotel.business.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public abstract class Bill implements IBill {

    private CardInformation cardInformation;

    protected Bill() {
    }

    protected Bill(final CardInformation cardInformation) {
        this.cardInformation = cardInformation;
    }

    public CardInformation getCardInformation() {
        return cardInformation;
    }

    public void setCardInformation(final CardInformation cardInformation) {
        this.cardInformation = cardInformation;
    }

    public boolean isPaid() {
        return getCardInformation() != null;
    }
}
