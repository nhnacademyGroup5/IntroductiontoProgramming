package Unit6;

import java.util.Arrays;
import java.util.Random;

public class Exercise6_1 {
    public static void main(String[] args) {

        int[] arr = new int[10];


        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = (r.nextInt(100) + 1);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
    }
}
