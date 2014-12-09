/**
 */
package business.logic;

import business.IRoomManagement;

import business.model.RoomReservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Management Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see business.logic.LogicPackage#getRoomManagementImpl()
 * @model
 * @generated
 */
public interface RoomManagementImpl extends IRoomManagement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomReservation listRoomReservations();

} // RoomManagementImpl
