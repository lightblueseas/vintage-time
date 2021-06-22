/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.timestamp;

import de.alpharogroup.date.ConvertDateExtensions;
import de.alpharogroup.date.DatePatterns;
import de.alpharogroup.date.ParseDateExtensions;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

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
