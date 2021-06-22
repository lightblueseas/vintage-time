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
package io.github.astrapi69.date;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

/**
 * The class {@link DatePatterns}.
 */
public class DatePatternsTest
{

	/**
	 * Test method for all constants of {@link io.github.astrapi69.date.DatePatterns}
	 */
	@Test
	public void testConstants()
	{

		String actual;
		String expected;

		actual = DatePatterns.DD_MMM_YY;
		expected = "dd-MMM-yy";
		assertEquals(expected, actual);

		actual = DatePatterns.DOT_DD_MM;
		expected = "dd.MM";
		assertEquals(expected, actual);

		actual = DatePatterns.DOT_DD_MM_YY;
		expected = "dd.MM.yy";
		assertEquals(expected, actual);

		actual = DatePatterns.DOT_DD_MM_YYYY;
		expected = "dd.MM.yyyy";
		assertEquals(expected, actual);

		actual = DatePatterns.DOT_DD_MM_YYYY_HH_MM_SS;
		expected = "dd.MM.yyyy HH:mm:ss";
		assertEquals(expected, actual);

		actual = DatePatterns.DOT_YYYY_MM_DD_HH_MM_SS;
		expected = "yyyy.MM.dd.HH.mm.ss";
		assertEquals(expected, actual);

		actual = DatePatterns.EEE_MMM_DD_HH_MM_SS_Z_YYYY;
		expected = "EEE MMM dd hh:mm:ss z yyyy";
		assertEquals(expected, actual);

		actual = DatePatterns.EEEE_MMM_DD_YYYY;
		expected = "EEEE MMM dd, yyyy";
		assertEquals(expected, actual);

		actual = DatePatterns.LHH_MM_SS;
		expected = "hh:mm:ss";
		assertEquals(expected, actual);

		actual = DatePatterns.UHH_MM;
		expected = "HH:mm";
		assertEquals(expected, actual);

		actual = DatePatterns.UHH_MM_SS;
		expected = "HH:mm:ss";
		assertEquals(expected, actual);

		actual = DatePatterns.YYYY_MM_DD;
		expected = "yyyy-MM-dd";
		assertEquals(expected, actual);

		actual = DatePatterns.YYYY_MM_DD_HH_MM_SS;
		expected = "yyyy-MM-dd hh:mm:ss";
		assertEquals(expected, actual);

		actual = DatePatterns.YYYY_MM_DD_HH_MM_SS_S;
		expected = "yyyy-MM-dd hh:mm:ss.S";
		assertEquals(expected, actual);

		actual = DatePatterns.YYYY_MM_DD_T_HH_MM_SS;
		expected = "yyyy-MM-dd'T'HH:mm:ss";
		assertEquals(expected, actual);

		actual = DatePatterns.YYYYMMDDHHMMSS;
		expected = "yyyyMMddHHmmss";
		assertEquals(expected, actual);
	}

}
