/**
 */
package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Classification;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomExtra;
import com.bodkink.hotel.business.model.RoomExtraTemplate;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.bodkink.hotel.business.BusinessPackage#getIRoomManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberDataType="org.eclipse.uml2.types.String" roomNumberRequired="true" roomNumberOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" allowedGuestRequired="true" allowedGuestOrdered="false" sizeRequired="true" sizeOrdered="false" nightPriceRequired="true" nightPriceOrdered="false" picUrlsDataType="org.eclipse.uml2.types.String" picUrlsRequired="true" picUrlsOrdered="false" classificationRequired="true" classificationOrdered="false" bedTypesRequired="true" bedTypesOrdered="false" roomExtrasMany="true" roomExtrasOrdered="false"
	 * @generated
	 */
	Room create(String roomNumber, String description, int allowedGuest, BigDecimal size, BigDecimal nightPrice, String picUrls, Classification classification, Map bedTypes, EList<RoomExtra> roomExtras);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberDataType="org.eclipse.uml2.types.String" roomNumberRequired="true" roomNumberOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" allowedGuestRequired="true" allowedGuestOrdered="false" sizeRequired="true" sizeOrdered="false" nightPriceRequired="true" nightPriceOrdered="false" picUrlsDataType="org.eclipse.uml2.types.String" picUrlsRequired="true" picUrlsOrdered="false" classificationRequired="true" classificationOrdered="false" bedTypesRequired="true" bedTypesOrdered="false" roomExtrasTemplateRequired="true" roomExtrasTemplateOrdered="false"
	 * @generated
	 */
	Room create(String roomNumber, String description, int allowedGuest, BigDecimal size, BigDecimal nightPrice, String picUrls, Classification classification, Map bedTypes, RoomExtraTemplate roomExtrasTemplate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> listRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	Room editRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomIdRequired="true" roomIdOrdered="false"
	 * @generated
	 */
	boolean disableRoom(String roomId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomIdRequired="true" roomIdOrdered="false"
	 * @generated
	 */
	Room findRoom(String roomId);

} // IRoomManagement
