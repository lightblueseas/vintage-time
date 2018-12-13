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

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

import java.util.Arrays;
import java.util.Date;

import org.testng.annotations.Test;

/**
 * The test class {@link AgeTest} is for the class {@link Age}.
 */
public class AgeTest
{

	/**
	 * Test method for {@link Age#calculateInDays()}
	 */
	@Test
	public void testCalculateInDays()
	{
		int actual;
		int expected;
		long elapsed;
		Age age;
		Date now;
		Date birthDay;
		now = CreateDateExtensions.now();
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		actual = (int)age.calculateInDays();
		expected = (int)(elapsed / Age.ONE_DAY);
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = Age.of(birthDay);
		expected = (int)(elapsed / Age.ONE_DAY);
		actual = (int)age.calculateInDays();
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 3, 44);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = Age.of(birthDay);
		expected = (int)(elapsed / Age.ONE_DAY);
		actual = (int)age.calculateInDays();
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 0, 3, 44);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = Age.of(birthDay);
		expected = (int)(elapsed / Age.ONE_DAY);
		actual = (int)age.calculateInDays();
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link Age#calculateInDefaultMonth()}.
	 */
	@Test
	public void testCalculateInDefaultMonth()
	{
		int actual;
		int expected;
		long elapsed;
		Age age;
		Date now;
		Date birthDay;
		now = CreateDateExtensions.now();
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		expected = (int)(elapsed / Age.ONE_DEFAULT_MONTH);
		actual = (int)age.calculateInDefaultMonth();
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = Age.of(birthDay);
		expected = (int)(elapsed / Age.ONE_DEFAULT_MONTH);
		actual = (int)age.calculateInDefaultMonth();
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 14, 22);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		expected = (int)(elapsed / Age.ONE_DEFAULT_MONTH);
		actual = (int)age.calculateInDefaultMonth();
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 0, 14, 22);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		expected = (int)(elapsed / Age.ONE_DEFAULT_MONTH);
		actual = (int)age.calculateInDefaultMonth();
		assertEquals(actual, expected);
	}


	/**
	 * Test method for {@link Age#calculateInDefaultMonth(long)}.
	 */
	@Test
	public void testCalculateInDefaultMonthLong()
	{
		int actual;
		int expected;
		long elapsed;
		Age age;
		Date now;
		Date birthDay;
		now = CreateDateExtensions.now();
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		expected = (int)(elapsed / Age.ONE_DEFAULT_MONTH);
		actual = (int)age.calculateInDefaultMonth(elapsed);
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = Age.of(birthDay);
		expected = (int)(elapsed / Age.ONE_DEFAULT_MONTH);
		actual = (int)age.calculateInDefaultMonth(elapsed);
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 0, 0, 0);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		expected = (int)(elapsed / Age.ONE_DEFAULT_MONTH);
		actual = (int)age.calculateInDefaultMonth(elapsed);
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link Age#calculateInHours()}
	 */
	@Test
	public void testCalculateInHours()
	{
		int actual;
		int expected;
		long elapsed;
		Age age;
		Date now;
		Date birthDay;
		now = CreateDateExtensions.now();
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		expected = (int)(elapsed / Age.ONE_HOUR);
		actual = (int)age.calculateInHours();
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = Age.of(birthDay);
		expected = (int)(elapsed / Age.ONE_HOUR);
		actual = (int)age.calculateInHours();
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link Age#calculateInMinutes()}.
	 */
	@Test
	public void testCalculateInMinutes()
	{
		int actual;
		int expected;
		long elapsed;
		Age age;
		Date now;
		Date birthDay;
		now = CreateDateExtensions.now();
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		expected = (int)(elapsed / Age.ONE_MINUTE);
		actual = (int)age.calculateInMinutes();
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = Age.of(birthDay);
		expected = (int)(elapsed / Age.ONE_MINUTE);
		actual = (int)age.calculateInMinutes();
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link Age#calculateInMinutes(long)}.
	 */
	@Test
	public void testCalculateInMinutesLong()
	{
		int actual;
		int expected;
		long elapsed;
		Age age;
		Date now;
		Date birthDay;
		now = CreateDateExtensions.now();
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		expected = (int)(elapsed / Age.ONE_MINUTE);
		actual = (int)age.calculateInMinutes(elapsed);
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = Age.of(birthDay);
		expected = (int)(elapsed / Age.ONE_MINUTE);
		actual = (int)age.calculateInMinutes(elapsed);
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link Age#calculateInSeconds()}.
	 */
	@Test
	public void testCalculateInSeconds()
	{
		int actual;
		int expected;
		long elapsed;
		Age age;
		Date now;
		Date birthDay;
		now = CreateDateExtensions.now();
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		expected = (int)(elapsed / Age.ONE_SECOND);
		actual = (int)age.calculateInSeconds();
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = Age.of(birthDay);
		expected = (int)(elapsed / Age.ONE_SECOND);
		actual = (int)age.calculateInSeconds();
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link Age#calculateInSeconds(long)}.
	 */
	@Test
	public void testCalculateInSecondsLong()
	{
		int actual;
		int expected;
		long elapsed;
		Age age;
		Date now;
		Date birthDay;
		now = CreateDateExtensions.now();
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = new Age(birthDay);
		expected = (int)(elapsed / Age.ONE_SECOND);
		actual = (int)age.calculateInSeconds(elapsed);
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		age = Age.of(birthDay);
		expected = (int)(elapsed / Age.ONE_SECOND);
		actual = (int)age.calculateInSeconds(elapsed);
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link Age#calculateInYearsMonthsDaysHoursMinutesAndSeconds()}.
	 */
	@Test
	public void testCalculateInYearsMonthsDaysHoursMinutesAndSeconds()
	{
		int actual[];
		int expected[];
		Age age;
		Date till;
		Date birthDay;
		// new scenario...
		till = CreateDateExtensions.newDate(2010, 11, 8, 19, 0, 0);

		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		age = new Age(birthDay, till);
		expected = new int[6];
		expected[0] = 3;
		expected[1] = 0;
		expected[2] = 0;
		expected[3] = 6;
		expected[4] = 0;
		expected[5] = 0;
		actual = age.calculateInYearsMonthsDaysHoursMinutesAndSeconds();
		assertArrayEquals(actual, expected);
		assertTrue(Arrays.equals(actual, expected));
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		age = Age.of(birthDay, till);
		expected = new int[6];
		expected[0] = 22;
		expected[1] = 10;
		expected[2] = 20;
		expected[3] = 7;
		expected[4] = 0;
		expected[5] = 0;
		actual = age.calculateInYearsMonthsDaysHoursMinutesAndSeconds();
		assertArrayEquals(actual, expected);
		assertTrue(Arrays.equals(actual, expected));
	}

	/**
	 * Test method for {@link Age#calculateInYearsMonthsDaysHoursMinutesAndSeconds(long)}.
	 */
	@Test
	public void testCalculateInYearsMonthsDaysHoursMinutesAndSecondsLong()
	{
		int actual[];
		int expected[];
		long elapsed;
		Age age;
		Date till;
		Date birthDay;
		// new scenario...
		till = CreateDateExtensions.newDate(2010, 11, 8, 19, 0, 0);

		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, till);
		age = new Age(birthDay, till);
		expected = new int[6];
		expected[0] = 3;
		expected[1] = 0;
		expected[2] = 0;
		expected[3] = 6;
		expected[4] = 0;
		expected[5] = 0;
		actual = age.calculateInYearsMonthsDaysHoursMinutesAndSeconds(elapsed);
		assertTrue(Arrays.equals(actual, expected));
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, till);
		age = Age.of(birthDay, till);
		expected[0] = 22;
		expected[1] = 10;
		expected[2] = 20;
		expected[3] = 7;
		expected[4] = 0;
		expected[5] = 0;
		actual = age.calculateInYearsMonthsDaysHoursMinutesAndSeconds(elapsed);
		assertTrue(Arrays.equals(actual, expected));
	}

	/**
	 * Test method for {@link Age#getHumanReadableAge()}.
	 */
	@Test
	public void testGetHumanReadableAge()
	{
		String actual;
		String expected;
		Age age;
		Date till;
		Date birthDay;
		till = CreateDateExtensions.newDate(2010, 11, 8, 19, 0, 0);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		age = new Age(birthDay, till);
		expected = "Your are 3 years 0 months 0 days 6 hours 0 minutes 0 seconds young!";
		actual = age.getHumanReadableAge();
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		age = Age.of(birthDay, till);
		expected = "Your are 22 years 10 months 20 days 7 hours 0 minutes 0 seconds young!";
		actual = age.getHumanReadableAge();
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link Age#getHumanReadableAge(int[])}.
	 */
	@Test
	public void testGetHumanReadableAgeIntArray()
	{
		String actual;
		String expected;
		Age age;
		Date till;
		Date birthDay;
		int[] readableAge;
		till = CreateDateExtensions.newDate(2010, 11, 8, 19, 0, 0);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		age = new Age(birthDay, till);
		readableAge = new int[6];
		readableAge[0] = 3;
		readableAge[1] = 0;
		readableAge[2] = 0;
		readableAge[3] = 6;
		readableAge[4] = 0;
		readableAge[5] = 0;
		actual = age.getHumanReadableAge(readableAge);
		expected = "Your are 3 years 0 months 0 days 6 hours 0 minutes 0 seconds young!";
		assertEquals(actual, expected);
		// new scenario...
		birthDay = CreateDateExtensions.newDate(1987, 12, 24);
		age = Age.of(birthDay, till);
		readableAge[0] = 22;
		readableAge[1] = 10;
		readableAge[2] = 20;
		readableAge[3] = 7;
		readableAge[4] = 0;
		readableAge[5] = 0;
		actual = age.getHumanReadableAge(readableAge);
		expected = "Your are 22 years 10 months 20 days 7 hours 0 minutes 0 seconds young!";
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link Age#of(Date, Date)}.
	 */
	@Test
	public void testOfDateDate()
	{
		int actual;
		int expected;
		long elapsed;
		Age age;
		Date now;
		Date birthDay;
		now = CreateDateExtensions.now();
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		age = Age.of(birthDay, now);
		assertNotNull(age);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		expected = (int)(elapsed / Age.ONE_DAY);
		actual = (int)age.calculateInDays();
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link Age#of(long)}.
	 */
	@Test
	public void testOfLong()
	{
		int actual;
		int expected;
		long elapsed;
		Age age;
		Date now;
		Date birthDay;
		now = CreateDateExtensions.now();
		// new scenario...
		birthDay = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		age = Age.of(birthDay.getTime());
		assertNotNull(age);
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDay, now);
		expected = (int)(elapsed / Age.ONE_DAY);
		actual = (int)age.calculateInDays();
		assertEquals(actual, expected);
	}

}
