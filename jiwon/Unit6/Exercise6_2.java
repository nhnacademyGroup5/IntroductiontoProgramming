package Unit6;

import java.util.Random;

public class Exercise6_2 {

    public static int even(int n) {

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(2);
            } else {
                System.out.println(i * 2 + 2);
            }
        }
        return n;
    }


    public static void main(String[] args) {
        Random r = new Random();
        int n = (r.nextInt(10) + 1);
        System.out.println(even(n));
    }
}
