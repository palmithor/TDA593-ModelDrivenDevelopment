package com.bodkink.hotel.presentation.controllers;

import com.bodkink.hotel.business.IGuestManagement;
import com.bodkink.hotel.presentation.message.CheckInOutRequest;
import com.bodkink.hotel.util.MessageToModelConverter;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import ninja.Result;
import ninja.Results;

/**
 * @author palmithor
 * @since 13/12/14.
 */
@Singleton
public class ReceptionController {

    @Inject
    IGuestManagement guestManagement;


    public Result checkIn(final CheckInOutRequest checkInOutRequest) {
        boolean result = guestManagement.checkIn(MessageToModelConverter.convertRoomReservation(checkInOutRequest.getRoomReservationMessage()),
                MessageToModelConverter.convertGuest(checkInOutRequest.getGuest()));
        if (result) {
            return Results.json();
        } else {
            return Results.forbidden().json();
        }
    }


    public Result checkOut(final CheckInOutRequest checkInOutRequest) {
        boolean result = guestManagement.checkOut(MessageToModelConverter.convertRoomReservation(checkInOutRequest.getRoomReservationMessage()));
        if (result) {
            return Results.json();
        } else {
            return Results.forbidden().json();
        }
    }
}
