/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.IBillingManagement;
import com.bodkink.hotel.business.IRoomManagement;
import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.logic.BookingManagement;
import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.business.util.IBookingCache;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.business.util.RoomUtil;
import com.bodkink.hotel.persistence.IBookingService;
import com.bodkink.hotel.persistence.model.BookingEntity;
import com.bodkink.hotel.persistence.model.RoomReservationEntity;
import com.bodkink.hotel.util.DateInterval;
import com.bodkink.hotel.util.DateUtil;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.bson.types.ObjectId;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@Singleton
public class BookingManagementImpl extends MinimalEObjectImpl.Container implements BookingManagement {

    private static final Logger logger = LoggerFactory.getLogger(BookingManagementImpl.class);

    @Inject
    IBookingCache bookingCache;
    @Inject
    IBookingService bookingService;
    @Inject
    IRoomReservationManagement roomReservationManagement;
    @Inject
    IRoomManagement roomManagement;
    @Inject
    IBillingManagement billingManagement;


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BookingManagementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LogicPackage.Literals.BOOKING_MANAGEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public Booking create(Date start, Date end, EList<Room> rooms, EList<Service> services, Customer customer) {
        if (areAvailable(rooms, start, end)) {
            Booking booking = ModelFactory.eINSTANCE.createBooking();
            booking.setId(ObjectId.get().toString());

            rooms.forEach(r -> {
                RoomReservation roomReservation = ModelFactory.eINSTANCE.createRoomReservation();
                roomReservation.setStartDate(start);
                roomReservation.setEndDate(end);
                roomReservation.setRoom(r);
                roomReservation.setReservationStatusEnum(ReservationStatusEnum.RESERVED);
                roomReservation.setRoomReservationType(RoomReservationType.BOOKING);
                booking.getRoomReservation().add(roomReservation);
                roomReservationManagement.create(r, start, end, RoomReservationType.BOOKING);
            });
            if (services != null) {
                booking.getService().addAll(services);
            }
            booking.setCustomer(customer);

            bookingCache.put(booking);
            return booking;
        } else {
            return null;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public EList<Booking> listBookings() {
        List<BookingEntity> bookingEntityList = bookingService.list();
        EList<Booking> bookings = new BasicEList<>(bookingEntityList.size());
        bookingEntityList.forEach(entity -> {
            bookings.add(EntityToModelConverter.convertBooking(entity));
        });
        return bookings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public Booking findBooking(String bookingId) {
        BookingEntity entity = bookingService.find(bookingId);
        if (entity != null) {
            return EntityToModelConverter.convertBooking(entity);
        } else {
            return null;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public EList<Booking> listBookings(Date start) {
        EList<RoomReservation> roomReservation = roomReservationManagement.listRoomReservations(start);
        List<RoomReservationEntity> roomReservationEntities = new ArrayList<>(roomReservation.size());

        roomReservation.forEach(model -> {
            roomReservationEntities.add(ModelToEntityConverter.convertRoomReservation(model));
        });
        List<BookingEntity> bookingEntities = bookingService.findByRoomReservation(roomReservationEntities);

        EList<Booking> bookings = new BasicEList<>();
        bookingEntities.forEach(entity -> {
            bookings.add(EntityToModelConverter.convertBooking(entity));
        });

        return bookings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public EList<Room> listAvailableRooms(Date start, Date endDate) {
        EList<RoomReservation> roomReservations = roomReservationManagement.listRoomReservations(start, endDate);
        EList<Room> availableRooms = new BasicEList<>();
        DateInterval compareDateInterval = new DateInterval(start, endDate);
        roomReservations.forEach(roomReservation -> {
            DateInterval roomReservedDateInterval = new DateInterval(roomReservation.getStartDate(), roomReservation.getEndDate());
            if (!DateUtil.isOverlapping(roomReservedDateInterval, compareDateInterval)
                    || roomReservation.getReservationStatusEnum() == ReservationStatusEnum.CANCELED) {
                availableRooms.add(roomManagement.findRoom(roomReservation.getRoom().getId()));
            }
        });

        return availableRooms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public EList<Room> searchRoom(int numberOfGuests, int numberOfRooms, Date start, Date end) {
        EList<Room> availableRooms = listAvailableRooms(start, end);
        EList<Room> roomSuggestions = new BasicEList<>();
        if (availableRooms.size() < numberOfRooms || RoomUtil.hasTooManyGuests(numberOfGuests, availableRooms)) {
            return roomSuggestions;
        } else {
            return availableRooms;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case LogicPackage.BOOKING_MANAGEMENT___CREATE__DATE_DATE_ELIST_ELIST_CUSTOMER:
                return create((Date) arguments.get(0), (Date) arguments.get(1), (EList<Room>) arguments.get(2), (EList<Service>) arguments.get(3), (Customer) arguments.get(4));
            case LogicPackage.BOOKING_MANAGEMENT___LIST_BOOKINGS:
                return listBookings();
            case LogicPackage.BOOKING_MANAGEMENT___FIND_BOOKING__STRING:
                return findBooking((String) arguments.get(0));
            case LogicPackage.BOOKING_MANAGEMENT___LIST_BOOKINGS__DATE:
                return listBookings((Date) arguments.get(0));
            case LogicPackage.BOOKING_MANAGEMENT___LIST_AVAILABLE_ROOMS__DATE_DATE:
                return listAvailableRooms((Date) arguments.get(0), (Date) arguments.get(1));
            case LogicPackage.BOOKING_MANAGEMENT___CANCEL_BOOKING__BOOKING:
                return cancelBooking((Booking) arguments.get(0));
            case LogicPackage.BOOKING_MANAGEMENT___GET_BOOKING_STATUS__STRING:
                return getBookingStatus((String) arguments.get(0));
            case LogicPackage.BOOKING_MANAGEMENT___CONFIRM_AND_PAY__BOOKING:
                return confirmAndPay((Booking) arguments.get(0));
            case LogicPackage.BOOKING_MANAGEMENT___SEARCH_ROOM__INT_INT_DATE_DATE:
                return searchRoom((Integer) arguments.get(0), (Integer) arguments.get(1), (Date) arguments.get(2), (Date) arguments.get(3));
        }
        return super.eInvoke(operationID, arguments);
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public boolean cancelBooking(Booking booking) {
        EList<RoomReservation> roomReservations = booking.getRoomReservation();
        roomReservations.forEach(roomReservation -> {
            roomReservation.setReservationStatusEnum(ReservationStatusEnum.CANCELED);
        });
        BookingEntity bookingEntity = bookingService.persist(ModelToEntityConverter.convertBooking(booking));
        return bookingEntity.getId() != null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public ReservationStatusEnum getBookingStatus(String bookingId) {
        // TODO Implement
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Receipt confirmAndPay(final Booking booking) {
        BookingBill bookingBill = billingManagement.createBookingBill(booking, BookingBillType.RESERVATION_FEE);
        booking.getBookingBill().add(bookingBill);
        if (bookingCache.get(booking.getId()) != null && billingManagement.makePayment(booking)) {
            bookingService.persist(ModelToEntityConverter.convertBooking(booking));
            bookingCache.remove(booking.getId());
            return billingManagement.generateReceipts(booking).get(0);
        } else {
            return null;
        }
    }


    private boolean areAvailable(EList<Room> rooms, final Date start, final Date end) {
        boolean result = true;
        for (Room r : rooms) {
            if (!roomReservationManagement.isAvailable(r, start, end)) {
                result = false;
                break;
            }
        }
        return result;
    }

} //BookingManagementImpl
