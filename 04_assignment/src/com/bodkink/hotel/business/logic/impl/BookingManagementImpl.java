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
import com.bodkink.hotel.business.model.Service;

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
	public Booking create(Date start, Date end, EList<Room> rooms, EList<Service> services, Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> listBookings() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking findBooking(String bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> listBookings(Date start) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> listAvailableRooms(Date start, Date endDate) {
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
	public ReservationStatusEnum getBookingStatus(String bookingId) {
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
	public EList<Room> searchRoom(int numberOfGuests, int numberOfRooms, Date start, Date end) {
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
			case LogicPackage.BOOKING_MANAGEMENT___CREATE__DATE_DATE_ELIST_ELIST_CUSTOMER:
				return create((Date)arguments.get(0), (Date)arguments.get(1), (EList<Room>)arguments.get(2), (EList<Service>)arguments.get(3), (Customer)arguments.get(4));
			case LogicPackage.BOOKING_MANAGEMENT___LIST_BOOKINGS:
				return listBookings();
			case LogicPackage.BOOKING_MANAGEMENT___FIND_BOOKING__STRING:
				return findBooking((String)arguments.get(0));
			case LogicPackage.BOOKING_MANAGEMENT___LIST_BOOKINGS__DATE:
				return listBookings((Date)arguments.get(0));
			case LogicPackage.BOOKING_MANAGEMENT___LIST_AVAILABLE_ROOMS__DATE_DATE:
				return listAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1));
			case LogicPackage.BOOKING_MANAGEMENT___CANCEL_BOOKING__BOOKING:
				return cancelBooking((Booking)arguments.get(0));
			case LogicPackage.BOOKING_MANAGEMENT___GET_BOOKING_STATUS__STRING:
				return getBookingStatus((String)arguments.get(0));
			case LogicPackage.BOOKING_MANAGEMENT___CONFIRM_AND_PAY__BOOKING_CARDINFORMATION:
				return confirmAndPay((Booking)arguments.get(0), (CardInformation)arguments.get(1));
			case LogicPackage.BOOKING_MANAGEMENT___SEARCH_ROOM__INT_INT_DATE_DATE:
				return searchRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (Date)arguments.get(2), (Date)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingManagementImpl
