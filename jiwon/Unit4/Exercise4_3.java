package Unit4;

import java.util.Scanner;

public class Exercise4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double aithmetic = (double) (a + b) / 2;
        double geometric = Math.sqrt(a) * Math.sqrt(b);

        System.out.println(aithmetic + " " + geometric + " " + Math.max(aithmetic, geometric));

    }
}
