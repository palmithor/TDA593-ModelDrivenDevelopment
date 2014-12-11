/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.logic.RoomManagement;

import com.bodkink.hotel.business.model.Classification;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomExtra;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;

import java.util.Map;

import com.bodkink.hotel.persistence.IRoomExtraService;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	public IRoomExtraService roomExtraService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.ROOM_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room create(String roomNumber, String description, int allowedGuest, BigDecimal size, BigDecimal nightPrice, String picUrls, Classification classification, Map bedTypes, EList<RoomExtra> roomExtras) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> listRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room editRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean disableRoom(String roomId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room findRoom(String roomId) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.ROOM_MANAGEMENT___CREATE__STRING_STRING_INT_BIGDECIMAL_BIGDECIMAL_STRING_CLASSIFICATION_MAP_ELIST:
				return create((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (BigDecimal)arguments.get(3), (BigDecimal)arguments.get(4), (String)arguments.get(5), (Classification)arguments.get(6), (Map)arguments.get(7), (EList<RoomExtra>)arguments.get(8));
			case LogicPackage.ROOM_MANAGEMENT___LIST_ROOMS:
				return listRooms();
			case LogicPackage.ROOM_MANAGEMENT___EDIT_ROOM__ROOM:
				return editRoom((Room)arguments.get(0));
			case LogicPackage.ROOM_MANAGEMENT___DISABLE_ROOM__STRING:
				return disableRoom((String)arguments.get(0));
			case LogicPackage.ROOM_MANAGEMENT___FIND_ROOM__STRING:
				return findRoom((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomManagementImpl
