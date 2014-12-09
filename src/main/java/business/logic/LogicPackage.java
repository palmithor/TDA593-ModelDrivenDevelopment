/**
 */
package business.logic;

import business.BusinessPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @model kind="package"
 * @generated
 * @see business.logic.LogicFactory
 */
public interface LogicPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "logic";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http:///business/logic.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "business.logic";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    LogicPackage eINSTANCE = business.logic.impl.LogicPackageImpl.init();

    /**
     * The meta object id for the '{@link business.logic.impl.GuestManagementImplImpl <em>Guest Management Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see business.logic.impl.GuestManagementImplImpl
     * @see business.logic.impl.LogicPackageImpl#getGuestManagementImpl()
     */
    int GUEST_MANAGEMENT_IMPL = 0;

    /**
     * The number of structural features of the '<em>Guest Management Impl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GUEST_MANAGEMENT_IMPL_FEATURE_COUNT = BusinessPackage.IGUEST_MANAGEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link business.logic.impl.RoomExtraManagementImplImpl <em>Room Extra Management Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see business.logic.impl.RoomExtraManagementImplImpl
     * @see business.logic.impl.LogicPackageImpl#getRoomExtraManagementImpl()
     */
    int ROOM_EXTRA_MANAGEMENT_IMPL = 1;

    /**
     * The number of structural features of the '<em>Room Extra Management Impl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_EXTRA_MANAGEMENT_IMPL_FEATURE_COUNT = BusinessPackage.IROOM_EXTRA_MANAGEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link business.logic.impl.RoomManagementImplImpl <em>Room Management Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see business.logic.impl.RoomManagementImplImpl
     * @see business.logic.impl.LogicPackageImpl#getRoomManagementImpl()
     */
    int ROOM_MANAGEMENT_IMPL = 2;

    /**
     * The number of structural features of the '<em>Room Management Impl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_MANAGEMENT_IMPL_FEATURE_COUNT = BusinessPackage.IROOM_MANAGEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link business.logic.impl.ServiceManagementImplImpl <em>Service Management Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see business.logic.impl.ServiceManagementImplImpl
     * @see business.logic.impl.LogicPackageImpl#getServiceManagementImpl()
     */
    int SERVICE_MANAGEMENT_IMPL = 3;

    /**
     * The number of structural features of the '<em>Service Management Impl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_MANAGEMENT_IMPL_FEATURE_COUNT = BusinessPackage.ISERVICE_MANAGEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link business.logic.impl.BedTypeManagementImplImpl <em>Bed Type Management Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see business.logic.impl.BedTypeManagementImplImpl
     * @see business.logic.impl.LogicPackageImpl#getBedTypeManagementImpl()
     */
    int BED_TYPE_MANAGEMENT_IMPL = 4;

    /**
     * The number of structural features of the '<em>Bed Type Management Impl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BED_TYPE_MANAGEMENT_IMPL_FEATURE_COUNT = BusinessPackage.IBED_TYPE_MANAGEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link business.logic.impl.BillableItemManagementImplImpl <em>Billable Item Management Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see business.logic.impl.BillableItemManagementImplImpl
     * @see business.logic.impl.LogicPackageImpl#getBillableItemManagementImpl()
     */
    int BILLABLE_ITEM_MANAGEMENT_IMPL = 5;

    /**
     * The number of structural features of the '<em>Billable Item Management Impl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BILLABLE_ITEM_MANAGEMENT_IMPL_FEATURE_COUNT = BusinessPackage.IBILLABLE_ITEM_MANAGEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link business.logic.impl.BillingManagementImplImpl <em>Billing Management Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see business.logic.impl.BillingManagementImplImpl
     * @see business.logic.impl.LogicPackageImpl#getBillingManagementImpl()
     */
    int BILLING_MANAGEMENT_IMPL = 6;

    /**
     * The number of structural features of the '<em>Billing Management Impl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BILLING_MANAGEMENT_IMPL_FEATURE_COUNT = BusinessPackage.IBILLING_MANAGEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link business.logic.impl.BookingManagementImplImpl <em>Booking Management Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see business.logic.impl.BookingManagementImplImpl
     * @see business.logic.impl.LogicPackageImpl#getBookingManagementImpl()
     */
    int BOOKING_MANAGEMENT_IMPL = 7;

    /**
     * The number of structural features of the '<em>Booking Management Impl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_MANAGEMENT_IMPL_FEATURE_COUNT = BusinessPackage.IBOOKING_MANAGEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link business.logic.impl.CustomerManagementImplImpl <em>Customer Management Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see business.logic.impl.CustomerManagementImplImpl
     * @see business.logic.impl.LogicPackageImpl#getCustomerManagementImpl()
     */
    int CUSTOMER_MANAGEMENT_IMPL = 8;

    /**
     * The number of structural features of the '<em>Customer Management Impl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CUSTOMER_MANAGEMENT_IMPL_FEATURE_COUNT = BusinessPackage.ICUSTOMER_MANAGEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link business.logic.impl.AccountManagementImplImpl <em>Account Management Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see business.logic.impl.AccountManagementImplImpl
     * @see business.logic.impl.LogicPackageImpl#getAccountManagementImpl()
     */
    int ACCOUNT_MANAGEMENT_IMPL = 9;

    /**
     * The number of structural features of the '<em>Account Management Impl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ACCOUNT_MANAGEMENT_IMPL_FEATURE_COUNT = BusinessPackage.IACCOUNT_MANAGEMENT_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link business.logic.GuestManagementImpl <em>Guest Management Impl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Guest Management Impl</em>'.
     * @generated
     * @see business.logic.GuestManagementImpl
     */
    EClass getGuestManagementImpl();

    /**
     * Returns the meta object for class '{@link business.logic.RoomExtraManagementImpl <em>Room Extra Management Impl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Room Extra Management Impl</em>'.
     * @generated
     * @see business.logic.RoomExtraManagementImpl
     */
    EClass getRoomExtraManagementImpl();

    /**
     * Returns the meta object for class '{@link business.logic.RoomManagementImpl <em>Room Management Impl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Room Management Impl</em>'.
     * @generated
     * @see business.logic.RoomManagementImpl
     */
    EClass getRoomManagementImpl();

    /**
     * Returns the meta object for class '{@link business.logic.ServiceManagementImpl <em>Service Management Impl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Service Management Impl</em>'.
     * @generated
     * @see business.logic.ServiceManagementImpl
     */
    EClass getServiceManagementImpl();

    /**
     * Returns the meta object for class '{@link business.logic.BedTypeManagementImpl <em>Bed Type Management Impl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Bed Type Management Impl</em>'.
     * @generated
     * @see business.logic.BedTypeManagementImpl
     */
    EClass getBedTypeManagementImpl();

    /**
     * Returns the meta object for class '{@link business.logic.BillableItemManagementImpl <em>Billable Item Management Impl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Billable Item Management Impl</em>'.
     * @generated
     * @see business.logic.BillableItemManagementImpl
     */
    EClass getBillableItemManagementImpl();

    /**
     * Returns the meta object for class '{@link business.logic.BillingManagementImpl <em>Billing Management Impl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Billing Management Impl</em>'.
     * @generated
     * @see business.logic.BillingManagementImpl
     */
    EClass getBillingManagementImpl();

    /**
     * Returns the meta object for class '{@link business.logic.BookingManagementImpl <em>Booking Management Impl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Booking Management Impl</em>'.
     * @generated
     * @see business.logic.BookingManagementImpl
     */
    EClass getBookingManagementImpl();

    /**
     * Returns the meta object for class '{@link business.logic.CustomerManagementImpl <em>Customer Management Impl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Customer Management Impl</em>'.
     * @generated
     * @see business.logic.CustomerManagementImpl
     */
    EClass getCustomerManagementImpl();

    /**
     * Returns the meta object for class '{@link business.logic.AccountManagementImpl <em>Account Management Impl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Account Management Impl</em>'.
     * @generated
     * @see business.logic.AccountManagementImpl
     */
    EClass getAccountManagementImpl();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    LogicFactory getLogicFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link business.logic.impl.GuestManagementImplImpl <em>Guest Management Impl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see business.logic.impl.GuestManagementImplImpl
         * @see business.logic.impl.LogicPackageImpl#getGuestManagementImpl()
         */
        EClass GUEST_MANAGEMENT_IMPL = eINSTANCE.getGuestManagementImpl();

        /**
         * The meta object literal for the '{@link business.logic.impl.RoomExtraManagementImplImpl <em>Room Extra Management Impl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see business.logic.impl.RoomExtraManagementImplImpl
         * @see business.logic.impl.LogicPackageImpl#getRoomExtraManagementImpl()
         */
        EClass ROOM_EXTRA_MANAGEMENT_IMPL = eINSTANCE.getRoomExtraManagementImpl();

        /**
         * The meta object literal for the '{@link business.logic.impl.RoomManagementImplImpl <em>Room Management Impl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see business.logic.impl.RoomManagementImplImpl
         * @see business.logic.impl.LogicPackageImpl#getRoomManagementImpl()
         */
        EClass ROOM_MANAGEMENT_IMPL = eINSTANCE.getRoomManagementImpl();

        /**
         * The meta object literal for the '{@link business.logic.impl.ServiceManagementImplImpl <em>Service Management Impl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see business.logic.impl.ServiceManagementImplImpl
         * @see business.logic.impl.LogicPackageImpl#getServiceManagementImpl()
         */
        EClass SERVICE_MANAGEMENT_IMPL = eINSTANCE.getServiceManagementImpl();

        /**
         * The meta object literal for the '{@link business.logic.impl.BedTypeManagementImplImpl <em>Bed Type Management Impl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see business.logic.impl.BedTypeManagementImplImpl
         * @see business.logic.impl.LogicPackageImpl#getBedTypeManagementImpl()
         */
        EClass BED_TYPE_MANAGEMENT_IMPL = eINSTANCE.getBedTypeManagementImpl();

        /**
         * The meta object literal for the '{@link business.logic.impl.BillableItemManagementImplImpl <em>Billable Item Management Impl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see business.logic.impl.BillableItemManagementImplImpl
         * @see business.logic.impl.LogicPackageImpl#getBillableItemManagementImpl()
         */
        EClass BILLABLE_ITEM_MANAGEMENT_IMPL = eINSTANCE.getBillableItemManagementImpl();

        /**
         * The meta object literal for the '{@link business.logic.impl.BillingManagementImplImpl <em>Billing Management Impl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see business.logic.impl.BillingManagementImplImpl
         * @see business.logic.impl.LogicPackageImpl#getBillingManagementImpl()
         */
        EClass BILLING_MANAGEMENT_IMPL = eINSTANCE.getBillingManagementImpl();

        /**
         * The meta object literal for the '{@link business.logic.impl.BookingManagementImplImpl <em>Booking Management Impl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see business.logic.impl.BookingManagementImplImpl
         * @see business.logic.impl.LogicPackageImpl#getBookingManagementImpl()
         */
        EClass BOOKING_MANAGEMENT_IMPL = eINSTANCE.getBookingManagementImpl();

        /**
         * The meta object literal for the '{@link business.logic.impl.CustomerManagementImplImpl <em>Customer Management Impl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see business.logic.impl.CustomerManagementImplImpl
         * @see business.logic.impl.LogicPackageImpl#getCustomerManagementImpl()
         */
        EClass CUSTOMER_MANAGEMENT_IMPL = eINSTANCE.getCustomerManagementImpl();

        /**
         * The meta object literal for the '{@link business.logic.impl.AccountManagementImplImpl <em>Account Management Impl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see business.logic.impl.AccountManagementImplImpl
         * @see business.logic.impl.LogicPackageImpl#getAccountManagementImpl()
         */
        EClass ACCOUNT_MANAGEMENT_IMPL = eINSTANCE.getAccountManagementImpl();

    }

} //LogicPackage
