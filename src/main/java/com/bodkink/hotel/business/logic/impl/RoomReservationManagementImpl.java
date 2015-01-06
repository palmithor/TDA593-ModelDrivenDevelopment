/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.logic.RoomReservationManagement;
import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.business.model.RoomReservationType;
import com.bodkink.hotel.business.model.impl.ModelFactoryImpl;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.IRoomReservationService;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;
import com.bodkink.hotel.util.DateInterval;
import com.bodkink.hotel.util.DateUtil;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Reservation Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RoomReservationManagementImpl extends MinimalEObjectImpl.Container implements RoomReservationManagement {

    @Inject
    public IRoomReservationService roomReservationService;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected RoomReservationManagementImpl() {
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
        return LogicPackage.Literals.ROOM_RESERVATION_MANAGEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * List all room reservations.
     * @return A list of all room reservations.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public EList<RoomReservation> listRoomReservations() {
        EList<RoomReservation> roomReservations = new BasicEList<>();
        roomReservationService.list().forEach(entity -> {
            roomReservations.add(EntityToModelConverter.convertRoomReservation(entity));
        });
        return roomReservations;
    }

    /**
     * <!-- begin-user-doc -->
     * List all room reservations that is overlapping the given date.
     *
     * @param start The wanted date.
     * @return A list of all room reservations overlapping the given date.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public EList<RoomReservation> listRoomReservations(Date start) {
        EList<RoomReservation> roomReservations = new BasicEList<>();
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(start);
        c1.set(Calendar.HOUR_OF_DAY, 0);
        c1.set(Calendar.MINUTE, 0);
        c2.setTime(c1.getTime());
        c2.set(Calendar.HOUR_OF_DAY, 23);
        c2.set(Calendar.MINUTE, 59);

        DateInterval interval = new DateInterval(c1.getTime(), c2.getTime());
        roomReservationService.list().forEach(entity -> {


            DateInterval entityInterval = new DateInterval(entity.getStartDate(), entity.getEndDate());
            if(DateUtil.isOverlapping(interval, entityInterval))
                roomReservations.add(EntityToModelConverter.convertRoomReservation(entity));
        });

        return roomReservations;
    }

    /**
     * <!-- begin-user-doc -->
     * List all room reservations overlapping the given date interval.
     *
     * @param start The start date of the wanted interval.
     * @param end The end date of the wanted interval.
     * @return A list of all room reservations overlapping the given date interval.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public EList<RoomReservation> listRoomReservations(Date start, Date end) {
        EList<RoomReservation> roomReservations = new BasicEList<>();
        DateInterval interval = new DateInterval(start, end);

        listRoomReservations().forEach(reservation -> {
            DateInterval tmp = new DateInterval(reservation.getStartDate(), reservation.getEndDate());
            if(DateUtil.isOverlapping(interval, tmp))
                roomReservations.add(reservation);
        });

        return roomReservations;
    }

    /**
     * <!-- begin-user-doc -->
     * Create a new room reservation.
     *
     * @param room The room to reserve.
     * @param start The start date of the reservation.
     * @param end The end date of the reservation.
     * @param roomReservationType The type of the reservation.
     * @return The created room reservation.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public RoomReservation create(Room room, Date start, Date end, RoomReservationType roomReservationType) {
        RoomReservation result = ModelFactoryImpl.eINSTANCE.createRoomReservation();
        result.setRoom(room);
        result.setStartDate(start);
        result.setEndDate(end);
        result.setRoomReservationType(roomReservationType);

        RoomReservationEntity entity = ModelToEntityConverter.convertRoomReservation(result);

        roomReservationService.persist(entity);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * Get a room reservation with a specific id.
     *
     * @param roomReservationId The id of the wanted room reservation.
     * @return The room reservation with the specified id.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public RoomReservation findRoomReservation(String roomReservationId) {
        RoomReservationEntity entity = roomReservationService.find(roomReservationId);
        if (entity != null)
            return EntityToModelConverter.convertRoomReservation(entity);
        else
            return null;
    }

    /**
     * <!-- begin-user-doc -->
     * Set the status of a room reservation to CANCELED.
     *
     * @param roomReservationId The id of the room reservation to cancel.
     * @return true if success, false otherwise.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean cancelRoomReservation(String roomReservationId) {
        RoomReservationEntity roomReservationEntity = roomReservationService.find(roomReservationId);
        RoomReservation roomReservation = EntityToModelConverter.convertRoomReservation(roomReservationEntity);

        roomReservation.setReservationStatusEnum(ReservationStatusEnum.CANCELED);
        roomReservationEntity = ModelToEntityConverter.convertRoomReservation(roomReservation);

        return roomReservationService.edit(roomReservationEntity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case LogicPackage.ROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS:
                return listRoomReservations();
            case LogicPackage.ROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE_DATE:
                return listRoomReservations((Date) arguments.get(0), (Date) arguments.get(1));
            case LogicPackage.ROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE:
                return listRoomReservations((Date) arguments.get(0));
            case LogicPackage.ROOM_RESERVATION_MANAGEMENT___CREATE__ROOM_DATE_DATE_ROOMRESERVATIONTYPE:
                return create((Room) arguments.get(0), (Date) arguments.get(1), (Date) arguments.get(2), (RoomReservationType) arguments.get(3));
            case LogicPackage.ROOM_RESERVATION_MANAGEMENT___FIND_ROOM_RESERVATION__STRING:
                return findRoomReservation((String) arguments.get(0));
            case LogicPackage.ROOM_RESERVATION_MANAGEMENT___CANCEL_ROOM_RESERVATION__STRING:
                return cancelRoomReservation((String) arguments.get(0));
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * Check if a room is available for a specific date interval.
     *
     * @param room The room to check the availability for.
     * @param start The start date.
     * @param end The end date.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isAvailable(Room room, Date start, Date end) {
        List<RoomReservationEntity> roomReservationEntityList = roomReservationService.listByRoom(ModelToEntityConverter.convertRoom(room));
        DateInterval wantedDateInterval = new DateInterval(start, end);

        for (RoomReservationEntity entity : roomReservationEntityList) {
            DateInterval entityDateInterval = new DateInterval(entity.getStartDate(), entity.getEndDate());
            if (DateUtil.isOverlapping(wantedDateInterval, entityDateInterval)) {
                return false;
            }
        }

        return true;
    }

} //RoomReservationManagementImpl
