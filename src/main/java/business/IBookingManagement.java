/**
 */
package business;

import business.model.Booking;
import business.model.CardInformation;
import business.model.Customer;
import business.model.Receipt;
import business.model.ReservationStatusEnum;
import business.model.Room;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * @model interface="true" abstract="true"
 * @generated
 * @see business.BusinessPackage#getIBookingManagement()
 */
public interface IBookingManagement extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" startRequired="true" startOrdered="false" endRequired="true" endOrdered="false" roomsRequired="true" roomsOrdered="false" numberOfGuestsRequired="true" numberOfGuestsOrdered="false" customerRequired="true" customerOrdered="false"
     * @generated
     */
    Booking create(Date start, Date end, Room rooms, int numberOfGuests, Customer customer);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false"
     * @generated
     */
    Booking listBookings();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
     * @generated
     */
    Booking findBooking(long bookingId);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" startRequired="true" startOrdered="false"
     * @generated
     */
    Booking listBooking(Date start);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model startRequired="true" startOrdered="false" endDateRequired="true" endDateOrdered="false" roomsRequired="true" roomsOrdered="false"
     * @generated
     */
    void listAvailableRooms(Date start, Date endDate, Room rooms);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
     * @generated
     */
    boolean cancelBooking(Booking booking);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" idRequired="true" idOrdered="false"
     * @generated
     */
    ReservationStatusEnum getBookingStatus(long id);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false" cardInformationRequired="true" cardInformationOrdered="false"
     * @generated
     */
    Receipt confirmAndPay(Booking booking, CardInformation cardInformation);

} // IBookingManagement
