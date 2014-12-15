/**
 */
package com.bodkink.hotel.business.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.bodkink.hotel.business.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///com/bodkink/hotel/business/model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.bodkink.hotel.business.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = com.bodkink.hotel.business.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.AddressImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = 0;

	/**
	 * The feature id for the '<em><b>Address Line1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDRESS_LINE1 = 1;

	/**
	 * The feature id for the '<em><b>Address Line2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDRESS_LINE2 = 2;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ZIP_CODE = 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 4;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 5;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.BedTypeImpl <em>Bed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.BedTypeImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBedType()
	 * @generated
	 */
	int BED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE__PLACES = 4;

	/**
	 * The number of structural features of the '<em>Bed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Bed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.BillImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__ID = 0;

	/**
	 * The feature id for the '<em><b>Bill Status Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__BILL_STATUS_ENUM = 1;

	/**
	 * The feature id for the '<em><b>Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__CARD_INFORMATION = 2;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.CardInformationImpl <em>Card Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.CardInformationImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getCardInformation()
	 * @generated
	 */
	int CARD_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INFORMATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INFORMATION__CARD_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Card Holder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INFORMATION__CARD_HOLDER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INFORMATION__EXPIRATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INFORMATION__ADDRESS = 4;

	/**
	 * The number of structural features of the '<em>Card Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INFORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Card Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.BillableItemImpl <em>Billable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.BillableItemImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBillableItem()
	 * @generated
	 */
	int BILLABLE_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLABLE_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLABLE_ITEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLABLE_ITEM__PRICE = 2;

	/**
	 * The number of structural features of the '<em>Billable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLABLE_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Billable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLABLE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.BookingImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ID = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Room Reservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_RESERVATION = 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Booking Bill</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_BILL = 5;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.PersonImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SURNAME = 2;

	/**
	 * The feature id for the '<em><b>Birth Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_YEAR = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.CustomerImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = PERSON__ID;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SURNAME = PERSON__SURNAME;

	/**
	 * The feature id for the '<em><b>Birth Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BIRTH_YEAR = PERSON__BIRTH_YEAR;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NOTES = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CARD_INFORMATION = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.RoomReservationImpl <em>Room Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.RoomReservationImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoomReservation()
	 * @generated
	 */
	int ROOM_RESERVATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__GUEST = 3;

	/**
	 * The feature id for the '<em><b>Room Reservation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__ROOM_RESERVATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__ROOM = 5;

	/**
	 * The feature id for the '<em><b>Room Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__ROOM_BILL = 6;

	/**
	 * The feature id for the '<em><b>Reservation Status Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__RESERVATION_STATUS_ENUM = 7;

	/**
	 * The number of structural features of the '<em>Room Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Room Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.GuestImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ID = PERSON__ID;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__SURNAME = PERSON__SURNAME;

	/**
	 * The feature id for the '<em><b>Birth Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__BIRTH_YEAR = PERSON__BIRTH_YEAR;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.RoomImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ID = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Allowed Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ALLOWED_GUESTS = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SIZE = 4;

	/**
	 * The feature id for the '<em><b>Night Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NIGHT_PRICE = 5;

	/**
	 * The feature id for the '<em><b>Pictures</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PICTURES = 6;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CLASSIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Bed Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BED_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Room Extra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_EXTRA = 9;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.ClassificationImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.RoomExtraImpl <em>Room Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.RoomExtraImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoomExtra()
	 * @generated
	 */
	int ROOM_EXTRA = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Room Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.RoomBillImpl <em>Room Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.RoomBillImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoomBill()
	 * @generated
	 */
	int ROOM_BILL = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BILL__ID = BILL__ID;

	/**
	 * The feature id for the '<em><b>Bill Status Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BILL__BILL_STATUS_ENUM = BILL__BILL_STATUS_ENUM;

	/**
	 * The feature id for the '<em><b>Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BILL__CARD_INFORMATION = BILL__CARD_INFORMATION;

	/**
	 * The feature id for the '<em><b>Billable Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BILL__BILLABLE_ITEM = BILL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BILL_FEATURE_COUNT = BILL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Room Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BILL_OPERATION_COUNT = BILL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.ServiceImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRICE = 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.BookingBillImpl <em>Booking Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.BookingBillImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBookingBill()
	 * @generated
	 */
	int BOOKING_BILL = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__ID = BILL__ID;

	/**
	 * The feature id for the '<em><b>Bill Status Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__BILL_STATUS_ENUM = BILL__BILL_STATUS_ENUM;

	/**
	 * The feature id for the '<em><b>Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__CARD_INFORMATION = BILL__CARD_INFORMATION;

	/**
	 * The feature id for the '<em><b>Booking Bill Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__BOOKING_BILL_TYPE = BILL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_FEATURE_COUNT = BILL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_OPERATION_COUNT = BILL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.RoomExtraTemplateImpl <em>Room Extra Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.RoomExtraTemplateImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoomExtraTemplate()
	 * @generated
	 */
	int ROOM_EXTRA_TEMPLATE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_TEMPLATE__ID = 0;

	/**
	 * The feature id for the '<em><b>Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_TEMPLATE__TEMPLATE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Room Extra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_TEMPLATE__ROOM_EXTRA = 2;

	/**
	 * The number of structural features of the '<em>Room Extra Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room Extra Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRA_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.ReceiptImpl <em>Receipt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.ReceiptImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getReceipt()
	 * @generated
	 */
	int RECEIPT = 17;

	/**
	 * The feature id for the '<em><b>Receipt Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__RECEIPT_ITEM = 0;

	/**
	 * The number of structural features of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.ReceiptItemImpl <em>Receipt Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.ReceiptItemImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getReceiptItem()
	 * @generated
	 */
	int RECEIPT_ITEM = 18;

	/**
	 * The number of structural features of the '<em>Receipt Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Receipt Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.UserAccountImpl <em>User Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.UserAccountImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getUserAccount()
	 * @generated
	 */
	int USER_ACCOUNT = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNT__ID = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNT__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNT__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>User Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.impl.CustomerUserAccountImpl <em>Customer User Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.impl.CustomerUserAccountImpl
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getCustomerUserAccount()
	 * @generated
	 */
	int CUSTOMER_USER_ACCOUNT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_USER_ACCOUNT__ID = USER_ACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_USER_ACCOUNT__USERNAME = USER_ACCOUNT__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_USER_ACCOUNT__PASSWORD = USER_ACCOUNT__PASSWORD;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_USER_ACCOUNT__CUSTOMER = USER_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Group Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_USER_ACCOUNT__USER_GROUP_ENUM = USER_ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Customer User Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_USER_ACCOUNT_FEATURE_COUNT = USER_ACCOUNT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Customer User Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_USER_ACCOUNT_OPERATION_COUNT = USER_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.BillStatusEnum <em>Bill Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.BillStatusEnum
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBillStatusEnum()
	 * @generated
	 */
	int BILL_STATUS_ENUM = 21;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.RoomReservationType <em>Room Reservation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.RoomReservationType
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoomReservationType()
	 * @generated
	 */
	int ROOM_RESERVATION_TYPE = 22;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.ReservationStatusEnum <em>Reservation Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.ReservationStatusEnum
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getReservationStatusEnum()
	 * @generated
	 */
	int RESERVATION_STATUS_ENUM = 23;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.BookingBillType <em>Booking Bill Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.BookingBillType
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBookingBillType()
	 * @generated
	 */
	int BOOKING_BILL_TYPE = 24;

	/**
	 * The meta object id for the '{@link com.bodkink.hotel.business.model.UserGroupEnum <em>User Group Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bodkink.hotel.business.model.UserGroupEnum
	 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getUserGroupEnum()
	 * @generated
	 */
	int USER_GROUP_ENUM = 25;


	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see com.bodkink.hotel.business.model.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Address#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.Address#getId()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Address#getAddressLine1 <em>Address Line1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Line1</em>'.
	 * @see com.bodkink.hotel.business.model.Address#getAddressLine1()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_AddressLine1();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Address#getAddressLine2 <em>Address Line2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Line2</em>'.
	 * @see com.bodkink.hotel.business.model.Address#getAddressLine2()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_AddressLine2();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Address#getZipCode <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Code</em>'.
	 * @see com.bodkink.hotel.business.model.Address#getZipCode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_ZipCode();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see com.bodkink.hotel.business.model.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see com.bodkink.hotel.business.model.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.BedType <em>Bed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bed Type</em>'.
	 * @see com.bodkink.hotel.business.model.BedType
	 * @generated
	 */
	EClass getBedType();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.BedType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.BedType#getId()
	 * @see #getBedType()
	 * @generated
	 */
	EAttribute getBedType_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.BedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.bodkink.hotel.business.model.BedType#getName()
	 * @see #getBedType()
	 * @generated
	 */
	EAttribute getBedType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.BedType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see com.bodkink.hotel.business.model.BedType#getLength()
	 * @see #getBedType()
	 * @generated
	 */
	EAttribute getBedType_Length();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.BedType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.bodkink.hotel.business.model.BedType#getWidth()
	 * @see #getBedType()
	 * @generated
	 */
	EAttribute getBedType_Width();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.BedType#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Places</em>'.
	 * @see com.bodkink.hotel.business.model.BedType#getPlaces()
	 * @see #getBedType()
	 * @generated
	 */
	EAttribute getBedType_Places();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see com.bodkink.hotel.business.model.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Bill#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.Bill#getId()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Bill#getBillStatusEnum <em>Bill Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill Status Enum</em>'.
	 * @see com.bodkink.hotel.business.model.Bill#getBillStatusEnum()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_BillStatusEnum();

	/**
	 * Returns the meta object for the reference '{@link com.bodkink.hotel.business.model.Bill#getCardInformation <em>Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card Information</em>'.
	 * @see com.bodkink.hotel.business.model.Bill#getCardInformation()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_CardInformation();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.CardInformation <em>Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Information</em>'.
	 * @see com.bodkink.hotel.business.model.CardInformation
	 * @generated
	 */
	EClass getCardInformation();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.CardInformation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.CardInformation#getId()
	 * @see #getCardInformation()
	 * @generated
	 */
	EAttribute getCardInformation_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.CardInformation#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see com.bodkink.hotel.business.model.CardInformation#getCardNumber()
	 * @see #getCardInformation()
	 * @generated
	 */
	EAttribute getCardInformation_CardNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.CardInformation#getCardHolderName <em>Card Holder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Holder Name</em>'.
	 * @see com.bodkink.hotel.business.model.CardInformation#getCardHolderName()
	 * @see #getCardInformation()
	 * @generated
	 */
	EAttribute getCardInformation_CardHolderName();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.CardInformation#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see com.bodkink.hotel.business.model.CardInformation#getExpirationDate()
	 * @see #getCardInformation()
	 * @generated
	 */
	EAttribute getCardInformation_ExpirationDate();

	/**
	 * Returns the meta object for the reference '{@link com.bodkink.hotel.business.model.CardInformation#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see com.bodkink.hotel.business.model.CardInformation#getAddress()
	 * @see #getCardInformation()
	 * @generated
	 */
	EReference getCardInformation_Address();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.BillableItem <em>Billable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billable Item</em>'.
	 * @see com.bodkink.hotel.business.model.BillableItem
	 * @generated
	 */
	EClass getBillableItem();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.BillableItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.BillableItem#getId()
	 * @see #getBillableItem()
	 * @generated
	 */
	EAttribute getBillableItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.BillableItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.bodkink.hotel.business.model.BillableItem#getName()
	 * @see #getBillableItem()
	 * @generated
	 */
	EAttribute getBillableItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.BillableItem#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see com.bodkink.hotel.business.model.BillableItem#getPrice()
	 * @see #getBillableItem()
	 * @generated
	 */
	EAttribute getBillableItem_Price();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see com.bodkink.hotel.business.model.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Booking#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.Booking#getId()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Booking#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.bodkink.hotel.business.model.Booking#getNumber()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Number();

	/**
	 * Returns the meta object for the reference '{@link com.bodkink.hotel.business.model.Booking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see com.bodkink.hotel.business.model.Booking#getCustomer()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Customer();

	/**
	 * Returns the meta object for the reference list '{@link com.bodkink.hotel.business.model.Booking#getRoomReservation <em>Room Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Reservation</em>'.
	 * @see com.bodkink.hotel.business.model.Booking#getRoomReservation()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomReservation();

	/**
	 * Returns the meta object for the reference list '{@link com.bodkink.hotel.business.model.Booking#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service</em>'.
	 * @see com.bodkink.hotel.business.model.Booking#getService()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Service();

	/**
	 * Returns the meta object for the reference list '{@link com.bodkink.hotel.business.model.Booking#getBookingBill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booking Bill</em>'.
	 * @see com.bodkink.hotel.business.model.Booking#getBookingBill()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_BookingBill();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see com.bodkink.hotel.business.model.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Customer#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see com.bodkink.hotel.business.model.Customer#getPhone()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Phone();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Customer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see com.bodkink.hotel.business.model.Customer#getEmail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Email();

	/**
	 * Returns the meta object for the attribute list '{@link com.bodkink.hotel.business.model.Customer#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Notes</em>'.
	 * @see com.bodkink.hotel.business.model.Customer#getNotes()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Notes();

	/**
	 * Returns the meta object for the reference '{@link com.bodkink.hotel.business.model.Customer#getCardInformation <em>Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card Information</em>'.
	 * @see com.bodkink.hotel.business.model.Customer#getCardInformation()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_CardInformation();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see com.bodkink.hotel.business.model.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Person#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.Person#getId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see com.bodkink.hotel.business.model.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Person#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see com.bodkink.hotel.business.model.Person#getSurname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Surname();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Person#getBirthYear <em>Birth Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Year</em>'.
	 * @see com.bodkink.hotel.business.model.Person#getBirthYear()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthYear();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.RoomReservation <em>Room Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Reservation</em>'.
	 * @see com.bodkink.hotel.business.model.RoomReservation
	 * @generated
	 */
	EClass getRoomReservation();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.RoomReservation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.RoomReservation#getId()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EAttribute getRoomReservation_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.RoomReservation#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see com.bodkink.hotel.business.model.RoomReservation#getStartDate()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EAttribute getRoomReservation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.RoomReservation#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see com.bodkink.hotel.business.model.RoomReservation#getEndDate()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EAttribute getRoomReservation_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link com.bodkink.hotel.business.model.RoomReservation#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guest</em>'.
	 * @see com.bodkink.hotel.business.model.RoomReservation#getGuest()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation_Guest();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.RoomReservation#getRoomReservationType <em>Room Reservation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Reservation Type</em>'.
	 * @see com.bodkink.hotel.business.model.RoomReservation#getRoomReservationType()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EAttribute getRoomReservation_RoomReservationType();

	/**
	 * Returns the meta object for the reference '{@link com.bodkink.hotel.business.model.RoomReservation#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see com.bodkink.hotel.business.model.RoomReservation#getRoom()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation_Room();

	/**
	 * Returns the meta object for the reference '{@link com.bodkink.hotel.business.model.RoomReservation#getRoomBill <em>Room Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Bill</em>'.
	 * @see com.bodkink.hotel.business.model.RoomReservation#getRoomBill()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation_RoomBill();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.RoomReservation#getReservationStatusEnum <em>Reservation Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Status Enum</em>'.
	 * @see com.bodkink.hotel.business.model.RoomReservation#getReservationStatusEnum()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EAttribute getRoomReservation_ReservationStatusEnum();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see com.bodkink.hotel.business.model.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see com.bodkink.hotel.business.model.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Room#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.Room#getId()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Room#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.bodkink.hotel.business.model.Room#getNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Number();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Room#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.bodkink.hotel.business.model.Room#getDescription()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Room#getAllowedGuests <em>Allowed Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Guests</em>'.
	 * @see com.bodkink.hotel.business.model.Room#getAllowedGuests()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_AllowedGuests();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Room#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.bodkink.hotel.business.model.Room#getSize()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Room#getNightPrice <em>Night Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Night Price</em>'.
	 * @see com.bodkink.hotel.business.model.Room#getNightPrice()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_NightPrice();

	/**
	 * Returns the meta object for the attribute list '{@link com.bodkink.hotel.business.model.Room#getPictures <em>Pictures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pictures</em>'.
	 * @see com.bodkink.hotel.business.model.Room#getPictures()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Pictures();

	/**
	 * Returns the meta object for the reference '{@link com.bodkink.hotel.business.model.Room#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classification</em>'.
	 * @see com.bodkink.hotel.business.model.Room#getClassification()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Classification();

	/**
	 * Returns the meta object for the reference list '{@link com.bodkink.hotel.business.model.Room#getBedType <em>Bed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bed Type</em>'.
	 * @see com.bodkink.hotel.business.model.Room#getBedType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_BedType();

	/**
	 * Returns the meta object for the reference list '{@link com.bodkink.hotel.business.model.Room#getRoomExtra <em>Room Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Extra</em>'.
	 * @see com.bodkink.hotel.business.model.Room#getRoomExtra()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomExtra();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see com.bodkink.hotel.business.model.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Classification#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.Classification#getId()
	 * @see #getClassification()
	 * @generated
	 */
	EAttribute getClassification_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Classification#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.bodkink.hotel.business.model.Classification#getTitle()
	 * @see #getClassification()
	 * @generated
	 */
	EAttribute getClassification_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Classification#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.bodkink.hotel.business.model.Classification#getDescription()
	 * @see #getClassification()
	 * @generated
	 */
	EAttribute getClassification_Description();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.RoomExtra <em>Room Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Extra</em>'.
	 * @see com.bodkink.hotel.business.model.RoomExtra
	 * @generated
	 */
	EClass getRoomExtra();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.RoomExtra#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.RoomExtra#getId()
	 * @see #getRoomExtra()
	 * @generated
	 */
	EAttribute getRoomExtra_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.RoomExtra#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.bodkink.hotel.business.model.RoomExtra#getTitle()
	 * @see #getRoomExtra()
	 * @generated
	 */
	EAttribute getRoomExtra_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.RoomExtra#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.bodkink.hotel.business.model.RoomExtra#getDescription()
	 * @see #getRoomExtra()
	 * @generated
	 */
	EAttribute getRoomExtra_Description();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.RoomBill <em>Room Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Bill</em>'.
	 * @see com.bodkink.hotel.business.model.RoomBill
	 * @generated
	 */
	EClass getRoomBill();

	/**
	 * Returns the meta object for the reference list '{@link com.bodkink.hotel.business.model.RoomBill#getBillableItem <em>Billable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Billable Item</em>'.
	 * @see com.bodkink.hotel.business.model.RoomBill#getBillableItem()
	 * @see #getRoomBill()
	 * @generated
	 */
	EReference getRoomBill_BillableItem();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see com.bodkink.hotel.business.model.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Service#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.Service#getId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Service#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.bodkink.hotel.business.model.Service#getTitle()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.bodkink.hotel.business.model.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.Service#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see com.bodkink.hotel.business.model.Service#getPrice()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Price();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.BookingBill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Bill</em>'.
	 * @see com.bodkink.hotel.business.model.BookingBill
	 * @generated
	 */
	EClass getBookingBill();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.BookingBill#getBookingBillType <em>Booking Bill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Bill Type</em>'.
	 * @see com.bodkink.hotel.business.model.BookingBill#getBookingBillType()
	 * @see #getBookingBill()
	 * @generated
	 */
	EAttribute getBookingBill_BookingBillType();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.RoomExtraTemplate <em>Room Extra Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Extra Template</em>'.
	 * @see com.bodkink.hotel.business.model.RoomExtraTemplate
	 * @generated
	 */
	EClass getRoomExtraTemplate();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.RoomExtraTemplate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.RoomExtraTemplate#getId()
	 * @see #getRoomExtraTemplate()
	 * @generated
	 */
	EAttribute getRoomExtraTemplate_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.RoomExtraTemplate#getTemplateName <em>Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Name</em>'.
	 * @see com.bodkink.hotel.business.model.RoomExtraTemplate#getTemplateName()
	 * @see #getRoomExtraTemplate()
	 * @generated
	 */
	EAttribute getRoomExtraTemplate_TemplateName();

	/**
	 * Returns the meta object for the reference list '{@link com.bodkink.hotel.business.model.RoomExtraTemplate#getRoomExtra <em>Room Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Extra</em>'.
	 * @see com.bodkink.hotel.business.model.RoomExtraTemplate#getRoomExtra()
	 * @see #getRoomExtraTemplate()
	 * @generated
	 */
	EReference getRoomExtraTemplate_RoomExtra();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receipt</em>'.
	 * @see com.bodkink.hotel.business.model.Receipt
	 * @generated
	 */
	EClass getReceipt();

	/**
	 * Returns the meta object for the reference list '{@link com.bodkink.hotel.business.model.Receipt#getReceiptItem <em>Receipt Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receipt Item</em>'.
	 * @see com.bodkink.hotel.business.model.Receipt#getReceiptItem()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_ReceiptItem();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.ReceiptItem <em>Receipt Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receipt Item</em>'.
	 * @see com.bodkink.hotel.business.model.ReceiptItem
	 * @generated
	 */
	EClass getReceiptItem();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.UserAccount <em>User Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Account</em>'.
	 * @see com.bodkink.hotel.business.model.UserAccount
	 * @generated
	 */
	EClass getUserAccount();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.UserAccount#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.bodkink.hotel.business.model.UserAccount#getId()
	 * @see #getUserAccount()
	 * @generated
	 */
	EAttribute getUserAccount_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.UserAccount#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see com.bodkink.hotel.business.model.UserAccount#getUsername()
	 * @see #getUserAccount()
	 * @generated
	 */
	EAttribute getUserAccount_Username();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.UserAccount#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.bodkink.hotel.business.model.UserAccount#getPassword()
	 * @see #getUserAccount()
	 * @generated
	 */
	EAttribute getUserAccount_Password();

	/**
	 * Returns the meta object for class '{@link com.bodkink.hotel.business.model.CustomerUserAccount <em>Customer User Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer User Account</em>'.
	 * @see com.bodkink.hotel.business.model.CustomerUserAccount
	 * @generated
	 */
	EClass getCustomerUserAccount();

	/**
	 * Returns the meta object for the reference '{@link com.bodkink.hotel.business.model.CustomerUserAccount#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see com.bodkink.hotel.business.model.CustomerUserAccount#getCustomer()
	 * @see #getCustomerUserAccount()
	 * @generated
	 */
	EReference getCustomerUserAccount_Customer();

	/**
	 * Returns the meta object for the attribute '{@link com.bodkink.hotel.business.model.CustomerUserAccount#getUserGroupEnum <em>User Group Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Group Enum</em>'.
	 * @see com.bodkink.hotel.business.model.CustomerUserAccount#getUserGroupEnum()
	 * @see #getCustomerUserAccount()
	 * @generated
	 */
	EAttribute getCustomerUserAccount_UserGroupEnum();

	/**
	 * Returns the meta object for enum '{@link com.bodkink.hotel.business.model.BillStatusEnum <em>Bill Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bill Status Enum</em>'.
	 * @see com.bodkink.hotel.business.model.BillStatusEnum
	 * @generated
	 */
	EEnum getBillStatusEnum();

	/**
	 * Returns the meta object for enum '{@link com.bodkink.hotel.business.model.RoomReservationType <em>Room Reservation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Reservation Type</em>'.
	 * @see com.bodkink.hotel.business.model.RoomReservationType
	 * @generated
	 */
	EEnum getRoomReservationType();

	/**
	 * Returns the meta object for enum '{@link com.bodkink.hotel.business.model.ReservationStatusEnum <em>Reservation Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Status Enum</em>'.
	 * @see com.bodkink.hotel.business.model.ReservationStatusEnum
	 * @generated
	 */
	EEnum getReservationStatusEnum();

	/**
	 * Returns the meta object for enum '{@link com.bodkink.hotel.business.model.BookingBillType <em>Booking Bill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Booking Bill Type</em>'.
	 * @see com.bodkink.hotel.business.model.BookingBillType
	 * @generated
	 */
	EEnum getBookingBillType();

	/**
	 * Returns the meta object for enum '{@link com.bodkink.hotel.business.model.UserGroupEnum <em>User Group Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Group Enum</em>'.
	 * @see com.bodkink.hotel.business.model.UserGroupEnum
	 * @generated
	 */
	EEnum getUserGroupEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.AddressImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ID = eINSTANCE.getAddress_Id();

		/**
		 * The meta object literal for the '<em><b>Address Line1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ADDRESS_LINE1 = eINSTANCE.getAddress_AddressLine1();

		/**
		 * The meta object literal for the '<em><b>Address Line2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ADDRESS_LINE2 = eINSTANCE.getAddress_AddressLine2();

		/**
		 * The meta object literal for the '<em><b>Zip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ZIP_CODE = eINSTANCE.getAddress_ZipCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.BedTypeImpl <em>Bed Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.BedTypeImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBedType()
		 * @generated
		 */
		EClass BED_TYPE = eINSTANCE.getBedType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BED_TYPE__ID = eINSTANCE.getBedType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BED_TYPE__NAME = eINSTANCE.getBedType_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BED_TYPE__LENGTH = eINSTANCE.getBedType_Length();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BED_TYPE__WIDTH = eINSTANCE.getBedType_Width();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BED_TYPE__PLACES = eINSTANCE.getBedType_Places();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.BillImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__ID = eINSTANCE.getBill_Id();

		/**
		 * The meta object literal for the '<em><b>Bill Status Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__BILL_STATUS_ENUM = eINSTANCE.getBill_BillStatusEnum();

		/**
		 * The meta object literal for the '<em><b>Card Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__CARD_INFORMATION = eINSTANCE.getBill_CardInformation();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.CardInformationImpl <em>Card Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.CardInformationImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getCardInformation()
		 * @generated
		 */
		EClass CARD_INFORMATION = eINSTANCE.getCardInformation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_INFORMATION__ID = eINSTANCE.getCardInformation_Id();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_INFORMATION__CARD_NUMBER = eINSTANCE.getCardInformation_CardNumber();

		/**
		 * The meta object literal for the '<em><b>Card Holder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_INFORMATION__CARD_HOLDER_NAME = eINSTANCE.getCardInformation_CardHolderName();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_INFORMATION__EXPIRATION_DATE = eINSTANCE.getCardInformation_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_INFORMATION__ADDRESS = eINSTANCE.getCardInformation_Address();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.BillableItemImpl <em>Billable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.BillableItemImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBillableItem()
		 * @generated
		 */
		EClass BILLABLE_ITEM = eINSTANCE.getBillableItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLABLE_ITEM__ID = eINSTANCE.getBillableItem_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLABLE_ITEM__NAME = eINSTANCE.getBillableItem_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLABLE_ITEM__PRICE = eINSTANCE.getBillableItem_Price();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.BookingImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ID = eINSTANCE.getBooking_Id();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__NUMBER = eINSTANCE.getBooking_Number();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__CUSTOMER = eINSTANCE.getBooking_Customer();

		/**
		 * The meta object literal for the '<em><b>Room Reservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM_RESERVATION = eINSTANCE.getBooking_RoomReservation();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__SERVICE = eINSTANCE.getBooking_Service();

		/**
		 * The meta object literal for the '<em><b>Booking Bill</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__BOOKING_BILL = eINSTANCE.getBooking_BookingBill();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.CustomerImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PHONE = eINSTANCE.getCustomer_Phone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_Email();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NOTES = eINSTANCE.getCustomer_Notes();

		/**
		 * The meta object literal for the '<em><b>Card Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__CARD_INFORMATION = eINSTANCE.getCustomer_CardInformation();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.PersonImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ID = eINSTANCE.getPerson_Id();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SURNAME = eINSTANCE.getPerson_Surname();

		/**
		 * The meta object literal for the '<em><b>Birth Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_YEAR = eINSTANCE.getPerson_BirthYear();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.RoomReservationImpl <em>Room Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.RoomReservationImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoomReservation()
		 * @generated
		 */
		EClass ROOM_RESERVATION = eINSTANCE.getRoomReservation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESERVATION__ID = eINSTANCE.getRoomReservation_Id();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESERVATION__START_DATE = eINSTANCE.getRoomReservation_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESERVATION__END_DATE = eINSTANCE.getRoomReservation_EndDate();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_RESERVATION__GUEST = eINSTANCE.getRoomReservation_Guest();

		/**
		 * The meta object literal for the '<em><b>Room Reservation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESERVATION__ROOM_RESERVATION_TYPE = eINSTANCE.getRoomReservation_RoomReservationType();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_RESERVATION__ROOM = eINSTANCE.getRoomReservation_Room();

		/**
		 * The meta object literal for the '<em><b>Room Bill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_RESERVATION__ROOM_BILL = eINSTANCE.getRoomReservation_RoomBill();

		/**
		 * The meta object literal for the '<em><b>Reservation Status Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESERVATION__RESERVATION_STATUS_ENUM = eINSTANCE.getRoomReservation_ReservationStatusEnum();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.GuestImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.RoomImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ID = eINSTANCE.getRoom_Id();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NUMBER = eINSTANCE.getRoom_Number();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__DESCRIPTION = eINSTANCE.getRoom_Description();

		/**
		 * The meta object literal for the '<em><b>Allowed Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ALLOWED_GUESTS = eINSTANCE.getRoom_AllowedGuests();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__SIZE = eINSTANCE.getRoom_Size();

		/**
		 * The meta object literal for the '<em><b>Night Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NIGHT_PRICE = eINSTANCE.getRoom_NightPrice();

		/**
		 * The meta object literal for the '<em><b>Pictures</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__PICTURES = eINSTANCE.getRoom_Pictures();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__CLASSIFICATION = eINSTANCE.getRoom_Classification();

		/**
		 * The meta object literal for the '<em><b>Bed Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__BED_TYPE = eINSTANCE.getRoom_BedType();

		/**
		 * The meta object literal for the '<em><b>Room Extra</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOM_EXTRA = eINSTANCE.getRoom_RoomExtra();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.ClassificationImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION__ID = eINSTANCE.getClassification_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION__TITLE = eINSTANCE.getClassification_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION__DESCRIPTION = eINSTANCE.getClassification_Description();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.RoomExtraImpl <em>Room Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.RoomExtraImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoomExtra()
		 * @generated
		 */
		EClass ROOM_EXTRA = eINSTANCE.getRoomExtra();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EXTRA__ID = eINSTANCE.getRoomExtra_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EXTRA__TITLE = eINSTANCE.getRoomExtra_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EXTRA__DESCRIPTION = eINSTANCE.getRoomExtra_Description();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.RoomBillImpl <em>Room Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.RoomBillImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoomBill()
		 * @generated
		 */
		EClass ROOM_BILL = eINSTANCE.getRoomBill();

		/**
		 * The meta object literal for the '<em><b>Billable Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BILL__BILLABLE_ITEM = eINSTANCE.getRoomBill_BillableItem();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.ServiceImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ID = eINSTANCE.getService_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TITLE = eINSTANCE.getService_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PRICE = eINSTANCE.getService_Price();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.BookingBillImpl <em>Booking Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.BookingBillImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBookingBill()
		 * @generated
		 */
		EClass BOOKING_BILL = eINSTANCE.getBookingBill();

		/**
		 * The meta object literal for the '<em><b>Booking Bill Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_BILL__BOOKING_BILL_TYPE = eINSTANCE.getBookingBill_BookingBillType();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.RoomExtraTemplateImpl <em>Room Extra Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.RoomExtraTemplateImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoomExtraTemplate()
		 * @generated
		 */
		EClass ROOM_EXTRA_TEMPLATE = eINSTANCE.getRoomExtraTemplate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EXTRA_TEMPLATE__ID = eINSTANCE.getRoomExtraTemplate_Id();

		/**
		 * The meta object literal for the '<em><b>Template Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EXTRA_TEMPLATE__TEMPLATE_NAME = eINSTANCE.getRoomExtraTemplate_TemplateName();

		/**
		 * The meta object literal for the '<em><b>Room Extra</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EXTRA_TEMPLATE__ROOM_EXTRA = eINSTANCE.getRoomExtraTemplate_RoomExtra();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.ReceiptImpl <em>Receipt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.ReceiptImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getReceipt()
		 * @generated
		 */
		EClass RECEIPT = eINSTANCE.getReceipt();

		/**
		 * The meta object literal for the '<em><b>Receipt Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__RECEIPT_ITEM = eINSTANCE.getReceipt_ReceiptItem();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.ReceiptItemImpl <em>Receipt Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.ReceiptItemImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getReceiptItem()
		 * @generated
		 */
		EClass RECEIPT_ITEM = eINSTANCE.getReceiptItem();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.UserAccountImpl <em>User Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.UserAccountImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getUserAccount()
		 * @generated
		 */
		EClass USER_ACCOUNT = eINSTANCE.getUserAccount();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ACCOUNT__ID = eINSTANCE.getUserAccount_Id();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ACCOUNT__USERNAME = eINSTANCE.getUserAccount_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ACCOUNT__PASSWORD = eINSTANCE.getUserAccount_Password();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.impl.CustomerUserAccountImpl <em>Customer User Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.impl.CustomerUserAccountImpl
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getCustomerUserAccount()
		 * @generated
		 */
		EClass CUSTOMER_USER_ACCOUNT = eINSTANCE.getCustomerUserAccount();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_USER_ACCOUNT__CUSTOMER = eINSTANCE.getCustomerUserAccount_Customer();

		/**
		 * The meta object literal for the '<em><b>User Group Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_USER_ACCOUNT__USER_GROUP_ENUM = eINSTANCE.getCustomerUserAccount_UserGroupEnum();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.BillStatusEnum <em>Bill Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.BillStatusEnum
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBillStatusEnum()
		 * @generated
		 */
		EEnum BILL_STATUS_ENUM = eINSTANCE.getBillStatusEnum();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.RoomReservationType <em>Room Reservation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.RoomReservationType
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getRoomReservationType()
		 * @generated
		 */
		EEnum ROOM_RESERVATION_TYPE = eINSTANCE.getRoomReservationType();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.ReservationStatusEnum <em>Reservation Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.ReservationStatusEnum
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getReservationStatusEnum()
		 * @generated
		 */
		EEnum RESERVATION_STATUS_ENUM = eINSTANCE.getReservationStatusEnum();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.BookingBillType <em>Booking Bill Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.BookingBillType
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getBookingBillType()
		 * @generated
		 */
		EEnum BOOKING_BILL_TYPE = eINSTANCE.getBookingBillType();

		/**
		 * The meta object literal for the '{@link com.bodkink.hotel.business.model.UserGroupEnum <em>User Group Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bodkink.hotel.business.model.UserGroupEnum
		 * @see com.bodkink.hotel.business.model.impl.ModelPackageImpl#getUserGroupEnum()
		 * @generated
		 */
		EEnum USER_GROUP_ENUM = eINSTANCE.getUserGroupEnum();

	}

} //ModelPackage
