/**
 */
package business;

import business.model.Bill;
import business.model.BillableItem;
import business.model.Booking;
import business.model.BookingBill;
import business.model.BookingBillType;
import business.model.CardInformation;
import business.model.Customer;
import business.model.Receipt;
import business.model.RoomBill;
import business.model.RoomReservation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBilling Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * @model interface="true" abstract="true"
 * @generated
 * @see business.BusinessPackage#getIBillingManagement()
 */
public interface IBillingManagement extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomReservationRequired="true" roomReservationOrdered="false"
     * @generated
     */
    RoomBill createRoomBill(RoomReservation roomReservation);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false" bookingBillTypeRequired="true" bookingBillTypeOrdered="false"
     * @generated
     */
    BookingBill createBookingBill(Booking booking, BookingBillType bookingBillType);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomBillRequired="true" roomBillOrdered="false" itemRequired="true" itemOrdered="false" quantityDataType="org.eclipse.uml2.types.Integer" quantityRequired="true" quantityOrdered="false"
     * @generated
     */
    boolean addBillableItem(RoomBill roomBill, BillableItem item, int quantity);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomBillIdRequired="true" roomBillIdOrdered="false"
     * @generated
     */
    RoomBill findRoomBill(long roomBillId);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" billRequired="true" billOrdered="false" cardInformationRequired="true" cardInformationOrdered="false"
     * @generated
     */
    boolean makePayment(Bill bill, CardInformation cardInformation);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
     * @generated
     */
    Receipt generateReceipts(Booking booking);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" billRequired="true" billOrdered="false"
     * @generated
     */
    Receipt generateReceipt(Bill bill);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" billRequired="true" billOrdered="false" customerRequired="true" customerOrdered="false"
     * @generated
     */
    boolean makePayment(Bill bill, Customer customer);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model bookingRequired="true" bookingOrdered="false" resultRequired="true" resultOrdered="false"
     * @generated
     */
    void makePayment(Booking booking, boolean result);

} // IBillingManagement
