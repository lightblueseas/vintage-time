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

import java.util.Calendar;
import java.util.Date;

/**
 * Utility class for the use of Date and Calendar object.
 *
 * @author Asterios Raptis
 * @version 1.0
 */
public final class ConvertDateExtensions
{
	private ConvertDateExtensions()
	{
	}

	/**
	 * Converts a Date to a Calendar-object.
	 *
	 * @param date
	 *            The date to convert.
	 * @return The calendar from the date.
	 */
	public static Calendar toCalendar(final Date date)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

	/**
	 * Converts the given long value to a calendar object.
	 *
	 * @param millis
	 *            the millis
	 * @return the calendar
	 */
	public static Calendar toCalendar(final long millis)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar;
	}

	/**
	 * Converts a Calendar-object to a Date.
	 *
	 * @param calendar
	 *            The calendar to convert.
	 * @return The date from the calendar.
	 */
	public static Date toDate(final Calendar calendar)
	{
		return calendar.getTime();
	}

	/**
	 * Converts the given long value to a Date object.
	 *
	 * @param millis
	 *            the millis
	 * @return the date
	 */
	public static Date toDate(final long millis)
	{
		return toDate(toCalendar(millis));
	}

}
