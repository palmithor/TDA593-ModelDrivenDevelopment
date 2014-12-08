package conf;

import com.bodkink.hotel.persistence.dao.RoomExtraDAO;
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

    private NinjaProperties ninjaProperties;

    @Inject
    public StartupActions(NinjaProperties ninjaProperties) {
        this.ninjaProperties = ninjaProperties;
    }

    @Start(order = 100)
    public void generateDummyDataWhenInTest() {

        roomExtraDAO.getDatastore().getDB().getCollection(CollectionNames.ADDRESS).drop();
        roomExtraDAO.getDatastore().getDB().getCollection(CollectionNames.ROOM_EXTRA).drop();

        roomExtraDAO.save(new RoomExtraEntity("42\" TV", "42\" Samsung flat screen television"));
        roomExtraDAO.save(new RoomExtraEntity("Hairdryer", "Simple hairdryer"));
        roomExtraDAO.save(new RoomExtraEntity("Telephone", "Telephone for calling the room service."));
        roomExtraDAO.save(new RoomExtraEntity("Wifi", "Wireless internet connection."));
    }
}
