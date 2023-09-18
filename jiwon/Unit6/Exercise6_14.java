package Unit6;

import java.util.Scanner;

public class Exercise6_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 2;
        

        while (n > 1) {
            if (isPrime(num) && n % num == 0) {
                System.out.print(num + " ");
                n /= num;
            } else {
                num++;
            }
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
