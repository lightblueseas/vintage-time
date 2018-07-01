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

import java.util.Date;

import org.meanbean.factories.ObjectCreationException;
import org.meanbean.test.BeanTestException;
import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

/**
 * The unit test class for the class {@link TimeZoneExtensions}
 */
public class TimeZoneExtensionsTest
{

	/**
	 * Test method for {@link TimeZoneExtensions#getTimezoneOffsetInHours(Date)}
	 */
	@Test(enabled = false)
	public final void testGetTimezoneOffsetInHours() throws Exception
	{
		int actual;
		int expected;
		final Date date = CreateDateExtensions.newDate(2000, 1, 1, 12, 0, 0);
		actual = TimeZoneExtensions.getTimezoneOffsetInHours(date);
		expected = -1;
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link TimeZoneExtensions#getTimezoneOffsetInMinutes(Date)}
	 */
	@Test(enabled = false)
	public final void testGetTimezoneOffsetInMinutes() throws Exception
	{
		int actual;
		int expected;
		final Date date = CreateDateExtensions.newDate(2000, 1, 1, 12, 0, 0);
		actual = TimeZoneExtensions.getTimezoneOffsetInMinutes(date);
		expected = -60;
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link TimeZoneExtensions}
	 */
	@Test(expectedExceptions = { BeanTestException.class, ObjectCreationException.class })
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(TimeZoneExtensions.class);
	}
	
}
