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
 * The test class for the enum class {@link DatePattern}
 */
public class DatePatternTest
{

	/**
	 * Test method for all enum values of {@link DatePattern}
	 */
	@Test
	public void testEnumValues()
	{

		String actual;
		String expected;

		actual = DatePattern.DD_MMM_YY.getValue();
		expected = "dd-MMM-yy";
		assertEquals(expected, actual);

		actual = DatePattern.DOT_DD_MM.getValue();
		expected = "dd.MM";
		assertEquals(expected, actual);

		actual = DatePattern.DOT_DD_MM_YY.getValue();
		expected = "dd.MM.yy";
		assertEquals(expected, actual);

		actual = DatePattern.DOT_DD_MM_YYYY.getValue();
		expected = "dd.MM.yyyy";
		assertEquals(expected, actual);

		actual = DatePattern.DOT_DD_MM_YYYY_HH_MM_SS.getValue();
		expected = "dd.MM.yyyy HH:mm:ss";
		assertEquals(expected, actual);

		actual = DatePattern.DOT_YYYY_MM_DD_HH_MM_SS.getValue();
		expected = "yyyy.MM.dd.HH.mm.ss";
		assertEquals(expected, actual);

		actual = DatePattern.EEE_MMM_DD_HH_MM_SS_Z_YYYY.getValue();
		expected = "EEE MMM dd hh:mm:ss z yyyy";
		assertEquals(expected, actual);

		actual = DatePattern.EEEE_MMM_DD_YYYY.getValue();
		expected = "EEEE MMM dd, yyyy";
		assertEquals(expected, actual);

		actual = DatePattern.LHH_MM_SS.getValue();
		expected = "hh:mm:ss";
		assertEquals(expected, actual);

		actual = DatePattern.UHH_MM.getValue();
		expected = "HH:mm";
		assertEquals(expected, actual);

		actual = DatePattern.UHH_MM_SS.getValue();
		expected = "HH:mm:ss";
		assertEquals(expected, actual);

		actual = DatePattern.YYYY_MM_DD.getValue();
		expected = "yyyy-MM-dd";
		assertEquals(expected, actual);

		actual = DatePattern.YYYY_MM_DD_HH_MM_SS.getValue();
		expected = "yyyy-MM-dd hh:mm:ss";
		assertEquals(expected, actual);

		actual = DatePattern.YYYY_MM_DD_HH_MM_SS_S.getValue();
		expected = "yyyy-MM-dd hh:mm:ss.S";
		assertEquals(expected, actual);

		actual = DatePattern.YYYY_MM_DD_T_HH_MM_SS.getValue();
		expected = "yyyy-MM-dd'T'HH:mm:ss";
		assertEquals(expected, actual);

		actual = DatePattern.YYYYMMDDHHMMSS.getValue();
		expected = "yyyyMMddHHmmss";
		assertEquals(expected, actual);
	}

	/**
	 * Test method for all constants of {@link io.github.astrapi69.date.DatePattern}
	 */
	@Test
	public void testConstants()
	{

		String actual;
		String expected;

		actual = DatePattern.DD_MMM_YY_PATTERN;
		expected = "dd-MMM-yy";
		assertEquals(expected, actual);

		actual = DatePattern.DOT_DD_MM_PATTERN;
		expected = "dd.MM";
		assertEquals(expected, actual);

		actual = DatePattern.DOT_DD_MM_YY_PATTERN;
		expected = "dd.MM.yy";
		assertEquals(expected, actual);

		actual = DatePattern.DOT_DD_MM_YYYY_PATTERN;
		expected = "dd.MM.yyyy";
		assertEquals(expected, actual);

		actual = DatePattern.DOT_DD_MM_YYYY_HH_MM_SS_PATTERN;
		expected = "dd.MM.yyyy HH:mm:ss";
		assertEquals(expected, actual);

		actual = DatePattern.DOT_YYYY_MM_DD_HH_MM_SS_PATTERN;
		expected = "yyyy.MM.dd.HH.mm.ss";
		assertEquals(expected, actual);

		actual = DatePattern.EEE_MMM_DD_HH_MM_SS_Z_YYYY_PATTERN;
		expected = "EEE MMM dd hh:mm:ss z yyyy";
		assertEquals(expected, actual);

		actual = DatePattern.EEEE_MMM_DD_YYYY_PATTERN;
		expected = "EEEE MMM dd, yyyy";
		assertEquals(expected, actual);

		actual = DatePattern.LHH_MM_SS_PATTERN;
		expected = "hh:mm:ss";
		assertEquals(expected, actual);

		actual = DatePattern.UHH_MM_PATTERN;
		expected = "HH:mm";
		assertEquals(expected, actual);

		actual = DatePattern.UHH_MM_SS_PATTERN;
		expected = "HH:mm:ss";
		assertEquals(expected, actual);

		actual = DatePattern.YYYY_MM_DD_PATTERN;
		expected = "yyyy-MM-dd";
		assertEquals(expected, actual);

		actual = DatePattern.YYYY_MM_DD_HH_MM_SS_PATTERN;
		expected = "yyyy-MM-dd hh:mm:ss";
		assertEquals(expected, actual);

		actual = DatePattern.YYYY_MM_DD_HH_MM_SS_S_PATTERN;
		expected = "yyyy-MM-dd hh:mm:ss.S";
		assertEquals(expected, actual);

		actual = DatePattern.YYYY_MM_DD_T_HH_MM_SS_PATTERN;
		expected = "yyyy-MM-dd'T'HH:mm:ss";
		assertEquals(expected, actual);

		actual = DatePattern.YYYYMMDDHHMMSS_PATTERN;
		expected = "yyyyMMddHHmmss";
		assertEquals(expected, actual);
	}
}
