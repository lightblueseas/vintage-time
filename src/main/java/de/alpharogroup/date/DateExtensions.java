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

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

/**
 * Utility class for the use of Date and Calendar object.
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public final class DateExtensions implements DatePatterns
{
	/**
	 * Returns a map with all date patterns from the Interface DatePatterns. As key is the name from
	 * the pattern.
	 *
	 * @return Returns a Map with all date patterns from the Interface DatePatterns.
	 * @throws IllegalAccessException
	 *             is thrown when an application tries to reflectively create an instance
	 */
	public static Map<String, Object> getAllDatePatterns() throws IllegalAccessException
	{
		final Field[] fields = DatePatterns.class.getFields();
		final Map<String, Object> patterns = new HashMap<>(fields.length);
		for (final Field field : fields)
		{
			patterns.put(field.getName(), field.get(field.getName()));
		}
		return patterns;
	}

	/**
	 * Returns a list with all date formats from the interface {@link DatePatterns}
	 *
	 * @return Returns a list with all dateformats from the interface {@link DatePatterns}
	 * @throws IllegalAccessException
	 *             is thrown when an application tries to reflectively create an instance
	 */
	public static List<String> getDatePatterns() throws IllegalAccessException
	{
		final Field[] fields = DatePatterns.class.getFields();
		final List<String> list = new ArrayList<>(fields.length);
		for (final Field field : fields)
		{
			list.add((String)field.get(field.getName()));
		}
		return list;
	}

	/**
	 * The Method from the Date.getDay is deprecated. This is a helper-Method.
	 *
	 * @param date
	 *            The Date-object to get the day.
	 * @return The day from the Date-object.
	 */
	public static int getDay(final Date date)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * The Method from the Date.getHours is deprecated. This is a helper-Method.
	 *
	 * @param date
	 *            The Date-object to get the hours.
	 * @return The hours from the Date-object.
	 */
	public static int getHours(final Date date)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * The Method from the Date.getMinutes is deprecated. This is a helper-Method.
	 *
	 * @param date
	 *            The Date-object to get the minutes.
	 * @return The minutes from the Date-object.
	 */
	public static int getMinutes(final Date date)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * The Method from the Date.getMonth is deprecated. This is a helper-Method.
	 *
	 * @param date
	 *            The Date-object to get the month.
	 * @return The month from the Date-object.
	 */
	public static int getMonth(final Date date)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH);
	}

	/**
	 * The Method from the Date.getSeconds is deprecated. This is a helper-Method.
	 *
	 * @param date
	 *            The Date-object to get the seconds.
	 * @return The seconds from the Date-object.
	 */
	public static int getSeconds(final Date date)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.SECOND);
	}

	/**
	 * The week of the year as an int from the given Date-object.
	 *
	 * @param date
	 *            The Date-object to get the week of the year.
	 * @return The week of the year from the Date-object.
	 */
	public static int getWeekOfYear(final Date date)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}

	/**
	 * The year as int from the Date-object.
	 *
	 * @param date
	 *            The Date-object to get the year.
	 * @return The year from the Date-object.
	 */
	public static int getYear(final Date date)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * Returns a new {@link Date} object from the given Date object and sets the given parameters.
	 *
	 * @param dateToSet
	 *            the date to set
	 * @param year
	 *            the year
	 * @param month
	 *            the month
	 * @param day
	 *            the day
	 * @param hour
	 *            the hour
	 * @param minute
	 *            the minute
	 * @param second
	 *            the second
	 * @param milliSecond
	 *            the mili second
	 * @param zone
	 *            the zone
	 * @param locale
	 *            the a locale
	 * @return the new {@link Date} object
	 */
	public static Date setDate(final Date dateToSet, final int year, final int month, final int day,
		final int hour, final int minute, final int second, final int milliSecond,
		final TimeZone zone, final Locale locale)
	{
		Objects.requireNonNull(dateToSet);
		final Calendar calendar = Calendar.getInstance(zone, locale);
		calendar.setTime(dateToSet);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DATE, day);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, milliSecond);
		return calendar.getTime();
	}

	/**
	 * Returns a new {@link Date} object from the given Date object and sets the given parameters.
	 *
	 * @param dateToSet
	 *            the date to set
	 * @param hour
	 *            the hour
	 * @param minute
	 *            the minute
	 * @param second
	 *            the second
	 * @param milliSecond
	 *            the mili second
	 * @param zone
	 *            the zone
	 * @param locale
	 *            the a locale
	 * @return the date
	 */
	public static Date setDate(final Date dateToSet, final int hour, final int minute,
		final int second, final int milliSecond, final TimeZone zone, final Locale locale)
	{
		Objects.requireNonNull(dateToSet);
		return setDate(dateToSet, getYear(dateToSet), getMonth(dateToSet), getDay(dateToSet), hour,
			minute, second, milliSecond, zone, locale);
	}

	private DateExtensions()
	{
	}

}
