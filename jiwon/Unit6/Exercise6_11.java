package Unit6;

import java.util.Scanner;

public class Exercise6_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);

        if (isPrime) {
            System.out.println("isPrime");
        } else {
            System.out.println("isNotPrime");
        }
    }


    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


}
