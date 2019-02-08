package de.alpharogroup.date;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@UtilityClass
public class TimeGapExtensions {

    public boolean isBeforeTimeGap(LocalDate localDate, LocalDate otherLocalDate, ChronoUnit chronoUnit) {
        long between = chronoUnit.between(localDate, otherLocalDate);
        return between < -1;
    }

    public boolean isAfterTimeGap(LocalDate localDate, LocalDate otherLocalDate, ChronoUnit chronoUnit) {
        long between = ChronoUnit.DAYS.between(localDate, otherLocalDate);
        return 1 < between;
    }
}
