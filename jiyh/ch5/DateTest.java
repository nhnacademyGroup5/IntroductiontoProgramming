package ch5;

import java.time.LocalDate;

public class DateTest {

    public static void main(String[] args) {
        Date date1 = new Date(1999, 11, 27);
        Date date2 = new Date(1999, 11, 27);

        Date date3 = new Date(2000, 2, 28);

        // getter(day, month, year)
        System.out.println(date1);

        // Date equals
        System.out.println(date1.equals(date2));

        // Date precedes
        System.out.println(date1.precedes(date3));
        System.out.println(date3.precedes(date1));

        // nextday
        date3.nextday();   
        date3.nextday();   
        System.out.println(date3.getDate());   
        
        LocalDate now = LocalDate.now();
        LocalDate birth = LocalDate.of(2019, 2, 11);


        // comment
        System.out.println(now);
        System.out.println(now.isAfter(birth));
        System.out.println(now.equals(birth));
        System.out.println(now.plusDays(1));

    }
    
}
