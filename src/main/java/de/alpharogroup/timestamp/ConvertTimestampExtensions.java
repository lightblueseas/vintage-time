package de.alpharogroup.timestamp;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * The class {@link ConvertTimestampExtensions} provides methods for check time gaps
 */
public final class ConvertTimestampExtensions {
    private ConvertTimestampExtensions() {
    }


    /**
     * Converts a Date to a Timestamp-object.
     *
     * @param date The date to convert.
     * @return The Timestamp from the date.
     */
    public static Timestamp toTimestamp(final Date date) {
        final Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return new Timestamp(cal.getTime().getTime());
    }
}
