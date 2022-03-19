package Hotel;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class Time {

    public static void showCalendar(@NotNull Calendar c){
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        int millisecond = c.get(Calendar.MILLISECOND);

        System.out.println(" " + year + "-" + (month + 1) + "-" + day + " " + hour + ":" + minute + ":" + second + " " + millisecond );
    }

}
