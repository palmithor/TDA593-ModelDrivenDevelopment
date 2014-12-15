/**
 */
package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.business.model.RoomReservationType;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Reservation Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.bodkink.hotel.business.BusinessPackage#getIRoomReservationManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomReservationManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomReservation> listRoomReservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" startRequired="true" startOrdered="false" endRequired="true" endOrdered="false"
	 * @generated
	 */
	EList<RoomReservation> listRoomReservations(Date start, Date end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" startRequired="true" startOrdered="false"
	 * @generated
	 */
	EList<RoomReservation> listRoomReservations(Date start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false" startRequired="true" startOrdered="false" endRequired="true" endOrdered="false" roomReservationTypeRequired="true" roomReservationTypeOrdered="false"
	 * @generated
	 */
	RoomReservation create(Room room, Date start, Date end, RoomReservationType roomReservationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomReservationIdRequired="true" roomReservationIdOrdered="false"
	 * @generated
	 */
	RoomReservation findRoomReservation(String roomReservationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomReservationIdRequired="true" roomReservationIdOrdered="false"
	 * @generated
	 */
	boolean cancelRoomReservation(String roomReservationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomRequired="true" roomOrdered="false" startRequired="true" startOrdered="false" endRequired="true" endOrdered="false"
	 * @generated
	 */
	boolean isAvailable(Room room, Date start, Date end);

} // IRoomReservationManagement
