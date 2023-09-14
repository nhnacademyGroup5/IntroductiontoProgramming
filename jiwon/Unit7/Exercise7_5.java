package Unit7;

import java.util.Arrays;

public class Exercise7_5 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {4, 3, 5, 2, 1};
        int c[] = {1, 3, 4, 5, 6};
        System.out.println(equals(a, b));
        System.out.println(equals(a, c));
    }


    public static boolean equals(int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }
}
