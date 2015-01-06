package com.bodkink.hotel.util;


import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.presentation.message.*;

/**
 * @author palmithor
 * @since 18/12/14.
 */
public class MessageToModelConverter {

    private MessageToModelConverter() {
    }

    public static Booking convertBooking(final BookingMessage message) {
        Booking booking = ModelFactory.eINSTANCE.createBooking();
        booking.setId(message.getId());
        booking.setCustomer(convertCustomer(message.getCustomer()));
        message.getServices().forEach(service -> {
            booking.getService().add(convertService(service));
        });

        message.getBookingBills().forEach(bill -> {
            booking.getBookingBill().add(convertBookingBill(bill));
        });

        message.getRoomReservations().forEach(reservation -> {
            booking.getRoomReservation().add(convertRoomReservation(reservation));
        });
        return booking;
    }

    private static BookingBill convertBookingBill(BookingBillMessage message) {
        BookingBill bookingBill = ModelFactory.eINSTANCE.createBookingBill();
        bookingBill.setCardInformation(convertCardInformation(message.getCardInformation()));
        bookingBill.setBillStatusEnum(message.getBillStatus());
        bookingBill.setBookingBillType(message.getBookingBillType());
        bookingBill.setId(message.getId());
        return bookingBill;
    }

    public static Service convertService(final ServiceMessage message) {
        Service service = ModelFactory.eINSTANCE.createService();
        service.setId(message.getId());
        service.setDescription(message.getDescription());
        service.setPrice(message.getPrice());
        service.setTitle(message.getTitle());
        return service;
    }

    public static Room convertRoom(final RoomMessage message) {
        Room room = ModelFactory.eINSTANCE.createRoom();
        room.setId(message.getId());
        room.setClassification(convertClassification(message.getClassification()));
        room.setDescription(message.getDescription());
        room.setNightPrice(message.getNightPrice());
        room.setSize(message.getSize());
        room.setAllowedGuests(message.getAllowedGuests());
        room.setNumber(message.getNumber());
        room.getBedType(); // TODO ADD BED TYPES
        return room;
    }

    public static Classification convertClassification(final ClassificationMessage message) {
        if (message != null && message.getId() != null) {
            Classification classification = ModelFactory.eINSTANCE.createClassification();
            classification.setId(message.getId());
            classification.setTitle(message.getTitle());
            classification.setDescription(message.getDescription());
            return classification;
        }
        return null;
    }

    public static RoomReservation convertRoomReservation(final RoomReservationMessage message) {
        RoomReservation roomReservation = ModelFactory.eINSTANCE.createRoomReservation();
        roomReservation.setId(message.getId());
        roomReservation.setReservationStatusEnum(message.getReservationStatus());
        roomReservation.setRoomReservationType(message.getReservationType());
        roomReservation.setRoom(convertRoom(message.getRoom()));
        roomReservation.setRoomBill(convertRoomBill(message.getRoomBill()));
        if (message.getGuests() != null) {
            message.getGuests().forEach(guest -> {
                roomReservation.getGuest().add(convertGuest(guest));
            });
        }
        roomReservation.setStartDate(message.getStartDate());
        roomReservation.setEndDate(message.getEndDate());
        return roomReservation;
    }


    public static RoomBill convertRoomBill(final RoomBillMessage message) {
        RoomBill roomBill = null;
        if (message != null) {
            roomBill = ModelFactory.eINSTANCE.createRoomBill();
            roomBill.setId(message.getId());
            roomBill.setBillStatusEnum(message.getBillStatus());
            roomBill.setCardInformation(convertCardInformation(message.getCardInformation()));
        }
        return roomBill;
    }

    public static BedType convertBedType(final BedTypeMessage message) {
        BedType bedType = ModelFactory.eINSTANCE.createBedType();
        bedType.setId(message.getId());
        bedType.setName(message.getName());
        bedType.setPlaces(message.getPlaces());
        bedType.setWidth(message.getWidth());
        bedType.setLength(message.getLength());
        return bedType;
    }

    public static Guest convertGuest(final GuestMessage message) {
        Guest guest = ModelFactory.eINSTANCE.createGuest();
        guest.setId(message.getId());
        guest.setBirthYear(message.getBirthYear());
        guest.setFirstName(message.getFirstName());
        guest.setSurname(message.getLastName());
        return guest;
    }

    public static RoomExtra convertRoomExtra(final RoomExtraMessage message) {
        RoomExtra roomExtra = ModelFactory.eINSTANCE.createRoomExtra();
        roomExtra.setId(message.getId());
        roomExtra.setTitle(message.getTitle());
        roomExtra.setDescription(message.getDescription());
        return roomExtra;
    }

    public static Customer convertCustomer(final CustomerMessage message) {
        Customer customer = ModelFactory.eINSTANCE.createCustomer();
        customer.setId(message.getId());
        customer.setFirstName(message.getFirstName());
        customer.setSurname(message.getLastName());
        customer.setEmail(message.getEmail());
        customer.setCardInformation(convertCardInformation(message.getCardInformation()));
        customer.setPhone(message.getPhone());
        customer.setBirthYear(message.getBirthYear());
        return customer;
    }

    public static CardInformation convertCardInformation(final CardInformationMessage message) {
        CardInformation cardInformation = ModelFactory.eINSTANCE.createCardInformation();
        cardInformation.setId(message.getId());
        cardInformation.setCcNumber(message.getCcNumber());
        cardInformation.setCcv(message.getCcv());
        cardInformation.setExpiryMonth(message.getExpiryMonth());
        cardInformation.setExpiryYear(message.getExpiryYear());
        cardInformation.setFirstName(message.getFirstName());
        cardInformation.setLastName(message.getLastName());
        cardInformation.setAddress(convertAddress(message.getAddress()));

        return cardInformation;
    }

    public static Address convertAddress(final AddressMessage message) {
        Address address = ModelFactory.eINSTANCE.createAddress();
        address.setId(message.getId());
        address.setZipCode(message.getZipCode());
        address.setCountry(message.getCountry());
        address.setCity(message.getCity());
        address.setAddressLine1(message.getAddressLine1());
        address.setAddressLine2(message.getAddressLine2());
        return address;
    }

}
