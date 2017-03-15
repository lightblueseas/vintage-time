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

import java.util.Date;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test class for the class {@link CalculateDateExtensions}.
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public class CalculateDateExtensionsTest
{

	/** The Constant DD_MM. */
	private static final String DD_MM = "dd.MM";

	/** The Constant YYYY_MMDD_HHMMSS. */
	private static final String YYYY_MMDD_HHMMSS = "yyyyMMddHHmmss";

	/** The datum3. */
	private String datum3 = null;

	/** The datum4. */
	private String datum4 = null;

	/** The format3. */
	private String format3 = null;

	/** The format4. */
	private String format4 = null;

	/** The expected date1. */
	private Date expectedDate1 = null;

	/** The expected date2. */
	private Date expectedDate2 = null;

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
		this.datum3 = "20050621134451";
		this.datum4 = "32.13";
		this.format3 = YYYY_MMDD_HHMMSS;
		this.format4 = DD_MM;

		this.expectedDate1 = CreateDateExtensions.newDate(2000, 12, 31);
		this.expectedDate2 = CreateDateExtensions.newDate(2005, 06, 22, 9, 4, 55);
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
		this.expectedDate2 = null;
		this.expectedDate4 = null;
	}

	/**
	 * Test method for {@link de.alpharogroup.date.CalculateDateExtensions#addDays(java.util.Date, int)}
	 * .
	 */
	@Test
	public void testAddDaysToDate()
	{

		this.expectedDate4 = CreateDateExtensions.newDate(1971, 2, 1, 0, 0, 0);

		Date expected = CreateDateExtensions.newDate(1971, 2, 2, 0, 0, 0);

		Date date = CalculateDateExtensions.addDays(this.expectedDate4, 1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
		expected = CreateDateExtensions.newDate(1971, 1, 31, 0, 0, 0);
		// Add negative value...
		date = CalculateDateExtensions.addDays(this.expectedDate4, -1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
	}

	/**
	 * Test method for {@link de.alpharogroup.date.CalculateDateExtensions#addHours(java.util.Date, int)}
	 */
	@Test
	public void testAddHoursToDate()
	{

		this.expectedDate4 = CreateDateExtensions.newDate(1971, 2, 1, 0, 0, 0);

		Date expected = CreateDateExtensions.newDate(1971, 2, 1, 1, 0, 0);

		Date date = CalculateDateExtensions.addHours(this.expectedDate4, 1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
		expected = CreateDateExtensions.newDate(1971, 1, 31, 23, 0, 0);
		// Add negative value...
		date = CalculateDateExtensions.addHours(this.expectedDate4, -1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
	}

	/**
	 * Test method for {@link de.alpharogroup.date.CalculateDateExtensions#addHours(java.util.Date, int)}
	 * .
	 */
	@Test
	public void testAddMinutesToDate()
	{

		this.expectedDate4 = CreateDateExtensions.newDate(1971, 2, 1, 0, 0, 0);

		Date expected = CreateDateExtensions.newDate(1971, 2, 1, 0, 1, 0);

		Date date = CalculateDateExtensions.addMinutes(this.expectedDate4, 1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
		expected = CreateDateExtensions.newDate(1971, 1, 31, 23, 59, 0);
		// Add negative value...
		date = CalculateDateExtensions.addMinutes(this.expectedDate4, -1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.date.CalculateDateExtensions#addMonths(java.util.Date, int)} .
	 */
	@Test
	public void testAddMonthsToDate()
	{

		this.expectedDate4 = CreateDateExtensions.newDate(1971, 2, 1, 0, 0, 0);

		final Date expected = CreateDateExtensions.newDate(1971, 3, 1, 0, 0, 0);

		final Date date = CalculateDateExtensions.addMonths(this.expectedDate4, 1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
	}

	/**
	 * Test method for {@link de.alpharogroup.date.CalculateDateExtensions#addHours(java.util.Date, int)}
	 * .
	 */
	@Test
	public void testAddSecondsToDate()
	{

		this.expectedDate4 = CreateDateExtensions.newDate(1971, 2, 1, 0, 0, 0);

		Date expected = CreateDateExtensions.newDate(1971, 2, 1, 0, 0, 1);

		Date date = CalculateDateExtensions.addSeconds(this.expectedDate4, 1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
		expected = CreateDateExtensions.newDate(1971, 1, 31, 23, 59, 59);
		// Add negative value...
		date = CalculateDateExtensions.addSeconds(this.expectedDate4, -1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
	}

	/**
	 * Test method for {@link de.alpharogroup.date.CalculateDateExtensions#addWeeks(java.util.Date, int)}
	 * .
	 */
	@Test
	public void testAddWeeksToDate()
	{

		this.expectedDate4 = CreateDateExtensions.newDate(1971, 2, 1, 0, 0, 0);

		final Date expected = CreateDateExtensions.newDate(1971, 2, 8, 0, 0, 0);

		final Date date = CalculateDateExtensions.addWeeks(this.expectedDate4, 1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
	}

	/**
	 * Test method for {@link de.alpharogroup.date.CalculateDateExtensions#addYears(Date, int)}.
	 */
	@Test
	public void testAddYearsToDate()
	{
		final Date testdate = CalculateDateExtensions.addYears(this.expectedDate1, 10);
		final Date expected = CreateDateExtensions.newDate(2010, 12, 31);
		AssertJUnit.assertTrue("The expected date should be 10 years after the expectedDate1.",
			testdate.equals(expected));
	}

	@Test
	public void testAfter()
	{
		final Date now = CreateDateExtensions.now();
		final Date future = CalculateDateExtensions.addDays(now, 2);
		boolean actual = CalculateDateExtensions.after(future, now);
		AssertJUnit.assertTrue("Future is after now.", actual);
		actual = CalculateDateExtensions.after(now, future);
		AssertJUnit.assertFalse("Now is not after future.", actual);
	}

	@Test
	public void testBefore()
	{
		final Date now = CreateDateExtensions.now();
		final Date future = CalculateDateExtensions.addDays(now, 2);
		boolean actual = CalculateDateExtensions.before(future, now);
		AssertJUnit.assertFalse("Future is not before now.", actual);
		actual = CalculateDateExtensions.before(now, future);
		AssertJUnit.assertTrue("Now is before future.", actual);
	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.date.CalculateDateExtensions#calculateElapsedTime(java.util.Date, java.util.Date)}
	 * .
	 */
	@Test(enabled = false)
	public void testCalculateElapsedTime()
	{
		final long expected = 141206695000l;
		final long elapsed = CalculateDateExtensions.calculateElapsedTime(this.expectedDate1,
			this.expectedDate2);
		AssertJUnit.assertTrue("The long elapsed should be equal with the expected.",
			elapsed == expected);
		final Age time = new Age(elapsed);
		final long inDays = (long)time.calculateInDays();
		final long expectedDays = 1634l;
		AssertJUnit.assertTrue("The calculated days should be equal with the expectedDays.",
			inDays == expectedDays);
		final long expectedYears = 4l;
		final long inYears = (long)time.calculateInYears();
		AssertJUnit.assertTrue("The calculated years should be equal with the expectedYears.",
			inYears == expectedYears);

	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.date.CalculateDateExtensions#calculateTimeFromNow(java.util.Date, java.util.Date)}
	 * .
	 */
	@Test(enabled = false)
	public void testCalculateTimeFromNow()
	{
		final long expected = 141206695000l;
		long elapsed = CalculateDateExtensions.calculateTimeFromNow(this.expectedDate1,
			this.expectedDate2);
		AssertJUnit.assertTrue("The long elapsed should be equal with the expected.",
			elapsed == expected);
		Age time = new Age(elapsed);

		final long expectedYears = 4l;
		final long inYears = (long)time.calculateInYears();
		AssertJUnit.assertTrue("The calculated years should be equal with the expectedYears.",
			inYears == expectedYears);

		final long expectedMonths = 54l;
		final long inMonths = (long)time.calculateInDefaultMonth();
		AssertJUnit.assertTrue("The calculated months should be equal with the expectedMonths.",
			inMonths == expectedMonths);

		final long inDays = (long)time.calculateInDays();
		final long expectedDays = 1634l;
		AssertJUnit.assertTrue("The calculated days should be equal with the expectedDays.",
			inDays == expectedDays);

		final long inHours = (long)time.calculateInHours();
		final long expectedHours = 39224l;
		AssertJUnit.assertTrue("The calculated hours should be equal with the expectedDays.",
			inHours == expectedHours);

		final long inMinutes = (long)time.calculateInMinutes();
		final long expectedMinutes = 2353444l;
		AssertJUnit.assertTrue("The calculated hours should be equal with the expectedDays.",
			inMinutes == expectedMinutes);

		final long inSeconds = (long)time.calculateInSeconds();
		final long expectedSeconds = 141206695l;
		AssertJUnit.assertTrue("The calculated hours should be equal with the expectedDays.",
			inSeconds == expectedSeconds);

		System.out.println(time.getHumanReadableAge());

		final Date myBirthday = CreateDateExtensions.newDate(1969, 8, 28, 16, 0, 0);
		final Date now = new Date();
		elapsed = CalculateDateExtensions.calculateTimeFromNow(myBirthday, now);
		time = new Age(elapsed);
		System.out.println(time.getHumanReadableAge());
	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.date.CalculateDateExtensions#computeAge(java.util.Date, java.util.Date)} .
	 */
	@Test
	public void testComputeAge()
	{
		final int computedAge = CalculateDateExtensions.computeAge(this.expectedDate1,
			this.expectedDate2);
		AssertJUnit.assertTrue("The computedAge should be 4.", computedAge == 4);
	}

	/**
	 * Test method for {@link de.alpharogroup.date.CalculateDateExtensions#computeEasternSunday(int)}.
	 */
	@Test
	public void testComputeEasternSunday()
	{
		final Date easternSunday2007 = CalculateDateExtensions.computeEasternSunday(2007);
		final Date expected = CreateDateExtensions.newDate(2007, 3, 8);
		AssertJUnit.assertTrue(easternSunday2007.equals(expected));
	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.date.CalculateDateExtensions#computeEasternSundayNumber(int)} .
	 */
	@Test
	public void testComputeEasternSundayNumber()
	{

		final int easternSundayNumber = CalculateDateExtensions.computeEasternSundayNumber(2007);
		AssertJUnit.assertTrue(easternSundayNumber == 131);

	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.date.CalculateDateExtensions#isDateInTheFuture(java.util.Date)} .
	 */
	@Test
	public void testIsDateInTheFuture()
	{
		final boolean now = CalculateDateExtensions.isDateInTheFuture(CalculateDateExtensions.addDays(
			new Date(), 1));
		AssertJUnit.assertTrue("Now is not in the future.", now);
		final boolean past = CalculateDateExtensions.isDateInTheFuture(this.expectedDate1);
		AssertJUnit.assertFalse("The expectedDate1 should be in the future.", past);
		final Date twra = CalculateDateExtensions.addDays(new Date(), 1);
		final boolean future = CalculateDateExtensions.isDateInTheFuture(twra);
		AssertJUnit.assertTrue("One day after now should be in the future.", future);
	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.date.CalculateDateExtensions#isDateInThePast(java.util.Date)} .
	 */
	@Test
	public void testIsDateInThePast()
	{
		final boolean now = CalculateDateExtensions.isDateInThePast(CalculateDateExtensions.addDays(
			new Date(), 1));
		AssertJUnit.assertFalse("Now is not in the past.", now);
		final boolean past = CalculateDateExtensions.isDateInThePast(this.expectedDate1);
		AssertJUnit.assertTrue("The expectedDate1 should be in the past.", past);
		final Date twra = CalculateDateExtensions.addDays(new Date(), 1);
		final boolean future = CalculateDateExtensions.isDateInThePast(twra);
		AssertJUnit.assertFalse("One day after now not should be the past.", future);
	}

	/**
	 * Test method for {@link de.alpharogroup.date.CalculateDateExtensions#isLeapYear(int)}.
	 */
	@Test
	public void testIsLeapYear()
	{
		AssertJUnit.assertTrue(CalculateDateExtensions.isLeapYear(2000));
		AssertJUnit.assertTrue(CalculateDateExtensions.isLeapYear(2004));
		AssertJUnit.assertTrue(CalculateDateExtensions.isLeapYear(2008));
	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.date.CalculateDateExtensions#isValidDate(java.lang.String, java.lang.String, boolean)}
	 * .
	 */
	@Test
	public void testIsValidDate()
	{
		AssertJUnit.assertTrue("Date should be valid.",
			CalculateDateExtensions.isValidDate(this.datum3, this.format3, false));
		AssertJUnit.assertFalse("Date should be invalid.",
			CalculateDateExtensions.isValidDate(this.datum4, this.format4, false));
	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.date.CalculateDateExtensions#substractDaysFromDate(java.util.Date, int)} .
	 */
	@Test
	public void testSubstractDaysFromDate()
	{
		final Date testDate = CreateDateExtensions.newDate(1971, 2, 2, 0, 0, 0);

		final Date expected = CreateDateExtensions.newDate(1971, 2, 1, 0, 0, 0);

		final Date date = CalculateDateExtensions.substractDaysFromDate(testDate, 1);

		AssertJUnit.assertTrue("The expected should be equal with date.", date.equals(expected));
	}

	/**
	 * Test method for
	 * {@link de.alpharogroup.date.CalculateDateExtensions#substractYearsFromDate(java.util.Date, int)} .
	 */
	@Test
	public void testSubstractYearsFromDate()
	{
		final Date actual = CreateDateExtensions.newDate(1971, 2, 2, 0, 0, 0);

		final Date expected = CreateDateExtensions.newDate(1970, 2, 2, 0, 0, 0);

		final Date date = CalculateDateExtensions.substractYearsFromDate(actual, 1);

		AssertJUnit.assertTrue("The expected should be equal with actual.", date.equals(expected));
	}

}
