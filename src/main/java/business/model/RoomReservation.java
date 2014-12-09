/**
 */
package business.model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.RoomReservation#getId <em>Id</em>}</li>
 * <li>{@link business.model.RoomReservation#getStartDate <em>Start Date</em>}</li>
 * <li>{@link business.model.RoomReservation#getEndDate <em>End Date</em>}</li>
 * <li>{@link business.model.RoomReservation#getGuest <em>Guest</em>}</li>
 * <li>{@link business.model.RoomReservation#getRoomReservationType <em>Room Reservation Type</em>}</li>
 * <li>{@link business.model.RoomReservation#getRoom <em>Room</em>}</li>
 * <li>{@link business.model.RoomReservation#getRoomBill <em>Room Bill</em>}</li>
 * <li>{@link business.model.RoomReservation#getReservationStatusEnum <em>Reservation Status Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getRoomReservation()
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
     *
     * @return the value of the '<em>Id</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setId(String)
     * @see business.model.ModelPackage#getRoomReservation_Id()
     */
    String getId();

    /**
     * Sets the value of the '{@link business.model.RoomReservation#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Id</em>' attribute.
     * @generated
     * @see #getId()
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
     *
     * @return the value of the '<em>Start Date</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setStartDate(Date)
     * @see business.model.ModelPackage#getRoomReservation_StartDate()
     */
    Date getStartDate();

    /**
     * Sets the value of the '{@link business.model.RoomReservation#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Start Date</em>' attribute.
     * @generated
     * @see #getStartDate()
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
     *
     * @return the value of the '<em>End Date</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setEndDate(Date)
     * @see business.model.ModelPackage#getRoomReservation_EndDate()
     */
    Date getEndDate();

    /**
     * Sets the value of the '{@link business.model.RoomReservation#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>End Date</em>' attribute.
     * @generated
     * @see #getEndDate()
     */
    void setEndDate(Date value);

    /**
     * Returns the value of the '<em><b>Guest</b></em>' reference list.
     * The list contents are of type {@link business.model.Guest}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Guest</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Guest</em>' reference list.
     * @model type="business.model.Guest" ordered="false"
     * @generated
     * @see business.model.ModelPackage#getRoomReservation_Guest()
     */
    EList getGuest();

    /**
     * Returns the value of the '<em><b>Room Reservation Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Room Reservation Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Room Reservation Type</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setRoomReservationType(RoomReservationType)
     * @see business.model.ModelPackage#getRoomReservation_RoomReservationType()
     */
    RoomReservationType getRoomReservationType();

    /**
     * Sets the value of the '{@link business.model.RoomReservation#getRoomReservationType <em>Room Reservation Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Room Reservation Type</em>' reference.
     * @generated
     * @see #getRoomReservationType()
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
     *
     * @return the value of the '<em>Room</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setRoom(Room)
     * @see business.model.ModelPackage#getRoomReservation_Room()
     */
    Room getRoom();

    /**
     * Sets the value of the '{@link business.model.RoomReservation#getRoom <em>Room</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Room</em>' reference.
     * @generated
     * @see #getRoom()
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
     *
     * @return the value of the '<em>Room Bill</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setRoomBill(RoomBill)
     * @see business.model.ModelPackage#getRoomReservation_RoomBill()
     */
    RoomBill getRoomBill();

    /**
     * Sets the value of the '{@link business.model.RoomReservation#getRoomBill <em>Room Bill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Room Bill</em>' reference.
     * @generated
     * @see #getRoomBill()
     */
    void setRoomBill(RoomBill value);

    /**
     * Returns the value of the '<em><b>Reservation Status Enum</b></em>' attribute.
     * The literals are from the enumeration {@link business.model.ReservationStatusEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reservation Status Enum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Reservation Status Enum</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see business.model.ReservationStatusEnum
     * @see #setReservationStatusEnum(ReservationStatusEnum)
     * @see business.model.ModelPackage#getRoomReservation_ReservationStatusEnum()
     */
    ReservationStatusEnum getReservationStatusEnum();

    /**
     * Sets the value of the '{@link business.model.RoomReservation#getReservationStatusEnum <em>Reservation Status Enum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Reservation Status Enum</em>' attribute.
     * @generated
     * @see business.model.ReservationStatusEnum
     * @see #getReservationStatusEnum()
     */
    void setReservationStatusEnum(ReservationStatusEnum value);

} // RoomReservation
