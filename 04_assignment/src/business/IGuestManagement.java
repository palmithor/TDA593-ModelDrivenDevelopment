/**
 */
package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.Guest;
import com.bodkink.hotel.business.model.RoomReservation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IGuest Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.bodkink.hotel.business.BusinessPackage#getIGuestManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IGuestManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean checkOut(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomReservationRequired="true" roomReservationOrdered="false" guestsRequired="true" guestsOrdered="false"
	 * @generated
	 */
	boolean checkIn(RoomReservation roomReservation, Guest guests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomReservationRequired="true" roomReservationOrdered="false"
	 * @generated
	 */
	boolean checkOut(RoomReservation roomReservation);

} // IGuestManagement
