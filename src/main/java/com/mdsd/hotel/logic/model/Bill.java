package com.mdsd.hotel.logic.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public abstract class Bill implements IBill {

    private CardInformation cardInformation;


    public CardInformation getCardInformation() {
        return cardInformation;
    }

    public boolean isPaid() {
        return getCardInformation() != null;
    }
}
