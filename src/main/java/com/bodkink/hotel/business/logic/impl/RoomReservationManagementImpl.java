/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.logic.RoomReservationManagement;

import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.business.model.RoomReservationType;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import com.bodkink.hotel.persistence.IRoomReservationService;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	IRoomReservationService roomReservationService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomReservationManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.ROOM_RESERVATION_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<RoomReservation> listRoomReservations() {
		return roomReservationService.list();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<RoomReservation> listRoomReservations(Date start, Date end) {
		return roomReservationService.list(start, end);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<RoomReservation> listRoomReservations(Date start) {
		return roomReservationService.list(start);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create(Room room, Date start, Date end, RoomReservationType roomReservationType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomReservation findRoomReservation(String roomReservationId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean cancelRoomReservation(String roomReservationId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.ROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS:
				return listRoomReservations();
			case LogicPackage.ROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE_DATE:
				return listRoomReservations((Date)arguments.get(0), (Date)arguments.get(1));
			case LogicPackage.ROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE:
				return listRoomReservations((Date)arguments.get(0));
			case LogicPackage.ROOM_RESERVATION_MANAGEMENT___CREATE__ROOM_DATE_DATE_ROOMRESERVATIONTYPE:
				create((Room)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (RoomReservationType)arguments.get(3));
				return null;
			case LogicPackage.ROOM_RESERVATION_MANAGEMENT___FIND_ROOM_RESERVATION__STRING:
				return findRoomReservation((String)arguments.get(0));
			case LogicPackage.ROOM_RESERVATION_MANAGEMENT___CANCEL_ROOM_RESERVATION__STRING:
				return cancelRoomReservation((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomReservationManagementImpl
