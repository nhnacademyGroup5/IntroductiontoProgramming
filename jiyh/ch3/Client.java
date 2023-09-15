package ch3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        String str[] = sc.nextLine().split(" ");
        Book b1 = new Book(str[0], str[1]);
        str = sc.nextLine().split(" ");
        Book b2 = new Book(str[0], str[1]);

        b1.printBook();
        b2.printBook();

        b1.setPrice(20000000);
        b1.printBookPrice();

        sc.close();

    }
}
