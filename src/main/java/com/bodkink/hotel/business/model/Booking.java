/**
 */
package com.bodkink.hotel.business.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.Booking#getId <em>Id</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Booking#getNumber <em>Number</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Booking#getRoomReservation <em>Room Reservation</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Booking#getService <em>Service</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Booking#getBookingBill <em>Booking Bill</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
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
	 * @see com.bodkink.hotel.business.model.ModelPackage#getBooking_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Booking#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(double)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getBooking_Number()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getNumber();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Booking#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(double value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getBooking_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Booking#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Room Reservation</b></em>' reference list.
	 * The list contents are of type {@link com.bodkink.hotel.business.model.RoomReservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Reservation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Reservation</em>' reference list.
	 * @see com.bodkink.hotel.business.model.ModelPackage#getBooking_RoomReservation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomReservation> getRoomReservation();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference list.
	 * The list contents are of type {@link com.bodkink.hotel.business.model.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference list.
	 * @see com.bodkink.hotel.business.model.ModelPackage#getBooking_Service()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Booking Bill</b></em>' reference list.
	 * The list contents are of type {@link com.bodkink.hotel.business.model.BookingBill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Bill</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Bill</em>' reference list.
	 * @see com.bodkink.hotel.business.model.ModelPackage#getBooking_BookingBill()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BookingBill> getBookingBill();

} // Booking
