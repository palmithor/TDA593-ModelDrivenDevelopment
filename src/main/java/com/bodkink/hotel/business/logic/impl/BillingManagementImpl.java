/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.BillingManagement;
import com.bodkink.hotel.business.logic.LogicPackage;

import com.bodkink.hotel.business.model.*;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
	 * @generated NOT
	 */
	public boolean makePayment(RoomBill bill, CardInformation cardInformation) {

		return makePayment(cardInformation, getRoomBillPrice(bill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Receipt> generateReceipts(Booking booking) {
		EList<Receipt> rList = new BasicEList<Receipt>();
		Receipt rooms = ModelFactory.eINSTANCE.createReceipt();

		for( RoomReservation roomRes: booking.getRoomReservation()){
			if (roomRes.getRoomBill() != null) {
				rList.add(generateReceipt(roomRes.getRoomBill()));
			}

			// Add nights and price for this roomRes
			ReceiptItem tmpItem = ModelFactory.eINSTANCE.createReceiptItem();
			tmpItem.setTitle("Room: " + roomRes.getRoom().getNumber());
			tmpItem.setDescription("From: " + roomRes.getStartDate() + " To: " + roomRes.getEndDate());
			tmpItem.setPrice(roomRes.getRoom().getNightPrice());
			tmpItem.setQuantity((int)daysBetween(roomRes.getStartDate(), roomRes.getEndDate()));
			rooms.getReceiptItem().add(tmpItem);
		}
		rList.add(rooms);

		return rList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Receipt generateReceipt(RoomBill bill) {
		Receipt receipt = ModelFactory.eINSTANCE.createReceipt();

		Map<BillableItem, Integer> map = new HashMap<>();

		for ( BillableItem item: bill.getBillableItem()){

			if (map.containsKey(item)){
				map.replace(item, map.get(item), map.get(item) + 1);
			} else {
				map.put(item, 1);
			}
		}

		for (Map.Entry<BillableItem, Integer> entry : map.entrySet()){
			ReceiptItem tmpItem = ModelFactory.eINSTANCE.createReceiptItem();
			tmpItem.setTitle(entry.getKey().getName());
			tmpItem.setPrice(entry.getKey().getPrice());
			tmpItem.setQuantity(entry.getValue());

			receipt.getReceiptItem().add(tmpItem);
		}
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean makePayment(RoomBill bill, Customer customer) {

		return makePayment(customer.getCardInformation(), getRoomBillPrice(bill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean makePayment(Booking booking) {
		BookingBill bill = null;

		// Find the finalize bill
		for (BookingBill b: booking.getBookingBill()){
			if (b.getBookingBillType() == BookingBillType.FINALIZE){
				bill = b;
			}
		}
		// If booking alr paid return false
		if (bill.getBillStatusEnum() == BillStatusEnum.PAID){
			return false;
		}

		BigDecimal amount = BigDecimal.ZERO;

		// Add all unpaid room reservations to the bill
		for (RoomReservation room: booking.getRoomReservation()){
			if (room.getRoomBill() != null && room.getRoomBill().getBillStatusEnum() != BillStatusEnum.PAID) {
				// amount = amount + RommBill price
				amount = amount.add(getRoomBillPrice(room.getRoomBill()));
			}

			// amount = amount + price*nights
			amount = amount.add(room.getRoom().getNightPrice().multiply(new BigDecimal(daysBetween(room.getStartDate(), room.getEndDate()))));
		}

		// Make the payment and if success save new bill info.
		boolean paid =  makePayment(booking.getCustomer().getCardInformation(), amount);
		if (paid){
			bill.setBillStatusEnum(BillStatusEnum.PAID);
			bookingBillService.persist(ModelToEntityConverter.convertBookingBill(bill));
			for (RoomReservation room: booking.getRoomReservation()){
				if (room.getRoomBill() != null && room.getRoomBill().getBillStatusEnum() != BillStatusEnum.PAID) {
					room.getRoomBill().setBillStatusEnum(BillStatusEnum.PAID);
					roomBillService.persist(ModelToEntityConverter.convertRoomBill(room.getRoomBill()));
				}
			}
		}
		return paid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
	private boolean makePayment(CardInformation c, BigDecimal amount){
		boolean success = false;
		try {
			success = CustomerRequires.instance().makePayment(c.getCcNumber(), c.getCcv(), c.getExpiryMonth(),
					c.getExpiryYear(), c.getFirstName(), c.getLastName(), amount.doubleValue());

		} catch (javax.xml.soap.SOAPException e){
			return false;
		}
		return success;
	}

	/*
	Get the total price for a room bill.
	 */
	private BigDecimal getRoomBillPrice(RoomBill rBill){
		if (rBill == null) {
			return BigDecimal.ZERO;
		}
		BigDecimal amount = BigDecimal.ZERO;
		for (BillableItem item: rBill.getBillableItem()){
			amount = amount.add(item.getPrice());
		}
		return amount;
	}

	/*
	Safely find the number of days between 2 dates.
	 */
	private long daysBetween(Date startDate, Date endDate) {
		Calendar s = Calendar.getInstance();
		s.setTime(startDate);
		Calendar e = Calendar.getInstance();
		e.setTime(endDate);

		long daysBetween = 0;
		while (s.before(e)) {
			s.add(Calendar.DAY_OF_MONTH, 1);
			daysBetween++;
		}
		return daysBetween;
	}


} //BillingManagementImpl
