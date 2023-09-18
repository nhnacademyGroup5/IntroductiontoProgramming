package Unit7;

import java.util.Arrays;

public class Exercise7_2 {

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4};
        int[] b = {3, 4, 5, 6};
        Arrays.toString(intersection(a, b));
    }

    public static int[] intersection(int[] A, int[] B) {
        int result[] = new int[A.length];
        Arrays.sort(A);
        Arrays.sort(B);


        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                result[i] = A[i];
                
            }
        }

        return result;
    }
}
