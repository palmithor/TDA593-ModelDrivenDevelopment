package conf;

import com.bodkink.hotel.persistence.dao.BedTypeDAO;
import com.bodkink.hotel.persistence.dao.ClassificationDAO;
import com.bodkink.hotel.persistence.dao.RoomDAO;
import com.bodkink.hotel.persistence.dao.RoomExtraDAO;
import com.bodkink.hotel.persistence.model.ClassificationEntity;
import com.bodkink.hotel.persistence.model.CollectionNames;
import com.bodkink.hotel.persistence.model.RoomExtraEntity;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import ninja.lifecycle.Start;
import ninja.utils.NinjaProperties;

/**
 * @author palmithor
 * @since 08/12/14.
 */
@Singleton
public class StartupActions {

    @Inject
    RoomExtraDAO roomExtraDAO;
    @Inject
    BedTypeDAO bedTypeDAO;
    @Inject
    ClassificationDAO classificationDAO;
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
            dropAndCreateDefaultRoomExtras();
            dropAndCreateDefaultClassifications();
        }
    }

    private void dropAndCreateDefaultClassifications() {
        classificationDAO.getDatastore().getDB().getCollection(CollectionNames.CLASSIFICATION).drop();
        classificationDAO.save(new ClassificationEntity("A Class", "Fancy room"));
        classificationDAO.save(new ClassificationEntity("B Class", "Not so fancy room"));
        classificationDAO.save(new ClassificationEntity("C Class", "Regular room"));

    }

    private void dropDefaultSchemas() {
        roomExtraDAO.getDatastore().getDB().getCollection(CollectionNames.ADDRESS).drop();
        roomExtraDAO.getDatastore().getDB().getCollection(CollectionNames.BED_TYPE).drop();
        roomExtraDAO.getDatastore().getDB().getCollection(CollectionNames.CLASSIFICATION).drop();
        roomExtraDAO.getDatastore().getDB().getCollection(CollectionNames.ROOM).drop();
    }

    private void dropAndCreateDefaultRoomExtras() {
        roomExtraDAO.getDatastore().getDB().getCollection(CollectionNames.ROOM_EXTRA).drop();

        roomExtraDAO.save(new RoomExtraEntity("42\" TV", "42\" Samsung flat screen television"));
        roomExtraDAO.save(new RoomExtraEntity("Hairdryer", "Simple hairdryer"));
        roomExtraDAO.save(new RoomExtraEntity("Telephone", "Telephone for calling the room service"));
        roomExtraDAO.save(new RoomExtraEntity("Wifi", "Wireless internet connection"));
    }
}
