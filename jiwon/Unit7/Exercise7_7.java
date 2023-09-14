package Unit7;

import java.util.Arrays;

public class Exercise7_7 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 1, 2};
        System.out.println(removeDuplicates(a));
    }

    public static String removeDuplicates(int[] A) {
        int B[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] != A[j]) {
                    B[i] = A[i];

                }
            }


        }
        return Arrays.toString(B);

    }
}

