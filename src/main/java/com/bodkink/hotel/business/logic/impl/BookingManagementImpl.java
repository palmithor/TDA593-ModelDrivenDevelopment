/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.BookingManagement;
import com.bodkink.hotel.business.logic.LogicPackage;

import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.CardInformation;
import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.business.model.Receipt;
import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.Room;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BookingManagementImpl extends MinimalEObjectImpl.Container implements BookingManagement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.BOOKING_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking create(Date start, Date end, Room rooms, int numberOfGuests, Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking listBookings() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking findBooking(long bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking listBooking(Date start) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void listAvailableRooms(Date start, Date endDate, Room rooms) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean cancelBooking(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationStatusEnum getBookingStatus(long id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt confirmAndPay(Booking booking, CardInformation cardInformation) {
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
			case LogicPackage.BOOKING_MANAGEMENT___CREATE__DATE_DATE_ROOM_INT_CUSTOMER:
				return create((Date)arguments.get(0), (Date)arguments.get(1), (Room)arguments.get(2), (Integer)arguments.get(3), (Customer)arguments.get(4));
			case LogicPackage.BOOKING_MANAGEMENT___LIST_BOOKINGS:
				return listBookings();
			case LogicPackage.BOOKING_MANAGEMENT___FIND_BOOKING__LONG:
				return findBooking((Long)arguments.get(0));
			case LogicPackage.BOOKING_MANAGEMENT___LIST_BOOKING__DATE:
				return listBooking((Date)arguments.get(0));
			case LogicPackage.BOOKING_MANAGEMENT___LIST_AVAILABLE_ROOMS__DATE_DATE_ROOM:
				listAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (Room)arguments.get(2));
				return null;
			case LogicPackage.BOOKING_MANAGEMENT___CANCEL_BOOKING__BOOKING:
				return cancelBooking((Booking)arguments.get(0));
			case LogicPackage.BOOKING_MANAGEMENT___GET_BOOKING_STATUS__LONG:
				return getBookingStatus((Long)arguments.get(0));
			case LogicPackage.BOOKING_MANAGEMENT___CONFIRM_AND_PAY__BOOKING_CARDINFORMATION:
				return confirmAndPay((Booking)arguments.get(0), (CardInformation)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingManagementImpl
