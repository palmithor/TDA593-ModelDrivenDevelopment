/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.BillingManagement;
import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.IBookingBillService;
import com.bodkink.hotel.persistence.IRoomBillService;
import com.bodkink.hotel.persistence.IRoomReservationService;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billing Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BillingManagementImpl extends MinimalEObjectImpl.Container implements BillingManagement {

	@Inject
	IRoomReservationService roomReservationService;

	@Inject
	IRoomBillService roomBillService;

	@Inject
	IBookingBillService bookingBillService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.BILLING_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomBill createRoomBill(RoomReservation roomReservation) {
		if (roomReservation.getRoomBill() == null) {

			RoomBill bill = ModelFactory.eINSTANCE.createRoomBill();
			bill.setBillStatusEnum(BillStatusEnum.NOT_PAID);

			roomReservation.setRoomBill(bill);

			roomReservationService.persist(ModelToEntityConverter.convertRoomReservation(roomReservation));

			return bill;

		} else {
			return roomReservation.getRoomBill();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BookingBill createBookingBill(Booking booking, BookingBillType bookingBillType) {
		BookingBill bill = ModelFactory.eINSTANCE.createBookingBill();
		bill.setBookingBillType(bookingBillType);
		bill.setBillStatusEnum(BillStatusEnum.NOT_PAID);
		bill.setCardInformation(booking.getCustomer().getCardInformation());

		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addBillableItem(RoomBill roomBill, BillableItem item, int quantity) {
		if(roomBill.getBillStatusEnum().equals(BillStatusEnum.NOT_PAID) && quantity > 0){

			for (int i = 1; i <= quantity; i++) {
				roomBill.getBillableItem().add(item);
			}
			roomBillService.persist(ModelToEntityConverter.convertRoomBill(roomBill));

			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBill findRoomBill(String roomReservationId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makePayment(RoomBill bill, CardInformation cardInformation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receipt> generateReceipts(Booking booking) {
		EList<Receipt> rList = new BasicEList<Receipt>();

		for( RoomReservation RoomRes: booking.getRoomReservation()){
			rList.add(generateReceipt(RoomRes.getRoomBill()));
		}

		// TODO: include services in the booking?
		return rList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt generateReceipt(RoomBill bill) {
		Receipt receipt = ModelFactory.eINSTANCE.createReceipt();
		EList<ReceiptItem> items = receipt.getReceiptItem();

		if (bill instanceof RoomBill){
			RoomBill rBill = (RoomBill)bill;
			for ( BillableItem item: rBill.getBillableItem()){


			}
		}
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makePayment(RoomBill bill, Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makePayment(Booking booking) {
		booking.getBookingBill();


		double amount = 0;

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void markPaid(Bill bill) {
		bill.setBillStatusEnum(BillStatusEnum.PAID);

		if (bill instanceof RoomBill) {
			roomBillService.persist(ModelToEntityConverter.convertRoomBill((RoomBill)bill));
		} else if (bill instanceof BookingBill) {
			bookingBillService.persist(ModelToEntityConverter.convertBookingBill((BookingBill)bill));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.BILLING_MANAGEMENT___CREATE_ROOM_BILL__ROOMRESERVATION:
				return createRoomBill((RoomReservation)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___CREATE_BOOKING_BILL__BOOKING_BOOKINGBILLTYPE:
				return createBookingBill((Booking)arguments.get(0), (BookingBillType)arguments.get(1));
			case LogicPackage.BILLING_MANAGEMENT___ADD_BILLABLE_ITEM__ROOMBILL_BILLABLEITEM_INT:
				return addBillableItem((RoomBill)arguments.get(0), (BillableItem)arguments.get(1), (Integer)arguments.get(2));
			case LogicPackage.BILLING_MANAGEMENT___FIND_ROOM_BILL__STRING:
				return findRoomBill((String)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___MAKE_PAYMENT__ROOMBILL_CARDINFORMATION:
				return makePayment((RoomBill)arguments.get(0), (CardInformation)arguments.get(1));
			case LogicPackage.BILLING_MANAGEMENT___GENERATE_RECEIPTS__BOOKING:
				return generateReceipts((Booking)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___GENERATE_RECEIPT__ROOMBILL:
				return generateReceipt((RoomBill)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___MAKE_PAYMENT__ROOMBILL_CUSTOMER:
				return makePayment((RoomBill)arguments.get(0), (Customer)arguments.get(1));
			case LogicPackage.BILLING_MANAGEMENT___MAKE_PAYMENT__BOOKING:
				return makePayment((Booking)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___MARK_PAID__BILL:
				markPaid((Bill)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/*
	Private method that actually handles payments. Called from all public makePayment methods.
	 */
	private boolean makePayment(CardInformation cInf, double amount){
		boolean success = false;
		try {
			success = CustomerRequires.instance().makePayment(cInf.getCcNumber(), cInf.getCcv(), cInf.getExpiryMonth(),
					cInf.getExpiryYear(), cInf.getFirstName(), cInf.getLastName(), amount);

		} catch (javax.xml.soap.SOAPException e){
			return false;
		}
		return success;
	}

	/*
	Get the total decimal price for a room bill.
	 */
	private double getRoomBillPrice(RoomBill rBill){
		BigDecimal amount = BigDecimal.ZERO;
		for (BillableItem item: rBill.getBillableItem()){
			amount = amount.add(item.getPrice());
		}
		return amount.doubleValue();
	}


} //BillingManagementImpl
