/**
 */
package business.model.impl;

import business.model.Booking;
import business.model.BookingBill;
import business.model.Customer;
import business.model.ModelPackage;
import business.model.RoomReservation;
import business.model.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link business.model.impl.BookingImpl#getId <em>Id</em>}</li>
 *   <li>{@link business.model.impl.BookingImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link business.model.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link business.model.impl.BookingImpl#getRoomReservation <em>Room Reservation</em>}</li>
 *   <li>{@link business.model.impl.BookingImpl#getService <em>Service</em>}</li>
 *   <li>{@link business.model.impl.BookingImpl#getBookingBill <em>Booking Bill</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final double NUMBER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected double number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getRoomReservation() <em>Room Reservation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomReservation()
	 * @generated
	 * @ordered
	 */
	protected EList roomReservation;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList service;

	/**
	 * The cached value of the '{@link #getBookingBill() <em>Booking Bill</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingBill()
	 * @generated
	 * @ordered
	 */
	protected EList bookingBill;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(double newNumber) {
		double oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BOOKING__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoomReservation() {
		if (roomReservation == null) {
			roomReservation = new EObjectResolvingEList(RoomReservation.class, this, ModelPackage.BOOKING__ROOM_RESERVATION);
		}
		return roomReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getService() {
		if (service == null) {
			service = new EObjectResolvingEList(Service.class, this, ModelPackage.BOOKING__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBookingBill() {
		if (bookingBill == null) {
			bookingBill = new EObjectResolvingEList(BookingBill.class, this, ModelPackage.BOOKING__BOOKING_BILL);
		}
		return bookingBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BOOKING__ID:
				return getId();
			case ModelPackage.BOOKING__NUMBER:
				return new Double(getNumber());
			case ModelPackage.BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ModelPackage.BOOKING__ROOM_RESERVATION:
				return getRoomReservation();
			case ModelPackage.BOOKING__SERVICE:
				return getService();
			case ModelPackage.BOOKING__BOOKING_BILL:
				return getBookingBill();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BOOKING__ID:
				setId((String)newValue);
				return;
			case ModelPackage.BOOKING__NUMBER:
				setNumber(((Double)newValue).doubleValue());
				return;
			case ModelPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ModelPackage.BOOKING__ROOM_RESERVATION:
				getRoomReservation().clear();
				getRoomReservation().addAll((Collection)newValue);
				return;
			case ModelPackage.BOOKING__SERVICE:
				getService().clear();
				getService().addAll((Collection)newValue);
				return;
			case ModelPackage.BOOKING__BOOKING_BILL:
				getBookingBill().clear();
				getBookingBill().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.BOOKING__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.BOOKING__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case ModelPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ModelPackage.BOOKING__ROOM_RESERVATION:
				getRoomReservation().clear();
				return;
			case ModelPackage.BOOKING__SERVICE:
				getService().clear();
				return;
			case ModelPackage.BOOKING__BOOKING_BILL:
				getBookingBill().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.BOOKING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.BOOKING__NUMBER:
				return number != NUMBER_EDEFAULT;
			case ModelPackage.BOOKING__CUSTOMER:
				return customer != null;
			case ModelPackage.BOOKING__ROOM_RESERVATION:
				return roomReservation != null && !roomReservation.isEmpty();
			case ModelPackage.BOOKING__SERVICE:
				return service != null && !service.isEmpty();
			case ModelPackage.BOOKING__BOOKING_BILL:
				return bookingBill != null && !bookingBill.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
