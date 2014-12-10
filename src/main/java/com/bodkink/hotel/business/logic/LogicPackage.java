/**
 */
package com.bodkink.hotel.business.logic;

import com.bodkink.hotel.business.BusinessPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see com.bodkink.hotel.business.logic.LogicFactory
 * @model kind="package"
 * @generated
 */
public interface LogicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///com.bodkink.hotel.business/logic.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.bodkink.hotel.business.logic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicPackage eINSTANCE = com.bodkink.hotel.business.logic.impl.LogicPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.GuestManagementImpl <em>Guest Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.GuestManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getGuestManagement()
	 * @generated
	 */
	int GUEST_MANAGEMENT = 0;

	/**
	 * The number of structural features of the '<em>Guest Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGEMENT_FEATURE_COUNT = BusinessPackage.IGUEST_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGEMENT___CHECK_OUT__BOOKING_BOOLEAN = BusinessPackage.IGUEST_MANAGEMENT___CHECK_OUT__BOOKING_BOOLEAN;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGEMENT___CHECK_IN__ROOMRESERVATION_GUEST = BusinessPackage.IGUEST_MANAGEMENT___CHECK_IN__ROOMRESERVATION_GUEST;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGEMENT___CHECK_OUT__ROOMRESERVATION = BusinessPackage.IGUEST_MANAGEMENT___CHECK_OUT__ROOMRESERVATION;

	/**
	 * The number of operations of the '<em>Guest Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGEMENT_OPERATION_COUNT = BusinessPackage.IGUEST_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.RoomExtraManagementImpl <em>Room Extra Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.RoomExtraManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getRoomExtraManagement()
	 * @generated
	 */
	int ROOM_EXTRA_MANAGEMENT = 1;

	/**
	 * The number of structural features of the '<em>Room Extra Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_MANAGEMENT_FEATURE_COUNT = BusinessPackage.IROOM_EXTRA_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Room Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_MANAGEMENT___CREATE_ROOM_EXTRA__STRING_STRING = BusinessPackage.IROOM_EXTRA_MANAGEMENT___CREATE_ROOM_EXTRA__STRING_STRING;

	/**
	 * The operation id for the '<em>Edit Room Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_MANAGEMENT___EDIT_ROOM_EXTRA__ROOMEXTRA = BusinessPackage.IROOM_EXTRA_MANAGEMENT___EDIT_ROOM_EXTRA__ROOMEXTRA;

	/**
	 * The operation id for the '<em>List Room Extras</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_MANAGEMENT___LIST_ROOM_EXTRAS = BusinessPackage.IROOM_EXTRA_MANAGEMENT___LIST_ROOM_EXTRAS;

	/**
	 * The number of operations of the '<em>Room Extra Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_MANAGEMENT_OPERATION_COUNT = BusinessPackage.IROOM_EXTRA_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.RoomManagementImpl <em>Room Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.RoomManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getRoomManagement()
	 * @generated
	 */
	int ROOM_MANAGEMENT = 2;

	/**
	 * The number of structural features of the '<em>Room Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT_FEATURE_COUNT = BusinessPackage.IROOM_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT___CREATE__STRING_STRING_INT_BIGDECIMAL_BIGDECIMAL_STRING_CLASSIFICATION_MAP_ROOMEXTRA = BusinessPackage.IROOM_MANAGEMENT___CREATE__STRING_STRING_INT_BIGDECIMAL_BIGDECIMAL_STRING_CLASSIFICATION_MAP_ROOMEXTRA;

	/**
	 * The operation id for the '<em>List Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT___LIST_ROOMS = BusinessPackage.IROOM_MANAGEMENT___LIST_ROOMS;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT___EDIT_ROOM__ROOM = BusinessPackage.IROOM_MANAGEMENT___EDIT_ROOM__ROOM;

	/**
	 * The operation id for the '<em>Disable Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT___DISABLE_ROOM__LONG = BusinessPackage.IROOM_MANAGEMENT___DISABLE_ROOM__LONG;

	/**
	 * The operation id for the '<em>Find Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT___FIND_ROOM__LONG = BusinessPackage.IROOM_MANAGEMENT___FIND_ROOM__LONG;

	/**
	 * The number of operations of the '<em>Room Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT_OPERATION_COUNT = BusinessPackage.IROOM_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.RoomReservationManagementImpl <em>Room Reservation Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.RoomReservationManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getRoomReservationManagement()
	 * @generated
	 */
	int ROOM_RESERVATION_MANAGEMENT = 3;

	/**
	 * The number of structural features of the '<em>Room Reservation Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_MANAGEMENT_FEATURE_COUNT = BusinessPackage.IROOM_RESERVATION_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>List Room Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS = BusinessPackage.IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS;

	/**
	 * The operation id for the '<em>List Room Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE_DATE = BusinessPackage.IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE_DATE;

	/**
	 * The operation id for the '<em>List Room Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE = BusinessPackage.IROOM_RESERVATION_MANAGEMENT___LIST_ROOM_RESERVATIONS__DATE;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_MANAGEMENT___CREATE__ROOM_DATE_DATE_ROOMRESERVATIONTYPE = BusinessPackage.IROOM_RESERVATION_MANAGEMENT___CREATE__ROOM_DATE_DATE_ROOMRESERVATIONTYPE;

	/**
	 * The operation id for the '<em>Find Room Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_MANAGEMENT___FIND_ROOM_RESERVATION__LONG = BusinessPackage.IROOM_RESERVATION_MANAGEMENT___FIND_ROOM_RESERVATION__LONG;

	/**
	 * The operation id for the '<em>Cancel Room Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_MANAGEMENT___CANCEL_ROOM_RESERVATION__ROOMRESERVATION = BusinessPackage.IROOM_RESERVATION_MANAGEMENT___CANCEL_ROOM_RESERVATION__ROOMRESERVATION;

	/**
	 * The number of operations of the '<em>Room Reservation Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_MANAGEMENT_OPERATION_COUNT = BusinessPackage.IROOM_RESERVATION_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.ServiceManagementImpl <em>Service Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.ServiceManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getServiceManagement()
	 * @generated
	 */
	int SERVICE_MANAGEMENT = 4;

	/**
	 * The number of structural features of the '<em>Service Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_FEATURE_COUNT = BusinessPackage.ISERVICE_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT___CREATE_SERVICE__STRING_STRING_BIGDECIMAL = BusinessPackage.ISERVICE_MANAGEMENT___CREATE_SERVICE__STRING_STRING_BIGDECIMAL;

	/**
	 * The operation id for the '<em>Edit Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT___EDIT_SERVICE__SERVICE = BusinessPackage.ISERVICE_MANAGEMENT___EDIT_SERVICE__SERVICE;

	/**
	 * The operation id for the '<em>List Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT___LIST_SERVICES = BusinessPackage.ISERVICE_MANAGEMENT___LIST_SERVICES;

	/**
	 * The number of operations of the '<em>Service Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGEMENT_OPERATION_COUNT = BusinessPackage.ISERVICE_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.BedTypeManagementImpl <em>Bed Type Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.BedTypeManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getBedTypeManagement()
	 * @generated
	 */
	int BED_TYPE_MANAGEMENT = 5;

	/**
	 * The number of structural features of the '<em>Bed Type Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE_MANAGEMENT_FEATURE_COUNT = BusinessPackage.IBED_TYPE_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Bed Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE_MANAGEMENT___CREATE_BED_TYPE__STRING_INT_INT_INT = BusinessPackage.IBED_TYPE_MANAGEMENT___CREATE_BED_TYPE__STRING_INT_INT_INT;

	/**
	 * The operation id for the '<em>Edit Bed Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE_MANAGEMENT___EDIT_BED_TYPE__BEDTYPE = BusinessPackage.IBED_TYPE_MANAGEMENT___EDIT_BED_TYPE__BEDTYPE;

	/**
	 * The operation id for the '<em>List Bed Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE_MANAGEMENT___LIST_BED_TYPES = BusinessPackage.IBED_TYPE_MANAGEMENT___LIST_BED_TYPES;

	/**
	 * The number of operations of the '<em>Bed Type Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE_MANAGEMENT_OPERATION_COUNT = BusinessPackage.IBED_TYPE_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.BillableItemManagementImpl <em>Billable Item Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.BillableItemManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getBillableItemManagement()
	 * @generated
	 */
	int BILLABLE_ITEM_MANAGEMENT = 6;

	/**
	 * The number of structural features of the '<em>Billable Item Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLABLE_ITEM_MANAGEMENT_FEATURE_COUNT = BusinessPackage.IBILLABLE_ITEM_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Billable Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLABLE_ITEM_MANAGEMENT___CREATE_BILLABLE_ITEM__STRING_BIGDECIMAL = BusinessPackage.IBILLABLE_ITEM_MANAGEMENT___CREATE_BILLABLE_ITEM__STRING_BIGDECIMAL;

	/**
	 * The operation id for the '<em>Edit Billable Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLABLE_ITEM_MANAGEMENT___EDIT_BILLABLE_ITEM__BILLABLEITEM = BusinessPackage.IBILLABLE_ITEM_MANAGEMENT___EDIT_BILLABLE_ITEM__BILLABLEITEM;

	/**
	 * The operation id for the '<em>List Billable Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLABLE_ITEM_MANAGEMENT___LIST_BILLABLE_ITEMS__BILLABLEITEM = BusinessPackage.IBILLABLE_ITEM_MANAGEMENT___LIST_BILLABLE_ITEMS__BILLABLEITEM;

	/**
	 * The number of operations of the '<em>Billable Item Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLABLE_ITEM_MANAGEMENT_OPERATION_COUNT = BusinessPackage.IBILLABLE_ITEM_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.BillingManagementImpl <em>Billing Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.BillingManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getBillingManagement()
	 * @generated
	 */
	int BILLING_MANAGEMENT = 7;

	/**
	 * The number of structural features of the '<em>Billing Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT_FEATURE_COUNT = BusinessPackage.IBILLING_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Room Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT___CREATE_ROOM_BILL__ROOMRESERVATION = BusinessPackage.IBILLING_MANAGEMENT___CREATE_ROOM_BILL__ROOMRESERVATION;

	/**
	 * The operation id for the '<em>Create Booking Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT___CREATE_BOOKING_BILL__BOOKING_BOOKINGBILLTYPE = BusinessPackage.IBILLING_MANAGEMENT___CREATE_BOOKING_BILL__BOOKING_BOOKINGBILLTYPE;

	/**
	 * The operation id for the '<em>Add Billable Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT___ADD_BILLABLE_ITEM__ROOMBILL_BILLABLEITEM_INT = BusinessPackage.IBILLING_MANAGEMENT___ADD_BILLABLE_ITEM__ROOMBILL_BILLABLEITEM_INT;

	/**
	 * The operation id for the '<em>Find Room Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT___FIND_ROOM_BILL__LONG = BusinessPackage.IBILLING_MANAGEMENT___FIND_ROOM_BILL__LONG;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CARDINFORMATION = BusinessPackage.IBILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CARDINFORMATION;

	/**
	 * The operation id for the '<em>Generate Receipts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT___GENERATE_RECEIPTS__BOOKING = BusinessPackage.IBILLING_MANAGEMENT___GENERATE_RECEIPTS__BOOKING;

	/**
	 * The operation id for the '<em>Generate Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT___GENERATE_RECEIPT__BILL = BusinessPackage.IBILLING_MANAGEMENT___GENERATE_RECEIPT__BILL;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CUSTOMER = BusinessPackage.IBILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CUSTOMER;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT___MAKE_PAYMENT__BOOKING_BOOLEAN = BusinessPackage.IBILLING_MANAGEMENT___MAKE_PAYMENT__BOOKING_BOOLEAN;

	/**
	 * The number of operations of the '<em>Billing Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_MANAGEMENT_OPERATION_COUNT = BusinessPackage.IBILLING_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.BookingManagementImpl <em>Booking Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.BookingManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getBookingManagement()
	 * @generated
	 */
	int BOOKING_MANAGEMENT = 8;

	/**
	 * The number of structural features of the '<em>Booking Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGEMENT_FEATURE_COUNT = BusinessPackage.IBOOKING_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGEMENT___CREATE__DATE_DATE_ROOM_INT_CUSTOMER = BusinessPackage.IBOOKING_MANAGEMENT___CREATE__DATE_DATE_ROOM_INT_CUSTOMER;

	/**
	 * The operation id for the '<em>List Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGEMENT___LIST_BOOKINGS = BusinessPackage.IBOOKING_MANAGEMENT___LIST_BOOKINGS;

	/**
	 * The operation id for the '<em>Find Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGEMENT___FIND_BOOKING__LONG = BusinessPackage.IBOOKING_MANAGEMENT___FIND_BOOKING__LONG;

	/**
	 * The operation id for the '<em>List Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGEMENT___LIST_BOOKING__DATE = BusinessPackage.IBOOKING_MANAGEMENT___LIST_BOOKING__DATE;

	/**
	 * The operation id for the '<em>List Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGEMENT___LIST_AVAILABLE_ROOMS__DATE_DATE_ROOM = BusinessPackage.IBOOKING_MANAGEMENT___LIST_AVAILABLE_ROOMS__DATE_DATE_ROOM;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGEMENT___CANCEL_BOOKING__BOOKING = BusinessPackage.IBOOKING_MANAGEMENT___CANCEL_BOOKING__BOOKING;

	/**
	 * The operation id for the '<em>Get Booking Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGEMENT___GET_BOOKING_STATUS__LONG = BusinessPackage.IBOOKING_MANAGEMENT___GET_BOOKING_STATUS__LONG;

	/**
	 * The operation id for the '<em>Confirm And Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGEMENT___CONFIRM_AND_PAY__BOOKING_CARDINFORMATION = BusinessPackage.IBOOKING_MANAGEMENT___CONFIRM_AND_PAY__BOOKING_CARDINFORMATION;

	/**
	 * The number of operations of the '<em>Booking Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGEMENT_OPERATION_COUNT = BusinessPackage.IBOOKING_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.CustomerManagementImpl <em>Customer Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.CustomerManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getCustomerManagement()
	 * @generated
	 */
	int CUSTOMER_MANAGEMENT = 9;

	/**
	 * The number of structural features of the '<em>Customer Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGEMENT_FEATURE_COUNT = BusinessPackage.ICUSTOMER_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGEMENT___CREATE_CUSTOMER__STRING_STRING_STRING_STRING_INT = BusinessPackage.ICUSTOMER_MANAGEMENT___CREATE_CUSTOMER__STRING_STRING_STRING_STRING_INT;

	/**
	 * The operation id for the '<em>Edit Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGEMENT___EDIT_CUSTOMER__CUSTOMER = BusinessPackage.ICUSTOMER_MANAGEMENT___EDIT_CUSTOMER__CUSTOMER;

	/**
	 * The number of operations of the '<em>Customer Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGEMENT_OPERATION_COUNT = BusinessPackage.ICUSTOMER_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.logic.impl.AccountManagementImpl <em>Account Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.logic.impl.AccountManagementImpl
	 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getAccountManagement()
	 * @generated
	 */
	int ACCOUNT_MANAGEMENT = 10;

	/**
	 * The number of structural features of the '<em>Account Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MANAGEMENT_FEATURE_COUNT = BusinessPackage.IACCOUNT_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Customer Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MANAGEMENT___CREATE_CUSTOMER_ACCOUNT__STRING_STRING_CUSTOMER = BusinessPackage.IACCOUNT_MANAGEMENT___CREATE_CUSTOMER_ACCOUNT__STRING_STRING_CUSTOMER;

	/**
	 * The operation id for the '<em>Create Employee Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MANAGEMENT___CREATE_EMPLOYEE_ACCOUNT__STRING_STRING_USERGROUPENUM = BusinessPackage.IACCOUNT_MANAGEMENT___CREATE_EMPLOYEE_ACCOUNT__STRING_STRING_USERGROUPENUM;

	/**
	 * The operation id for the '<em>Edit User Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MANAGEMENT___EDIT_USER_ACCOUNT__USERACCOUNT = BusinessPackage.IACCOUNT_MANAGEMENT___EDIT_USER_ACCOUNT__USERACCOUNT;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MANAGEMENT___LOGIN__STRING_STRING = BusinessPackage.IACCOUNT_MANAGEMENT___LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Is Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MANAGEMENT___IS_LOGGED_IN = BusinessPackage.IACCOUNT_MANAGEMENT___IS_LOGGED_IN;

	/**
	 * The number of operations of the '<em>Account Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MANAGEMENT_OPERATION_COUNT = BusinessPackage.IACCOUNT_MANAGEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.GuestManagement <em>Guest Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Management</em>'.
	 * @see com.bodkink.hotel.business.logic.GuestManagement
	 * @generated
	 */
	EClass getGuestManagement();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.RoomExtraManagement <em>Room Extra Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Extra Management</em>'.
	 * @see com.bodkink.hotel.business.logic.RoomExtraManagement
	 * @generated
	 */
	EClass getRoomExtraManagement();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.RoomManagement <em>Room Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Management</em>'.
	 * @see com.bodkink.hotel.business.logic.RoomManagement
	 * @generated
	 */
	EClass getRoomManagement();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.RoomReservationManagement <em>Room Reservation Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Reservation Management</em>'.
	 * @see com.bodkink.hotel.business.logic.RoomReservationManagement
	 * @generated
	 */
	EClass getRoomReservationManagement();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.ServiceManagement <em>Service Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Management</em>'.
	 * @see com.bodkink.hotel.business.logic.ServiceManagement
	 * @generated
	 */
	EClass getServiceManagement();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.BedTypeManagement <em>Bed Type Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bed Type Management</em>'.
	 * @see com.bodkink.hotel.business.logic.BedTypeManagement
	 * @generated
	 */
	EClass getBedTypeManagement();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.BillableItemManagement <em>Billable Item Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billable Item Management</em>'.
	 * @see com.bodkink.hotel.business.logic.BillableItemManagement
	 * @generated
	 */
	EClass getBillableItemManagement();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.BillingManagement <em>Billing Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billing Management</em>'.
	 * @see com.bodkink.hotel.business.logic.BillingManagement
	 * @generated
	 */
	EClass getBillingManagement();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.BookingManagement <em>Booking Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Management</em>'.
	 * @see com.bodkink.hotel.business.logic.BookingManagement
	 * @generated
	 */
	EClass getBookingManagement();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.CustomerManagement <em>Customer Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Management</em>'.
	 * @see com.bodkink.hotel.business.logic.CustomerManagement
	 * @generated
	 */
	EClass getCustomerManagement();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.logic.AccountManagement <em>Account Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Management</em>'.
	 * @see com.bodkink.hotel.business.logic.AccountManagement
	 * @generated
	 */
	EClass getAccountManagement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogicFactory getLogicFactory();

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
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.GuestManagementImpl <em>Guest Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.GuestManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getGuestManagement()
		 * @generated
		 */
		EClass GUEST_MANAGEMENT = eINSTANCE.getGuestManagement();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.RoomExtraManagementImpl <em>Room Extra Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.RoomExtraManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getRoomExtraManagement()
		 * @generated
		 */
		EClass ROOM_EXTRA_MANAGEMENT = eINSTANCE.getRoomExtraManagement();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.RoomManagementImpl <em>Room Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.RoomManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getRoomManagement()
		 * @generated
		 */
		EClass ROOM_MANAGEMENT = eINSTANCE.getRoomManagement();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.RoomReservationManagementImpl <em>Room Reservation Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.RoomReservationManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getRoomReservationManagement()
		 * @generated
		 */
		EClass ROOM_RESERVATION_MANAGEMENT = eINSTANCE.getRoomReservationManagement();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.ServiceManagementImpl <em>Service Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.ServiceManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getServiceManagement()
		 * @generated
		 */
		EClass SERVICE_MANAGEMENT = eINSTANCE.getServiceManagement();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.BedTypeManagementImpl <em>Bed Type Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.BedTypeManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getBedTypeManagement()
		 * @generated
		 */
		EClass BED_TYPE_MANAGEMENT = eINSTANCE.getBedTypeManagement();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.BillableItemManagementImpl <em>Billable Item Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.BillableItemManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getBillableItemManagement()
		 * @generated
		 */
		EClass BILLABLE_ITEM_MANAGEMENT = eINSTANCE.getBillableItemManagement();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.BillingManagementImpl <em>Billing Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.BillingManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getBillingManagement()
		 * @generated
		 */
		EClass BILLING_MANAGEMENT = eINSTANCE.getBillingManagement();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.BookingManagementImpl <em>Booking Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.BookingManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getBookingManagement()
		 * @generated
		 */
		EClass BOOKING_MANAGEMENT = eINSTANCE.getBookingManagement();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.CustomerManagementImpl <em>Customer Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.CustomerManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getCustomerManagement()
		 * @generated
		 */
		EClass CUSTOMER_MANAGEMENT = eINSTANCE.getCustomerManagement();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.logic.impl.AccountManagementImpl <em>Account Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.logic.impl.AccountManagementImpl
		 * @see com.bodkink.hotel.business.logic.impl.LogicPackageImpl#getAccountManagement()
		 * @generated
		 */
		EClass ACCOUNT_MANAGEMENT = eINSTANCE.getAccountManagement();

	}

} //LogicPackage
