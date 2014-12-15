package com.bodkink.hotel.business.util;

import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.persistence.IRoomReservationService;
import com.google.common.cache.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author palmithor
 * @since 13/12/14.
 */
@Singleton
public class BookingCache implements IBookingCache {

    @Inject
    IRoomReservationService roomReservationService;

    private LoadingCache<String, Booking> cache;

    public BookingCache() {
        this.cache =
                CacheBuilder.newBuilder()
                        .expireAfterWrite(3, TimeUnit.MINUTES)
                        .refreshAfterWrite(100, TimeUnit.MILLISECONDS)
                        .removalListener(new BookingRemovalListener())
                        .build(new CacheLoader<String, Booking>() {
                                   @Override
                                   public Booking load(String key) throws Exception {
                                       return null;
                                   }
                               }
                        );
        ;
    }

    public BookingCache(final int expiry, final TimeUnit timeUnit) {
        this.cache =
                CacheBuilder.newBuilder()
                        .expireAfterWrite(expiry, timeUnit)
                        .refreshAfterWrite(100, TimeUnit.MILLISECONDS)
                        .removalListener(new BookingRemovalListener())
                        .build(new CacheLoader<String, Booking>() {
                                   @Override
                                   public Booking load(String key) throws Exception {
                                       return null;
                                   }
                               }
                        );
        ;
    }

    @Override
    public Booking get(String id) {
        return cache.getUnchecked(id);
    }

    @Override
    public void put(Booking booking) {
        cache.put(booking.getId(), booking);
    }

    public class BookingRemovalListener implements RemovalListener<String, Booking> {

        @Override
        public void onRemoval(RemovalNotification<String, Booking> notification) {
            Booking booking = notification.getValue();
            if (booking != null) {
                if (booking.getRoomReservation() != null && booking.getRoomReservation().size() > 0) {
                    booking.getRoomReservation().forEach(roomReservation -> {
                        roomReservation.setReservationStatusEnum(ReservationStatusEnum.CANCELED);
                        roomReservationService.edit(ModelToEntityConverter.convertRoomReservation(roomReservation));
                    });
                }
            }
        }
    }
}
