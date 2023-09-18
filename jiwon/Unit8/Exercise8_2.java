package Unit8;

import java.util.Scanner;

public class Exercise8_2 {
    public static void main(String[] args) {
        double average = calculator();
        System.out.println(average);
    }

    public static double calculator() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int n;

        do {
            n = sc.nextInt();
            if (n != 0) {
                sum += n;
                count++;
            }
        } while (n != 0);

        if (count > 0) {
            return (double) sum / count;
        }

        return 0;
    }
}
