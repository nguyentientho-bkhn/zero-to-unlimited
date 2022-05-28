package nguyentientho.core.calendar_;

import java.util.Calendar;

public class CalendarMain {
    public static void main(String[] args) {
        calendarMain();
    }

    private static void calendarMain() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("this is Calendarrr = " + calendar);

        String dateC = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        String hoursC = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
        String minutesC = String.valueOf(calendar.get(Calendar.MINUTE));
        System.out.printf("date of month =%s, hours =%s, minutes=%s", dateC, hoursC, minutesC);
    }
}
