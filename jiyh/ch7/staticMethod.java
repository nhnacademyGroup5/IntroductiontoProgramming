package ch7;

public class staticMethod {
    
    public static double scalarProduct(double[] A, double[] B){
        double result = 0;

        for(int i=0;i<A.length; i++){
            result += A[i] * B[i];
        }
        return result;
    }

    public static int[] Intersection(int[] A, int[] B){
        int result[] = new int[A.length];

        int idx = 0;
        int a = 0;
        int b = 0;

        while(a < A.length && b < B.length){
            if(A[a] == B[b]) {
                result[idx++] = A[a];
                a++; b++;

            }else if(A[a] > B[b]) b++;
            else a++;
        }

        return result;
    }

    public static double[][] transposeMatrix(double[][] M){
        
        double[][] result = new double[M[0].length][M.length];

        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[0].length; j++){
                result[j][i] = M[i][j];
            }
        }

        // 정방행렬만 가능
        // for(int i=1; i<M.length; i++){
        //     for(int j=0; j<i; j++){
        //         double a = M[i][j];
        //         M[i][j] = M[j][i];
        //         M[j][i] = a;
        //     }
        // }
        
        return M;
    }

    public static int[] MatrixSumColumns(int[][] matrix) {
        int[] result = new int[matrix.length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                result[i] += matrix[i][j];
            }
        }


        return result;
    }

    public static boolean equalArrays(int[] A, int [] B ){
        for(int i=0; i<A.length; i++){
            if(A[i] != B[i]) return false;
        }

        return true;
    }

    public static int numberOfDuplicates(int[] A){
        int cnt = 1;

        for(int i=1; i<A.length; i++){
            if(A[i-1] != A[i]) cnt++;
        }
        return cnt;
    }

    public static int numberOfDistinctValues(int[] A){
        int cnt = 0;
        for(int i=1; i<A.length; i++){
            if(A[i-1] == A[i]) cnt++;
        }

        return cnt;
    }

    public static int[] removeDuplicates(int[] A){
        int[] result = new int[numberOfDuplicates(A)];
        int idx = 1;

        result[0] = A[0];
        for(int i=1; i<A.length; i++){
            if(A[i-1] != A[i]) result[idx++] = A[i];
        }

        return result;
    }

    public static boolean symmetric(int[][] M){
        for(int i=1; i<M.length; i++){
            for(int j=0; j<i; j++){
                if(M[i][j] != M[j][i]) return false;
            }
        }
        return true;
    }

    public static boolean lowerTriangular(int[][] M){
        for(int i=0; i<M.length; i++){
            if(M[i][i] != 0) return false;
        }
        return true;

    }

    public static boolean diagonal(int[][] M) {
        for(int i=1; i<M.length; i++){
            for(int j=0; j<i; j++){
                if(M[i][j] != 0 || M[j][i] != 0) return false;
            }
        }
        return true;
    }


}
