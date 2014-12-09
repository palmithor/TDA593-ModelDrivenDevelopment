/**
 */
package business.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.BookingBill#getBookingBillType <em>Booking Bill Type</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getBookingBill()
 */
public interface BookingBill extends Bill {
    /**
     * Returns the value of the '<em><b>Booking Bill Type</b></em>' attribute.
     * The literals are from the enumeration {@link business.model.BookingBillType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Booking Bill Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Booking Bill Type</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see business.model.BookingBillType
     * @see #setBookingBillType(BookingBillType)
     * @see business.model.ModelPackage#getBookingBill_BookingBillType()
     */
    BookingBillType getBookingBillType();

    /**
     * Sets the value of the '{@link business.model.BookingBill#getBookingBillType <em>Booking Bill Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Booking Bill Type</em>' attribute.
     * @generated
     * @see business.model.BookingBillType
     * @see #getBookingBillType()
     */
    void setBookingBillType(BookingBillType value);

} // BookingBill
