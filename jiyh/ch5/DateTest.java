package ch5;

public class DateTest {

    public static void main(String[] args) {
        Date date1 = new Date(1999, 11, 27);
        Date date2 = new Date(1999, 11, 27);

        Date date3 = new Date(2000, 2, 28);

        // getter(day, month, year)
        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());

        // Date equals
        System.out.println(date1.equals(date2));

        // Date precedes
        System.out.println(date1.precedes(date3));
        System.out.println(date3.precedes(date1));

        // nextday
        date3.nextday();   
        date3.nextday();   
        System.out.println(date3.getDate());    
    }
    
}
