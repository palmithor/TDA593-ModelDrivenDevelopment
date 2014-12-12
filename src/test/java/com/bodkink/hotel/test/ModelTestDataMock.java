package com.bodkink.hotel.test;

import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public class ModelTestDataMock {

    public static final String PICTURE_URL = "http://www.doylecollection.com/var/doyle/storage/images/media/photo-galleries/the-dupont-circle-hotel-gallery/rooms/dupont-circle-hotel-superior-king-room/36016-1-eng-US/dupont-circle-hotel-superior-king-room_gallery_image.jpg";

    public static EList<Room> getRooms() {
        EList<Room> rooms = new BasicEList<>();
        DBTestDataMock.getRoomEntities().forEach(entity -> {
            rooms.add(EntityToModelConverter.convertRoom(entity));
        });
        return rooms;
    }

    public static EList<Classification> getClassifications() {
        EList<Classification> classifications = new BasicEList<>();
        DBTestDataMock.getClassificationEntities().forEach(entity -> {
            classifications.add(EntityToModelConverter.convertClassification(entity));
        });
        return classifications;
    }

    public static EList<RoomExtra> getRoomExtras() {
        EList<RoomExtra> roomExtras = new BasicEList<>();
        DBTestDataMock.getRoomExtraEntities().forEach(entity -> {
            roomExtras.add(EntityToModelConverter.convertRoomExtra(entity));
        });
        return roomExtras;
    }

    public static List<BedType> getBedTypes() {
        List<BedType> bedTypes = new ArrayList<BedType>();
        DBTestDataMock.getBedTypeEntities().forEach(entity -> {
            bedTypes.add(EntityToModelConverter.convertBedType(entity));
        });
        return bedTypes;
    }

    public static List<RoomReservationType> getRoomReservationTypes() {
        EList<RoomReservationType> roomReservationTypes = new BasicEList<>();
        DBTestDataMock.getRoomReservationTypesEntities().forEach(entity -> {
            roomReservationTypes.add(EntityToModelConverter.convertRoomReservationType(entity));
        });
        return roomReservationTypes;
    }

    public static Customer getCustomer() {
        return EntityToModelConverter.convertCustomer(DBTestDataMock.getCustomerEntity());
    }

    public static CardInformation getCardInformation() {
        return EntityToModelConverter.convertCardInformation(DBTestDataMock.getCardInformationEntity());
    }

    public static Address getAddress() {
        return EntityToModelConverter.convertAddress(DBTestDataMock.getAddressEntity());
    }
}
