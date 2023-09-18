package Unit6;

import java.util.Scanner;

public class Exercise6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pi = 0;

        for (int i = 0; i < n; i++) {
            double a = 2 * i + 1;
            if (i % 2 == 0) {
                pi += 4 / a;
            } else {
                pi -= 4 / a;
            }
        }
        System.out.println(pi);
    }
}
