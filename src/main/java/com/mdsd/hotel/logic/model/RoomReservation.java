package com.mdsd.hotel.logic.model;

import java.time.LocalDate;
import java.util.List;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomReservation {
    private LocalDate startDate;
    private LocalDate endDate;
    private RoomReservationType type;
    private Room room;
    private List<Guest> guests;
    private RoomBill roomBill;
}
