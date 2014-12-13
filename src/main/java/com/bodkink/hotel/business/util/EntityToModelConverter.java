package com.bodkink.hotel.business.util;

import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.persistence.model.*;

/**
 * @author palmithor
 * @since 12/12/14.
 */
public class EntityToModelConverter {

    private EntityToModelConverter() {
    }


    public static Booking convertBooking(final BookingEntity entity) {
        Booking booking = ModelFactory.eINSTANCE.createBooking();
        booking.setId(entity.getId() != null ? entity.getId().toString() : null);
        booking.setCustomer(convertCustomer(entity.getCustomer()));
        if (entity.getNumber() != null) {
            booking.setNumber(entity.getNumber());
        } // TODO should we generate booking no?
        entity.getServices().forEach(service -> {
            booking.getService().add(convertService(service));
        });

        entity.getBookingBills().forEach(bill -> {
            booking.getBookingBill().add(convertBookingBill(bill));
        });

        entity.getRoomReservations().forEach(reservation -> {
            booking.getRoomReservation().add(convertRoomReservation(reservation));
        });
        return booking;
    }

    private static BookingBill convertBookingBill(BookingBillEntity entity) {
        BookingBill bookingBill = ModelFactory.eINSTANCE.createBookingBill();
        bookingBill.setCardInformation(convertCardInformation(entity.getCardInformation()));
        bookingBill.setBillStatusEnum(entity.getBillStatus());
        bookingBill.setBookingBillType(entity.getBookingBillType());
        bookingBill.setId(entity.getId() != null ? entity.getId().toString() : null);
        return bookingBill;
    }

    public static Service convertService(final ServiceEntity entity) {
        Service service = ModelFactory.eINSTANCE.createService();
        service.setId(entity.getId() != null ? entity.getId().toString() : null);
        service.setDescription(entity.getDescription());
        service.setPrice(entity.getPrice());
        service.setTitle(entity.getTitle());
        return service;
    }

    public static Room convertRoom(final RoomEntity entity) {
        Room room = ModelFactory.eINSTANCE.createRoom();
        room.setId(entity.getId() != null ? entity.getId().toString() : null);
        room.setClassification(convertClassification(entity.getClassification()));
        room.setDescription(entity.getDescription());
        room.setNightPrice(entity.getNightPrice());
        room.setSize(entity.getSize());
        room.setAllowedGuests(entity.getAllowedGuests());
        room.setNumber(entity.getNumber());
        room.getBedType(); // TODO ADD BED TYPES
        return room;
    }

    public static Classification convertClassification(final ClassificationEntity entity) {
        Classification classification = ModelFactory.eINSTANCE.createClassification();
        classification.setId(entity.getId() != null ? entity.getId().toString() : null);
        classification.setTitle(entity.getTitle());
        classification.setDescription(entity.getDescription());
        return classification;
    }

    public static RoomReservation convertRoomReservation(final RoomReservationEntity entity) {
        RoomReservation roomReservation = ModelFactory.eINSTANCE.createRoomReservation();
        roomReservation.setId(entity.getId() != null ? entity.getId().toString() : null);
        roomReservation.setReservationStatusEnum(entity.getReservationStatus());
        roomReservation.setRoomReservationType(convertRoomReservationType(entity.getType()));
        roomReservation.setRoom(convertRoom(entity.getRoom()));
        roomReservation.setRoomBill(convertRoomBill(entity.getRoomBill()));
        entity.getGuests().forEach(guest -> {
            roomReservation.getGuest().add(convertGuest(guest));
        });
        roomReservation.setStartDate(entity.getStartDate());
        roomReservation.setEndDate(entity.getEndDate());
        return roomReservation;
    }

    public static RoomReservationType convertRoomReservationType(final RoomReservationTypeEntity entity) {
        RoomReservationType roomReservationType = ModelFactory.eINSTANCE.createRoomReservationType();
        roomReservationType.setId(entity.getId() != null ? entity.getId().toString() : null);
        roomReservationType.setType(entity.getType());
        return roomReservationType;
    }

    public static RoomBill convertRoomBill(final RoomBillEntity entity) {
        RoomBill roomBill = null;
        if (entity != null) {
            roomBill = ModelFactory.eINSTANCE.createRoomBill();
            roomBill.setId(entity.getId() != null ? entity.getId().toString() : null);
            roomBill.setBillStatusEnum(entity.getBillStatus());
            roomBill.setCardInformation(convertCardInformation(entity.getCardInformation()));
        }
        return roomBill;
    }

    public static BedType convertBedType(final BedTypeEntity entity) {
        BedType bedType = ModelFactory.eINSTANCE.createBedType();
        bedType.setId(entity.getId() != null ? entity.getId().toString() : null);
        bedType.setName(entity.getName());
        bedType.setPlaces(entity.getPlaces());
        bedType.setWidth(entity.getWidth());
        bedType.setLength(entity.getLength());
        return bedType;
    }

    public static Guest convertGuest(final GuestEntity entity) {
        Guest guest = ModelFactory.eINSTANCE.createGuest();
        guest.setId(entity.getId() != null ? entity.getId().toString() : null);
        guest.setBirthYear(entity.getBirthYear());
        guest.setFirstName(entity.getFirstName());
        guest.setSurname(entity.getLastName());
        return guest;
    }

    public static RoomExtra convertRoomExtra(final RoomExtraEntity entity) {
        RoomExtra roomExtra = ModelFactory.eINSTANCE.createRoomExtra();
        roomExtra.setId(entity.getId() != null ? entity.getId().toString() : null);
        roomExtra.setTitle(entity.getTitle());
        roomExtra.setDescription(entity.getDescription());
        return roomExtra;
    }

    public static Customer convertCustomer(final CustomerEntity entity) {
        Customer customer = ModelFactory.eINSTANCE.createCustomer();
        customer.setId(entity.getId() != null ? entity.getId().toString() : null);
        customer.setFirstName(entity.getFirstName());
        customer.setSurname(entity.getLastName());
        customer.setEmail(entity.getEmail());
        customer.setCardInformation(convertCardInformation(entity.getCardInformation()));
        customer.setPhone(entity.getPhone());
        customer.setBirthYear(entity.getBirthYear());
        return customer;
    }

    public static CardInformation convertCardInformation(final CardInformationEntity entity) {
        CardInformation cardInformation = ModelFactory.eINSTANCE.createCardInformation();
        cardInformation.setId(entity.getId() != null ? entity.getId().toString() : null);
        cardInformation.setExpirationDate(entity.getExpirationDate());
        cardInformation.setCardNumber(entity.getCardNumber());
        cardInformation.setCardHolderName(entity.getCardHolderName());
        cardInformation.setAddress(convertAddress(entity.getAddress()));
        return cardInformation;
    }

    public static Address convertAddress(final AddressEntity entity) {
        Address address = ModelFactory.eINSTANCE.createAddress();
        address.setId(entity.getId() != null ? entity.getId().toString() : null);
        address.setZipCode(entity.getZipCode());
        address.setCountry(entity.getCountry());
        address.setCity(entity.getCity());
        address.setAddressLine1(entity.getAddressLine1());
        address.setAddressLine2(entity.getAddressLine2());
        return address;
    }
}
