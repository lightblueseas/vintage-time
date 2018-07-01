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

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.meanbean.factories.ObjectCreationException;
import org.meanbean.test.BeanTestException;
import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

/**
 * The unit test class for the class {@link IntervalExtensions}.
 */
public class IntervalExtensionsTest
{

	/**
	 * Test method for {@link IntervalExtensions#isBetween(Interval, Interval)}
	 */
	@Test
	public void testIsBetween()
	{
		boolean actual;
		boolean expected;


		DateTime startDate;
		DateTime endDate;
		Interval timeRange;
		Interval timeRangeToCheck;

		startDate = new DateTime(2007, 11, 8, 19, 0, 0, 0);
		endDate = startDate.plus(Months.months(2));

		timeRange = new Interval(startDate, endDate);

		startDate = new DateTime(2007, 11, 10, 19, 0, 0, 0);
		endDate = startDate.plus(Months.months(1));

		timeRangeToCheck = new Interval(startDate, endDate);

		actual = IntervalExtensions.isBetween(timeRange, timeRangeToCheck);
		expected = true;
		assertEquals(actual, expected);


		startDate = new DateTime(2007, 11, 8, 19, 0, 0, 0);
		endDate = startDate.plus(Months.months(2));

		timeRange = new Interval(startDate, endDate);

		startDate = new DateTime(2008, 11, 7, 19, 0, 0, 0);
		endDate = startDate.plus(Months.months(1));

		timeRangeToCheck = new Interval(startDate, endDate);

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
