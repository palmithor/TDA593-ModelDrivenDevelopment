/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.logic.RoomManagement;
import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.IRoomService;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RoomManagementImpl extends MinimalEObjectImpl.Container implements RoomManagement {

    @Inject
    public IRoomService roomService;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected RoomManagementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LogicPackage.Literals.ROOM_MANAGEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * Create a new room.
     *
     * @param roomNumber     The number of the room
     * @param description    The description of the room
     * @param allowedGuest   The maximum number of allowed guests in this room
     * @param size           The size of the room
     * @param nightPrice     The price per night of the room
     * @param picUrls        URL for pictures used when displaying information of the room
     * @param classification The classification of the room
     * @param bedTypes       A map of bed types and how many of each bed type the room has
     * @param roomExtras     A list of room extras that this room has
     * @return The newly created room.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Room create(String roomNumber, String description, int allowedGuest, BigDecimal size, BigDecimal nightPrice,
                       String picUrls, Classification classification, Map bedTypes, EList<RoomExtra> roomExtras) {
        Room result = ModelFactory.eINSTANCE.createRoom();
        result.setNumber(roomNumber);
        result.setDescription(description);
        result.setAllowedGuests(allowedGuest);
        result.setSize(size);
        result.setNightPrice(nightPrice);
        result.getPictures().add(picUrls);
        result.setClassification(classification);
        result.getBedType().addAll(bedTypes.keySet()); //TODO: Map<BedType, quantity> instead of List<BedType> ?
        result.getRoomExtra().addAll(roomExtras);

        RoomEntity roomEntity = ModelToEntityConverter.convertRoom(result);
        roomService.persist(roomEntity);

        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * Create a new room.
     *
     * @param roomNumber         The number of the room
     * @param description        The description of the room
     * @param allowedGuest       The maximum number of allowed guests in this room
     * @param size               The size of the room
     * @param nightPrice         The price per night of the room
     * @param picUrls            URL for pictures used when displaying information of the room
     * @param classification     The classification of the room
     * @param bedTypes           A map of bed types and how many of each bed type the room has
     * @param roomExtrasTemplate A template holding a list of room extras that this room has
     * @return The newly created room.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Room create(String roomNumber, String description, int allowedGuest, BigDecimal size, BigDecimal nightPrice, String picUrls, Classification classification, Map bedTypes, RoomExtraTemplate roomExtrasTemplate) {
        return create(roomNumber, description, allowedGuest, size, nightPrice, picUrls, classification, bedTypes, roomExtrasTemplate.getRoomExtra());
    }

    /**
     * <!-- begin-user-doc -->
     * Get a list of all rooms.
     *
     * @return an EList containing all rooms
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public EList<Room> listRooms() {
        List<RoomEntity> roomEntityList = roomService.listAll();
        EList<Room> rooms = new BasicEList<>(roomEntityList.size());
        roomEntityList.forEach(entity -> {
            rooms.add(EntityToModelConverter.convertRoom(entity));
        });
        return rooms;
    }

    /**
     * <!-- begin-user-doc -->
     * Edit an existing room
     *
     * @param room The edited room
     * @return The room, now edited and saved
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Room editRoom(Room room) {
        RoomEntity bedTypeEntity = ModelToEntityConverter.convertRoom(room);
        roomService.edit(bedTypeEntity);
        return room;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean disableRoom(String roomId) {
        // TODO: implement this method
        // TODO: What does it mean to disable a room?
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * Find a room by its ID
     *
     * @param roomId the ID of the room
     * @return the room associated with the ID
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Room findRoom(String roomId) {
        List<RoomEntity> roomEntityList = roomService.listAll();
        for (RoomEntity entity : roomEntityList) {
            System.out.println(entity.getId().toString());
            if (entity.getId().toString().equals(roomId))
                return EntityToModelConverter.convertRoom(entity);
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case LogicPackage.ROOM_MANAGEMENT___CREATE__STRING_STRING_INT_BIGDECIMAL_BIGDECIMAL_STRING_CLASSIFICATION_MAP_ELIST:
                return create((String) arguments.get(0), (String) arguments.get(1), (Integer) arguments.get(2), (BigDecimal) arguments.get(3), (BigDecimal) arguments.get(4), (String) arguments.get(5), (Classification) arguments.get(6), (Map) arguments.get(7), (EList<RoomExtra>) arguments.get(8));
            case LogicPackage.ROOM_MANAGEMENT___CREATE__STRING_STRING_INT_BIGDECIMAL_BIGDECIMAL_STRING_CLASSIFICATION_MAP_ROOMEXTRATEMPLATE:
                return create((String) arguments.get(0), (String) arguments.get(1), (Integer) arguments.get(2), (BigDecimal) arguments.get(3), (BigDecimal) arguments.get(4), (String) arguments.get(5), (Classification) arguments.get(6), (Map) arguments.get(7), (RoomExtraTemplate) arguments.get(8));
            case LogicPackage.ROOM_MANAGEMENT___LIST_ROOMS:
                return listRooms();
            case LogicPackage.ROOM_MANAGEMENT___EDIT_ROOM__ROOM:
                return editRoom((Room) arguments.get(0));
            case LogicPackage.ROOM_MANAGEMENT___DISABLE_ROOM__STRING:
                return disableRoom((String) arguments.get(0));
            case LogicPackage.ROOM_MANAGEMENT___FIND_ROOM__STRING:
                return findRoom((String) arguments.get(0));
        }
        return super.eInvoke(operationID, arguments);
    }

} //RoomManagementImpl
