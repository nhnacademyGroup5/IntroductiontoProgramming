package jinwoo.unit5;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();
        System.out.println(currentDate);
        System.out.println(currentYear + currentMonth + currentDay);
        System.out.println(currentDate.isLeapYear());
    }
}
