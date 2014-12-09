/**
 */
package business.logic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @generated
 * @see business.logic.LogicPackage
 */
public interface LogicFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    LogicFactory eINSTANCE = business.logic.impl.LogicFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Guest Management Impl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Guest Management Impl</em>'.
     * @generated
     */
    GuestManagementImpl createGuestManagementImpl();

    /**
     * Returns a new object of class '<em>Room Extra Management Impl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Room Extra Management Impl</em>'.
     * @generated
     */
    RoomExtraManagementImpl createRoomExtraManagementImpl();

    /**
     * Returns a new object of class '<em>Room Management Impl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Room Management Impl</em>'.
     * @generated
     */
    RoomManagementImpl createRoomManagementImpl();

    /**
     * Returns a new object of class '<em>Service Management Impl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Service Management Impl</em>'.
     * @generated
     */
    ServiceManagementImpl createServiceManagementImpl();

    /**
     * Returns a new object of class '<em>Bed Type Management Impl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Bed Type Management Impl</em>'.
     * @generated
     */
    BedTypeManagementImpl createBedTypeManagementImpl();

    /**
     * Returns a new object of class '<em>Billable Item Management Impl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Billable Item Management Impl</em>'.
     * @generated
     */
    BillableItemManagementImpl createBillableItemManagementImpl();

    /**
     * Returns a new object of class '<em>Billing Management Impl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Billing Management Impl</em>'.
     * @generated
     */
    BillingManagementImpl createBillingManagementImpl();

    /**
     * Returns a new object of class '<em>Booking Management Impl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Booking Management Impl</em>'.
     * @generated
     */
    BookingManagementImpl createBookingManagementImpl();

    /**
     * Returns a new object of class '<em>Customer Management Impl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Customer Management Impl</em>'.
     * @generated
     */
    CustomerManagementImpl createCustomerManagementImpl();

    /**
     * Returns a new object of class '<em>Account Management Impl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Account Management Impl</em>'.
     * @generated
     */
    AccountManagementImpl createAccountManagementImpl();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    LogicPackage getLogicPackage();

} //LogicFactory
