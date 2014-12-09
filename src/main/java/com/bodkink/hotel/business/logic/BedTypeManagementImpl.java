package com.bodkink.hotel.business.logic;

import com.bodkink.hotel.business.IBedTypeManagement;
import com.bodkink.hotel.business.model.BedType;
import com.bodkink.hotel.persistence.IBedTypeService;
import com.bodkink.hotel.persistence.model.BedTypeEntity;
import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.List;

public class BedTypeManagementImpl implements IBedTypeManagement {

    @Inject
    IBedTypeService bedTypeService;

    /**
     * @param name
     * @param length
     * @param width
     * @param noOfSleepingSpots
     * @return
     */
    public BedType createBedType(String name, int length, int width, int noOfSleepingSpots) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @param bedType
     * @return
     */
    public BedType editBedType(BedType bedType) {
        // TODO Auto-generated method
        return null;
    }

    /**
     * @return
     */
    public List<BedType> listBedTypes() {
        List<BedTypeEntity> bedTypeEntities = bedTypeService.listAll();
        List<BedType> bedTypes = new ArrayList<>(bedTypeEntities.size());
        for (BedTypeEntity bedTypeEntity : bedTypeEntities) {
            BedType bedType = new BedType();
            bedType.setId(bedTypeEntity.getId().toString());
            bedType.setLength(bedTypeEntity.getLength());
            bedType.setWidth(bedTypeEntity.getWidth());
            bedType.setPlaces(bedTypeEntity.getPlaces());
            bedType.setName(bedTypeEntity.getName());
            bedTypes.add(bedType);
        }

        return bedTypes;
    }

}
