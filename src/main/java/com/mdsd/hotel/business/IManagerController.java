package com.mdsd.hotel.business;

import com.mdsd.hotel.business.model.*;

import java.util.List;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public interface IManagerController {

    Room createRoom(final Room room);

    void editRoom(final Room room);

    Room viewRoom(final String roomNumber);

    RoomExtra createRoomExtra(final RoomExtra roomExtra);

    void editRoomExtra(final RoomExtra roomExtra);

    List<RoomExtra> listRoomExtras();

    Service createService(final Service service);

    void editService(final Service service);

    RoomExtrasTemplate createRoomExtrasTemplate(final String templateName, final Long... roomExtraIdList);

    void addRoomExtra(final Long roomExtrasTemplateId, final Long roomExtraId);

    void removeRoomExtra(final Long roomExtrasTemplateId, final Long roomExtraId);

    BedType createBedType(final BedType bedType);

    void editBedType(final BedType bedType);

    List<BedType> listBedTypes();

    BillableItem createBillableItem(final BillableItem billableItem);

    void editBillableItem(final BillableItem billableItem);

    List<BillableItem> listBillableItems();
}
