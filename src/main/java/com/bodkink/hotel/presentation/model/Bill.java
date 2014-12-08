package com.bodkink.hotel.presentation.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public abstract class Bill implements IBill {

    private final String id;
    private final CardInformation cardInformation;

    protected Bill() {
        this.id = null;
        this.cardInformation = null;
    }

    protected Bill(final String id, final CardInformation cardInformation) {
        this.id = id;
        this.cardInformation = cardInformation;
    }

    public String getId() {
        return id;
    }

    public CardInformation getCardInformation() {
        return cardInformation;
    }

    public boolean isPaid() {
        return getCardInformation() != null;
    }
}
