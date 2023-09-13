package jinwoo;

import java.util.Scanner;

public class windowBook {
        public static void main(String[] args) {
            
            // Exercise 3.1. Define a classe Book to handle the information associated to books. The information of interest for a book are: the title, the authors, and the price. The methods of interest are:
            Book book = new Book("title", "authors", 10000);
            book.printBook();

            // Exercise 3.2. Write a Java class implementing an example client for the class Book of Exercise 3.1. The example class should perform the following operations:
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter information of fisrt book");
            String title1 = sc.next();
            String authors1 = sc.next();
            int price1 = sc.nextInt();
            
            
            Book first = new Book(title1, authors1, price1);
            
            System.out.println("Enter information of second book");
            String title2 = sc.next();
            String authors2 = sc.next();
            int price2 = sc.nextInt();

            Book second = new Book(title2, authors2, price2);

            sc.close();

            first.printBook();
            second.printBook();

            System.out.println(first.getPrice());
            first.setPrice(50000);
            System.out.println(first.getPrice());

            first.printBookPrice();

            // Ex 3.3
            MessageText messageText = new MessageText("ily", "I love you, darling");
            System.out.println(messageText.convert("ily"));
            System.out.println(messageText.convert("I love you, darling"));

        }
}