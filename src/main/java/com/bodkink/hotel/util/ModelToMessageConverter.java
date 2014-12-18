package com.bodkink.hotel.util;


import com.bodkink.hotel.business.model.*;
import com.bodkink.hotel.presentation.message.*;
import com.bodkink.hotel.presentation.message.ReceiptItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author palmithor
 * @since 18/12/14.
 */
public class ModelToMessageConverter {

    private ModelToMessageConverter() {
    }

    public static BookingMessage convertBooking(final Booking model) {
        List<ServiceMessage> services = new ArrayList<>();
        model.getService().forEach(service -> {
            services.add(convertService(service));
        });

        List<RoomReservationMessage> roomReservations = new ArrayList<>();

        model.getRoomReservation().forEach(roomReservation -> {
            roomReservations.add(convertRoomReservation(roomReservation));
        });

        List<BookingBillMessage> bookingBills = new ArrayList<>();
        model.getBookingBill().forEach(bill -> {
            bookingBills.add(convertBookingBill(bill));
        });
        return new BookingMessage(model.getId(),
                convertCustomer(model.getCustomer()), services, roomReservations, bookingBills);
    }

    public static CustomerMessage convertCustomer(final Customer model) {
        return new CustomerMessage(model.getId(),
                model.getFirstName(), model.getSurname(), model.getBirthYear(), model.getPhone(),
                model.getEmail(), model.getNotes(), convertCardInformation(model.getCardInformation()));
    }

    public static ServiceMessage convertService(final Service model) {
        return new ServiceMessage(model.getId(),
                model.getTitle(), model.getDescription(), model.getPrice());
    }

    public static RoomReservationMessage convertRoomReservation(final RoomReservation model) {
        List<GuestMessage> guests = new ArrayList<>(model.getGuest().size());
        model.getGuest().forEach(guest -> {
            guests.add(convertGuest(guest));
        });

        return new RoomReservationMessage(model.getId(), model.getStartDate(),
                model.getEndDate(), model.getRoomReservationType(), convertRoom(model.getRoom()),
                guests, model.getRoomBill() != null ? convertRoomBill(model.getRoomBill()) : null, model.getReservationStatusEnum());
    }

    public static RoomMessage convertRoom(final Room model) {
        if (model != null) {
            Map<String, Integer> bedTypeCount = new HashMap<>(model.getBedType().size());

            model.getBedType().forEach(bedTypeModel -> {
                bedTypeCount.put(model.getId(), 1);
            });

            List<RoomExtraMessage> roomExtras = new ArrayList<>(model.getRoomExtra().size());
            model.getRoomExtra().forEach(roomExtraModel -> {
                roomExtras.add(convertRoomExtra(roomExtraModel));
            });

            return new RoomMessage(model.getId(), model.getNumber(), model.getDescription(),
                    model.getAllowedGuests(), model.getSize(), model.getNightPrice(), model.getPictures(),
                    convertClassification(model.getClassification()), roomExtras, bedTypeCount);
        }
        return null;
    }

    public static ClassificationMessage convertClassification(final Classification model) {
        return new ClassificationMessage(model.getId(), model.getTitle(), model.getDescription());
    }

    public static BedTypeMessage convertBedType(final BedType model) {
        return new BedTypeMessage(model.getId(), model.getPlaces(), model.getWidth(),
                model.getLength(), model.getName());
    }

    public static RoomExtraMessage convertRoomExtra(final RoomExtra model) {
        return new RoomExtraMessage(model.getId(), model.getTitle(), model.getDescription());
    }

    public static GuestMessage convertGuest(final Guest model) {
        return new GuestMessage(model.getId(), model.getFirstName(),
                model.getSurname(), model.getBirthYear());
    }

    public static RoomBillMessage convertRoomBill(final RoomBill model) {
        if (model != null) {
            List<BillableItemMessage> billableItems = new ArrayList<>(model.getBillableItem().size());
            model.getBillableItem().forEach(item -> {
                billableItems.add(convertBillableItem(item));
            });
            return new RoomBillMessage(model.getId(),
                    convertCardInformation(model.getCardInformation()), billableItems, model.getBillStatusEnum());
        }
        return null;
    }

    public static CardInformationMessage convertCardInformation(final CardInformation model) {
        return new CardInformationMessage(model.getId(), model.getCcNumber(), model.getCcv(), model.getExpiryMonth(), model.getExpiryYear(), model.getFirstName(), model.getLastName(), ModelToMessageConverter.convertAddress(model.getAddress()));
    }

    public static AddressMessage convertAddress(final Address model) {
        return new AddressMessage(model.getId(),
                model.getCountry(), model.getCity(), model.getZipCode(), model.getAddressLine2(),
                model.getAddressLine1());
    }

    public static BillableItemMessage convertBillableItem(final BillableItem model) {
        return new BillableItemMessage(model.getId(),
                model.getName(), model.getPrice());
    }


    public static BookingBillMessage convertBookingBill(final BookingBill model) {
        return new BookingBillMessage(model.getId(),
                convertCardInformation(model.getCardInformation()), model.getBillStatusEnum(),
                model.getBookingBillType());
    }

    public static ReceiptMessage convertReceipt(final Receipt receipt) {
        if (receipt != null && receipt.getReceiptItem() != null) {
            List<ReceiptItem> items = new ArrayList<>(receipt.getReceiptItem().size());
            receipt.getReceiptItem().forEach(item -> {
                items.add(convertReceiptItem(item));
            });
            return new ReceiptMessage(items);
        } else {
            return new ReceiptMessage();
        }
    }

    private static ReceiptItem convertReceiptItem(final com.bodkink.hotel.business.model.ReceiptItem model) {
        return new ReceiptItem(model.getTitle(), model.getDescription(), model.getQuantity(),
                model.getPrice());
    }

}
