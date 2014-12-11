/**
 */
package com.bodkink.hotel.business.impl;

import com.bodkink.hotel.business.BusinessFactory;
import com.bodkink.hotel.business.BusinessPackage;
import com.bodkink.hotel.business.IAccountManagement;
import com.bodkink.hotel.business.IBedTypeManagement;
import com.bodkink.hotel.business.IBillableItemManagement;
import com.bodkink.hotel.business.IBillingManagement;
import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.ICustomerManagement;
import com.bodkink.hotel.business.IGuestManagement;
import com.bodkink.hotel.business.IRoomExtraManagement;
import com.bodkink.hotel.business.IRoomManagement;
import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.IServiceManagement;

import com.bodkink.hotel.business.logic.LogicPackage;

import com.bodkink.hotel.business.logic.impl.LogicPackageImpl;

import com.bodkink.hotel.business.model.ModelPackage;

import com.bodkink.hotel.business.model.impl.ModelPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
	private EClass iRoomReservationManagementEClass = null;

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
	 * @see com.bodkink.hotel.business.BusinessPackage#eNS_URI
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
	public EOperation getIGuestManagement__CheckOut__Booking() {
		return iGuestManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuestManagement__CheckIn__RoomReservation_Guest() {
		return iGuestManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuestManagement__CheckOut__RoomReservation() {
		return iGuestManagementEClass.getEOperations().get(2);
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
	public EOperation getIRoomExtraManagement__CreateRoomExtra__String_String() {
		return iRoomExtraManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomExtraManagement__EditRoomExtra__RoomExtra() {
		return iRoomExtraManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomExtraManagement__ListRoomExtras() {
		return iRoomExtraManagementEClass.getEOperations().get(2);
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
	public EOperation getIRoomManagement__Create__String_String_int_BigDecimal_BigDecimal_String_Classification_Map_EList() {
		return iRoomManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManagement__ListRooms() {
		return iRoomManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManagement__EditRoom__Room() {
		return iRoomManagementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManagement__DisableRoom__String() {
		return iRoomManagementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManagement__FindRoom__String() {
		return iRoomManagementEClass.getEOperations().get(4);
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
	public EOperation getIRoomReservationManagement__ListRoomReservations() {
		return iRoomReservationManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomReservationManagement__ListRoomReservations__Date_Date() {
		return iRoomReservationManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomReservationManagement__ListRoomReservations__Date() {
		return iRoomReservationManagementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomReservationManagement__Create__Room_Date_Date_RoomReservationType() {
		return iRoomReservationManagementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomReservationManagement__FindRoomReservation__String() {
		return iRoomReservationManagementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomReservationManagement__CancelRoomReservation__String() {
		return iRoomReservationManagementEClass.getEOperations().get(5);
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
	public EOperation getIServiceManagement__CreateService__String_String_BigDecimal() {
		return iServiceManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServiceManagement__EditService__Service() {
		return iServiceManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServiceManagement__ListServices() {
		return iServiceManagementEClass.getEOperations().get(2);
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
	public EOperation getIBedTypeManagement__CreateBedType__String_int_int_int() {
		return iBedTypeManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBedTypeManagement__EditBedType__BedType() {
		return iBedTypeManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBedTypeManagement__ListBedTypes() {
		return iBedTypeManagementEClass.getEOperations().get(2);
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
	public EOperation getIBillableItemManagement__CreateBillableItem__String_BigDecimal() {
		return iBillableItemManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillableItemManagement__EditBillableItem__BillableItem() {
		return iBillableItemManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillableItemManagement__ListBillableItems() {
		return iBillableItemManagementEClass.getEOperations().get(2);
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
	public EOperation getIBillingManagement__CreateRoomBill__RoomReservation() {
		return iBillingManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillingManagement__CreateBookingBill__Booking_BookingBillType() {
		return iBillingManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillingManagement__AddBillableItem__RoomBill_BillableItem_int() {
		return iBillingManagementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillingManagement__FindRoomBill__String() {
		return iBillingManagementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillingManagement__MakePayment__Bill_CardInformation() {
		return iBillingManagementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillingManagement__GenerateReceipts__Booking() {
		return iBillingManagementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillingManagement__GenerateReceipt__Bill() {
		return iBillingManagementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillingManagement__MakePayment__Bill_Customer() {
		return iBillingManagementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillingManagement__MakePayment__Booking() {
		return iBillingManagementEClass.getEOperations().get(8);
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
	public EOperation getIBookingManagement__Create__Date_Date_EList_EList_int_Customer() {
		return iBookingManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__ListBookings() {
		return iBookingManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__FindBooking__String() {
		return iBookingManagementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__ListBookings__Date() {
		return iBookingManagementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__ListAvailableRooms__Date_Date() {
		return iBookingManagementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__CancelBooking__Booking() {
		return iBookingManagementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__GetBookingStatus__String() {
		return iBookingManagementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__ConfirmAndPay__Booking_CardInformation() {
		return iBookingManagementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__SearchRoom__int_int_Date_Date() {
		return iBookingManagementEClass.getEOperations().get(8);
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
	public EOperation getICustomerManagement__CreateCustomer__String_String_String_String_int_CardInformation() {
		return iCustomerManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomerManagement__EditCustomer__Customer() {
		return iCustomerManagementEClass.getEOperations().get(1);
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
	public EOperation getIAccountManagement__CreateCustomerAccount__String_String_Customer() {
		return iAccountManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAccountManagement__CreateEmployeeAccount__String_String_UserGroupEnum() {
		return iAccountManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAccountManagement__EditUserAccount__UserAccount() {
		return iAccountManagementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAccountManagement__Login__String_String() {
		return iAccountManagementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAccountManagement__IsLoggedIn() {
		return iAccountManagementEClass.getEOperations().get(4);
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
		createEOperation(iGuestManagementEClass, IGUEST_MANAGEMENT___CHECK_OUT__BOOKING);
		createEOperation(iGuestManagementEClass, IGUEST_MANAGEMENT___CHECK_IN__ROOMRESERVATION_GUEST);
		createEOperation(iGuestManagementEClass, IGUEST_MANAGEMENT___CHECK_OUT__ROOMRESERVATION);

		iRoomExtraManagementEClass = createEClass(IROOM_EXTRA_MANAGEMENT);
		createEOperation(iRoomExtraManagementEClass, IROOM_EXTRA_MANAGEMENT___CREATE_ROOM_EXTRA__STRING_STRING);
		createEOperation(iRoomExtraManagementEClass, IROOM_EXTRA_MANAGEMENT___EDIT_ROOM_EXTRA__ROOMEXTRA);
		createEOperation(iRoomExtraManagementEClass, IROOM_EXTRA_MANAGEMENT___LIST_ROOM_EXTRAS);

		iRoomManagementEClass = createEClass(IROOM_MANAGEMENT);
		createEOperation(iRoomManagementEClass, IROOM_MANAGEMENT___CREATE__STRING_STRING_INT_BIGDECIMAL_BIGDECIMAL_STRING_CLASSIFICATION_MAP_ELIST);
		createEOperation(iRoomManagementEClass, IROOM_MANAGEMENT___LIST_ROOMS);
		createEOperation(iRoomManagementEClass, IROOM_MANAGEMENT___EDIT_ROOM__ROOM);
		createEOperation(iRoomManagementEClass, IROOM_MANAGEMENT___DISABLE_ROOM__STRING);
		createEOperation(iRoomManagementEClass, IROOM_MANAGEMENT___FIND_ROOM__STRING);

		iRoomReservationManagementEClass = createEClass(IROOM_RESERVATION_MANAGEMENT);
		createEOperation(iRoomReservationManagementEClass, IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS);
		createEOperation(iRoomReservationManagementEClass, IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE_DATE);
		createEOperation(iRoomReservationManagementEClass, IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE);
		createEOperation(iRoomReservationManagementEClass, IROOM_RESERVATION_MANAGEMENT___CREATE__ROOM_DATE_DATE_ROOMRESERVATIONTYPE);
		createEOperation(iRoomReservationManagementEClass, IROOM_RESERVATION_MANAGEMENT___FIND_ROOM_RESERVATION__STRING);
		createEOperation(iRoomReservationManagementEClass, IROOM_RESERVATION_MANAGEMENT___CANCEL_ROOM_RESERVATION__STRING);

		iServiceManagementEClass = createEClass(ISERVICE_MANAGEMENT);
		createEOperation(iServiceManagementEClass, ISERVICE_MANAGEMENT___CREATE_SERVICE__STRING_STRING_BIGDECIMAL);
		createEOperation(iServiceManagementEClass, ISERVICE_MANAGEMENT___EDIT_SERVICE__SERVICE);
		createEOperation(iServiceManagementEClass, ISERVICE_MANAGEMENT___LIST_SERVICES);

		iBedTypeManagementEClass = createEClass(IBED_TYPE_MANAGEMENT);
		createEOperation(iBedTypeManagementEClass, IBED_TYPE_MANAGEMENT___CREATE_BED_TYPE__STRING_INT_INT_INT);
		createEOperation(iBedTypeManagementEClass, IBED_TYPE_MANAGEMENT___EDIT_BED_TYPE__BEDTYPE);
		createEOperation(iBedTypeManagementEClass, IBED_TYPE_MANAGEMENT___LIST_BED_TYPES);

		iBillableItemManagementEClass = createEClass(IBILLABLE_ITEM_MANAGEMENT);
		createEOperation(iBillableItemManagementEClass, IBILLABLE_ITEM_MANAGEMENT___CREATE_BILLABLE_ITEM__STRING_BIGDECIMAL);
		createEOperation(iBillableItemManagementEClass, IBILLABLE_ITEM_MANAGEMENT___EDIT_BILLABLE_ITEM__BILLABLEITEM);
		createEOperation(iBillableItemManagementEClass, IBILLABLE_ITEM_MANAGEMENT___LIST_BILLABLE_ITEMS);

		iBillingManagementEClass = createEClass(IBILLING_MANAGEMENT);
		createEOperation(iBillingManagementEClass, IBILLING_MANAGEMENT___CREATE_ROOM_BILL__ROOMRESERVATION);
		createEOperation(iBillingManagementEClass, IBILLING_MANAGEMENT___CREATE_BOOKING_BILL__BOOKING_BOOKINGBILLTYPE);
		createEOperation(iBillingManagementEClass, IBILLING_MANAGEMENT___ADD_BILLABLE_ITEM__ROOMBILL_BILLABLEITEM_INT);
		createEOperation(iBillingManagementEClass, IBILLING_MANAGEMENT___FIND_ROOM_BILL__STRING);
		createEOperation(iBillingManagementEClass, IBILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CARDINFORMATION);
		createEOperation(iBillingManagementEClass, IBILLING_MANAGEMENT___GENERATE_RECEIPTS__BOOKING);
		createEOperation(iBillingManagementEClass, IBILLING_MANAGEMENT___GENERATE_RECEIPT__BILL);
		createEOperation(iBillingManagementEClass, IBILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CUSTOMER);
		createEOperation(iBillingManagementEClass, IBILLING_MANAGEMENT___MAKE_PAYMENT__BOOKING);

		iBookingManagementEClass = createEClass(IBOOKING_MANAGEMENT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CREATE__DATE_DATE_ELIST_ELIST_INT_CUSTOMER);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___LIST_BOOKINGS);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___FIND_BOOKING__STRING);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___LIST_BOOKINGS__DATE);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___LIST_AVAILABLE_ROOMS__DATE_DATE);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CANCEL_BOOKING__BOOKING);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___GET_BOOKING_STATUS__STRING);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CONFIRM_AND_PAY__BOOKING_CARDINFORMATION);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___SEARCH_ROOM__INT_INT_DATE_DATE);

		iCustomerManagementEClass = createEClass(ICUSTOMER_MANAGEMENT);
		createEOperation(iCustomerManagementEClass, ICUSTOMER_MANAGEMENT___CREATE_CUSTOMER__STRING_STRING_STRING_STRING_INT_CARDINFORMATION);
		createEOperation(iCustomerManagementEClass, ICUSTOMER_MANAGEMENT___EDIT_CUSTOMER__CUSTOMER);

		iAccountManagementEClass = createEClass(IACCOUNT_MANAGEMENT);
		createEOperation(iAccountManagementEClass, IACCOUNT_MANAGEMENT___CREATE_CUSTOMER_ACCOUNT__STRING_STRING_CUSTOMER);
		createEOperation(iAccountManagementEClass, IACCOUNT_MANAGEMENT___CREATE_EMPLOYEE_ACCOUNT__STRING_STRING_USERGROUPENUM);
		createEOperation(iAccountManagementEClass, IACCOUNT_MANAGEMENT___EDIT_USER_ACCOUNT__USERACCOUNT);
		createEOperation(iAccountManagementEClass, IACCOUNT_MANAGEMENT___LOGIN__STRING_STRING);
		createEOperation(iAccountManagementEClass, IACCOUNT_MANAGEMENT___IS_LOGGED_IN);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(iGuestManagementEClass, IGuestManagement.class, "IGuestManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIGuestManagement__CheckOut__Booking(), ecorePackage.getEBoolean(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuestManagement__CheckIn__RoomReservation_Guest(), ecorePackage.getEBoolean(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomReservation(), "roomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getGuest(), "guests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuestManagement__CheckOut__RoomReservation(), ecorePackage.getEBoolean(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomReservation(), "roomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRoomExtraManagementEClass, IRoomExtraManagement.class, "IRoomExtraManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIRoomExtraManagement__CreateRoomExtra__String_String(), theModelPackage.getRoomExtra(), "createRoomExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomExtraManagement__EditRoomExtra__RoomExtra(), theModelPackage.getRoomExtra(), "editRoomExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomExtra(), "roomExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomExtraManagement__ListRoomExtras(), theModelPackage.getRoomExtra(), "listRoomExtras", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRoomManagementEClass, IRoomManagement.class, "IRoomManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIRoomManagement__Create__String_String_int_BigDecimal_BigDecimal_String_Classification_Map_EList(), theModelPackage.getRoom(), "create", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "allowedGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "size", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "nightPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "picUrls", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getClassification(), "classification", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "bedTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomExtra(), "roomExtras", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomManagement__ListRooms(), theModelPackage.getRoom(), "listRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomManagement__EditRoom__Room(), theModelPackage.getRoom(), "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomManagement__DisableRoom__String(), ecorePackage.getEBoolean(), "disableRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomManagement__FindRoom__String(), theModelPackage.getRoom(), "findRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRoomReservationManagementEClass, IRoomReservationManagement.class, "IRoomReservationManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIRoomReservationManagement__ListRoomReservations(), theModelPackage.getRoomReservation(), "listRoomReservations", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomReservationManagement__ListRoomReservations__Date_Date(), theModelPackage.getRoomReservation(), "listRoomReservations", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomReservationManagement__ListRoomReservations__Date(), theModelPackage.getRoomReservation(), "listRoomReservations", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomReservationManagement__Create__Room_Date_Date_RoomReservationType(), theModelPackage.getRoomReservation(), "create", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomReservationType(), "roomReservationType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomReservationManagement__FindRoomReservation__String(), theModelPackage.getRoomReservation(), "findRoomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomReservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomReservationManagement__CancelRoomReservation__String(), ecorePackage.getEBoolean(), "cancelRoomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomReservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iServiceManagementEClass, IServiceManagement.class, "IServiceManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIServiceManagement__CreateService__String_String_BigDecimal(), theModelPackage.getService(), "createService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "width", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServiceManagement__EditService__Service(), theModelPackage.getService(), "editService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIServiceManagement__ListServices(), theModelPackage.getService(), "listServices", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBedTypeManagementEClass, IBedTypeManagement.class, "IBedTypeManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBedTypeManagement__CreateBedType__String_int_int_int(), theModelPackage.getBedType(), "createBedType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "noOfSleepingSpots", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBedTypeManagement__EditBedType__BedType(), theModelPackage.getBedType(), "editBedType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBedType(), "bedType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBedTypeManagement__ListBedTypes(), theModelPackage.getBedType(), "listBedTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBillableItemManagementEClass, IBillableItemManagement.class, "IBillableItemManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBillableItemManagement__CreateBillableItem__String_BigDecimal(), theModelPackage.getBillableItem(), "createBillableItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillableItemManagement__EditBillableItem__BillableItem(), theModelPackage.getBillableItem(), "editBillableItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBillableItem(), "billableItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBillableItemManagement__ListBillableItems(), theModelPackage.getBillableItem(), "listBillableItems", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBillingManagementEClass, IBillingManagement.class, "IBillingManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBillingManagement__CreateRoomBill__RoomReservation(), theModelPackage.getRoomBill(), "createRoomBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomReservation(), "roomReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillingManagement__CreateBookingBill__Booking_BookingBillType(), theModelPackage.getBookingBill(), "createBookingBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBookingBillType(), "bookingBillType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillingManagement__AddBillableItem__RoomBill_BillableItem_int(), ecorePackage.getEBoolean(), "addBillableItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoomBill(), "roomBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBillableItem(), "item", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "quantity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillingManagement__FindRoomBill__String(), theModelPackage.getRoomBill(), "findRoomBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomReservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillingManagement__MakePayment__Bill_CardInformation(), ecorePackage.getEBoolean(), "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCardInformation(), "cardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillingManagement__GenerateReceipts__Booking(), theModelPackage.getReceipt(), "generateReceipts", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillingManagement__GenerateReceipt__Bill(), theModelPackage.getReceipt(), "generateReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillingManagement__MakePayment__Bill_Customer(), ecorePackage.getEBoolean(), "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillingManagement__MakePayment__Booking(), ecorePackage.getEBoolean(), "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingManagementEClass, IBookingManagement.class, "IBookingManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBookingManagement__Create__Date_Date_EList_EList_int_Customer(), theModelPackage.getBooking(), "create", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getRoom(), "rooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getService(), "services", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookingManagement__ListBookings(), theModelPackage.getBooking(), "listBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__FindBooking__String(), theModelPackage.getBooking(), "findBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__ListBookings__Date(), theModelPackage.getBooking(), "listBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__ListAvailableRooms__Date_Date(), theModelPackage.getRoom(), "listAvailableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__CancelBooking__Booking(), ecorePackage.getEBoolean(), "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__GetBookingStatus__String(), theModelPackage.getReservationStatusEnum(), "getBookingStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__ConfirmAndPay__Booking_CardInformation(), theModelPackage.getReceipt(), "confirmAndPay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCardInformation(), "cardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__SearchRoom__int_int_Date_Date(), theModelPackage.getRoom(), "searchRoom", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iCustomerManagementEClass, ICustomerManagement.class, "ICustomerManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getICustomerManagement__CreateCustomer__String_String_String_String_int_CardInformation(), theModelPackage.getCustomer(), "createCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "birthYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCardInformation(), "cardInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManagement__EditCustomer__Customer(), theModelPackage.getCustomer(), "editCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iAccountManagementEClass, IAccountManagement.class, "IAccountManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIAccountManagement__CreateCustomerAccount__String_String_Customer(), theModelPackage.getCustomerUserAccount(), "createCustomerAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIAccountManagement__CreateEmployeeAccount__String_String_UserGroupEnum(), theModelPackage.getUserAccount(), "createEmployeeAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getUserGroupEnum(), "userGroup", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIAccountManagement__EditUserAccount__UserAccount(), theModelPackage.getUserAccount(), "editUserAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModelPackage.getUserAccount(), "userAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIAccountManagement__Login__String_String(), theModelPackage.getCustomerUserAccount(), "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIAccountManagement__IsLoggedIn(), ecorePackage.getEBoolean(), "isLoggedIn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BusinessPackageImpl
