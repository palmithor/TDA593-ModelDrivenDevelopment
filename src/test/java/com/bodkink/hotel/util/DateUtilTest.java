package com.bodkink.hotel.util;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DateUtilTest {

    @Test
    public void testIsOverlapping() {
        DateTime startBase = DateUtil.yyyyMMdd.parseDateTime("2014-12-01");
        DateTime endBase = DateUtil.yyyyMMdd.parseDateTime("2014-12-03");
        DateInterval baseInterval = new DateInterval(startBase.toDate(), endBase.toDate());

        DateTime startOverlappingBetween = DateUtil.yyyyMMdd.parseDateTime("2014-12-02");
        DateTime endOverlappingBetween = DateUtil.yyyyMMdd.parseDateTime("2014-12-03");

        assertThat(DateUtil.isOverlapping(baseInterval, new DateInterval(startOverlappingBetween.toDate(), endOverlappingBetween.toDate())),
                is(Boolean.TRUE));


        DateTime startOverlappingBefore = DateUtil.yyyyMMdd.parseDateTime("2014-11-30");
        DateTime endOverlappingBefore = DateUtil.yyyyMMdd.parseDateTime("2014-12-02");

        assertThat(DateUtil.isOverlapping(baseInterval, new DateInterval(startOverlappingBefore.toDate(), endOverlappingBefore.toDate())),
                is(Boolean.TRUE));

        DateTime startOverlappingEnd = DateUtil.yyyyMMdd.parseDateTime("2014-12-02");
        DateTime endOverlappingEnd = DateUtil.yyyyMMdd.parseDateTime("2014-12-05");

        assertThat(DateUtil.isOverlapping(baseInterval, new DateInterval(startOverlappingEnd.toDate(), endOverlappingEnd.toDate())),
                is(Boolean.TRUE));

        DateTime startNotOverlappingBefore = DateUtil.yyyyMMdd.parseDateTime("2014-11-30");
        DateTime endNotOverlappingBefore = DateUtil.yyyyMMdd.parseDateTime("2014-12-01");

        assertThat(DateUtil.isOverlapping(baseInterval, new DateInterval(startNotOverlappingBefore.toDate(), endNotOverlappingBefore.toDate())),
                is(Boolean.FALSE));

        DateTime startNotOverlappingEnd = DateUtil.yyyyMMdd.parseDateTime("2014-12-03");
        DateTime endNotOverlappingEnd = DateUtil.yyyyMMdd.parseDateTime("2014-12-05");

        assertThat(DateUtil.isOverlapping(baseInterval, new DateInterval(startNotOverlappingEnd.toDate(), endNotOverlappingEnd.toDate())),
                is(Boolean.FALSE));
    }
}