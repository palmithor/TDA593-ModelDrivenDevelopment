package com.bodkink.hotel.test;

import com.bodkink.hotel.business.model.*;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.eclipse.emf.common.util.BasicEList;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public class ModelTestDataMock {

    public static final String PICTURE_URL = "http://www.doylecollection.com/var/doyle/storage/images/media/photo-galleries/the-dupont-circle-hotel-gallery/rooms/dupont-circle-hotel-superior-king-room/36016-1-eng-US/dupont-circle-hotel-superior-king-room_gallery_image.jpg";

    public static List<Room> getRooms() {
        List<Room> roomEntities = new BasicEList<>();
        List<Classification> classifications = getClassifications();
        List<BedType> bedTypes = getBedTypes();
        // Not pretty I know !
        for (int i = 0; i < 30; i++) {
            final String roomNumber = StringUtils.leftPad(String.valueOf(i), 3, "0");
            final int allowedGuests = (i % 2) + 2;
            Map<BedType, Integer> bedTypeCount = new HashMap<>();
            bedTypeCount.put(bedTypes.get(0), 1);
            if (allowedGuests == 3) {
                bedTypeCount.put(bedTypes.get(1), 1);
            }
            final BigDecimal nightPrice = BigDecimal.TEN.multiply(BigDecimal.TEN).multiply(new BigDecimal(allowedGuests));
            Room room = ModelFactory.eINSTANCE.createRoom();
            room.setId(ObjectId.get().toString());
            room.setNumber(roomNumber);
            room.setDescription("Room " + i);
            room.setAllowedGuests(allowedGuests);
            room.setSize(BigDecimal.TEN);
            room.setNightPrice(nightPrice);
            room.getPictures().addAll(Arrays.asList(PICTURE_URL));
            room.setClassification(classifications.get(i % 2));
            room.getRoomExtra().addAll(getRoomExtras());
            // TODO MAP ? room.getBedType();
            roomEntities.add(room);
        }
        return roomEntities;
    }

    public static List<Classification> getClassifications() {
        List<Classification> classifications = new ArrayList<Classification>();
        Classification aClass = ModelFactory.eINSTANCE.createClassification();
        aClass.setId(ObjectId.get().toString());
        aClass.setDescription("Description for class A");
        aClass.setTitle("Class A");
        Classification bClass = ModelFactory.eINSTANCE.createClassification();
        bClass.setId(ObjectId.get().toString());
        bClass.setDescription("Description for class B");
        bClass.setTitle("Class B");
        classifications.add(aClass);
        classifications.add(bClass);
        return classifications;
    }

    public static List<RoomExtra> getRoomExtras() {
        List<RoomExtra> roomExtras = new BasicEList<>();
        RoomExtra roomExtraTv = ModelFactory.eINSTANCE.createRoomExtra();
        roomExtraTv.setId(ObjectId.get().toString());
        roomExtraTv.setTitle("42\" TV");
        roomExtraTv.setDescription("42\" Samsung flat screen television");
        RoomExtra roomExtraHairDryer = ModelFactory.eINSTANCE.createRoomExtra();
        roomExtraHairDryer.setId(ObjectId.get().toString());
        roomExtraHairDryer.setTitle("Hairdryer");
        roomExtraHairDryer.setDescription("Simple hairryer");
        roomExtras.add(roomExtraHairDryer);
        roomExtras.add(roomExtraTv);
        return roomExtras;
    }

    public static List<BedType> getBedTypes() {
        List<BedType> bedTypes = new ArrayList<BedType>();
        BedType single = ModelFactory.eINSTANCE.createBedType();
        single.setId(ObjectId.get().toString());
        single.setLength(200);
        single.setWidth(90);
        single.setPlaces(2);
        single.setName("Single Bed");


        BedType doubleBed = ModelFactory.eINSTANCE.createBedType();
        doubleBed.setId(ObjectId.get().toString());
        doubleBed.setLength(200);
        doubleBed.setWidth(160);
        doubleBed.setPlaces(2);
        doubleBed.setName("Double Bed");
        bedTypes.add(single);
        bedTypes.add(doubleBed);
        return bedTypes;
    }

    public static List<RoomReservationType> getRoomReservationTypes() {
        List<RoomReservationType> roomReservationTypes = new BasicEList<>();

        RoomReservationType roomReservationTypeBooking = ModelFactory.eINSTANCE.createRoomReservationType();
        roomReservationTypeBooking.setId(ObjectId.get().toString());
        roomReservationTypeBooking.setType("Booking");

        RoomReservationType roomReservationTypeMaintenance = ModelFactory.eINSTANCE.createRoomReservationType();
        roomReservationTypeMaintenance.setId(ObjectId.get().toString());
        roomReservationTypeMaintenance.setType("Maintenance");

        roomReservationTypes.add(roomReservationTypeBooking);
        roomReservationTypes.add(roomReservationTypeMaintenance);
        return roomReservationTypes;
    }

}
