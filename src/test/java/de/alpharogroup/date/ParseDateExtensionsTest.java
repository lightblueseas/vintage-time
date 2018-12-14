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
import static org.testng.AssertJUnit.assertNull;
import static org.testng.AssertJUnit.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.meanbean.factories.ObjectCreationException;
import org.meanbean.test.BeanTestException;
import org.meanbean.test.BeanTester;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * The unit test class for the class {@link ParseDateExtensions}
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public class ParseDateExtensionsTest
{

	/** The Constant DD_MM. */
	private static final String DD_MM = "dd.MM";

	/** The Constant DD_MM_YYYY_HH_MM_SS. */
	private static final String DD_MM_YYYY_HH_MM_SS = "dd.MM.yyyy HH:mm:ss";

	/** The Constant YYYY_MM_DD. */
	private static final String YYYY_MM_DD = "yyyy-MM-dd";

	/** The Constant YYYY_MMDD_HHMMSS. */
	private static final String YYYY_MMDD_HHMMSS = "yyyyMMddHHmmss";

	/** The datum1. */
	private String datum1 = null;

	/** The datum2. */
	private String datum2 = null;

	/** The datum3. */
	private String datum3 = null;

	/** The datum4. */
	private String datum4 = null;

	/** The expected date1. */
	private Date expectedDate1 = null;

	/** The expected date2. */
	private Date expectedDate2 = null;

	/** The expected date3. */
	private Date expectedDate3 = null;

	/** The expected date4. */
	private Date expectedDate4 = null;

	/** The format1. */
	private String format1 = null;

	/** The format2. */
	private String format2 = null;

	/** The format3. */
	private String format3 = null;

	/** The format4. */
	private String format4 = null;

	/**
	 * Sets up method will be invoked before every unit test method in this class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeMethod
	protected void setUp() throws Exception
	{
		this.datum1 = "2000-12-31";

		this.datum2 = "22.06.2005 09:04:55";
		this.datum3 = "20050621134451";
		this.datum4 = "32.13";
		this.format1 = YYYY_MM_DD;
		this.format2 = DD_MM_YYYY_HH_MM_SS;
		this.format3 = YYYY_MMDD_HHMMSS;
		this.format4 = DD_MM;

		this.expectedDate1 = CreateDateExtensions.newDate(2000, 12, 31);
		this.expectedDate2 = CreateDateExtensions.newDate(2005, 06, 22, 9, 4, 55);
		this.expectedDate3 = CreateDateExtensions.newDate(2005, 6, 21, 13, 44, 51);
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
		this.expectedDate3 = null;
		this.expectedDate4 = null;
	}

	/**
	 * Test method for {@link ParseDateExtensions#parseDate(String, List)}
	 */
	@Test
	public void testParseDate() throws IllegalArgumentException, IllegalAccessException
	{
		Date actual;
		Date expected;

		actual = ParseDateExtensions.parseDate(this.datum1,
			new ArrayList<>(DateExtensions.getDatePatterns()));
		expected = expectedDate1;
		assertEquals(actual, expected);

		actual = ParseDateExtensions.parseDate(this.datum1, new ArrayList<>());
		expected = null;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link ParseDateExtensions#parseToDate(String, String)}
	 *
	 * @throws ParseException
	 *             the parse exception
	 */
	@Test
	public void testparseToDate() throws ParseException
	{
		Date actual;
		Date expected;
		DateFormat dateFormat;

		// ----------------------------------------------
		dateFormat = new SimpleDateFormat(this.format1);
		expected = dateFormat.parse(this.datum1);
		actual = ParseDateExtensions.parseToDate(this.datum1, this.format1);
		assertEquals(actual, expected);
		assertEquals(actual, expectedDate1);
		// ----------------------------------------------

		dateFormat = new SimpleDateFormat(format2);
		expected = dateFormat.parse(datum2);
		actual = ParseDateExtensions.parseToDate(datum2, format2);
		assertEquals(actual, expected);
		assertEquals(actual, expectedDate2);
		// -----------------------------------------------

		dateFormat = new SimpleDateFormat(format3);
		expected = dateFormat.parse(datum3);
		actual = ParseDateExtensions.parseToDate(datum3, format3);
		assertEquals(actual, expected);
		assertEquals(actual, expectedDate3);

		// -----------------------------------------------

		dateFormat = new SimpleDateFormat(format4);
		expected = dateFormat.parse(datum4);
		actual = ParseDateExtensions.parseToDate(datum4, format4);
		assertEquals(actual, expected);
		assertEquals(actual, expectedDate4);
		// -----------------------------------------------
	}

	/**
	 * Test method for {@link ParseDateExtensions#parseToString(String, String, String)}
	 */
	@Test
	public void testParseToDateAndParseToString()
	{
		final String expected = "20120810";
		String actual = null;
		try
		{
			actual = ParseDateExtensions.parseToString("10.08.2012", "dd.MM.yyyy", "yyyyMMdd");
		}
		catch (final ParseException e)
		{
			e.printStackTrace();
		}
		assertTrue(
			"Generated actual date string '" + actual
				+ "' should be equal with the expected value '" + expected + "'.",
			expected.equals(actual));
	}

	/**
	 * Test method for {@link ParseDateExtensions#parseToDateLenient(String, String, boolean)}
	 *
	 * @throws ParseException
	 *             the parse exception
	 */
	@Test
	public void testParseToDateLenient() throws ParseException
	{
		Date actual;
		Date expected;
		DateFormat dateFormat;
		// ----------------------------------------------
		dateFormat = new SimpleDateFormat(format1);
		expected = dateFormat.parse(datum1);
		actual = ParseDateExtensions.parseToDateLenient(datum1, format1, false);
		assertEquals(actual, expected);
		assertEquals(actual, expectedDate1);

		// ----------------------------------------------
		dateFormat = new SimpleDateFormat(format2);
		expected = dateFormat.parse(datum2);
		actual = ParseDateExtensions.parseToDateLenient(datum2, format2, false);
		assertEquals(actual, expected);
		assertEquals(actual, expectedDate2);

		// -----------------------------------------------
		dateFormat = new SimpleDateFormat(format3);
		expected = dateFormat.parse(datum3);
		actual = ParseDateExtensions.parseToDateLenient(datum3, format3, false);
		assertEquals(actual, expected);
		assertEquals(actual, expectedDate3);

		// -----------------------------------------------
		dateFormat = new SimpleDateFormat(format4);
		expected = dateFormat.parse(datum4);
		actual = ParseDateExtensions.parseToDateLenient(datum4, format4, false);
		assertNull(actual);
		assertEquals(expected, expectedDate4);

		// -----------------------------------------------
		dateFormat = new SimpleDateFormat(format4);
		expected = dateFormat.parse(datum4);
		actual = ParseDateExtensions.parseToDateLenient(null, format4, false);
		assertNull(actual);
		assertEquals(expected, expectedDate4);

	}

	/**
	 * Test method for {@link ParseDateExtensions#parseToDate(String, String)}
	 */
	@Test
	public void testParseToDateStringString()
	{
		Date testDate = null;
		try
		{
			testDate = ParseDateExtensions.parseToDate(this.datum1, this.format1);
		}
		catch (final ParseException e)
		{
			e.printStackTrace();
		}
		assertTrue("The expectedDate1 is not equal with the testDate.",
			this.expectedDate1.equals(testDate));
	}

	/**
	 * Test method for {@link ParseDateExtensions#parseToDate(String, String[], Locale)}
	 */
	@Test
	public void testParseToDateStringStringArrayLocale()
	{
		final Locale de = new Locale("de", "DE");
		final String formats[] = { this.format2, this.format3 };
		Date testDate = ParseDateExtensions.parseToDate(this.datum1, formats, de);
		assertNull(testDate);
		formats[0] = this.format1;
		testDate = ParseDateExtensions.parseToDate(this.datum1, formats, de);
		assertNotNull(testDate);
		assertTrue("Generated testDate should be equal with the expectedDate1.",
			testDate.equals(this.expectedDate1));

	}

	/**
	 * Test method for {@link ParseDateExtensions#parseToString(Date, String)}
	 */
	@Test
	public void testParseToString()
	{
		final String testString = ParseDateExtensions.parseToString(this.expectedDate1,
			this.format1);
		assertTrue("Generated testString should be equal with the datum1.",
			testString.equals(this.datum1));
		System.out.println();
	}

	/**
	 * Test method for {@link ParseDateExtensions}
	 */
	@Test(expectedExceptions = { BeanTestException.class, ObjectCreationException.class })
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(ParseDateExtensions.class);
	}
}
