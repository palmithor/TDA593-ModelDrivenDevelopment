package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.BedType;

import java.util.List;

public interface IBedTypeManagement {

    /**
     * @param name
     * @param length
     * @param width
     * @param noOfSleepingSpots
     * @return
     */
    public BedType createBedType(String name, int length, int width, int noOfSleepingSpots);

    /**
     * @param bedType
     * @return
     */
    public BedType editBedType(BedType bedType);

    /**
     * @return
     */
    public List<BedType> listBedTypes();

}
