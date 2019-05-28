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
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.meanbean.factories.ObjectCreationException;
import org.meanbean.test.BeanTestException;
import org.meanbean.test.BeanTester;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * The unit test class for the class {@link CreateDateExtensions}
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public class CreateDateExtensionsTest
{

	/**
	 * Sets up method will be invoked before every unit test method in this class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeMethod
	protected void setUp() throws Exception
	{

	}

	/**
	 * Tear down method will be invoked after every unit test method in this class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@AfterMethod
	protected void tearDown() throws Exception
	{
	}

	/**
	 * Test method for {@link CreateDateExtensions#newDate(int, int, int)}
	 */
	@Test
	public void testCreateDateIntIntInt()
	{

		final Date date = CreateDateExtensions.newDate(2000, 1, 1);
		final Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2000);
		calendar.set(Calendar.MONTH, 1 - 1);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		final Date expected = calendar.getTime();
		assertTrue("The date should be equal with the expected.", date.equals(expected));
	}

	/**
	 * Test method for {@link CreateDateExtensions#newDate(int, int, int, int, int, int)}
	 */
	@Test
	public void testCreateDateIntIntIntIntIntInt()
	{

		final Date date = CreateDateExtensions.newDate(2000, 1, 1, 12, 0, 0);
		final Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2000);
		calendar.set(Calendar.MONTH, 1 - 1);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 12);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		final Date expected = calendar.getTime();
		assertTrue("The date should be equal with the expected.", date.equals(expected));
	}

	/**
	 * Test method for {@link CreateDateExtensions#inPast(Date, int)}.
	 */
	@Test
	public void testInPast()
	{
		Date actual;
		Date expected;
		Date from;
		int millis;
		from = CreateDateExtensions.newDate(2000, 1, 2, 12, 0, 0);
		millis = (int)Age.ONE_DAY;
		actual = CreateDateExtensions.inPast(from, millis);
		expected = CreateDateExtensions.newDate(2000, 1, 1, 12, 0, 0);
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link CreateDateExtensions#newRandomDate(Date)}.
	 */
	@Test
	public void testNewRandomDate()
	{
		Date from;
		from = CreateDateExtensions.newDate(2000, 1, 2, 12, 0, 0);
		Date newRandomDate = CreateDateExtensions.newRandomDate(from);
		assertNotNull(newRandomDate);
	}

	/**
	 * Test method for {@link CreateDateExtensions}
	 */
	@Test(expectedExceptions = { BeanTestException.class, ObjectCreationException.class })
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(CreateDateExtensions.class);
	}

}
