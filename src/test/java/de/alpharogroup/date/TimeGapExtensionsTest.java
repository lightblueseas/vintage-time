package de.alpharogroup.date;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import static org.testng.AssertJUnit.assertEquals;

public class TimeGapExtensionsTest {

    @Test
    public void testIsBeforeTimeGap() {
        boolean actual;
        boolean expected;
        LocalDate dateStart;
        LocalDate dateEnd;

        dateStart = LocalDate.of(2018, Month.AUGUST, 1);
        dateEnd = LocalDate.of(2018, Month.JULY, 31);

        actual = TimeGapExtensions.isBeforeTimeGap(dateStart, dateEnd, ChronoUnit.DAYS);
        expected = false;
        assertEquals(expected, actual);

        dateEnd = LocalDate.of(2018, Month.AUGUST, 2);
        actual = TimeGapExtensions.isBeforeTimeGap(dateStart, dateEnd, ChronoUnit.DAYS);
        expected = false;
        assertEquals(expected, actual);

        dateEnd = LocalDate.of(2018, Month.JULY, 30);
        actual = TimeGapExtensions.isBeforeTimeGap(dateStart, dateEnd, ChronoUnit.DAYS);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsAfterTimeGap() {
        boolean actual;
        boolean expected;
        LocalDate dateStart;
        LocalDate dateEnd;

        dateStart = LocalDate.of(2018, Month.APRIL, 30);
        dateEnd = LocalDate.of(2018, Month.MAY, 1);

        actual = TimeGapExtensions.isAfterTimeGap(dateStart, dateEnd, ChronoUnit.DAYS);
        expected = false;
        assertEquals(expected, actual);

        dateEnd = LocalDate.of(2018, Month.APRIL, 29);
        actual = TimeGapExtensions.isAfterTimeGap(dateStart, dateEnd, ChronoUnit.DAYS);
        expected = false;
        assertEquals(expected, actual);

        dateEnd = LocalDate.of(2018, Month.MAY, 2);
        actual = TimeGapExtensions.isAfterTimeGap(dateStart, dateEnd, ChronoUnit.DAYS);
        expected = true;
        assertEquals(expected, actual);
    }

}
