package Unit5;

import java.util.Random;

public class Exercise5_7 {
    private int day;
    private int month;
    private int year;
    private int date;

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static boolean equal(int date, int day) {
        if (date == day) {
            return true;
        }
        return false;
    }

    public static int compute(int day) {
        return day += 1;
    }

    public static boolean precedes(int date, int day) {
        if (date < day) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int date = random.nextInt(365);
        int day = 100;
        int month = (random.nextInt(12) + 1);
        int year = random.nextInt() + 1;
        System.out.println(date);
        System.out.println(day + " " + month + " " + year);
        System.out.println(precedes(date, day));
        System.out.println(compute(day));
        System.out.println(precedes(date, day));
        System.out.println(equal(date, day));
        System.out.println(leapYear(year));
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
