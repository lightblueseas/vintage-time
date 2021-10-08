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

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;

import org.testng.annotations.Test;

import io.github.astrapi69.collections.list.ListExtensions;
import io.github.astrapi69.collections.set.SetFactory;

/**
 * The unit test class for the class {@link StringDatePatternExtensions}
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public class StringDatePatternExtensionsTest
{

	/** The datum1. */
	private String datum1;

	/** The expected date1. */
	private Date expectedDate1;

	/**
	 * Test method for {@link StringDatePatternExtensions#resolvePattern(String, Set, BiFunction)}
	 *
	 * @throws ParseException
	 *             if the beginning of the specified string cannot be parsed
	 */
	@Test
	public void testResolvePattern() throws ParseException
	{

		Date actual;
		Date expected;
		datum1 = "2000-12-31";

		expectedDate1 = CreateDateExtensions.newDate(2000, 12, 31);
		List<String> matchedPatterns = StringDatePatternExtensions.resolvePattern(datum1,
			SetFactory.newHashSet(DateExtensions.getDatePatterns()),
			(s1, s2) -> s1.length() == s2.length() && s2.contains("-"));
		assertTrue(matchedPatterns.size() == 1);
		String firstMatchedPattern = ListExtensions.getFirst(matchedPatterns);
		actual = ParseDateExtensions.parseToDate(datum1, firstMatchedPattern);
		expected = expectedDate1;
		assertEquals(actual, expected);
	}
}