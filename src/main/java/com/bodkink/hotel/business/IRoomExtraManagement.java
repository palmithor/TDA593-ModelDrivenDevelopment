/**
 */
package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.RoomExtra;
import com.bodkink.hotel.business.model.RoomExtraTemplate;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" roomExtrasMany="true" roomExtrasOrdered="false"
	 * @generated
	 */
	RoomExtraTemplate createRoomExtraTemplate(String name, EList<RoomExtra> roomExtras);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomExtraTemplateRequired="true" roomExtraTemplateOrdered="false"
	 * @generated
	 */
	RoomExtraTemplate editRoomExtraTemplate(RoomExtraTemplate roomExtraTemplate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomExtraTemplateRequired="true" roomExtraTemplateOrdered="false"
	 * @generated
	 */
	RoomExtraTemplate deleteRoomExtraTemplate(RoomExtraTemplate roomExtraTemplate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomExtraTemplate> listRoomExtraTemplates();

} // IRoomExtraManagement
