package com.bodkink.hotel.util;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Calendar;
import java.util.Date;

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

    public static boolean isSameDay(final Date date1, final Date date2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);
        boolean sameYear = c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR);
        boolean sameMonth = c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH);
        boolean sameDay = c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH);

        return sameYear && sameMonth && sameDay;

    }
}
