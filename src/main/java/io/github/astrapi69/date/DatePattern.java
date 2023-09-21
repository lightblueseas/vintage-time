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

/**
 * The enum class {@link DatePattern} that holds date patterns
 */
public enum DatePattern
{

	YYYY_MM_DD_T_HH_MM_SS(DatePattern.YYYY_MM_DD_T_HH_MM_SS_PATTERN), EEEE_MMM_DD_YYYY(
		DatePattern.EEEE_MMM_DD_YYYY_PATTERN), YYYY_MM_DD_HH_MM_SS(
			DatePattern.YYYY_MM_DD_HH_MM_SS_PATTERN), DD_MMM_YY(
				DatePattern.DD_MMM_YY_PATTERN), DOT_YYYY_MM_DD_HH_MM_SS(
					DatePattern.DOT_YYYY_MM_DD_HH_MM_SS_PATTERN), EEE_MMM_DD_HH_MM_SS_Z_YYYY(
						DatePattern.EEE_MMM_DD_HH_MM_SS_Z_YYYY_PATTERN), YYYY_MM_DD_HH_MM_SS_S(
							DatePattern.YYYY_MM_DD_HH_MM_SS_S_PATTERN), DOT_DD_MM(
								DatePattern.DOT_DD_MM_PATTERN), YYYYMMDDHHMMSS(
									DatePattern.YYYYMMDDHHMMSS_PATTERN), UHH_MM_SS(
										DatePattern.UHH_MM_SS_PATTERN), UHH_MM(
											DatePattern.UHH_MM_PATTERN), LHH_MM_SS(
												DatePattern.LHH_MM_SS_PATTERN), DOT_DD_MM_YYYY(
													DatePattern.DOT_DD_MM_YYYY_PATTERN), DOT_DD_MM_YYYY_HH_MM_SS(
														DatePattern.DOT_DD_MM_YYYY_HH_MM_SS_PATTERN), YYYY_MM_DD(
															DatePattern.YYYY_MM_DD_PATTERN), DOT_DD_MM_YY(
																DatePattern.DOT_DD_MM_YY_PATTERN);

	/**
	 * Dateformat in String. Current value:"yyyy-MM-dd'T'HH:mm:ss"
	 */
	public static final String YYYY_MM_DD_T_HH_MM_SS_PATTERN = "yyyy-MM-dd'T'HH:mm:ss";

	/**
	 * Dateformat in String. Current value:"EEEE MMM dd, yyyy"
	 */
	public static final String EEEE_MMM_DD_YYYY_PATTERN = "EEEE MMM dd, yyyy";

	/**
	 * Dateformat in String. Current value:"dd-MMM-yy"
	 */
	public static final String YYYY_MM_DD_HH_MM_SS_PATTERN = "yyyy-MM-dd hh:mm:ss";

	/**
	 * Dateformat in String. Current value:"dd-MMM-yy"
	 */
	public static final String DD_MMM_YY_PATTERN = "dd-MMM-yy";

	/**
	 * Dateformat in String. Current value:"yyyy.MM.dd.HH.mm.ss"
	 */
	public static final String DOT_YYYY_MM_DD_HH_MM_SS_PATTERN = "yyyy.MM.dd.HH.mm.ss";

	/**
	 * Dateformat in String. Current value:"EEE MMM dd hh:mm:ss z yyyy"
	 */
	public static final String EEE_MMM_DD_HH_MM_SS_Z_YYYY_PATTERN = "EEE MMM dd hh:mm:ss z yyyy";

	/**
	 * Dateformat in String. Current value:"yyyy-MM-dd hh:mm:ss.S"
	 */
	public static final String YYYY_MM_DD_HH_MM_SS_S_PATTERN = "yyyy-MM-dd hh:mm:ss.S";

	/**
	 * Dateformat in String. Current value:"dd.MM"
	 */
	public static final String DOT_DD_MM_PATTERN = "dd.MM";

	/**
	 * Dateformat in String. Current value:"yyyyMMddHHmmss"
	 */
	public static final String YYYYMMDDHHMMSS_PATTERN = "yyyyMMddHHmmss";

	/**
	 * Dateformat in String. Current value:"HH:mm:ss"
	 */
	public static final String UHH_MM_SS_PATTERN = "HH:mm:ss";

	/**
	 * Dateformat in String. Current value:"HH:mm:ss"
	 */
	public static final String UHH_MM_PATTERN = "HH:mm";

	/**
	 * Dateformat in String. Current value:"hh:mm:ss"
	 */
	public static final String LHH_MM_SS_PATTERN = "hh:mm:ss";

	/**
	 * Dateformat in String. Current value:"dd.MM.yyyy"
	 */
	public static final String DOT_DD_MM_YYYY_PATTERN = "dd.MM.yyyy";

	/**
	 * Dateformat in String. Current value:"dd.MM.yyyy HH:mm:ss"
	 */
	public static final String DOT_DD_MM_YYYY_HH_MM_SS_PATTERN = DOT_DD_MM_YYYY_PATTERN + " "
		+ UHH_MM_SS_PATTERN;

	/**
	 * Dateformat in String. Current value:"yyyy-MM-dd"
	 */
	public static final String YYYY_MM_DD_PATTERN = "yyyy-MM-dd";

	/**
	 * Dateformat in String. Current value:"dd.MM.yy"
	 */
	public static final String DOT_DD_MM_YY_PATTERN = "dd.MM.yy";

	private final String value;

	DatePattern(final String value)
	{
		this.value = value;
	}

	public String getValue()
	{
		return value;
	}
}
