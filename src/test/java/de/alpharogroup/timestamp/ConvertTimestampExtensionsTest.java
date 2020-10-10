package de.alpharogroup.timestamp;

import static org.testng.AssertJUnit.assertEquals;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

import de.alpharogroup.date.DatePatterns;
import de.alpharogroup.date.ParseDateExtensions;

public class ConvertTimestampExtensionsTest {


    /**
     * Test method for {@link ConvertTimestampExtensions#toTimestamp(Date)}
     *
     * @throws ParseException
     *             occurs when their are problems with parsing the String to Date.
     */
    @Test
    public void testToTimestamp() throws ParseException
    {
        Timestamp actual;
        Timestamp expected;
        final Date test = ParseDateExtensions.parseToDate("1900-10-01", DatePatterns.YYYY_MM_DD);
        actual = ConvertTimestampExtensions.toTimestamp(test);
        final Calendar compare = Calendar.getInstance();
        compare.setTime(test);

        compare.set(Calendar.HOUR_OF_DAY, 0);
        compare.set(Calendar.MINUTE, 0);
        compare.set(Calendar.SECOND, 0);
        compare.set(Calendar.MILLISECOND, 0);
        expected = new Timestamp(compare.getTime().getTime());
        assertEquals(actual, expected);

        actual = ConvertTimestampExtensions.toTimestamp(test);
        expected = new Timestamp(test.getTime());
        assertEquals(actual, expected);
    }
}
