package com.bodkink.hotel.business.util;

import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.persistence.model.*;
import org.apache.commons.lang.StringUtils;
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

    private ModelToEntityConverter() {
    }

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
        return new BookingEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null,
                convertCustomer(model.getCustomer()), services, roomReservations, bookingBills);
    }

    public static CustomerEntity convertCustomer(final Customer model) {
        return new CustomerEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null,
                model.getFirstName(), model.getSurname(), model.getBirthYear(), model.getPhone(),
                model.getEmail(), model.getNotes(), convertCardInformation(model.getCardInformation()));
    }

    public static ServiceEntity convertService(final Service model) {
        return new ServiceEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null,
                model.getTitle(), model.getDescription(), model.getPrice());
    }

    public static RoomReservationEntity convertRoomReservation(final RoomReservation model) {
        List<GuestEntity> guests = new ArrayList<>(model.getGuest().size());
        model.getGuest().forEach(guest -> {
            guests.add(convertGuest(guest));
        });

        return new RoomReservationEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null, model.getStartDate(),
                model.getEndDate(), model.getRoomReservationType(), convertRoom(model.getRoom()),
                guests, model.getRoomBill() != null ? convertRoomBill(model.getRoomBill()) : null, model.getReservationStatusEnum());
    }

    public static RoomEntity convertRoom(final Room model) {
        if (model != null) {
            Map<ObjectId, Integer> bedTypeCount = new HashMap<>(model.getBedType().size());

            model.getBedType().forEach(bedTypeModel -> {
                bedTypeCount.put(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null, 1);
            });

            List<RoomExtraEntity> roomExtras = new ArrayList<>(model.getRoomExtra().size());
            model.getRoomExtra().forEach(roomExtraModel -> {
                roomExtras.add(convertRoomExtra(roomExtraModel));
            });

            return new RoomEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null, model.getNumber(), model.getDescription(),
                    model.getAllowedGuests(), model.getSize(), model.getNightPrice(), model.getPictures(),
                    convertClassification(model.getClassification()), roomExtras, bedTypeCount);
        }
        return null;
    }

    public static ClassificationEntity convertClassification(final Classification model) {
        return new ClassificationEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null, model.getTitle(), model.getDescription());
    }

    public static BedTypeEntity convertBedType(final BedType model) {
        return new BedTypeEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null, model.getPlaces(), model.getWidth(),
                model.getLength(), model.getName());
    }

    public static RoomExtraEntity convertRoomExtra(final RoomExtra model) {
        return new RoomExtraEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null, model.getTitle(), model.getDescription());
    }

    public static GuestEntity convertGuest(final Guest model) {
        return new GuestEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null, model.getFirstName(),
                model.getSurname(), model.getBirthYear());
    }

    public static RoomBillEntity convertRoomBill(final RoomBill model) {
        if (model != null) {
            List<BillableItemEntity> billableItems = new ArrayList<>(model.getBillableItem().size());
            model.getBillableItem().forEach(item -> {
                billableItems.add(convertBillableItem(item));
            });
            return new RoomBillEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null,
                    convertCardInformation(model.getCardInformation()), billableItems, model.getBillStatusEnum());
        }
        return null;
    }

    public static CardInformationEntity convertCardInformation(final CardInformation model) {
        if (model != null) {
            return new CardInformationEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null, model.getCcNumber(), model.getCcv(), model.getExpiryMonth(), model.getExpiryYear(), model.getFirstName(), model.getLastName(), ModelToEntityConverter.convertAddress(model.getAddress()));
        } else {
            return null;
        }
    }

    public static AddressEntity convertAddress(final Address model) {
        return new AddressEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null,
                model.getCountry(), model.getCity(), model.getZipCode(), model.getAddressLine2(),
                model.getAddressLine1());
    }

    public static BillableItemEntity convertBillableItem(final BillableItem model) {
        return new BillableItemEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null,
                model.getName(), model.getPrice());
    }


    public static BookingBillEntity convertBookingBill(final BookingBill model) {
        return new BookingBillEntity(StringUtils.isNotBlank(model.getId()) ? new ObjectId(model.getId()) : null,
                convertCardInformation(model.getCardInformation()), model.getBillStatusEnum(),
                model.getBookingBillType());
    }
}
