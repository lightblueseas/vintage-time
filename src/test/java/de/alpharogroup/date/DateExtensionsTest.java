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
import static org.testng.AssertJUnit.assertTrue;

import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.meanbean.factories.ObjectCreationException;
import org.meanbean.test.BeanTestException;
import org.meanbean.test.BeanTester;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * The unit test class for the class {@link DateExtensions}.
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public class DateExtensionsTest
{

	/** The expected date1. */
	private Date expectedDate1 = null;

	/** The expected date4. */
	private Date expectedDate4 = null;

	/**
	 * Sets up method will be invoked before every unit test method in this class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeMethod
	protected void setUp() throws Exception
	{
		this.expectedDate1 = CreateDateExtensions.newDate(2000, 12, 31);
		this.expectedDate4 = CreateDateExtensions.newDate(1971, 2, 1, 0, 0, 0);
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
		this.expectedDate1 = null;
		this.expectedDate4 = null;
	}

	/**
	 * Test method for {@link de.alpharogroup.date.DateExtensions#getAllDateFormats()}.
	 *
	 * @throws IllegalArgumentException
	 *             the illegal argument exception
	 * @throws IllegalAccessException
	 *             the illegal access exception
	 */
	@Test
	public void testGetAllDateFormats() throws IllegalArgumentException, IllegalAccessException
	{
		final List<String> dateformats = DateExtensions.getAllDateFormats();
		int i = 1;
		for (final String element : dateformats)
		{
			System.out.println(i++ + ".value:" + element);

		}
	}

	/**
	 * Test method for {@link DateExtensions#getAllDatePatterns()}.
	 */
	@Test
	public void testGetAllDatePatterns()
	{
		Map<String, Object> actual;
		Map<String, Object> expected;
		actual = DateExtensions.getAllDatePatterns();
		expected = new HashMap<>();
		expected.put("DD_MMM_YY", "dd-MMM-yy");
		expected.put("DOT_DD_MM", "dd.MM");
		expected.put("DOT_DD_MM_YY", "dd.MM.yy");
		expected.put("DOT_DD_MM_YYYY", "dd.MM.yyyy");
		expected.put("DOT_DD_MM_YYYY_HH_MM_SS", "dd.MM.yyyy HH:mm:ss");
		expected.put("DOT_YYYY_MM_DD_HH_MM_SS", "yyyy.MM.dd.HH.mm.ss");
		expected.put("EEE_MMM_DD_HH_MM_SS_Z_YYYY", "EEE MMM dd hh:mm:ss z yyyy");
		expected.put("EEEE_MMM_DD_YYYY", "EEEE MMM dd, yyyy");
		expected.put("LHH_MM_SS", "hh:mm:ss");
		expected.put("UHH_MM", "HH:mm");
		expected.put("UHH_MM_SS", "HH:mm:ss");
		expected.put("YYYY_MM_DD", "yyyy-MM-dd");
		expected.put("YYYY_MM_DD_HH_MM_SS", "yyyy-MM-dd hh:mm:ss");
		expected.put("YYYY_MM_DD_HH_MM_SS_S", "yyyy-MM-dd hh:mm:ss.S");
		expected.put("YYYY_MM_DD_T_HH_MM_SS", "yyyy-MM-dd'T'HH:mm:ss");
		expected.put("YYYYMMDDHHMMSS", "yyyyMMddHHmmss");
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link de.alpharogroup.date.DateExtensions#getDay(java.util.Date)}.
	 */
	@Test
	public void testGetDay()
	{

		final int day = DateExtensions.getDay(this.expectedDate1);
		final int expected = 31;
		assertTrue("The day should be 31.", day == expected);
	}

	/**
	 * Test method for {@link de.alpharogroup.date.DateExtensions#getHours(java.util.Date)}.
	 */
	@Test
	public void testGetHours()
	{

		final int hour = DateExtensions.getHours(this.expectedDate4);
		final int expected = 0;
		assertTrue("The hour should be 0.", hour == expected);
	}

	/**
	 * Test method for {@link de.alpharogroup.date.DateExtensions#getMinutes(java.util.Date)}.
	 */
	@Test
	public void testGetMinutes()
	{

		final int minutes = DateExtensions.getMinutes(this.expectedDate4);
		final int expected = 0;
		assertTrue("The minutes should be 0.", minutes == expected);
	}

	/**
	 * Test method for {@link de.alpharogroup.date.DateExtensions#getMonth(java.util.Date)}.
	 */
	@Test
	public void testGetMonth()
	{

		final int month = DateExtensions.getMonth(this.expectedDate1);
		final int expected = 11;
		assertTrue("The month should be 11.", month == expected);
	}

	/**
	 * Test method for {@link de.alpharogroup.date.DateExtensions#getSeconds(java.util.Date)}.
	 */
	@Test
	public void testGetSeconds()
	{

		final int seconds = DateExtensions.getSeconds(this.expectedDate4);
		final int expected = 0;
		assertTrue("The seconds should be 0.", seconds == expected);
	}

	/**
	 * Test method for {@link DateExtensions#getWeekOfYear(Date)}.
	 */
	@Test
	public void testGetWeekOfYear()
	{
		int actual;
		int expected;
		Date birthDay;
		int weekOfYear;

		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		weekOfYear = DateExtensions.getWeekOfYear(birthDay);
		actual = weekOfYear;
		expected = 45;
		assertEquals(actual, expected);

		birthDay = CreateDateExtensions.newDate(2007, 1, 8, 19, 0, 0);
		weekOfYear = DateExtensions.getWeekOfYear(birthDay);
		actual = weekOfYear;
		expected = 2;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link de.alpharogroup.date.DateExtensions#getYear(java.util.Date)}.
	 */
	@Test
	public void testGetYear()
	{

		final int year = DateExtensions.getYear(this.expectedDate1);
		final int expected = 2000;
		assertTrue("The year should be 2000.", year == expected);
	}

	/**
	 * Test method for {@link DateExtensions#setDate(Date, int, int, int, int, TimeZone, Locale)}.
	 */
	@Test(enabled = false)
	public void testSetDate()
	{
		Date actual;
		Date expected;
		Date dateToSet;
		TimeZone zone;
		Locale locale;
		int year;
		int month;
		int day;
		int hours;
		int minutes;
		int seconds;
		int milisec;
		year = 2007;
		month = 11;
		day = 8;
		dateToSet = CreateDateExtensions.newDate(year, month, day);
		hours = 12;
		minutes = 35;
		seconds = 15;
		milisec = 30;
		zone = TimeZone.getTimeZone(ZoneId.of("Europe/Berlin"));
		locale = Locale.GERMANY;
		actual = DateExtensions.setDate(dateToSet, hours, minutes, seconds, milisec, zone, locale);
		expected = CreateDateExtensions.newDate(year, month, day, hours, minutes, seconds, milisec);
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link DateExtensions}
	 */
	@Test(expectedExceptions = { BeanTestException.class, ObjectCreationException.class })
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(DateExtensions.class);
	}

}
