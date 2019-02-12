
import de.alpharogroup.date.CalculateDateExtensions;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

public class NextEasternQuery implements TemporalQuery<LocalDate> {

    @Override
    public LocalDate queryFrom(TemporalAccessor temporal) {
        LocalDate date = LocalDate.from(temporal);
        LocalDate currentYearEasternSunday = getEasternDateInYear(date.getYear());

        Period periodToCurrentYearEasternSunday = Period.between(date, currentYearEasternSunday);

        if (periodToCurrentYearEasternSunday.isNegative() || periodToCurrentYearEasternSunday.isZero()) {
            return getEasternDateInYear(date.getYear() + 1);
        } else {
            return currentYearEasternSunday;
        }
    }

    private LocalDate getEasternDateInYear(int year) {
        final int easternSundayNumber = CalculateDateExtensions.computeEasternSundayNumber(year);
        final int month = easternSundayNumber / 31;
        final int day = easternSundayNumber % 31 + 1;
        return LocalDate.of(year, month, day);
    }
}
