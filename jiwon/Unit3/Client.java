package Unit3;

import java.util.Scanner;

public class Client {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String title1 = scanner.nextLine();
        String authors1 = scanner.nextLine();

        Book firstBook = new Book(title1, authors1);

        String title2 = scanner.nextLine();
        String authors2 = scanner.nextLine();
        Book secondBook = new Book(title2, authors2);

        System.out.println(firstBook.printBook(title1, authors1));
        System.out.println(secondBook.printBook(title2, authors2));

        int price = 3000;
        firstBook.printBookPrice(title1, authors2, price);

        System.out.println(firstBook.printBookPrice(title1, authors2, price));

    }
}
