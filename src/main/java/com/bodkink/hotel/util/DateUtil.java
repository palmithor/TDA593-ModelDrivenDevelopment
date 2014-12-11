package com.bodkink.hotel.util;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public class DateUtil {

    public static final DateTimeFormatter yyyyMMdd = DateTimeFormat.forPattern("yyyy-MM-dd");


    private DateUtil() {
    }

    public static boolean isOverlapping(final DateInterval dateInterval, final DateInterval compareWith) {
        return dateInterval.getStart().getTime() < compareWith.getEnd().getTime() &&
                dateInterval.getEnd().getTime() > compareWith.getStart().getTime();
    }
}
