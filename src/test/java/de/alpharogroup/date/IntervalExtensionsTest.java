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
package de.alpharogroup.date;

import static org.testng.AssertJUnit.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//
//import org.joda.time.DateTime;
//import org.joda.time.Interval;
//import org.joda.time.Months;
import org.meanbean.factories.ObjectCreationException;
import org.meanbean.test.BeanTestException;
import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;
import org.threeten.extra.Interval;

/**
 * The unit test class for the class {@link IntervalExtensions}.
 */
public class IntervalExtensionsTest
{

	/**
	 * Test method for {@link IntervalExtensions#isBetween(Interval, Interval)}
	 */
	@Test(enabled = true)
	public void testIsBetween()
	{
		boolean actual;
		boolean expected;


		LocalDateTime startDate;
		LocalDateTime endDate;
		Interval timeRange;
		Interval timeRangeToCheck;
		DateTimeFormatter formatter;
		formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		startDate = LocalDate.parse("2007-11-08", formatter).atStartOfDay();
		// new ZonedDateTime(2007, 11, 8, 19, 0, 0, 0);
		endDate = startDate.plus(2, ChronoUnit.MONTHS);
		// plus(Months.months(2));

		timeRange = Interval.of(startDate.toInstant(ZoneOffset.UTC),
			endDate.toInstant(ZoneOffset.UTC));
		// new Interval(startDate.toInstant(), endDate.toInstant());

		startDate = LocalDate.parse("2007-11-10", formatter).atStartOfDay();
		// new DateTime(2007, 11, 10, 19, 0, 0, 0);
		endDate = startDate.plus(1, ChronoUnit.MONTHS);
		// plus(Months.months(1));

		timeRangeToCheck = Interval.of(startDate.toInstant(ZoneOffset.UTC),
			endDate.toInstant(ZoneOffset.UTC));

		actual = IntervalExtensions.isBetween(timeRange, timeRangeToCheck);
		expected = true;
		assertEquals(actual, expected);


		startDate = LocalDate.parse("2007-11-08", formatter).atStartOfDay();
		// new DateTime(2007, 11, 8, 19, 0, 0, 0);
		endDate = startDate.plus(2, ChronoUnit.MONTHS);

		timeRange = Interval.of(startDate.toInstant(ZoneOffset.UTC),
			endDate.toInstant(ZoneOffset.UTC));

		startDate = LocalDate.parse("2007-11-07", formatter).atStartOfDay();
		// new DateTime(2008, 11, 7, 19, 0, 0, 0);
		endDate = startDate.plus(1, ChronoUnit.MONTHS);

		timeRangeToCheck = Interval.of(startDate.toInstant(ZoneOffset.UTC),
			endDate.toInstant(ZoneOffset.UTC));

		actual = IntervalExtensions.isBetween(timeRange, timeRangeToCheck);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link IntervalExtensions}
	 */
	@Test(expectedExceptions = { BeanTestException.class, ObjectCreationException.class })
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(IntervalExtensions.class);
	}

}
