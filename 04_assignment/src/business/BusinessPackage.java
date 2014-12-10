/**
 */
package com.bodkink.hotel.business;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.bodkink.hotel.business.BusinessFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "com/bodkink/hotel/business";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///business.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com/bodkink/hotel/business";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessPackage eINSTANCE = com.bodkink.hotel.business.impl.BusinessPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.IGuestManagement <em>IGuest Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.IGuestManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIGuestManagement()
	 * @generated
	 */
	int IGUEST_MANAGEMENT = 0;

	/**
	 * The number of structural features of the '<em>IGuest Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGEMENT___CHECK_OUT__BOOKING_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGEMENT___CHECK_IN__ROOMRESERVATION_GUEST = 1;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGEMENT___CHECK_OUT__ROOMRESERVATION = 2;

	/**
	 * The number of operations of the '<em>IGuest Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.IRoomExtraManagement <em>IRoom Extra Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.IRoomExtraManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIRoomExtraManagement()
	 * @generated
	 */
	int IROOM_EXTRA_MANAGEMENT = 1;

	/**
	 * The number of structural features of the '<em>IRoom Extra Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_EXTRA_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Room Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_EXTRA_MANAGEMENT___CREATE_ROOM_EXTRA__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Room Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_EXTRA_MANAGEMENT___EDIT_ROOM_EXTRA__ROOMEXTRA = 1;

	/**
	 * The operation id for the '<em>List Room Extras</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_EXTRA_MANAGEMENT___LIST_ROOM_EXTRAS = 2;

	/**
	 * The number of operations of the '<em>IRoom Extra Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_EXTRA_MANAGEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.IRoomManagement <em>IRoom Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.IRoomManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIRoomManagement()
	 * @generated
	 */
	int IROOM_MANAGEMENT = 2;

	/**
	 * The number of structural features of the '<em>IRoom Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGEMENT___CREATE__STRING_STRING_INT_BIGDECIMAL_BIGDECIMAL_STRING_CLASSIFICATION_MAP_ROOMEXTRA = 0;

	/**
	 * The operation id for the '<em>List Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGEMENT___LIST_ROOMS = 1;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGEMENT___EDIT_ROOM__ROOM = 2;

	/**
	 * The operation id for the '<em>Disable Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGEMENT___DISABLE_ROOM__LONG = 3;

	/**
	 * The operation id for the '<em>Find Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGEMENT___FIND_ROOM__LONG = 4;

	/**
	 * The number of operations of the '<em>IRoom Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGEMENT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.IRoomReservationManagement <em>IRoom Reservation Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.IRoomReservationManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIRoomReservationManagement()
	 * @generated
	 */
	int IROOM_RESERVATION_MANAGEMENT = 3;

	/**
	 * The number of structural features of the '<em>IRoom Reservation Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_RESERVATION_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>List Room Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS = 0;

	/**
	 * The operation id for the '<em>List Room Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE_DATE = 1;

	/**
	 * The operation id for the '<em>List Room Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE = 2;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_RESERVATION_MANAGEMENT___CREATE__ROOM_DATE_DATE_ROOMRESERVATIONTYPE = 3;

	/**
	 * The operation id for the '<em>Find Room Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_RESERVATION_MANAGEMENT___FIND_ROOM_RESERVATION__LONG = 4;

	/**
	 * The operation id for the '<em>Cancel Room Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_RESERVATION_MANAGEMENT___CANCEL_ROOM_RESERVATION__ROOMRESERVATION = 5;

	/**
	 * The number of operations of the '<em>IRoom Reservation Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_RESERVATION_MANAGEMENT_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.IServiceManagement <em>IService Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.IServiceManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIServiceManagement()
	 * @generated
	 */
	int ISERVICE_MANAGEMENT = 4;

	/**
	 * The number of structural features of the '<em>IService Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_MANAGEMENT___CREATE_SERVICE__STRING_STRING_BIGDECIMAL = 0;

	/**
	 * The operation id for the '<em>Edit Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_MANAGEMENT___EDIT_SERVICE__SERVICE = 1;

	/**
	 * The operation id for the '<em>List Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_MANAGEMENT___LIST_SERVICES = 2;

	/**
	 * The number of operations of the '<em>IService Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_MANAGEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.IBedTypeManagement <em>IBed Type Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.IBedTypeManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIBedTypeManagement()
	 * @generated
	 */
	int IBED_TYPE_MANAGEMENT = 5;

	/**
	 * The number of structural features of the '<em>IBed Type Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBED_TYPE_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Bed Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBED_TYPE_MANAGEMENT___CREATE_BED_TYPE__STRING_INT_INT_INT = 0;

	/**
	 * The operation id for the '<em>Edit Bed Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBED_TYPE_MANAGEMENT___EDIT_BED_TYPE__BEDTYPE = 1;

	/**
	 * The operation id for the '<em>List Bed Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBED_TYPE_MANAGEMENT___LIST_BED_TYPES = 2;

	/**
	 * The number of operations of the '<em>IBed Type Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBED_TYPE_MANAGEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.IBillableItemManagement <em>IBillable Item Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.IBillableItemManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIBillableItemManagement()
	 * @generated
	 */
	int IBILLABLE_ITEM_MANAGEMENT = 6;

	/**
	 * The number of structural features of the '<em>IBillable Item Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLABLE_ITEM_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Billable Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLABLE_ITEM_MANAGEMENT___CREATE_BILLABLE_ITEM__STRING_BIGDECIMAL = 0;

	/**
	 * The operation id for the '<em>Edit Billable Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLABLE_ITEM_MANAGEMENT___EDIT_BILLABLE_ITEM__BILLABLEITEM = 1;

	/**
	 * The operation id for the '<em>List Billable Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLABLE_ITEM_MANAGEMENT___LIST_BILLABLE_ITEMS__BILLABLEITEM = 2;

	/**
	 * The number of operations of the '<em>IBillable Item Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLABLE_ITEM_MANAGEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.IBillingManagement <em>IBilling Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.IBillingManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIBillingManagement()
	 * @generated
	 */
	int IBILLING_MANAGEMENT = 7;

	/**
	 * The number of structural features of the '<em>IBilling Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Room Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT___CREATE_ROOM_BILL__ROOMRESERVATION = 0;

	/**
	 * The operation id for the '<em>Create Booking Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT___CREATE_BOOKING_BILL__BOOKING_BOOKINGBILLTYPE = 1;

	/**
	 * The operation id for the '<em>Add Billable Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT___ADD_BILLABLE_ITEM__ROOMBILL_BILLABLEITEM_INT = 2;

	/**
	 * The operation id for the '<em>Find Room Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT___FIND_ROOM_BILL__LONG = 3;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CARDINFORMATION = 4;

	/**
	 * The operation id for the '<em>Generate Receipts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT___GENERATE_RECEIPTS__BOOKING = 5;

	/**
	 * The operation id for the '<em>Generate Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT___GENERATE_RECEIPT__BILL = 6;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CUSTOMER = 7;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT___MAKE_PAYMENT__BOOKING_BOOLEAN = 8;

	/**
	 * The number of operations of the '<em>IBilling Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.IBookingManagement <em>IBooking Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.IBookingManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIBookingManagement()
	 * @generated
	 */
	int IBOOKING_MANAGEMENT = 8;

	/**
	 * The number of structural features of the '<em>IBooking Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CREATE__DATE_DATE_ROOM_INT_CUSTOMER = 0;

	/**
	 * The operation id for the '<em>List Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___LIST_BOOKINGS = 1;

	/**
	 * The operation id for the '<em>Find Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___FIND_BOOKING__LONG = 2;

	/**
	 * The operation id for the '<em>List Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___LIST_BOOKING__DATE = 3;

	/**
	 * The operation id for the '<em>List Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___LIST_AVAILABLE_ROOMS__DATE_DATE_ROOM = 4;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CANCEL_BOOKING__BOOKING = 5;

	/**
	 * The operation id for the '<em>Get Booking Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___GET_BOOKING_STATUS__LONG = 6;

	/**
	 * The operation id for the '<em>Confirm And Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CONFIRM_AND_PAY__BOOKING_CARDINFORMATION = 7;

	/**
	 * The number of operations of the '<em>IBooking Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.ICustomerManagement <em>ICustomer Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.ICustomerManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getICustomerManagement()
	 * @generated
	 */
	int ICUSTOMER_MANAGEMENT = 9;

	/**
	 * The number of structural features of the '<em>ICustomer Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGEMENT___CREATE_CUSTOMER__STRING_STRING_STRING_STRING_INT = 0;

	/**
	 * The operation id for the '<em>Edit Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGEMENT___EDIT_CUSTOMER__CUSTOMER = 1;

	/**
	 * The number of operations of the '<em>ICustomer Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.IAccountManagement <em>IAccount Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.IAccountManagement
	 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIAccountManagement()
	 * @generated
	 */
	int IACCOUNT_MANAGEMENT = 10;

	/**
	 * The number of structural features of the '<em>IAccount Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNT_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Customer Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNT_MANAGEMENT___CREATE_CUSTOMER_ACCOUNT__STRING_STRING_CUSTOMER = 0;

	/**
	 * The operation id for the '<em>Create Employee Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNT_MANAGEMENT___CREATE_EMPLOYEE_ACCOUNT__STRING_STRING_USERGROUPENUM = 1;

	/**
	 * The operation id for the '<em>Edit User Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNT_MANAGEMENT___EDIT_USER_ACCOUNT__USERACCOUNT = 2;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNT_MANAGEMENT___LOGIN__STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Is Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNT_MANAGEMENT___IS_LOGGED_IN = 4;

	/**
	 * The number of operations of the '<em>IAccount Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNT_MANAGEMENT_OPERATION_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.IGuestManagement <em>IGuest Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IGuest Management</em>'.
	 * @see com.bodkink.hotel.business.IGuestManagement
	 * @generated
	 */
	EClass getIGuestManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IGuestManagement#checkOut(com.bodkink.hotel.business.model.Booking, boolean) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see com.bodkink.hotel.business.IGuestManagement#checkOut(com.bodkink.hotel.business.model.Booking, boolean)
	 * @generated
	 */
	EOperation getIGuestManagement__CheckOut__Booking_boolean();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IGuestManagement#checkIn(com.bodkink.hotel.business.model.RoomReservation, com.bodkink.hotel.business.model.Guest) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see com.bodkink.hotel.business.IGuestManagement#checkIn(com.bodkink.hotel.business.model.RoomReservation, com.bodkink.hotel.business.model.Guest)
	 * @generated
	 */
	EOperation getIGuestManagement__CheckIn__RoomReservation_Guest();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IGuestManagement#checkOut(com.bodkink.hotel.business.model.RoomReservation) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see com.bodkink.hotel.business.IGuestManagement#checkOut(com.bodkink.hotel.business.model.RoomReservation)
	 * @generated
	 */
	EOperation getIGuestManagement__CheckOut__RoomReservation();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.IRoomExtraManagement <em>IRoom Extra Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Extra Management</em>'.
	 * @see com.bodkink.hotel.business.IRoomExtraManagement
	 * @generated
	 */
	EClass getIRoomExtraManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomExtraManagement#createRoomExtra(java.lang.String, java.lang.String) <em>Create Room Extra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Room Extra</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomExtraManagement#createRoomExtra(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRoomExtraManagement__CreateRoomExtra__String_String();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomExtraManagement#editRoomExtra(com.bodkink.hotel.business.model.RoomExtra) <em>Edit Room Extra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Extra</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomExtraManagement#editRoomExtra(com.bodkink.hotel.business.model.RoomExtra)
	 * @generated
	 */
	EOperation getIRoomExtraManagement__EditRoomExtra__RoomExtra();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomExtraManagement#listRoomExtras() <em>List Room Extras</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Room Extras</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomExtraManagement#listRoomExtras()
	 * @generated
	 */
	EOperation getIRoomExtraManagement__ListRoomExtras();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.IRoomManagement <em>IRoom Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Management</em>'.
	 * @see com.bodkink.hotel.business.IRoomManagement
	 * @generated
	 */
	EClass getIRoomManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomManagement#create(java.lang.String, java.lang.String, int, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, com.bodkink.hotel.business.model.Classification, java.util.Map, com.bodkink.hotel.business.model.RoomExtra) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomManagement#create(java.lang.String, java.lang.String, int, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, com.bodkink.hotel.business.model.Classification, java.util.Map, com.bodkink.hotel.business.model.RoomExtra)
	 * @generated
	 */
	EOperation getIRoomManagement__Create__String_String_int_BigDecimal_BigDecimal_String_Classification_Map_RoomExtra();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomManagement#listRooms() <em>List Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Rooms</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomManagement#listRooms()
	 * @generated
	 */
	EOperation getIRoomManagement__ListRooms();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomManagement#editRoom(com.bodkink.hotel.business.model.Room) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomManagement#editRoom(com.bodkink.hotel.business.model.Room)
	 * @generated
	 */
	EOperation getIRoomManagement__EditRoom__Room();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomManagement#disableRoom(long) <em>Disable Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disable Room</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomManagement#disableRoom(long)
	 * @generated
	 */
	EOperation getIRoomManagement__DisableRoom__long();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomManagement#findRoom(long) <em>Find Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Room</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomManagement#findRoom(long)
	 * @generated
	 */
	EOperation getIRoomManagement__FindRoom__long();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.IRoomReservationManagement <em>IRoom Reservation Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Reservation Management</em>'.
	 * @see com.bodkink.hotel.business.IRoomReservationManagement
	 * @generated
	 */
	EClass getIRoomReservationManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomReservationManagement#listRoomReservations() <em>List Room Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Room Reservations</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomReservationManagement#listRoomReservations()
	 * @generated
	 */
	EOperation getIRoomReservationManagement__ListRoomReservations();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomReservationManagement#listRoomReservations(java.util.Date, java.util.Date) <em>List Room Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Room Reservations</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomReservationManagement#listRoomReservations(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIRoomReservationManagement__ListRoomReservations__Date_Date();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomReservationManagement#listRoomReservations(java.util.Date) <em>List Room Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Room Reservations</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomReservationManagement#listRoomReservations(java.util.Date)
	 * @generated
	 */
	EOperation getIRoomReservationManagement__ListRoomReservations__Date();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomReservationManagement#create(com.bodkink.hotel.business.model.Room, java.util.Date, java.util.Date, com.bodkink.hotel.business.model.RoomReservationType) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomReservationManagement#create(com.bodkink.hotel.business.model.Room, java.util.Date, java.util.Date, com.bodkink.hotel.business.model.RoomReservationType)
	 * @generated
	 */
	EOperation getIRoomReservationManagement__Create__Room_Date_Date_RoomReservationType();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomReservationManagement#findRoomReservation(long) <em>Find Room Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Room Reservation</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomReservationManagement#findRoomReservation(long)
	 * @generated
	 */
	EOperation getIRoomReservationManagement__FindRoomReservation__long();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IRoomReservationManagement#cancelRoomReservation(com.bodkink.hotel.business.model.RoomReservation) <em>Cancel Room Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Room Reservation</em>' operation.
	 * @see com.bodkink.hotel.business.IRoomReservationManagement#cancelRoomReservation(com.bodkink.hotel.business.model.RoomReservation)
	 * @generated
	 */
	EOperation getIRoomReservationManagement__CancelRoomReservation__RoomReservation();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.IServiceManagement <em>IService Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IService Management</em>'.
	 * @see com.bodkink.hotel.business.IServiceManagement
	 * @generated
	 */
	EClass getIServiceManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IServiceManagement#createService(java.lang.String, java.lang.String, java.math.BigDecimal) <em>Create Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Service</em>' operation.
	 * @see com.bodkink.hotel.business.IServiceManagement#createService(java.lang.String, java.lang.String, java.math.BigDecimal)
	 * @generated
	 */
	EOperation getIServiceManagement__CreateService__String_String_BigDecimal();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IServiceManagement#editService(com.bodkink.hotel.business.model.Service) <em>Edit Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Service</em>' operation.
	 * @see com.bodkink.hotel.business.IServiceManagement#editService(com.bodkink.hotel.business.model.Service)
	 * @generated
	 */
	EOperation getIServiceManagement__EditService__Service();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IServiceManagement#listServices() <em>List Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Services</em>' operation.
	 * @see com.bodkink.hotel.business.IServiceManagement#listServices()
	 * @generated
	 */
	EOperation getIServiceManagement__ListServices();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.IBedTypeManagement <em>IBed Type Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBed Type Management</em>'.
	 * @see com.bodkink.hotel.business.IBedTypeManagement
	 * @generated
	 */
	EClass getIBedTypeManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBedTypeManagement#createBedType(java.lang.String, int, int, int) <em>Create Bed Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Bed Type</em>' operation.
	 * @see com.bodkink.hotel.business.IBedTypeManagement#createBedType(java.lang.String, int, int, int)
	 * @generated
	 */
	EOperation getIBedTypeManagement__CreateBedType__String_int_int_int();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBedTypeManagement#editBedType(com.bodkink.hotel.business.model.BedType) <em>Edit Bed Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Bed Type</em>' operation.
	 * @see com.bodkink.hotel.business.IBedTypeManagement#editBedType(com.bodkink.hotel.business.model.BedType)
	 * @generated
	 */
	EOperation getIBedTypeManagement__EditBedType__BedType();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBedTypeManagement#listBedTypes() <em>List Bed Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Bed Types</em>' operation.
	 * @see com.bodkink.hotel.business.IBedTypeManagement#listBedTypes()
	 * @generated
	 */
	EOperation getIBedTypeManagement__ListBedTypes();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.IBillableItemManagement <em>IBillable Item Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBillable Item Management</em>'.
	 * @see com.bodkink.hotel.business.IBillableItemManagement
	 * @generated
	 */
	EClass getIBillableItemManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillableItemManagement#createBillableItem(java.lang.String, java.math.BigDecimal) <em>Create Billable Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Billable Item</em>' operation.
	 * @see com.bodkink.hotel.business.IBillableItemManagement#createBillableItem(java.lang.String, java.math.BigDecimal)
	 * @generated
	 */
	EOperation getIBillableItemManagement__CreateBillableItem__String_BigDecimal();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillableItemManagement#editBillableItem(com.bodkink.hotel.business.model.BillableItem) <em>Edit Billable Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Billable Item</em>' operation.
	 * @see com.bodkink.hotel.business.IBillableItemManagement#editBillableItem(com.bodkink.hotel.business.model.BillableItem)
	 * @generated
	 */
	EOperation getIBillableItemManagement__EditBillableItem__BillableItem();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillableItemManagement#listBillableItems(com.bodkink.hotel.business.model.BillableItem) <em>List Billable Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Billable Items</em>' operation.
	 * @see com.bodkink.hotel.business.IBillableItemManagement#listBillableItems(com.bodkink.hotel.business.model.BillableItem)
	 * @generated
	 */
	EOperation getIBillableItemManagement__ListBillableItems__BillableItem();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.IBillingManagement <em>IBilling Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBilling Management</em>'.
	 * @see com.bodkink.hotel.business.IBillingManagement
	 * @generated
	 */
	EClass getIBillingManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillingManagement#createRoomBill(com.bodkink.hotel.business.model.RoomReservation) <em>Create Room Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Room Bill</em>' operation.
	 * @see com.bodkink.hotel.business.IBillingManagement#createRoomBill(com.bodkink.hotel.business.model.RoomReservation)
	 * @generated
	 */
	EOperation getIBillingManagement__CreateRoomBill__RoomReservation();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillingManagement#createBookingBill(com.bodkink.hotel.business.model.Booking, com.bodkink.hotel.business.model.BookingBillType) <em>Create Booking Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking Bill</em>' operation.
	 * @see com.bodkink.hotel.business.IBillingManagement#createBookingBill(com.bodkink.hotel.business.model.Booking, com.bodkink.hotel.business.model.BookingBillType)
	 * @generated
	 */
	EOperation getIBillingManagement__CreateBookingBill__Booking_BookingBillType();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillingManagement#addBillableItem(com.bodkink.hotel.business.model.RoomBill, com.bodkink.hotel.business.model.BillableItem, int) <em>Add Billable Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Billable Item</em>' operation.
	 * @see com.bodkink.hotel.business.IBillingManagement#addBillableItem(com.bodkink.hotel.business.model.RoomBill, com.bodkink.hotel.business.model.BillableItem, int)
	 * @generated
	 */
	EOperation getIBillingManagement__AddBillableItem__RoomBill_BillableItem_int();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillingManagement#findRoomBill(long) <em>Find Room Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Room Bill</em>' operation.
	 * @see com.bodkink.hotel.business.IBillingManagement#findRoomBill(long)
	 * @generated
	 */
	EOperation getIBillingManagement__FindRoomBill__long();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillingManagement#makePayment(com.bodkink.hotel.business.model.Bill, com.bodkink.hotel.business.model.CardInformation) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see com.bodkink.hotel.business.IBillingManagement#makePayment(com.bodkink.hotel.business.model.Bill, com.bodkink.hotel.business.model.CardInformation)
	 * @generated
	 */
	EOperation getIBillingManagement__MakePayment__Bill_CardInformation();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillingManagement#generateReceipts(com.bodkink.hotel.business.model.Booking) <em>Generate Receipts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Receipts</em>' operation.
	 * @see com.bodkink.hotel.business.IBillingManagement#generateReceipts(com.bodkink.hotel.business.model.Booking)
	 * @generated
	 */
	EOperation getIBillingManagement__GenerateReceipts__Booking();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillingManagement#generateReceipt(com.bodkink.hotel.business.model.Bill) <em>Generate Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Receipt</em>' operation.
	 * @see com.bodkink.hotel.business.IBillingManagement#generateReceipt(com.bodkink.hotel.business.model.Bill)
	 * @generated
	 */
	EOperation getIBillingManagement__GenerateReceipt__Bill();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillingManagement#makePayment(com.bodkink.hotel.business.model.Bill, com.bodkink.hotel.business.model.Customer) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see com.bodkink.hotel.business.IBillingManagement#makePayment(com.bodkink.hotel.business.model.Bill, com.bodkink.hotel.business.model.Customer)
	 * @generated
	 */
	EOperation getIBillingManagement__MakePayment__Bill_Customer();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBillingManagement#makePayment(com.bodkink.hotel.business.model.Booking, boolean) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see com.bodkink.hotel.business.IBillingManagement#makePayment(com.bodkink.hotel.business.model.Booking, boolean)
	 * @generated
	 */
	EOperation getIBillingManagement__MakePayment__Booking_boolean();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.IBookingManagement <em>IBooking Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Management</em>'.
	 * @see com.bodkink.hotel.business.IBookingManagement
	 * @generated
	 */
	EClass getIBookingManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBookingManagement#create(java.util.Date, java.util.Date, com.bodkink.hotel.business.model.Room, int, com.bodkink.hotel.business.model.Customer) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see com.bodkink.hotel.business.IBookingManagement#create(java.util.Date, java.util.Date, com.bodkink.hotel.business.model.Room, int, com.bodkink.hotel.business.model.Customer)
	 * @generated
	 */
	EOperation getIBookingManagement__Create__Date_Date_Room_int_Customer();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBookingManagement#listBookings() <em>List Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Bookings</em>' operation.
	 * @see com.bodkink.hotel.business.IBookingManagement#listBookings()
	 * @generated
	 */
	EOperation getIBookingManagement__ListBookings();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBookingManagement#findBooking(long) <em>Find Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Booking</em>' operation.
	 * @see com.bodkink.hotel.business.IBookingManagement#findBooking(long)
	 * @generated
	 */
	EOperation getIBookingManagement__FindBooking__long();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBookingManagement#listBooking(java.util.Date) <em>List Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Booking</em>' operation.
	 * @see com.bodkink.hotel.business.IBookingManagement#listBooking(java.util.Date)
	 * @generated
	 */
	EOperation getIBookingManagement__ListBooking__Date();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBookingManagement#listAvailableRooms(java.util.Date, java.util.Date, com.bodkink.hotel.business.model.Room) <em>List Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Available Rooms</em>' operation.
	 * @see com.bodkink.hotel.business.IBookingManagement#listAvailableRooms(java.util.Date, java.util.Date, com.bodkink.hotel.business.model.Room)
	 * @generated
	 */
	EOperation getIBookingManagement__ListAvailableRooms__Date_Date_Room();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBookingManagement#cancelBooking(com.bodkink.hotel.business.model.Booking) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see com.bodkink.hotel.business.IBookingManagement#cancelBooking(com.bodkink.hotel.business.model.Booking)
	 * @generated
	 */
	EOperation getIBookingManagement__CancelBooking__Booking();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBookingManagement#getBookingStatus(long) <em>Get Booking Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Status</em>' operation.
	 * @see com.bodkink.hotel.business.IBookingManagement#getBookingStatus(long)
	 * @generated
	 */
	EOperation getIBookingManagement__GetBookingStatus__long();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IBookingManagement#confirmAndPay(com.bodkink.hotel.business.model.Booking, com.bodkink.hotel.business.model.CardInformation) <em>Confirm And Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm And Pay</em>' operation.
	 * @see com.bodkink.hotel.business.IBookingManagement#confirmAndPay(com.bodkink.hotel.business.model.Booking, com.bodkink.hotel.business.model.CardInformation)
	 * @generated
	 */
	EOperation getIBookingManagement__ConfirmAndPay__Booking_CardInformation();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.ICustomerManagement <em>ICustomer Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICustomer Management</em>'.
	 * @see com.bodkink.hotel.business.ICustomerManagement
	 * @generated
	 */
	EClass getICustomerManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.ICustomerManagement#createCustomer(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) <em>Create Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Customer</em>' operation.
	 * @see com.bodkink.hotel.business.ICustomerManagement#createCustomer(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getICustomerManagement__CreateCustomer__String_String_String_String_int();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.ICustomerManagement#editCustomer(com.bodkink.hotel.business.model.Customer) <em>Edit Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Customer</em>' operation.
	 * @see com.bodkink.hotel.business.ICustomerManagement#editCustomer(com.bodkink.hotel.business.model.Customer)
	 * @generated
	 */
	EOperation getICustomerManagement__EditCustomer__Customer();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.IAccountManagement <em>IAccount Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAccount Management</em>'.
	 * @see com.bodkink.hotel.business.IAccountManagement
	 * @generated
	 */
	EClass getIAccountManagement();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IAccountManagement#createCustomerAccount(java.lang.String, java.lang.String, com.bodkink.hotel.business.model.Customer) <em>Create Customer Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Customer Account</em>' operation.
	 * @see com.bodkink.hotel.business.IAccountManagement#createCustomerAccount(java.lang.String, java.lang.String, com.bodkink.hotel.business.model.Customer)
	 * @generated
	 */
	EOperation getIAccountManagement__CreateCustomerAccount__String_String_Customer();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IAccountManagement#createEmployeeAccount(java.lang.String, java.lang.String, com.bodkink.hotel.business.model.UserGroupEnum) <em>Create Employee Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Employee Account</em>' operation.
	 * @see com.bodkink.hotel.business.IAccountManagement#createEmployeeAccount(java.lang.String, java.lang.String, com.bodkink.hotel.business.model.UserGroupEnum)
	 * @generated
	 */
	EOperation getIAccountManagement__CreateEmployeeAccount__String_String_UserGroupEnum();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IAccountManagement#editUserAccount(com.bodkink.hotel.business.model.UserAccount) <em>Edit User Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit User Account</em>' operation.
	 * @see com.bodkink.hotel.business.IAccountManagement#editUserAccount(com.bodkink.hotel.business.model.UserAccount)
	 * @generated
	 */
	EOperation getIAccountManagement__EditUserAccount__UserAccount();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IAccountManagement#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see com.bodkink.hotel.business.IAccountManagement#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIAccountManagement__Login__String_String();

	/**
	 * Returns the meta object for the '{@link com.bodkink.hotel.business.IAccountManagement#isLoggedIn() <em>Is Logged In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Logged In</em>' operation.
	 * @see com.bodkink.hotel.business.IAccountManagement#isLoggedIn()
	 * @generated
	 */
	EOperation getIAccountManagement__IsLoggedIn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BusinessFactory getBusinessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.IGuestManagement <em>IGuest Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.IGuestManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIGuestManagement()
		 * @generated
		 */
		EClass IGUEST_MANAGEMENT = eINSTANCE.getIGuestManagement();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUEST_MANAGEMENT___CHECK_OUT__BOOKING_BOOLEAN = eINSTANCE.getIGuestManagement__CheckOut__Booking_boolean();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUEST_MANAGEMENT___CHECK_IN__ROOMRESERVATION_GUEST = eINSTANCE.getIGuestManagement__CheckIn__RoomReservation_Guest();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUEST_MANAGEMENT___CHECK_OUT__ROOMRESERVATION = eINSTANCE.getIGuestManagement__CheckOut__RoomReservation();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.IRoomExtraManagement <em>IRoom Extra Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.IRoomExtraManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIRoomExtraManagement()
		 * @generated
		 */
		EClass IROOM_EXTRA_MANAGEMENT = eINSTANCE.getIRoomExtraManagement();

		/**
		 * The meta object literal for the '<em><b>Create Room Extra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_EXTRA_MANAGEMENT___CREATE_ROOM_EXTRA__STRING_STRING = eINSTANCE.getIRoomExtraManagement__CreateRoomExtra__String_String();

		/**
		 * The meta object literal for the '<em><b>Edit Room Extra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_EXTRA_MANAGEMENT___EDIT_ROOM_EXTRA__ROOMEXTRA = eINSTANCE.getIRoomExtraManagement__EditRoomExtra__RoomExtra();

		/**
		 * The meta object literal for the '<em><b>List Room Extras</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_EXTRA_MANAGEMENT___LIST_ROOM_EXTRAS = eINSTANCE.getIRoomExtraManagement__ListRoomExtras();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.IRoomManagement <em>IRoom Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.IRoomManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIRoomManagement()
		 * @generated
		 */
		EClass IROOM_MANAGEMENT = eINSTANCE.getIRoomManagement();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGEMENT___CREATE__STRING_STRING_INT_BIGDECIMAL_BIGDECIMAL_STRING_CLASSIFICATION_MAP_ROOMEXTRA = eINSTANCE.getIRoomManagement__Create__String_String_int_BigDecimal_BigDecimal_String_Classification_Map_RoomExtra();

		/**
		 * The meta object literal for the '<em><b>List Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGEMENT___LIST_ROOMS = eINSTANCE.getIRoomManagement__ListRooms();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGEMENT___EDIT_ROOM__ROOM = eINSTANCE.getIRoomManagement__EditRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Disable Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGEMENT___DISABLE_ROOM__LONG = eINSTANCE.getIRoomManagement__DisableRoom__long();

		/**
		 * The meta object literal for the '<em><b>Find Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGEMENT___FIND_ROOM__LONG = eINSTANCE.getIRoomManagement__FindRoom__long();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.IRoomReservationManagement <em>IRoom Reservation Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.IRoomReservationManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIRoomReservationManagement()
		 * @generated
		 */
		EClass IROOM_RESERVATION_MANAGEMENT = eINSTANCE.getIRoomReservationManagement();

		/**
		 * The meta object literal for the '<em><b>List Room Reservations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS = eINSTANCE.getIRoomReservationManagement__ListRoomReservations();

		/**
		 * The meta object literal for the '<em><b>List Room Reservations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE_DATE = eINSTANCE.getIRoomReservationManagement__ListRoomReservations__Date_Date();

		/**
		 * The meta object literal for the '<em><b>List Room Reservations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE = eINSTANCE.getIRoomReservationManagement__ListRoomReservations__Date();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_RESERVATION_MANAGEMENT___CREATE__ROOM_DATE_DATE_ROOMRESERVATIONTYPE = eINSTANCE.getIRoomReservationManagement__Create__Room_Date_Date_RoomReservationType();

		/**
		 * The meta object literal for the '<em><b>Find Room Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_RESERVATION_MANAGEMENT___FIND_ROOM_RESERVATION__LONG = eINSTANCE.getIRoomReservationManagement__FindRoomReservation__long();

		/**
		 * The meta object literal for the '<em><b>Cancel Room Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_RESERVATION_MANAGEMENT___CANCEL_ROOM_RESERVATION__ROOMRESERVATION = eINSTANCE.getIRoomReservationManagement__CancelRoomReservation__RoomReservation();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.IServiceManagement <em>IService Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.IServiceManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIServiceManagement()
		 * @generated
		 */
		EClass ISERVICE_MANAGEMENT = eINSTANCE.getIServiceManagement();

		/**
		 * The meta object literal for the '<em><b>Create Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_MANAGEMENT___CREATE_SERVICE__STRING_STRING_BIGDECIMAL = eINSTANCE.getIServiceManagement__CreateService__String_String_BigDecimal();

		/**
		 * The meta object literal for the '<em><b>Edit Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_MANAGEMENT___EDIT_SERVICE__SERVICE = eINSTANCE.getIServiceManagement__EditService__Service();

		/**
		 * The meta object literal for the '<em><b>List Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_MANAGEMENT___LIST_SERVICES = eINSTANCE.getIServiceManagement__ListServices();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.IBedTypeManagement <em>IBed Type Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.IBedTypeManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIBedTypeManagement()
		 * @generated
		 */
		EClass IBED_TYPE_MANAGEMENT = eINSTANCE.getIBedTypeManagement();

		/**
		 * The meta object literal for the '<em><b>Create Bed Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBED_TYPE_MANAGEMENT___CREATE_BED_TYPE__STRING_INT_INT_INT = eINSTANCE.getIBedTypeManagement__CreateBedType__String_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Edit Bed Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBED_TYPE_MANAGEMENT___EDIT_BED_TYPE__BEDTYPE = eINSTANCE.getIBedTypeManagement__EditBedType__BedType();

		/**
		 * The meta object literal for the '<em><b>List Bed Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBED_TYPE_MANAGEMENT___LIST_BED_TYPES = eINSTANCE.getIBedTypeManagement__ListBedTypes();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.IBillableItemManagement <em>IBillable Item Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.IBillableItemManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIBillableItemManagement()
		 * @generated
		 */
		EClass IBILLABLE_ITEM_MANAGEMENT = eINSTANCE.getIBillableItemManagement();

		/**
		 * The meta object literal for the '<em><b>Create Billable Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLABLE_ITEM_MANAGEMENT___CREATE_BILLABLE_ITEM__STRING_BIGDECIMAL = eINSTANCE.getIBillableItemManagement__CreateBillableItem__String_BigDecimal();

		/**
		 * The meta object literal for the '<em><b>Edit Billable Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLABLE_ITEM_MANAGEMENT___EDIT_BILLABLE_ITEM__BILLABLEITEM = eINSTANCE.getIBillableItemManagement__EditBillableItem__BillableItem();

		/**
		 * The meta object literal for the '<em><b>List Billable Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLABLE_ITEM_MANAGEMENT___LIST_BILLABLE_ITEMS__BILLABLEITEM = eINSTANCE.getIBillableItemManagement__ListBillableItems__BillableItem();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.IBillingManagement <em>IBilling Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.IBillingManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIBillingManagement()
		 * @generated
		 */
		EClass IBILLING_MANAGEMENT = eINSTANCE.getIBillingManagement();

		/**
		 * The meta object literal for the '<em><b>Create Room Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLING_MANAGEMENT___CREATE_ROOM_BILL__ROOMRESERVATION = eINSTANCE.getIBillingManagement__CreateRoomBill__RoomReservation();

		/**
		 * The meta object literal for the '<em><b>Create Booking Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLING_MANAGEMENT___CREATE_BOOKING_BILL__BOOKING_BOOKINGBILLTYPE = eINSTANCE.getIBillingManagement__CreateBookingBill__Booking_BookingBillType();

		/**
		 * The meta object literal for the '<em><b>Add Billable Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLING_MANAGEMENT___ADD_BILLABLE_ITEM__ROOMBILL_BILLABLEITEM_INT = eINSTANCE.getIBillingManagement__AddBillableItem__RoomBill_BillableItem_int();

		/**
		 * The meta object literal for the '<em><b>Find Room Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLING_MANAGEMENT___FIND_ROOM_BILL__LONG = eINSTANCE.getIBillingManagement__FindRoomBill__long();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CARDINFORMATION = eINSTANCE.getIBillingManagement__MakePayment__Bill_CardInformation();

		/**
		 * The meta object literal for the '<em><b>Generate Receipts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLING_MANAGEMENT___GENERATE_RECEIPTS__BOOKING = eINSTANCE.getIBillingManagement__GenerateReceipts__Booking();

		/**
		 * The meta object literal for the '<em><b>Generate Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLING_MANAGEMENT___GENERATE_RECEIPT__BILL = eINSTANCE.getIBillingManagement__GenerateReceipt__Bill();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CUSTOMER = eINSTANCE.getIBillingManagement__MakePayment__Bill_Customer();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLING_MANAGEMENT___MAKE_PAYMENT__BOOKING_BOOLEAN = eINSTANCE.getIBillingManagement__MakePayment__Booking_boolean();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.IBookingManagement <em>IBooking Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.IBookingManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIBookingManagement()
		 * @generated
		 */
		EClass IBOOKING_MANAGEMENT = eINSTANCE.getIBookingManagement();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___CREATE__DATE_DATE_ROOM_INT_CUSTOMER = eINSTANCE.getIBookingManagement__Create__Date_Date_Room_int_Customer();

		/**
		 * The meta object literal for the '<em><b>List Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___LIST_BOOKINGS = eINSTANCE.getIBookingManagement__ListBookings();

		/**
		 * The meta object literal for the '<em><b>Find Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___FIND_BOOKING__LONG = eINSTANCE.getIBookingManagement__FindBooking__long();

		/**
		 * The meta object literal for the '<em><b>List Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___LIST_BOOKING__DATE = eINSTANCE.getIBookingManagement__ListBooking__Date();

		/**
		 * The meta object literal for the '<em><b>List Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___LIST_AVAILABLE_ROOMS__DATE_DATE_ROOM = eINSTANCE.getIBookingManagement__ListAvailableRooms__Date_Date_Room();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___CANCEL_BOOKING__BOOKING = eINSTANCE.getIBookingManagement__CancelBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Get Booking Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___GET_BOOKING_STATUS__LONG = eINSTANCE.getIBookingManagement__GetBookingStatus__long();

		/**
		 * The meta object literal for the '<em><b>Confirm And Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___CONFIRM_AND_PAY__BOOKING_CARDINFORMATION = eINSTANCE.getIBookingManagement__ConfirmAndPay__Booking_CardInformation();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.ICustomerManagement <em>ICustomer Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.ICustomerManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getICustomerManagement()
		 * @generated
		 */
		EClass ICUSTOMER_MANAGEMENT = eINSTANCE.getICustomerManagement();

		/**
		 * The meta object literal for the '<em><b>Create Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMER_MANAGEMENT___CREATE_CUSTOMER__STRING_STRING_STRING_STRING_INT = eINSTANCE.getICustomerManagement__CreateCustomer__String_String_String_String_int();

		/**
		 * The meta object literal for the '<em><b>Edit Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMER_MANAGEMENT___EDIT_CUSTOMER__CUSTOMER = eINSTANCE.getICustomerManagement__EditCustomer__Customer();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.IAccountManagement <em>IAccount Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.IAccountManagement
		 * @see com.bodkink.hotel.business.impl.BusinessPackageImpl#getIAccountManagement()
		 * @generated
		 */
		EClass IACCOUNT_MANAGEMENT = eINSTANCE.getIAccountManagement();

		/**
		 * The meta object literal for the '<em><b>Create Customer Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IACCOUNT_MANAGEMENT___CREATE_CUSTOMER_ACCOUNT__STRING_STRING_CUSTOMER = eINSTANCE.getIAccountManagement__CreateCustomerAccount__String_String_Customer();

		/**
		 * The meta object literal for the '<em><b>Create Employee Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IACCOUNT_MANAGEMENT___CREATE_EMPLOYEE_ACCOUNT__STRING_STRING_USERGROUPENUM = eINSTANCE.getIAccountManagement__CreateEmployeeAccount__String_String_UserGroupEnum();

		/**
		 * The meta object literal for the '<em><b>Edit User Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IACCOUNT_MANAGEMENT___EDIT_USER_ACCOUNT__USERACCOUNT = eINSTANCE.getIAccountManagement__EditUserAccount__UserAccount();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IACCOUNT_MANAGEMENT___LOGIN__STRING_STRING = eINSTANCE.getIAccountManagement__Login__String_String();

		/**
		 * The meta object literal for the '<em><b>Is Logged In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IACCOUNT_MANAGEMENT___IS_LOGGED_IN = eINSTANCE.getIAccountManagement__IsLoggedIn();

	}

} //BusinessPackage
