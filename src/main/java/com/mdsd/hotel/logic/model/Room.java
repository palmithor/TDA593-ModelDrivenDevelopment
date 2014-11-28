package com.mdsd.hotel.logic.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Room {

    private String number;
    private String description;
    private Integer allowedGuests;
    private BigDecimal size;
    private BigDecimal nightPrice;
    private List<String> pictures;
    private Classification classification;
    private List<RoomExtra> roomExtras;
    private Map<BedType, Integer> bedTypesCount;
}
