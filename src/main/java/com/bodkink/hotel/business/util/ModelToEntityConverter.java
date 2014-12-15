package com.bodkink.hotel.business.util;

import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.persistence.model.*;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author palmithor
 * @since 12/12/14.
 */
public class ModelToEntityConverter {


    public static BookingEntity convertBooking(final Booking model) {
        List<ServiceEntity> services = new ArrayList<>(model.getService().size());
        model.getService().forEach(service -> {
            services.add(convertService(service));
        });

        List<RoomReservationEntity> roomReservations = new ArrayList<>(model.getRoomReservation().size());

        model.getRoomReservation().forEach(roomReservation -> {
            roomReservations.add(convertRoomReservation(roomReservation));
        });

        List<BookingBillEntity> bookingBills = new ArrayList<>(model.getBookingBill().size());
        model.getBookingBill().forEach(bill -> {
            bookingBills.add(convertBookingBill(bill));
        });
        return new BookingEntity(model.getId() != null ? new ObjectId(model.getId()) : null,
                convertCustomer(model.getCustomer()), services, roomReservations, bookingBills);
    }

    public static CustomerEntity convertCustomer(final Customer model) {
        return new CustomerEntity(model.getId() != null ? new ObjectId(model.getId()) : null,
                model.getFirstName(), model.getSurname(), model.getBirthYear(), model.getPhone(),
                model.getEmail(), model.getNotes(), convertCardInformation(model.getCardInformation()));
    }

    public static ServiceEntity convertService(final Service model) {
        return new ServiceEntity(model.getId() != null ? new ObjectId(model.getId()) : null,
                model.getTitle(), model.getDescription(), model.getPrice());
    }

    public static RoomReservationEntity convertRoomReservation(final RoomReservation model) {
        List<GuestEntity> guests = new ArrayList<>(model.getGuest().size());
        model.getGuest().forEach(guest -> {
            guests.add(convertGuest(guest));
        });

        return new RoomReservationEntity(model.getId() != null ? new ObjectId(model.getId()) : null, model.getStartDate(),
                model.getEndDate(), model.getRoomReservationType(), convertRoom(model.getRoom()),
                guests, convertRoomBill(model.getRoomBill()), model.getReservationStatusEnum());
    }

    public static RoomEntity convertRoom(final Room model) {

        Map<ObjectId, Integer> bedTypeCount = new HashMap<>(model.getBedType().size());
        model.getBedType().forEach(bedTypeModel -> {
            bedTypeCount.put(model.getId() != null ? new ObjectId(model.getId()) : null, 1);
        });

        List<RoomExtraEntity> roomExtras = new ArrayList<>(model.getRoomExtra().size());
        model.getRoomExtra().forEach(roomExtraModel -> {
            roomExtras.add(convertRoomExtra(roomExtraModel));
        });

        return new RoomEntity(model.getId() != null ? new ObjectId(model.getId()) : null, model.getNumber(), model.getDescription(),
                model.getAllowedGuests(), model.getSize(), model.getNightPrice(), model.getPictures(),
                convertClassification(model.getClassification()), roomExtras, bedTypeCount);
    }

    public static ClassificationEntity convertClassification(final Classification model) {
        return new ClassificationEntity(model.getId() != null ? new ObjectId(model.getId()) : null, model.getTitle(), model.getDescription());
    }

    public static BedTypeEntity convertBedType(final BedType model) {
        return new BedTypeEntity(model.getId() != null ? new ObjectId(model.getId()) : null, model.getPlaces(), model.getWidth(),
                model.getLength(), model.getName());
    }

    public static RoomExtraEntity convertRoomExtra(final RoomExtra model) {
        return new RoomExtraEntity(model.getId() != null ? new ObjectId(model.getId()) : null, model.getTitle(), model.getDescription());
    }

    public static GuestEntity convertGuest(final Guest model) {
        return new GuestEntity(model.getId() != null ? new ObjectId(model.getId()) : null, model.getFirstName(),
                model.getSurname(), model.getBirthYear());
    }

    public static RoomBillEntity convertRoomBill(final RoomBill model) {
        List<BillableItemEntity> billableItems = new ArrayList<>(model.getBillableItem().size());
        model.getBillableItem().forEach(item -> {
            billableItems.add(convertBillableItem(item));
        });
        return new RoomBillEntity(model.getId() != null ? new ObjectId(model.getId()) : null,
                convertCardInformation(model.getCardInformation()), billableItems, model.getBillStatusEnum());
    }

    public static CardInformationEntity convertCardInformation(final CardInformation model) {
        return new CardInformationEntity(model.getId() != null ? new ObjectId(model.getId()) : null, model.getCardNumber(),
                model.getCardHolderName(), model.getExpirationDate(), convertAddress(model.getAddress()));
    }

    public static AddressEntity convertAddress(final Address model) {
        return new AddressEntity(model.getId() != null ? new ObjectId(model.getId()) : null,
                model.getCountry(), model.getCity(), model.getZipCode(), model.getAddressLine2(),
                model.getAddressLine1());
    }

    public static BillableItemEntity convertBillableItem(final BillableItem model) {
        return new BillableItemEntity(model.getId() != null ? new ObjectId(model.getId()) : null,
                model.getName(), model.getPrice());
    }


    public static BookingBillEntity convertBookingBill(final BookingBill model) {
        return new BookingBillEntity(model.getId() != null ? new ObjectId(model.getId()) : null,
                convertCardInformation(model.getCardInformation()), model.getBillStatusEnum(),
                model.getBookingBillType());
    }
}
