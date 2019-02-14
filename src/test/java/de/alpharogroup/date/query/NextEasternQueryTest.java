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
package de.alpharogroup.date.query;

import static org.testng.AssertJUnit.assertEquals;

import java.time.LocalDate;

import org.testng.annotations.Test;

/**
 * The unit test class for the class {@link NextEasternQuery}
 */
public class NextEasternQueryTest
{

	/**
	 * Test method for {@link NextEasternQuery#queryFrom(java.time.temporal.TemporalAccessor)}
	 */
	@Test
	public final void testQueryFrom()
	{
		LocalDate actual;
		LocalDate expected;
		LocalDate valentinsDay;
		LocalDate thanksgivingDay;
		
		valentinsDay = LocalDate.of(2019, 2, 14);
		actual = valentinsDay.query(new NextEasternQuery());
		expected = LocalDate.of(2019, 4, 21);
		assertEquals(actual, expected);

		thanksgivingDay = LocalDate.of(2019, 11, 28);
		actual = thanksgivingDay.query(new NextEasternQuery());
		expected = LocalDate.of(2020, 4, 12);
		assertEquals(actual, expected);
	}

}