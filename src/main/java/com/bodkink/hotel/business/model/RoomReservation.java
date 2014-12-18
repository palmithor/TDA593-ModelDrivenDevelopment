/**
 */
package com.bodkink.hotel.business.model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.RoomReservation#getId <em>Id</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.RoomReservation#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.RoomReservation#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.RoomReservation#getGuest <em>Guest</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.RoomReservation#getRoomReservationType <em>Room Reservation Type</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.RoomReservation#getRoom <em>Room</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.RoomReservation#getRoomBill <em>Room Bill</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.RoomReservation#getReservationStatusEnum <em>Reservation Status Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomReservation()
 * @model
 * @generated
 */
public interface RoomReservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomReservation_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.RoomReservation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomReservation_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.RoomReservation#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomReservation_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.RoomReservation#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' reference listByDate.
	 * The listByDate contents are of type {@link com.bodkink.hotel.business.model.Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest</em>' reference listByDate isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' reference listByDate.
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomReservation_Guest()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Guest> getGuest();

	/**
	 * Returns the value of the '<em><b>Room Reservation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.bodkink.hotel.business.model.RoomReservationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Reservation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Reservation Type</em>' attribute.
	 * @see com.bodkink.hotel.business.model.RoomReservationType
	 * @see #setRoomReservationType(RoomReservationType)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomReservation_RoomReservationType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomReservationType getRoomReservationType();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.RoomReservation#getRoomReservationType <em>Room Reservation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Reservation Type</em>' attribute.
	 * @see com.bodkink.hotel.business.model.RoomReservationType
	 * @see #getRoomReservationType()
	 * @generated
	 */
	void setRoomReservationType(RoomReservationType value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomReservation_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.RoomReservation#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Room Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Bill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Bill</em>' reference.
	 * @see #setRoomBill(RoomBill)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomReservation_RoomBill()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomBill getRoomBill();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.RoomReservation#getRoomBill <em>Room Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Bill</em>' reference.
	 * @see #getRoomBill()
	 * @generated
	 */
	void setRoomBill(RoomBill value);

	/**
	 * Returns the value of the '<em><b>Reservation Status Enum</b></em>' attribute.
	 * The literals are from the enumeration {@link com.bodkink.hotel.business.model.ReservationStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation Status Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Status Enum</em>' attribute.
	 * @see com.bodkink.hotel.business.model.ReservationStatusEnum
	 * @see #setReservationStatusEnum(ReservationStatusEnum)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomReservation_ReservationStatusEnum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReservationStatusEnum getReservationStatusEnum();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.RoomReservation#getReservationStatusEnum <em>Reservation Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Status Enum</em>' attribute.
	 * @see com.bodkink.hotel.business.model.ReservationStatusEnum
	 * @see #getReservationStatusEnum()
	 * @generated
	 */
	void setReservationStatusEnum(ReservationStatusEnum value);

} // RoomReservation
