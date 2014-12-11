/**
 */
package com.bodkink.hotel.business.model.impl;

import com.bodkink.hotel.business.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.ADDRESS: return createAddress();
			case ModelPackage.BED_TYPE: return createBedType();
			case ModelPackage.BILL: return createBill();
			case ModelPackage.CARD_INFORMATION: return createCardInformation();
			case ModelPackage.BILLABLE_ITEM: return createBillableItem();
			case ModelPackage.BOOKING: return createBooking();
			case ModelPackage.CUSTOMER: return createCustomer();
			case ModelPackage.PERSON: return createPerson();
			case ModelPackage.ROOM_RESERVATION: return createRoomReservation();
			case ModelPackage.GUEST: return createGuest();
			case ModelPackage.ROOM_RESERVATION_TYPE: return createRoomReservationType();
			case ModelPackage.ROOM: return createRoom();
			case ModelPackage.CLASSIFICATION: return createClassification();
			case ModelPackage.ROOM_EXTRA: return createRoomExtra();
			case ModelPackage.ROOM_BILL: return createRoomBill();
			case ModelPackage.SERVICE: return createService();
			case ModelPackage.BOOKING_BILL: return createBookingBill();
			case ModelPackage.ROOM_EXTRA_TEMPLATE: return createRoomExtraTemplate();
			case ModelPackage.RECEIPT: return createReceipt();
			case ModelPackage.RECEIPT_ITEM: return createReceiptItem();
			case ModelPackage.USER_ACCOUNT: return createUserAccount();
			case ModelPackage.CUSTOMER_USER_ACCOUNT: return createCustomerUserAccount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.BILL_STATUS_ENUM:
				return createBillStatusEnumFromString(eDataType, initialValue);
			case ModelPackage.RESERVATION_STATUS_ENUM:
				return createReservationStatusEnumFromString(eDataType, initialValue);
			case ModelPackage.BOOKING_BILL_TYPE:
				return createBookingBillTypeFromString(eDataType, initialValue);
			case ModelPackage.USER_GROUP_ENUM:
				return createUserGroupEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.BILL_STATUS_ENUM:
				return convertBillStatusEnumToString(eDataType, instanceValue);
			case ModelPackage.RESERVATION_STATUS_ENUM:
				return convertReservationStatusEnumToString(eDataType, instanceValue);
			case ModelPackage.BOOKING_BILL_TYPE:
				return convertBookingBillTypeToString(eDataType, instanceValue);
			case ModelPackage.USER_GROUP_ENUM:
				return convertUserGroupEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedType createBedType() {
		BedTypeImpl bedType = new BedTypeImpl();
		return bedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardInformation createCardInformation() {
		CardInformationImpl cardInformation = new CardInformationImpl();
		return cardInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillableItem createBillableItem() {
		BillableItemImpl billableItem = new BillableItemImpl();
		return billableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomReservation createRoomReservation() {
		RoomReservationImpl roomReservation = new RoomReservationImpl();
		return roomReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomReservationType createRoomReservationType() {
		RoomReservationTypeImpl roomReservationType = new RoomReservationTypeImpl();
		return roomReservationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification createClassification() {
		ClassificationImpl classification = new ClassificationImpl();
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExtra createRoomExtra() {
		RoomExtraImpl roomExtra = new RoomExtraImpl();
		return roomExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBill createRoomBill() {
		RoomBillImpl roomBill = new RoomBillImpl();
		return roomBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingBill createBookingBill() {
		BookingBillImpl bookingBill = new BookingBillImpl();
		return bookingBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExtraTemplate createRoomExtraTemplate() {
		RoomExtraTemplateImpl roomExtraTemplate = new RoomExtraTemplateImpl();
		return roomExtraTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt createReceipt() {
		ReceiptImpl receipt = new ReceiptImpl();
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiptItem createReceiptItem() {
		ReceiptItemImpl receiptItem = new ReceiptItemImpl();
		return receiptItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAccount createUserAccount() {
		UserAccountImpl userAccount = new UserAccountImpl();
		return userAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerUserAccount createCustomerUserAccount() {
		CustomerUserAccountImpl customerUserAccount = new CustomerUserAccountImpl();
		return customerUserAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillStatusEnum createBillStatusEnumFromString(EDataType eDataType, String initialValue) {
		BillStatusEnum result = BillStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBillStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationStatusEnum createReservationStatusEnumFromString(EDataType eDataType, String initialValue) {
		ReservationStatusEnum result = ReservationStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingBillType createBookingBillTypeFromString(EDataType eDataType, String initialValue) {
		BookingBillType result = BookingBillType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookingBillTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGroupEnum createUserGroupEnumFromString(EDataType eDataType, String initialValue) {
		UserGroupEnum result = UserGroupEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserGroupEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
