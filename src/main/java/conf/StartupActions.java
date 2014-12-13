package conf;

import com.bodkink.hotel.persistence.dao.*;
import com.bodkink.hotel.persistence.model.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import ninja.lifecycle.Start;
import ninja.utils.NinjaProperties;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author palmithor
 * @since 08/12/14.
 */
@Singleton
public class StartupActions {

    public static final String PICTURE_URL = "http://www.doylecollection.com/var/doyle/storage/images/media/photo-galleries/the-dupont-circle-hotel-gallery/rooms/dupont-circle-hotel-superior-king-room/36016-1-eng-US/dupont-circle-hotel-superior-king-room_gallery_image.jpg";

    @Inject
    RoomExtraDAO roomExtraDAO;
    @Inject
    BedTypeDAO bedTypeDAO;
    @Inject
    ClassificationDAO classificationDAO;
    @Inject
    BillableItemDAO billableItemDAO;
    @Inject
    ServiceDAO serviceDAO;
    @Inject
    RoomDAO roomDAO;


    private NinjaProperties ninjaProperties;

    @Inject
    public StartupActions(NinjaProperties ninjaProperties) {
        this.ninjaProperties = ninjaProperties;
    }

    @Start(order = 100)
    public void generateDummyDataWhenInTest() {

        if (ninjaProperties.isDev()) {
            dropAndCreateDefaultRooms();
            dropAndCreateDefaultBillableItems();
            dropAndCreateDefaultServices();
        }
    }

    private void dropAndCreateDefaultRooms() {
        // BED TYPES
        bedTypeDAO.getDatastore().getDB().getCollection(CollectionNames.BED_TYPE).drop();

        BedTypeEntity kingSizeBed = new BedTypeEntity(2, 200, 200, "King Size");
        BedTypeEntity doubleBed = new BedTypeEntity(2, 140, 200, "Double");
        BedTypeEntity singleBed = new BedTypeEntity(1, 90, 200, "Single");

        bedTypeDAO.save(kingSizeBed);
        bedTypeDAO.save(doubleBed);
        bedTypeDAO.save(singleBed);

        List<BedTypeEntity> bedTypes = new ArrayList<>();
        bedTypes.addAll(Arrays.asList(kingSizeBed, doubleBed, singleBed));

        // CLASSIFICATIONS
        classificationDAO.getDatastore().getDB().getCollection(CollectionNames.CLASSIFICATION).drop();

        ClassificationEntity cClass = new ClassificationEntity("C Class", "Regular room");
        ClassificationEntity bClass = new ClassificationEntity("B Class", "Not so fancy room");
        ClassificationEntity aClass = new ClassificationEntity("A Class", "Fancy room");

        classificationDAO.save(aClass);
        classificationDAO.save(bClass);
        classificationDAO.save(cClass);

        List<ClassificationEntity> classes = new ArrayList<>();
        classes.addAll(Arrays.asList(aClass, bClass, cClass));


        // ROOM EXTRAS
        roomExtraDAO.getDatastore().getDB().getCollection(CollectionNames.ROOM_EXTRA).drop();

        RoomExtraEntity tv = new RoomExtraEntity("42\" TV", "42\" Samsung flat screen television");
        RoomExtraEntity hairdryer = new RoomExtraEntity("Hairdryer", "Simple hairdryer");
        RoomExtraEntity wifi = new RoomExtraEntity("Wifi", "Wireless internet connection");
        RoomExtraEntity telephone = new RoomExtraEntity("Telephone", "Telephone for calling the room service");

        roomExtraDAO.save(telephone);
        roomExtraDAO.save(hairdryer);
        roomExtraDAO.save(tv);
        roomExtraDAO.save(wifi);

        List<RoomExtraEntity> roomExtras = new ArrayList<>();
        roomExtras.addAll(Arrays.asList(telephone, hairdryer, tv, wifi));


        roomExtraDAO.getDatastore().getDB().getCollection(CollectionNames.ROOM).drop();
        for (int i = 0; i < 30; i++) {
            final String roomNumber = StringUtils.leftPad(String.valueOf(i), 3, "0");
            final int allowedGuests = (i % 2) + 2;
            Map<ObjectId, Integer> bedTypeCount = new HashMap<>();
            bedTypeCount.put(bedTypes.get(0).getId(), 1);
            if (allowedGuests == 3) {
                bedTypeCount.put(bedTypes.get(1).getId(), 1);
            }
            final BigDecimal nightPrice = BigDecimal.TEN.multiply(BigDecimal.TEN).multiply(new BigDecimal(allowedGuests));
            roomDAO.save(new RoomEntity(ObjectId.get(), roomNumber, "Room " + i, allowedGuests, BigDecimal.TEN,
                    nightPrice, Arrays.asList(PICTURE_URL), classes.get(i % 2),
                    roomExtras, bedTypeCount));
        }
    }


    private void dropAndCreateDefaultBillableItems() {
        billableItemDAO.getDatastore().getDB().getCollection(CollectionNames.BILLABLE_ITEM).drop();

        billableItemDAO.save(new BillableItemEntity("Coca Cola 0.5l", new BigDecimal("20")));
        billableItemDAO.save(new BillableItemEntity("Sprite 0.5l", new BigDecimal("20")));
        billableItemDAO.save(new BillableItemEntity("Pringles Sour Cream and Onion", new BigDecimal("20")));
    }

    private void dropAndCreateDefaultServices() {
        serviceDAO.getDatastore().getDB().getCollection(CollectionNames.SERVICE).drop();

        serviceDAO.save(new ServiceEntity("Breakfast", "American breakfast", new BigDecimal("150")));
        serviceDAO.save(new ServiceEntity("Lunch", "Lunch buffet", new BigDecimal("180")));
        serviceDAO.save(new ServiceEntity("All inclusive", "All drinks and food inclusive", new BigDecimal("250")));
    }
}
