package Unit7;

public class Exercise7_6 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 1, 2};
        int count = numberOfDuplicates(a);
        System.out.println("number of duplicate" + "=" + count);
    }
//
//    public static int numberOfDistinctValues(int[] C) {
//        int B[] = new int[A.length];
//        for (int i = 0; i < A.length - 1; i++) {
//            for (int j = i + 1; j < A.length; j++) {
//                if (C[i] == C[j]) {
//                    B[i] = C[i];
//
//            }
//        }return B[i];
//    }

    public static int numberOfDuplicates(int[] A) {
        int count = 0;
        int B[] = new int[A.length];
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    B[i] = A[i];
                    count++;
                    System.out.println("Dupicate B" + " : " + B[i]);
                }
            }
        }

        return count;
    }
}