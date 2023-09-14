package Unit6;

import java.util.Scanner;

public class Exercise6_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            int factorial = factorial(i);
            System.out.println(i + "! = " + factorial);
        }
    }

    public static int factorial(int n) {
        int a = 0;
        if (n == 0) {
            a = 1;
        } else {

            a = factorial(n - 1);
            a *= n;
        }
        return a;
    }

}

