/**
 */
package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.business.model.Receipt;
import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.Service;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.bodkink.hotel.business.BusinessPackage#getIBookingManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookingManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" startRequired="true" startOrdered="false" endRequired="true" endOrdered="false" roomsMany="true" roomsOrdered="false" servicesMany="true" servicesOrdered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	Booking create(Date start, Date end, EList<Room> rooms, EList<Service> services, Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> listBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	Booking findBooking(String bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" startRequired="true" startOrdered="false"
	 * @generated
	 */
	EList<Booking> listBookings(Date start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" startRequired="true" startOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	EList<Room> listAvailableRooms(Date start, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean cancelBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	ReservationStatusEnum getBookingStatus(String bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	Receipt confirmAndPay(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" numberOfGuestsDataType="org.eclipse.uml2.types.Integer" numberOfGuestsRequired="true" numberOfGuestsOrdered="false" numberOfRoomsDataType="org.eclipse.uml2.types.Integer" numberOfRoomsRequired="true" numberOfRoomsOrdered="false" startRequired="true" startOrdered="false" endRequired="true" endOrdered="false"
	 * @generated
	 */
	EList<Room> searchRoom(int numberOfGuests, int numberOfRooms, Date start, Date end);

} // IBookingManagement
