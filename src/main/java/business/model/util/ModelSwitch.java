/**
 */
package business.model.util;

import business.model.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @generated
 * @see business.model.ModelPackage
 */
public class ModelSwitch {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ModelPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public ModelSwitch() {
        if (modelPackage == null) {
            modelPackage = ModelPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public Object doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        } else {
            List eSuperTypes = theEClass.getESuperTypes();
            return
                    eSuperTypes.isEmpty() ?
                            defaultCase(theEObject) :
                            doSwitch((EClass) eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ModelPackage.ADDRESS: {
                Address address = (Address) theEObject;
                Object result = caseAddress(address);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.BED_TYPE: {
                BedType bedType = (BedType) theEObject;
                Object result = caseBedType(bedType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.BILL: {
                Bill bill = (Bill) theEObject;
                Object result = caseBill(bill);
                if (result == null) result = caseIBill(bill);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CARD_INFORMATION: {
                CardInformation cardInformation = (CardInformation) theEObject;
                Object result = caseCardInformation(cardInformation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.IBILL: {
                IBill iBill = (IBill) theEObject;
                Object result = caseIBill(iBill);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.BILLABLE_ITEM: {
                BillableItem billableItem = (BillableItem) theEObject;
                Object result = caseBillableItem(billableItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.BOOKING: {
                Booking booking = (Booking) theEObject;
                Object result = caseBooking(booking);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CUSTOMER: {
                Customer customer = (Customer) theEObject;
                Object result = caseCustomer(customer);
                if (result == null) result = casePerson(customer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.PERSON: {
                Person person = (Person) theEObject;
                Object result = casePerson(person);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ROOM_RESERVATION: {
                RoomReservation roomReservation = (RoomReservation) theEObject;
                Object result = caseRoomReservation(roomReservation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.GUEST: {
                Guest guest = (Guest) theEObject;
                Object result = caseGuest(guest);
                if (result == null) result = casePerson(guest);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ROOM_RESERVATION_TYPE: {
                RoomReservationType roomReservationType = (RoomReservationType) theEObject;
                Object result = caseRoomReservationType(roomReservationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ROOM: {
                Room room = (Room) theEObject;
                Object result = caseRoom(room);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CLASSIFICATION: {
                Classification classification = (Classification) theEObject;
                Object result = caseClassification(classification);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ROOM_EXTRA: {
                RoomExtra roomExtra = (RoomExtra) theEObject;
                Object result = caseRoomExtra(roomExtra);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ROOM_BILL: {
                RoomBill roomBill = (RoomBill) theEObject;
                Object result = caseRoomBill(roomBill);
                if (result == null) result = caseBill(roomBill);
                if (result == null) result = caseIBill(roomBill);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.SERVICE: {
                Service service = (Service) theEObject;
                Object result = caseService(service);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.BOOKING_BILL: {
                BookingBill bookingBill = (BookingBill) theEObject;
                Object result = caseBookingBill(bookingBill);
                if (result == null) result = caseBill(bookingBill);
                if (result == null) result = caseIBill(bookingBill);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.ROOM_EXTRA_TEMPLATE: {
                RoomExtraTemplate roomExtraTemplate = (RoomExtraTemplate) theEObject;
                Object result = caseRoomExtraTemplate(roomExtraTemplate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.RECEIPT: {
                Receipt receipt = (Receipt) theEObject;
                Object result = caseReceipt(receipt);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.RECEIPT_ITEM: {
                ReceiptItem receiptItem = (ReceiptItem) theEObject;
                Object result = caseReceiptItem(receiptItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.USER_ACCOUNT: {
                UserAccount userAccount = (UserAccount) theEObject;
                Object result = caseUserAccount(userAccount);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CUSTOMER_USER_ACCOUNT: {
                CustomerUserAccount customerUserAccount = (CustomerUserAccount) theEObject;
                Object result = caseCustomerUserAccount(customerUserAccount);
                if (result == null) result = caseUserAccount(customerUserAccount);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default:
                return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Address</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseAddress(Address object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bed Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bed Type</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseBedType(BedType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bill</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bill</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseBill(Bill object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Card Information</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Card Information</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseCardInformation(CardInformation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IBill</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IBill</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseIBill(IBill object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Billable Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Billable Item</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseBillableItem(BillableItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseBooking(Booking object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseCustomer(Customer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Person</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object casePerson(Person object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Room Reservation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Room Reservation</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseRoomReservation(RoomReservation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Guest</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Guest</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseGuest(Guest object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Room Reservation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Room Reservation Type</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseRoomReservationType(RoomReservationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Room</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseRoom(Room object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Classification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Classification</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseClassification(Classification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Room Extra</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Room Extra</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseRoomExtra(RoomExtra object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Room Bill</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Room Bill</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseRoomBill(RoomBill object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseService(Service object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Booking Bill</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Booking Bill</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseBookingBill(BookingBill object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Room Extra Template</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Room Extra Template</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseRoomExtraTemplate(RoomExtraTemplate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Receipt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Receipt</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseReceipt(Receipt object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Receipt Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Receipt Item</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseReceiptItem(ReceiptItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>User Account</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>User Account</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseUserAccount(UserAccount object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Customer User Account</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Customer User Account</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public Object caseCustomerUserAccount(CustomerUserAccount object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     */
    public Object defaultCase(EObject object) {
        return null;
    }

} //ModelSwitch
