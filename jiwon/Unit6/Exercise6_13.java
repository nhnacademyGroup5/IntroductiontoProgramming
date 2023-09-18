package Unit6;

import java.util.Scanner;

public class Exercise6_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 2;
        int c = 0;
        while (c < n) {
            if (isPrime(num)) {
                System.out.println(num);
                c++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
