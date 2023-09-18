package Unit6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_4 {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(10) + 1;
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum + " " + sum * -1);
    }
}
