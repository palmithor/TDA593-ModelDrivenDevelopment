/**
 */
package business.logic.impl;

import business.logic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LogicFactoryImpl extends EFactoryImpl implements LogicFactory {
    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public LogicFactoryImpl() {
        super();
    }

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static LogicFactory init() {
        try {
            LogicFactory theLogicFactory = (LogicFactory) EPackage.Registry.INSTANCE.getEFactory(LogicPackage.eNS_URI);
            if (theLogicFactory != null) {
                return theLogicFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new LogicFactoryImpl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @deprecated
     */
    public static LogicPackage getPackage() {
        return LogicPackage.eINSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case LogicPackage.GUEST_MANAGEMENT_IMPL:
                return createGuestManagementImpl();
            case LogicPackage.ROOM_EXTRA_MANAGEMENT_IMPL:
                return createRoomExtraManagementImpl();
            case LogicPackage.ROOM_MANAGEMENT_IMPL:
                return createRoomManagementImpl();
            case LogicPackage.SERVICE_MANAGEMENT_IMPL:
                return createServiceManagementImpl();
            case LogicPackage.BED_TYPE_MANAGEMENT_IMPL:
                return createBedTypeManagementImpl();
            case LogicPackage.BILLABLE_ITEM_MANAGEMENT_IMPL:
                return createBillableItemManagementImpl();
            case LogicPackage.BILLING_MANAGEMENT_IMPL:
                return createBillingManagementImpl();
            case LogicPackage.BOOKING_MANAGEMENT_IMPL:
                return createBookingManagementImpl();
            case LogicPackage.CUSTOMER_MANAGEMENT_IMPL:
                return createCustomerManagementImpl();
            case LogicPackage.ACCOUNT_MANAGEMENT_IMPL:
                return createAccountManagementImpl();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public GuestManagementImpl createGuestManagementImpl() {
        GuestManagementImplImpl guestManagementImpl = new GuestManagementImplImpl();
        return guestManagementImpl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public RoomExtraManagementImpl createRoomExtraManagementImpl() {
        RoomExtraManagementImplImpl roomExtraManagementImpl = new RoomExtraManagementImplImpl();
        return roomExtraManagementImpl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public RoomManagementImpl createRoomManagementImpl() {
        RoomManagementImplImpl roomManagementImpl = new RoomManagementImplImpl();
        return roomManagementImpl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public ServiceManagementImpl createServiceManagementImpl() {
        ServiceManagementImplImpl serviceManagementImpl = new ServiceManagementImplImpl();
        return serviceManagementImpl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BedTypeManagementImpl createBedTypeManagementImpl() {
        BedTypeManagementImplImpl bedTypeManagementImpl = new BedTypeManagementImplImpl();
        return bedTypeManagementImpl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BillableItemManagementImpl createBillableItemManagementImpl() {
        BillableItemManagementImplImpl billableItemManagementImpl = new BillableItemManagementImplImpl();
        return billableItemManagementImpl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BillingManagementImpl createBillingManagementImpl() {
        BillingManagementImplImpl billingManagementImpl = new BillingManagementImplImpl();
        return billingManagementImpl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BookingManagementImpl createBookingManagementImpl() {
        BookingManagementImplImpl bookingManagementImpl = new BookingManagementImplImpl();
        return bookingManagementImpl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public CustomerManagementImpl createCustomerManagementImpl() {
        CustomerManagementImplImpl customerManagementImpl = new CustomerManagementImplImpl();
        return customerManagementImpl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public AccountManagementImpl createAccountManagementImpl() {
        AccountManagementImplImpl accountManagementImpl = new AccountManagementImplImpl();
        return accountManagementImpl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public LogicPackage getLogicPackage() {
        return (LogicPackage) getEPackage();
    }

} //LogicFactoryImpl
