/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.GuestManagement;
import com.bodkink.hotel.business.logic.LogicPackage;

import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.Guest;
import com.bodkink.hotel.business.model.RoomReservation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GuestManagementImpl extends MinimalEObjectImpl.Container implements GuestManagement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.GUEST_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut(Booking booking, boolean result) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIn(RoomReservation roomReservation, Guest guests) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkOut(RoomReservation roomReservation) {
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
			case LogicPackage.GUEST_MANAGEMENT___CHECK_OUT__BOOKING_BOOLEAN:
				checkOut((Booking)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case LogicPackage.GUEST_MANAGEMENT___CHECK_IN__ROOMRESERVATION_GUEST:
				return checkIn((RoomReservation)arguments.get(0), (Guest)arguments.get(1));
			case LogicPackage.GUEST_MANAGEMENT___CHECK_OUT__ROOMRESERVATION:
				return checkOut((RoomReservation)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GuestManagementImpl
