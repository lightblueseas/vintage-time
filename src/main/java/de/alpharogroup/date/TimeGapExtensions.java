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

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

/**
 * The class {@link TimeGapExtensions} provides methods for check time gaps
 */
@UtilityClass
public class TimeGapExtensions
{

	/**
	 * Checks if the given first {@link LocalDate} has a time gap before the given second
	 * {@link LocalDate} with the given {@link ChronoUnit}
	 *
	 * @param localDate
	 *            the local date
	 * @param otherLocalDate
	 *            the other local date
	 * @param chronoUnit
	 *            the chrono unit
	 * @return true, if the given first {@link LocalDate} has a time gap before the given second
	 *         {@link LocalDate} with the given {@link ChronoUnit} otherwise false
	 */
	public boolean isBeforeTimeGap(LocalDate localDate, LocalDate otherLocalDate,
		@NonNull ChronoUnit chronoUnit)
	{
		long between = chronoUnit.between(localDate, otherLocalDate);
		return between < -1;
	}

	/**
	 * Checks if the given first {@link LocalDate} has a time gap after the given second
	 * {@link LocalDate} with the given {@link ChronoUnit}
	 *
	 * @param localDate
	 *            the local date
	 * @param otherLocalDate
	 *            the other local date
	 * @param chronoUnit
	 *            the chrono unit
	 * @return true, if the given first {@link LocalDate} has a time gap after the given second
	 *         {@link LocalDate} with the given {@link ChronoUnit} otherwise false
	 */
	public boolean isAfterTimeGap(LocalDate localDate, LocalDate otherLocalDate,
		@NonNull ChronoUnit chronoUnit)
	{
		long between = chronoUnit.between(localDate, otherLocalDate);
		return 1 < between;
	}
}