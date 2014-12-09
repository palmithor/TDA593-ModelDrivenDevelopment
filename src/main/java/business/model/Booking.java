/**
 */
package business.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.Booking#getId <em>Id</em>}</li>
 * <li>{@link business.model.Booking#getNumber <em>Number</em>}</li>
 * <li>{@link business.model.Booking#getCustomer <em>Customer</em>}</li>
 * <li>{@link business.model.Booking#getRoomReservation <em>Room Reservation</em>}</li>
 * <li>{@link business.model.Booking#getService <em>Service</em>}</li>
 * <li>{@link business.model.Booking#getBookingBill <em>Booking Bill</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getBooking()
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
     *
     * @return the value of the '<em>Id</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setId(String)
     * @see business.model.ModelPackage#getBooking_Id()
     */
    String getId();

    /**
     * Sets the value of the '{@link business.model.Booking#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Id</em>' attribute.
     * @generated
     * @see #getId()
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
     *
     * @return the value of the '<em>Number</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
     * @generated
     * @see #setNumber(double)
     * @see business.model.ModelPackage#getBooking_Number()
     */
    double getNumber();

    /**
     * Sets the value of the '{@link business.model.Booking#getNumber <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Number</em>' attribute.
     * @generated
     * @see #getNumber()
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
     *
     * @return the value of the '<em>Customer</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setCustomer(Customer)
     * @see business.model.ModelPackage#getBooking_Customer()
     */
    Customer getCustomer();

    /**
     * Sets the value of the '{@link business.model.Booking#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Customer</em>' reference.
     * @generated
     * @see #getCustomer()
     */
    void setCustomer(Customer value);

    /**
     * Returns the value of the '<em><b>Room Reservation</b></em>' reference list.
     * The list contents are of type {@link business.model.RoomReservation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Room Reservation</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Room Reservation</em>' reference list.
     * @model type="business.model.RoomReservation" ordered="false"
     * @generated
     * @see business.model.ModelPackage#getBooking_RoomReservation()
     */
    EList getRoomReservation();

    /**
     * Returns the value of the '<em><b>Service</b></em>' reference list.
     * The list contents are of type {@link business.model.Service}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Service</em>' reference list.
     * @model type="business.model.Service" ordered="false"
     * @generated
     * @see business.model.ModelPackage#getBooking_Service()
     */
    EList getService();

    /**
     * Returns the value of the '<em><b>Booking Bill</b></em>' reference list.
     * The list contents are of type {@link business.model.BookingBill}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Booking Bill</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Booking Bill</em>' reference list.
     * @model type="business.model.BookingBill" ordered="false"
     * @generated
     * @see business.model.ModelPackage#getBooking_BookingBill()
     */
    EList getBookingBill();

} // Booking
