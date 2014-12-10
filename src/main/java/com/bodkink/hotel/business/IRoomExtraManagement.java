/**
 */
package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.RoomExtra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Extra Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.bodkink.hotel.business.BusinessPackage#getIRoomExtraManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomExtraManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	RoomExtra createRoomExtra(String name, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomExtraRequired="true" roomExtraOrdered="false"
	 * @generated
	 */
	RoomExtra editRoomExtra(RoomExtra roomExtra);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomExtra> listRoomExtras();

} // IRoomExtraManagement
