/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.BusinessPackage;

import com.bodkink.hotel.business.impl.BusinessPackageImpl;

import com.bodkink.hotel.business.logic.AccountManagement;
import com.bodkink.hotel.business.logic.BedTypeManagement;
import com.bodkink.hotel.business.logic.BillableItemManagement;
import com.bodkink.hotel.business.logic.BillingManagement;
import com.bodkink.hotel.business.logic.BookingManagement;
import com.bodkink.hotel.business.logic.CustomerManagement;
import com.bodkink.hotel.business.logic.GuestManagement;
import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.logic.RoomExtraManagement;
import com.bodkink.hotel.business.logic.RoomManagement;
import com.bodkink.hotel.business.logic.RoomReservationManagement;
import com.bodkink.hotel.business.logic.ServiceManagement;

import com.bodkink.hotel.business.model.ModelPackage;

import com.bodkink.hotel.business.model.impl.ModelPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicPackageImpl extends EPackageImpl implements LogicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomExtraManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomReservationManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedTypeManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billableItemManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountManagementEClass = null;

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
	 * @see com.bodkink.hotel.business.logic.LogicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogicPackageImpl() {
		super(eNS_URI, LogicFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogicPackage init() {
		if (isInited) return (LogicPackage)EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI);

		// Obtain or create and register package
		LogicPackageImpl theLogicPackage = (LogicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogicPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) instanceof BusinessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) : BusinessPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

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
	 * @generated
	 */
	public EClass getGuestManagement() {
		return guestManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomExtraManagement() {
		return roomExtraManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomManagement() {
		return roomManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomReservationManagement() {
		return roomReservationManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceManagement() {
		return serviceManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBedTypeManagement() {
		return bedTypeManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillableItemManagement() {
		return billableItemManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillingManagement() {
		return billingManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingManagement() {
		return bookingManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerManagement() {
		return customerManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountManagement() {
		return accountManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicFactory getLogicFactory() {
		return (LogicFactory)getEFactoryInstance();
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
		guestManagementEClass = createEClass(GUEST_MANAGEMENT);

		roomExtraManagementEClass = createEClass(ROOM_EXTRA_MANAGEMENT);

		roomManagementEClass = createEClass(ROOM_MANAGEMENT);

		roomReservationManagementEClass = createEClass(ROOM_RESERVATION_MANAGEMENT);

		serviceManagementEClass = createEClass(SERVICE_MANAGEMENT);

		bedTypeManagementEClass = createEClass(BED_TYPE_MANAGEMENT);

		billableItemManagementEClass = createEClass(BILLABLE_ITEM_MANAGEMENT);

		billingManagementEClass = createEClass(BILLING_MANAGEMENT);

		bookingManagementEClass = createEClass(BOOKING_MANAGEMENT);

		customerManagementEClass = createEClass(CUSTOMER_MANAGEMENT);

		accountManagementEClass = createEClass(ACCOUNT_MANAGEMENT);
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
		BusinessPackage theBusinessPackage = (BusinessPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guestManagementEClass.getESuperTypes().add(theBusinessPackage.getIGuestManagement());
		roomExtraManagementEClass.getESuperTypes().add(theBusinessPackage.getIRoomExtraManagement());
		roomManagementEClass.getESuperTypes().add(theBusinessPackage.getIRoomManagement());
		roomReservationManagementEClass.getESuperTypes().add(theBusinessPackage.getIRoomReservationManagement());
		serviceManagementEClass.getESuperTypes().add(theBusinessPackage.getIServiceManagement());
		bedTypeManagementEClass.getESuperTypes().add(theBusinessPackage.getIBedTypeManagement());
		billableItemManagementEClass.getESuperTypes().add(theBusinessPackage.getIBillableItemManagement());
		billingManagementEClass.getESuperTypes().add(theBusinessPackage.getIBillingManagement());
		bookingManagementEClass.getESuperTypes().add(theBusinessPackage.getIBookingManagement());
		customerManagementEClass.getESuperTypes().add(theBusinessPackage.getICustomerManagement());
		accountManagementEClass.getESuperTypes().add(theBusinessPackage.getIAccountManagement());

		// Initialize classes, features, and operations; add parameters
		initEClass(guestManagementEClass, GuestManagement.class, "GuestManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomExtraManagementEClass, RoomExtraManagement.class, "RoomExtraManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomManagementEClass, RoomManagement.class, "RoomManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomReservationManagementEClass, RoomReservationManagement.class, "RoomReservationManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceManagementEClass, ServiceManagement.class, "ServiceManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bedTypeManagementEClass, BedTypeManagement.class, "BedTypeManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(billableItemManagementEClass, BillableItemManagement.class, "BillableItemManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(billingManagementEClass, BillingManagement.class, "BillingManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bookingManagementEClass, BookingManagement.class, "BookingManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customerManagementEClass, CustomerManagement.class, "CustomerManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accountManagementEClass, AccountManagement.class, "AccountManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //LogicPackageImpl
