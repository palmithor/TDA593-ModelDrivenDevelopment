package com.bodkink.hotel.presentation.controllers;

import business.IRoomExtraManagement;
import business.model.RoomExtra;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import ninja.Result;
import ninja.Results;

import java.util.List;

/**
 * @author palmithor
 * @since 08/12/14.
 */
@Singleton
public class RoomExtrasController {

    @Inject
    IRoomExtraManagement roomExtraManagement;


    public Result list() {
        List<RoomExtra> roomExtras = roomExtraManagement.listRoomExtras();
        return Results.json().render(roomExtras);
    }
}
