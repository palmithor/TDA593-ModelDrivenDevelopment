/**
 */
package business.logic.impl;

import business.BusinessPackage;

import business.impl.BusinessPackageImpl;

import business.logic.AccountManagementImpl;
import business.logic.BedTypeManagementImpl;
import business.logic.BillableItemManagementImpl;
import business.logic.BillingManagementImpl;
import business.logic.BookingManagementImpl;
import business.logic.CustomerManagementImpl;
import business.logic.GuestManagementImpl;
import business.logic.LogicFactory;
import business.logic.LogicPackage;
import business.logic.RoomExtraManagementImpl;
import business.logic.RoomManagementImpl;
import business.logic.ServiceManagementImpl;

import business.model.ModelPackage;

import business.model.impl.ModelPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LogicPackageImpl extends EPackageImpl implements LogicPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass guestManagementImplEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass roomExtraManagementImplEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass roomManagementImplEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass serviceManagementImplEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass bedTypeManagementImplEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass billableItemManagementImplEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass billingManagementImplEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass bookingManagementImplEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass customerManagementImplEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass accountManagementImplEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see business.logic.LogicPackage#eNS_URI
     * @see #init()
     */
    private LogicPackageImpl() {
        super(eNS_URI, LogicFactory.eINSTANCE);
    }

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * <p/>
     * <p>This method is used to initialize {@link LogicPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     */
    public static LogicPackage init() {
        if (isInited) return (LogicPackage) EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI);

        // Obtain or create and register package
        LogicPackageImpl theLogicPackage = (LogicPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogicPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) instanceof BusinessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) : BusinessPackage.eINSTANCE);
        ModelPackageImpl theModelPackage = (ModelPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
        TypesPackageImpl theTypesPackage = (TypesPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

        // Create package meta-data objects
        theLogicPackage.createPackageContents();
        theBusinessPackage.createPackageContents();
        theModelPackage.createPackageContents();
        theTypesPackage.createPackageContents();

        // Initialize created meta-data
        theLogicPackage.initializePackageContents();
        theBusinessPackage.initializePackageContents();
        theModelPackage.initializePackageContents();
        theTypesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theLogicPackage.freeze();


        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(LogicPackage.eNS_URI, theLogicPackage);
        return theLogicPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass getGuestManagementImpl() {
        return guestManagementImplEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass getRoomExtraManagementImpl() {
        return roomExtraManagementImplEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass getRoomManagementImpl() {
        return roomManagementImplEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass getServiceManagementImpl() {
        return serviceManagementImplEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass getBedTypeManagementImpl() {
        return bedTypeManagementImplEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass getBillableItemManagementImpl() {
        return billableItemManagementImplEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass getBillingManagementImpl() {
        return billingManagementImplEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass getBookingManagementImpl() {
        return bookingManagementImplEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass getCustomerManagementImpl() {
        return customerManagementImplEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass getAccountManagementImpl() {
        return accountManagementImplEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public LogicFactory getLogicFactory() {
        return (LogicFactory) getEFactoryInstance();
    }

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        guestManagementImplEClass = createEClass(GUEST_MANAGEMENT_IMPL);

        roomExtraManagementImplEClass = createEClass(ROOM_EXTRA_MANAGEMENT_IMPL);

        roomManagementImplEClass = createEClass(ROOM_MANAGEMENT_IMPL);

        serviceManagementImplEClass = createEClass(SERVICE_MANAGEMENT_IMPL);

        bedTypeManagementImplEClass = createEClass(BED_TYPE_MANAGEMENT_IMPL);

        billableItemManagementImplEClass = createEClass(BILLABLE_ITEM_MANAGEMENT_IMPL);

        billingManagementImplEClass = createEClass(BILLING_MANAGEMENT_IMPL);

        bookingManagementImplEClass = createEClass(BOOKING_MANAGEMENT_IMPL);

        customerManagementImplEClass = createEClass(CUSTOMER_MANAGEMENT_IMPL);

        accountManagementImplEClass = createEClass(ACCOUNT_MANAGEMENT_IMPL);
    }

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        BusinessPackage theBusinessPackage = (BusinessPackage) EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI);
        ModelPackage theModelPackage = (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

        // Add supertypes to classes
        guestManagementImplEClass.getESuperTypes().add(theBusinessPackage.getIGuestManagement());
        roomExtraManagementImplEClass.getESuperTypes().add(theBusinessPackage.getIRoomExtraManagement());
        roomManagementImplEClass.getESuperTypes().add(theBusinessPackage.getIRoomManagement());
        serviceManagementImplEClass.getESuperTypes().add(theBusinessPackage.getIServiceManagement());
        bedTypeManagementImplEClass.getESuperTypes().add(theBusinessPackage.getIBedTypeManagement());
        billableItemManagementImplEClass.getESuperTypes().add(theBusinessPackage.getIBillableItemManagement());
        billingManagementImplEClass.getESuperTypes().add(theBusinessPackage.getIBillingManagement());
        bookingManagementImplEClass.getESuperTypes().add(theBusinessPackage.getIBookingManagement());
        customerManagementImplEClass.getESuperTypes().add(theBusinessPackage.getICustomerManagement());
        accountManagementImplEClass.getESuperTypes().add(theBusinessPackage.getIAccountManagement());

        // Initialize classes and features; add operations and parameters
        initEClass(guestManagementImplEClass, GuestManagementImpl.class, "GuestManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(roomExtraManagementImplEClass, RoomExtraManagementImpl.class, "RoomExtraManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(roomManagementImplEClass, RoomManagementImpl.class, "RoomManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(roomManagementImplEClass, theModelPackage.getRoomReservation(), "listRoomReservations", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(serviceManagementImplEClass, ServiceManagementImpl.class, "ServiceManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(bedTypeManagementImplEClass, BedTypeManagementImpl.class, "BedTypeManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(billableItemManagementImplEClass, BillableItemManagementImpl.class, "BillableItemManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(billingManagementImplEClass, BillingManagementImpl.class, "BillingManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(bookingManagementImplEClass, BookingManagementImpl.class, "BookingManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(customerManagementImplEClass, CustomerManagementImpl.class, "CustomerManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(accountManagementImplEClass, AccountManagementImpl.class, "AccountManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EOperation addEOperation(EClass owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
        EOperation o = addEOperation(owner, type, name, lowerBound, upperBound);
        o.setUnique(isUnique);
        o.setOrdered(isOrdered);
        return o;
    }

} //LogicPackageImpl
