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

import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * The extension class {@link StringDatePatternExtensions} for resolve date patterns
 */
public class StringDatePatternExtensions
{

	/**
	 * Resolves the matching patterns from the given string date and the patterns by matching the
	 * given {@link BiFunction} object. For an example see the corresponding unit test
	 *
	 * @param stringDate
	 *            the date as {@link String}
	 * @param patterns
	 *            the pattern to check
	 * @param biFunction
	 *            the bi function for match
	 * @return a list with the matching patterns
	 */
	public static List<String> resolvePattern(String stringDate, Set<String> patterns,
		BiFunction<String, String, Boolean> biFunction)
	{
		return patterns.stream().filter(pattern -> biFunction.apply(stringDate, pattern))
			.collect(Collectors.toList());
	}
}