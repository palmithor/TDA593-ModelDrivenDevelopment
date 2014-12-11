package com.bodkink.hotel.business.util;

import com.bodkink.hotel.business.model.Room;

import java.util.List;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public class RoomUtil {

    private RoomUtil() {
    }

    public static boolean hasTooManyGuests(final int numberOfGuest, final List<Room> rooms) {
        int allowedGuests = 0;
        for (Room r : rooms) {
            allowedGuests += r.getAllowedGuests();
        }
        return numberOfGuest > allowedGuests;
    }
}
