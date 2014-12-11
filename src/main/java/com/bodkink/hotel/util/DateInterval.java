package com.bodkink.hotel.util;

import java.util.Date;

/**
 * @author palmithor
 * @since 11/12/14.
 */
public class DateInterval {
    private final Date start;
    private final Date end;

    public DateInterval(final Date start, final Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}
