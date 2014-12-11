/**
 */
package com.bodkink.hotel.business.model.impl;

import com.bodkink.hotel.business.model.Guest;
import com.bodkink.hotel.business.model.ModelPackage;
import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomBill;
import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.business.model.RoomReservationType;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.impl.RoomReservationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.RoomReservationImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.RoomReservationImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.RoomReservationImpl#getRoomReservationType <em>Room Reservation Type</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.RoomReservationImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.RoomReservationImpl#getRoomBill <em>Room Bill</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.RoomReservationImpl#getReservationStatusEnum <em>Reservation Status Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomReservationImpl extends MinimalEObjectImpl.Container implements RoomReservation {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuest() <em>Guest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuest()
	 * @generated
	 * @ordered
	 */
	protected EList<Guest> guest;

	/**
	 * The cached value of the '{@link #getRoomReservationType() <em>Room Reservation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomReservationType()
	 * @generated
	 * @ordered
	 */
	protected RoomReservationType roomReservationType;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The cached value of the '{@link #getRoomBill() <em>Room Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomBill()
	 * @generated
	 * @ordered
	 */
	protected RoomBill roomBill;

	/**
	 * The default value of the '{@link #getReservationStatusEnum() <em>Reservation Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationStatusEnum()
	 * @generated
	 * @ordered
	 */
	protected static final ReservationStatusEnum RESERVATION_STATUS_ENUM_EDEFAULT = ReservationStatusEnum.CHECKED_IN;

	/**
	 * The cached value of the '{@link #getReservationStatusEnum() <em>Reservation Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationStatusEnum()
	 * @generated
	 * @ordered
	 */
	protected ReservationStatusEnum reservationStatusEnum = RESERVATION_STATUS_ENUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROOM_RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_RESERVATION__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_RESERVATION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guest> getGuest() {
		if (guest == null) {
			guest = new EObjectResolvingEList<Guest>(Guest.class, this, ModelPackage.ROOM_RESERVATION__GUEST);
		}
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomReservationType getRoomReservationType() {
		if (roomReservationType != null && roomReservationType.eIsProxy()) {
			InternalEObject oldRoomReservationType = (InternalEObject)roomReservationType;
			roomReservationType = (RoomReservationType)eResolveProxy(oldRoomReservationType);
			if (roomReservationType != oldRoomReservationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ROOM_RESERVATION__ROOM_RESERVATION_TYPE, oldRoomReservationType, roomReservationType));
			}
		}
		return roomReservationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomReservationType basicGetRoomReservationType() {
		return roomReservationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomReservationType(RoomReservationType newRoomReservationType) {
		RoomReservationType oldRoomReservationType = roomReservationType;
		roomReservationType = newRoomReservationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_RESERVATION__ROOM_RESERVATION_TYPE, oldRoomReservationType, roomReservationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ROOM_RESERVATION__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_RESERVATION__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBill getRoomBill() {
		if (roomBill != null && roomBill.eIsProxy()) {
			InternalEObject oldRoomBill = (InternalEObject)roomBill;
			roomBill = (RoomBill)eResolveProxy(oldRoomBill);
			if (roomBill != oldRoomBill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ROOM_RESERVATION__ROOM_BILL, oldRoomBill, roomBill));
			}
		}
		return roomBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBill basicGetRoomBill() {
		return roomBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomBill(RoomBill newRoomBill) {
		RoomBill oldRoomBill = roomBill;
		roomBill = newRoomBill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_RESERVATION__ROOM_BILL, oldRoomBill, roomBill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationStatusEnum getReservationStatusEnum() {
		return reservationStatusEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationStatusEnum(ReservationStatusEnum newReservationStatusEnum) {
		ReservationStatusEnum oldReservationStatusEnum = reservationStatusEnum;
		reservationStatusEnum = newReservationStatusEnum == null ? RESERVATION_STATUS_ENUM_EDEFAULT : newReservationStatusEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_RESERVATION__RESERVATION_STATUS_ENUM, oldReservationStatusEnum, reservationStatusEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ROOM_RESERVATION__START_DATE:
				return getStartDate();
			case ModelPackage.ROOM_RESERVATION__END_DATE:
				return getEndDate();
			case ModelPackage.ROOM_RESERVATION__GUEST:
				return getGuest();
			case ModelPackage.ROOM_RESERVATION__ROOM_RESERVATION_TYPE:
				if (resolve) return getRoomReservationType();
				return basicGetRoomReservationType();
			case ModelPackage.ROOM_RESERVATION__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case ModelPackage.ROOM_RESERVATION__ROOM_BILL:
				if (resolve) return getRoomBill();
				return basicGetRoomBill();
			case ModelPackage.ROOM_RESERVATION__RESERVATION_STATUS_ENUM:
				return getReservationStatusEnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ROOM_RESERVATION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ModelPackage.ROOM_RESERVATION__END_DATE:
				setEndDate((Date)newValue);
				return;
			case ModelPackage.ROOM_RESERVATION__GUEST:
				getGuest().clear();
				getGuest().addAll((Collection<? extends Guest>)newValue);
				return;
			case ModelPackage.ROOM_RESERVATION__ROOM_RESERVATION_TYPE:
				setRoomReservationType((RoomReservationType)newValue);
				return;
			case ModelPackage.ROOM_RESERVATION__ROOM:
				setRoom((Room)newValue);
				return;
			case ModelPackage.ROOM_RESERVATION__ROOM_BILL:
				setRoomBill((RoomBill)newValue);
				return;
			case ModelPackage.ROOM_RESERVATION__RESERVATION_STATUS_ENUM:
				setReservationStatusEnum((ReservationStatusEnum)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ROOM_RESERVATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ModelPackage.ROOM_RESERVATION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ModelPackage.ROOM_RESERVATION__GUEST:
				getGuest().clear();
				return;
			case ModelPackage.ROOM_RESERVATION__ROOM_RESERVATION_TYPE:
				setRoomReservationType((RoomReservationType)null);
				return;
			case ModelPackage.ROOM_RESERVATION__ROOM:
				setRoom((Room)null);
				return;
			case ModelPackage.ROOM_RESERVATION__ROOM_BILL:
				setRoomBill((RoomBill)null);
				return;
			case ModelPackage.ROOM_RESERVATION__RESERVATION_STATUS_ENUM:
				setReservationStatusEnum(RESERVATION_STATUS_ENUM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ROOM_RESERVATION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case ModelPackage.ROOM_RESERVATION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case ModelPackage.ROOM_RESERVATION__GUEST:
				return guest != null && !guest.isEmpty();
			case ModelPackage.ROOM_RESERVATION__ROOM_RESERVATION_TYPE:
				return roomReservationType != null;
			case ModelPackage.ROOM_RESERVATION__ROOM:
				return room != null;
			case ModelPackage.ROOM_RESERVATION__ROOM_BILL:
				return roomBill != null;
			case ModelPackage.ROOM_RESERVATION__RESERVATION_STATUS_ENUM:
				return reservationStatusEnum != RESERVATION_STATUS_ENUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", reservationStatusEnum: ");
		result.append(reservationStatusEnum);
		result.append(')');
		return result.toString();
	}

} //RoomReservationImpl
