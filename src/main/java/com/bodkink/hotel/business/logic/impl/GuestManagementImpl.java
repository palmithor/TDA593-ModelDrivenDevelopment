/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.IBillingManagement;
import com.bodkink.hotel.business.logic.GuestManagement;
import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.Guest;
import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.RoomReservation;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GuestManagementImpl extends MinimalEObjectImpl.Container implements GuestManagement {
    private static final Logger logger = LoggerFactory.getLogger(GuestManagementImpl.class);
    @Inject
    IBillingManagement billManager;
    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.GUEST_MANAGEMENT;
	}

    /**
     * Check out the customer and charge the customer for the stay.
     * @param booking
     * @return true on successful check out, otherwise false.
     */
	public boolean checkOut(Booking booking) {
        if(booking == null || !rdyForCheckOut(booking)){
            logger.error("Booking not ready for check out.");
            return false;
        }
        // TODO create bill for the stay. (Comment on this in the report), this will not allow the guest to pay whenever
        // Try to pay all remaining bills.
        if(!billManager.makePayment(booking)){
            logger.error("Booking payment failed.");
            return false;
        }

        return checkOutCustomer(booking);
	}

    /**
     * Check if all guests have checked out.
     * @param booking
     * @return
     */
    private boolean rdyForCheckOut(final Booking booking){
        boolean foundCustomer = false;
        for (RoomReservation reservation : booking.getRoomReservation()) {
            if(reservation.getReservationStatusEnum() == ReservationStatusEnum.CHECKED_IN) {
                for (Guest guest : reservation.getGuest()) {
                    if (guest.getId().equals(booking.getCustomer().getId()))
                        foundCustomer = true;
                }
                if (!foundCustomer) {
                    logger.error("Not all guests have been checked out from the booking.");
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Check out customer from room reservation.
     * @param booking
     * @return
     */
    private boolean checkOutCustomer(final Booking booking){
        // find customer room reservation and check out.

        for (RoomReservation reservation : booking.getRoomReservation()){
            if(reservation.getReservationStatusEnum() == ReservationStatusEnum.CHECKED_IN) {
                for (Guest guest : reservation.getGuest()) {
                    if (guest.getId().equals(booking.getCustomer().getId()))
                        return checkOut(reservation);
                }
            }
        }
        logger.error("The customer is not  checked in to any room in the booking");
        return false;
    }

    /**
     * Check guest/customer in to room.
     * @param roomReservation
     * @param guests
     * @return true on successful check in, otherwise false.
     */
	public boolean checkIn(RoomReservation roomReservation, Guest guests) {
        if(roomReservation == null || roomReservation.getReservationStatusEnum() == ReservationStatusEnum.CHECKED_IN) {
            logger.error("Illegal room reservation.");
            return false;
        }
        EList roomGuests = roomReservation.getGuest();
        roomGuests.clear();
        roomGuests.add(guests);

        roomReservation.setReservationStatusEnum(ReservationStatusEnum.CHECKED_IN);
        return true;
	}

    /**
     * Check the guest out from the room.
     * @param roomReservation
     * @return true on successful check out, otherwise false.
     */
	public boolean checkOut(RoomReservation roomReservation) {
        //return roomReservation.checkOut
        // he wants.
        if(roomReservation == null || roomReservation.getReservationStatusEnum() == ReservationStatusEnum.CHECKED_OUT){
            logger.error("Illegal room reservation.");
            return false;
        }
        roomReservation.getGuest().clear();
        roomReservation.setReservationStatusEnum(ReservationStatusEnum.CHECKED_OUT);
        return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.GUEST_MANAGEMENT___CHECK_OUT__BOOKING:
				return checkOut((Booking)arguments.get(0));
			case LogicPackage.GUEST_MANAGEMENT___CHECK_IN__ROOMRESERVATION_GUEST:
				return checkIn((RoomReservation)arguments.get(0), (Guest)arguments.get(1));
			case LogicPackage.GUEST_MANAGEMENT___CHECK_OUT__ROOMRESERVATION:
				return checkOut((RoomReservation)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

    public void setBillManager(IBillingManagement billManager) {
        this.billManager = billManager;
    }
} //GuestManagementImpl
