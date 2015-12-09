package de.alpharogroup.date;

import java.util.Date;

import org.testng.AssertJUnit;
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
		final long elapsed = CalculateDateExtensions.calculateElapsedTime(birthDayNick, now);
		final Age bdn = new Age(birthDayNick);
		final int expected = (int)(elapsed / Age.ONE_DAY);
		final int actual = (int)bdn.calculateInDays();
		AssertJUnit.assertTrue(actual == expected);
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
		AssertJUnit.assertTrue(actual == expected);
	}

}
