package com.bodkink.hotel.test;

import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.RoomReservationType;
import com.bodkink.hotel.persistence.model.*;
import com.bodkink.hotel.util.DateInterval;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public class DBTestDataMock {

    public static final String PICTURE_URL = "http://www.doylecollection.com/var/doyle/storage/images/media/photo-galleries/the-dupont-circle-hotel-gallery/rooms/dupont-circle-hotel-superior-king-room/36016-1-eng-US/dupont-circle-hotel-superior-king-room_gallery_image.jpg";
    private static DateTime now = DateTime.now();
    public static final DateInterval dateIntervalHalfAvailable1 = new DateInterval(now.minusDays(2).toDate(), now.plusDays(1).toDate());
    public static final DateInterval dateIntervalHalfAvailable2 = new DateInterval(now.minusDays(6).toDate(), now.minusDays(4).toDate());
    public static final DateInterval dateIntervalAllAvailable = new DateInterval(now.plusDays(20).toDate(), now.plusDays(23).toDate());
    public static final DateInterval dateIntervalNoAvailable = new DateInterval(now.minusDays(7).toDate(), now.plusDays(24).toDate());


    public static List<RoomReservationEntity> getRoomReservations(List<RoomEntity> rooms) {
        List<RoomReservationEntity> roomReservations = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            roomReservations.add(new RoomReservationEntity(
                    ObjectId.get(),
                    i % 2 == 0 ? DBTestDataMock.dateIntervalHalfAvailable1.getStart() : DBTestDataMock.dateIntervalHalfAvailable2.getStart(),
                    i % 2 == 0 ? DBTestDataMock.dateIntervalHalfAvailable1.getEnd() : DBTestDataMock.dateIntervalHalfAvailable2.getEnd(),
                    RoomReservationType.BOOKING,
                    rooms.get(i),
                    new ArrayList<GuestEntity>(),   // TODO ADD guests ?
                    null,                           // TODO add room bill?
                    ReservationStatusEnum.RESERVED
            ));
        }
        return roomReservations;
    }

    public static List<RoomEntity> getRoomEntities() {
        List<RoomEntity> roomEntities = new ArrayList<>();
        List<ClassificationEntity> classifications = getClassificationEntities();
        List<BedTypeEntity> bedTypes = getBedTypeEntities();
        // Not pretty I know !
        for (int i = 0; i < 30; i++) {
            final String roomNumber = StringUtils.leftPad(String.valueOf(i), 3, "0");
            final int allowedGuests = (i % 2) + 2;
            Map<ObjectId, Integer> bedTypeCount = new HashMap<>();
            bedTypeCount.put(bedTypes.get(0).getId(), 1);
            if (allowedGuests == 3) {
                bedTypeCount.put(bedTypes.get(1).getId(), 1);
            }
            final BigDecimal nightPrice = BigDecimal.TEN.multiply(BigDecimal.TEN).multiply(new BigDecimal(allowedGuests));
            RoomEntity roomEntity = new RoomEntity(ObjectId.get(), roomNumber, "Room " + i, allowedGuests, BigDecimal.TEN,
                    nightPrice, Arrays.asList(PICTURE_URL), classifications.get(i % 2),
                    getRoomExtraEntities(), bedTypeCount);
            roomEntities.add(roomEntity);
        }
        return roomEntities;
    }

    public static List<ClassificationEntity> getClassificationEntities() {
        return new ArrayList<ClassificationEntity>() {{
            add(new ClassificationEntity(ObjectId.get(), "Class A", "Description for class A"));
            add(new ClassificationEntity(ObjectId.get(), "Class B", "Description for class B"));
        }};
    }

    public static List<RoomExtraEntity> getRoomExtraEntities() {
        return new ArrayList<RoomExtraEntity>() {{
            add(new RoomExtraEntity("42\" TV", "42\" Samsung flat screen television"));
            add(new RoomExtraEntity("Hairdryer", "Simple hairdryer"));
        }};
    }

    public static List<BedTypeEntity> getBedTypeEntities() {
        return new ArrayList<BedTypeEntity>() {{
            add(new BedTypeEntity(2, 160, 200, "Double Bed"));
            add(new BedTypeEntity(1, 90, 200, "Single Bed"));
        }};
    }

    public static CustomerEntity getCustomerEntity() {
        return new CustomerEntity(ObjectId.get(), "Olof", "Palme", 1927,
                "+46707235555", "olof.palme@mail.com", new ArrayList<>(), getCardInformationEntity());
    }

    public static CardInformationEntity getCardInformationEntity() {
        return new CardInformationEntity(ObjectId.get(), "4000000000000002",
                "Olof Palme", DateTime.now().plusYears(1).toDate(), getAddressEntity());
    }

    public static AddressEntity getAddressEntity() {
        return new AddressEntity(ObjectId.get(), "Sweden", "Gothenburg", "48911",
                "Apt. 1", "Street 1");
    }

    public static List<BookingEntity> getBookings(final List<RoomEntity> rooms) {
        List<BookingEntity> bookings = new ArrayList<BookingEntity>();
        getRoomReservations(rooms).forEach(roomReservation -> {
            bookings.add(new BookingEntity(
                    ObjectId.get(),
                    getCustomerEntity(),
                    new ArrayList<ServiceEntity>(), // TODO add services?
                    Arrays.asList(roomReservation),
                    new ArrayList<BookingBillEntity>() // TODO add booking bills?
            ));
        });
        return bookings;
    }
}
