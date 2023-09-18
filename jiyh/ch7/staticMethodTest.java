package ch7;

public class staticMethodTest {
    public static void main(String[] args) {
        int arr[] = staticMethod.Intersection(new int[] {1, 2, 3}, new int[] {2, 3, 4});
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) break;

            System.out.print(arr[i]+ " ");
        }System.out.println();


        double[][] M = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        staticMethod.transposeMatrix(M);

        int[][] Ma = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        staticMethod.MatrixSumColumns(Ma);


        int[] exam1 = {1, 1, 1, 2, 2, 3, 4};
        System.out.println("Duplicate : " + staticMethod.numberOfDuplicates(exam1));
        System.out.println("DistinctValues : " + staticMethod.numberOfDistinctValues(exam1));
        exam1 = staticMethod.removeDuplicates(exam1);
        for(int i=0; i<exam1.length; i++){
            System.out.println(exam1[i]);
        }
        
        int[][] M2 = {
            {1, 2, 3},
            {2, 2, 4},
            {3, 4, 3}
        };
        System.out.println("symmetric : " + staticMethod.symmetric(M2));
        int[][] M2_1 = {
            {1, 1, 3},
            {2, 2, 4},
            {3, 4, 3}
        };
        System.out.println("symmetric : " + staticMethod.symmetric(M2_1));

        int[][] M3 = {
            {0, 2, 3},
            {2, 0, 4},
            {3, 4, 0}
        };
        System.out.println("lowerTriangular : " + staticMethod.lowerTriangular(M3));

        int[][] M3_1 = {
            {0, 2, 3},
            {2, 1, 4},
            {3, 4, 0}
        };
        System.out.println("lowerTriangular : " + staticMethod.lowerTriangular(M3_1));

        int[][] M4 = {
            {1, 0, 0},
            {0, 2, 0},
            {0, 0, 0}
        };
        System.out.println("diagonal : " + staticMethod.diagonal(M4));

        int[][] M4_1 = {
            {0, 2, 3},
            {2, 1, 4},
            {3, 4, 0}
        };
        System.out.println("diagonal : " + staticMethod.diagonal(M4_1));
    }

    
}
