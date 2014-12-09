/**
 */
package business;

import business.model.Room;
import business.model.RoomReservation;
import business.model.RoomReservationType;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Reservation Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see business.BusinessPackage#getIRoomReservationManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomReservationManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomReservation listRoomReservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" startRequired="true" startOrdered="false" endRequired="true" endOrdered="false"
	 * @generated
	 */
	RoomReservation listRoomReservations(Date start, Date end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" startRequired="true" startOrdered="false"
	 * @generated
	 */
	RoomReservation listRoomReservations(Date start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false" startRequired="true" startOrdered="false" endRequired="true" endOrdered="false" roomReservationTypeRequired="true" roomReservationTypeOrdered="false"
	 * @generated
	 */
	void create(Room room, Date start, Date end, RoomReservationType roomReservationType);

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
	 * @model required="true" ordered="false" roomReservationRequired="true" roomReservationOrdered="false"
	 * @generated
	 */
	boolean cancelRoomReservation(RoomReservation roomReservation);

} // IRoomReservationManagement
