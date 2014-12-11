package com.bodkink.hotel.test;

import com.bodkink.hotel.persistence.model.BedTypeEntity;
import com.bodkink.hotel.persistence.model.ClassificationEntity;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.persistence.model.RoomExtraEntity;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public class DBTestDataMock {

    public static final String PICTURE_URL = "http://www.doylecollection.com/var/doyle/storage/images/media/photo-galleries/the-dupont-circle-hotel-gallery/rooms/dupont-circle-hotel-superior-king-room/36016-1-eng-US/dupont-circle-hotel-superior-king-room_gallery_image.jpg";

    public static List<RoomEntity> getRoomEntities() {
        List<RoomEntity> roomEntities = new ArrayList<>();
        List<ClassificationEntity> classifications = getClassificationEntities();
        List<BedTypeEntity> bedTypes = getBetTypeEntities();
        // Not pretty I know !
        for (int i = 0; i < 30; i++) {
            final String roomNumber = StringUtils.leftPad(String.valueOf(i), 3, "0");
            final int allowedGuests = (i % 2) + 2;
            Map<ObjectId, Integer> bedTypeCount = new HashMap<>();
            bedTypeCount.put(bedTypes.get(0).getId(), 1);
            if (allowedGuests == 3) {
                bedTypeCount.put(bedTypes.get(1).getId(), 1);
            }
            final BigDecimal nightPrice = BigDecimal.TEN.multiply(BigDecimal.TEN).multiply(new BigDecimal(allowedGuests));
            RoomEntity roomEntity = new RoomEntity(ObjectId.get(), roomNumber, "Room " + i, allowedGuests, BigDecimal.TEN,
                    nightPrice, Arrays.asList(PICTURE_URL), classifications.get(i % 2),
                    getRoomExtraEntities(), bedTypeCount);
            roomEntities.add(roomEntity);
        }
        return roomEntities;
    }

    public static List<ClassificationEntity> getClassificationEntities() {
        return new ArrayList<ClassificationEntity>() {{
            add(new ClassificationEntity(ObjectId.get(), "Class A", "Description for class A"));
            add(new ClassificationEntity(ObjectId.get(), "Class B", "Description for class B"));
        }};
    }

    public static List<RoomExtraEntity> getRoomExtraEntities() {
        return new ArrayList<RoomExtraEntity>() {{
            add(new RoomExtraEntity("42\" TV", "42\" Samsung flat screen television"));
            add(new RoomExtraEntity("Hairdryer", "Simple hairdryer"));
            add(new RoomExtraEntity("Telephone", "Telephone for calling the room service"));
            add(new RoomExtraEntity("Wifi", "Wireless internet connection"));
        }};
    }

    public static List<BedTypeEntity> getBetTypeEntities() {
        return new ArrayList<BedTypeEntity>() {{
            add(new BedTypeEntity(2, 160, 200, "Double Bed"));
            add(new BedTypeEntity(1, 90, 200, "Single Bed"));
        }};
    }
}
