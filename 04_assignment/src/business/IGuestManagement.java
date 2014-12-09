/**
 */
package business;

import business.model.Booking;
import business.model.Guest;
import business.model.RoomReservation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IGuest Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see business.BusinessPackage#getIGuestManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IGuestManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false" resultRequired="true" resultOrdered="false"
	 * @generated
	 */
	void checkOut(Booking booking, boolean result);

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
