/**
 */
package business.impl;

import business.BusinessFactory;
import business.BusinessPackage;
import business.IAccountManagement;
import business.IBedTypeManagement;
import business.IBillableItemManagement;
import business.IBillingManagement;
import business.IBookingManagement;
import business.ICustomerManagement;
import business.IGuestManagement;
import business.IRoomExtraManagement;
import business.IRoomManagement;
import business.IRoomReservationManagement;
import business.IServiceManagement;

import business.logic.LogicPackage;

import business.logic.impl.LogicPackageImpl;

import business.model.ModelPackage;

import business.model.impl.ModelPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessPackageImpl extends EPackageImpl implements BusinessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iGuestManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomExtraManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iServiceManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBedTypeManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBillableItemManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBillingManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCustomerManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAccountManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomReservationManagementEClass = null;

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
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see business.BusinessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BusinessPackageImpl() {
		super(eNS_URI, BusinessFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BusinessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BusinessPackage init() {
		if (isInited) return (BusinessPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI);

		// Obtain or create and register package
		BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BusinessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BusinessPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		LogicPackageImpl theLogicPackage = (LogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI) instanceof LogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI) : LogicPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theBusinessPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theLogicPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theBusinessPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theLogicPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBusinessPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BusinessPackage.eNS_URI, theBusinessPackage);
		return theBusinessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIGuestManagement() {
		return iGuestManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomExtraManagement() {
		return iRoomExtraManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomManagement() {
		return iRoomManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIServiceManagement() {
		return iServiceManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBedTypeManagement() {
		return iBedTypeManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBillableItemManagement() {
		return iBillableItemManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBillingManagement() {
		return iBillingManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookingManagement() {
		return iBookingManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICustomerManagement() {
		return iCustomerManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAccountManagement() {
		return iAccountManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomReservationManagement() {
		return iRoomReservationManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessFactory getBusinessFactory() {
		return (BusinessFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iGuestManagementEClass = createEClass(IGUEST_MANAGEMENT);

		iRoomExtraManagementEClass = createEClass(IROOM_EXTRA_MANAGEMENT);

		iRoomManagementEClass = createEClass(IROOM_MANAGEMENT);

		iServiceManagementEClass = createEClass(ISERVICE_MANAGEMENT);

		iBedTypeManagementEClass = createEClass(IBED_TYPE_MANAGEMENT);

		iBillableItemManagementEClass = createEClass(IBILLABLE_ITEM_MANAGEMENT);

		iBillingManagementEClass = createEClass(IBILLING_MANAGEMENT);

		iBookingManagementEClass = createEClass(IBOOKING_MANAGEMENT);

		iCustomerManagementEClass = createEClass(ICUSTOMER_MANAGEMENT);

		iAccountManagementEClass = createEClass(IACCOUNT_MANAGEMENT);

		iRoomReservationManagementEClass = createEClass(IROOM_RESERVATION_MANAGEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		LogicPackage theLogicPackage = (LogicPackage)EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theModelPackage);
		getESubpackages().add(theLogicPackage);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(iGuestManagementEClass, IGuestManagement.class, "IGuestManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(iGuestManagementEClass, null, "checkOut");
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "result", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iGuestManagementEClass, ecorePackage.getEBoolean(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomReservation(), "roomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getGuest(), "guests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iGuestManagementEClass, ecorePackage.getEBoolean(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomReservation(), "roomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRoomExtraManagementEClass, IRoomExtraManagement.class, "IRoomExtraManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iRoomExtraManagementEClass, theModelPackage.getRoomExtra(), "createRoomExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iRoomExtraManagementEClass, theModelPackage.getRoomExtra(), "editRoomExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomExtra(), "roomExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iRoomExtraManagementEClass, theModelPackage.getRoomExtra(), "listRoomExtras", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRoomManagementEClass, IRoomManagement.class, "IRoomManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iRoomManagementEClass, theModelPackage.getRoom(), "create", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "allowedGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "size", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "nightPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "picUrls", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getClassification(), "classification", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "bedTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomExtra(), "roomExtras", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iRoomManagementEClass, theModelPackage.getRoom(), "listRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iRoomManagementEClass, theModelPackage.getRoom(), "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iRoomManagementEClass, ecorePackage.getEBoolean(), "disableRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iRoomManagementEClass, theModelPackage.getRoom(), "findRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iServiceManagementEClass, IServiceManagement.class, "IServiceManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iServiceManagementEClass, theModelPackage.getService(), "createService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "width", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iServiceManagementEClass, theModelPackage.getService(), "editService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iServiceManagementEClass, theModelPackage.getService(), "listServices", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBedTypeManagementEClass, IBedTypeManagement.class, "IBedTypeManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iBedTypeManagementEClass, theModelPackage.getBedType(), "createBedType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "noOfSleepingSpots", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBedTypeManagementEClass, theModelPackage.getBedType(), "editBedType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBedType(), "bedType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iBedTypeManagementEClass, theModelPackage.getBedType(), "listBedTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBillableItemManagementEClass, IBillableItemManagement.class, "IBillableItemManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iBillableItemManagementEClass, theModelPackage.getBillableItem(), "createBillableItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBillableItemManagementEClass, theModelPackage.getBillableItem(), "editBillableItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBillableItem(), "billableItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBillableItemManagementEClass, null, "listBillableItems");
		addEParameter(op, theModelPackage.getBillableItem(), "items", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBillingManagementEClass, IBillingManagement.class, "IBillingManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iBillingManagementEClass, theModelPackage.getRoomBill(), "createRoomBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomReservation(), "roomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBillingManagementEClass, theModelPackage.getBookingBill(), "createBookingBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBookingBillType(), "bookingBillType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBillingManagementEClass, ecorePackage.getEBoolean(), "addBillableItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomBill(), "roomBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBillableItem(), "item", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "quantity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBillingManagementEClass, theModelPackage.getRoomBill(), "findRoomBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "roomBillId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBillingManagementEClass, ecorePackage.getEBoolean(), "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCardInformation(), "cardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBillingManagementEClass, theModelPackage.getReceipt(), "generateReceipts", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBillingManagementEClass, theModelPackage.getReceipt(), "generateReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBillingManagementEClass, ecorePackage.getEBoolean(), "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBillingManagementEClass, null, "makePayment");
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "result", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingManagementEClass, IBookingManagement.class, "IBookingManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iBookingManagementEClass, theModelPackage.getBooking(), "create", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoom(), "rooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iBookingManagementEClass, theModelPackage.getBooking(), "listBookings", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagementEClass, theModelPackage.getBooking(), "findBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagementEClass, theModelPackage.getBooking(), "listBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagementEClass, null, "listAvailableRooms");
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoom(), "rooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagementEClass, ecorePackage.getEBoolean(), "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagementEClass, theModelPackage.getReservationStatusEnum(), "getBookingStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagementEClass, theModelPackage.getReceipt(), "confirmAndPay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCardInformation(), "cardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iCustomerManagementEClass, ICustomerManagement.class, "ICustomerManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iCustomerManagementEClass, theModelPackage.getCustomer(), "createCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "birthYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCustomerManagementEClass, theModelPackage.getCustomer(), "editCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iAccountManagementEClass, IAccountManagement.class, "IAccountManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iAccountManagementEClass, null, "createCustomerAccount");
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iAccountManagementEClass, theModelPackage.getUserAccount(), "createEmployeeAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getUserGroupEnum(), "userGroup", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iAccountManagementEClass, theModelPackage.getUserAccount(), "editUserAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getUserAccount(), "userAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iAccountManagementEClass, null, "login");
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iAccountManagementEClass, ecorePackage.getEBoolean(), "isLoggedIn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRoomReservationManagementEClass, IRoomReservationManagement.class, "IRoomReservationManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iRoomReservationManagementEClass, theModelPackage.getRoomReservation(), "listRoomReservations", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iRoomReservationManagementEClass, theModelPackage.getRoomReservation(), "listRoomReservations", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iRoomReservationManagementEClass, theModelPackage.getRoomReservation(), "listRoomReservations", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iRoomReservationManagementEClass, null, "create");
		addEParameter(op, theModelPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomReservationType(), "roomReservationType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iRoomReservationManagementEClass, theModelPackage.getRoomReservation(), "findRoomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomReservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iRoomReservationManagementEClass, ecorePackage.getEBoolean(), "cancelRoomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomReservation(), "roomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperation addEOperation(EClass owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EOperation o = addEOperation(owner, type, name, lowerBound, upperBound);
		o.setUnique(isUnique);
		o.setOrdered(isOrdered);
		return o;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EParameter addEParameter(EOperation owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EParameter p = ecoreFactory.createEParameter();
		p.setEType(type);
		p.setName(name);
		p.setLowerBound(lowerBound);
		p.setUpperBound(upperBound);
		p.setUnique(isUnique);
		p.setOrdered(isOrdered);
		owner.getEParameters().add(p);
		return p;
	}
	
} //BusinessPackageImpl
