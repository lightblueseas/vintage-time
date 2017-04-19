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

import static org.testng.AssertJUnit.assertTrue;

import java.util.Date;

import org.testng.annotations.Test;

/**
 * The test class {@link AgeTest} is for the class {@link Age}.
 */
public class AgeTest
{

	/**
	 * Test method for {@link de.alpharogroup.date.Age#calculateInDays()}
	 */
	@Test
	public void testCalculateInDays()
	{
		final Date birthDayNick = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		final Date now = CreateDateExtensions.now();
		long elapsed = CalculateDateExtensions.calculateElapsedTime(birthDayNick, now);
		final Age ageOfNick = new Age(birthDayNick);
		int expected = (int)(elapsed / Age.ONE_DAY);
		int actual = (int)ageOfNick.calculateInDays();
		assertTrue(actual == expected);

		final Date birthDayJohnDoe = CreateDateExtensions.newDate(1987, 12, 24);
		Age ageOfJohnDoe = Age.of(CreateDateExtensions.newDate(1987, 12, 24));
		elapsed = CalculateDateExtensions.calculateElapsedTime(birthDayJohnDoe, now);
		expected = (int)(elapsed / Age.ONE_DAY);
		actual = (int)ageOfJohnDoe.calculateInDays();
		assertTrue(actual == expected);
	}

	/**
	 * Test method for {@link de.alpharogroup.date.Age#calculateInHours()}
	 */
	@Test
	public void testCalculateInHours()
	{
		final Date birthDayNick = CreateDateExtensions.newDate(2007, 11, 8, 19, 0, 0);
		final Date now = CreateDateExtensions.now();
		final long elapsed = CalculateDateExtensions.calculateElapsedTime(birthDayNick, now);
		final Age bdn = new Age(birthDayNick);
		final int expected = (int)(elapsed / Age.ONE_HOUR);
		final int actual = (int)bdn.calculateInHours();
		assertTrue(actual == expected);
	}

}
