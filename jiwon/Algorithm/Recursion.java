package Algorithm;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(fibonacc(n));
    }


    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }


    public static int fibonacc(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacc(n - 1) + fibonacc(n - 2);
        }
    }

}
