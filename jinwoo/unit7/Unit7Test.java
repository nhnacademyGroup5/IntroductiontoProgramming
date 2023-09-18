package jinwoo.unit7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Unit7Test {
    public static void main(String[] args) {
        // int[] A ={1,2,3,4,5};
        // int[] B ={1,2,6,9,10};
        // int[] ex = intersection(A, B);
        // for (int i = 0; i < ex.length; i++) {
        //     System.out.println(ex[i]);
        // }
        // int[][] C = {{1,2,3},{4,5,6},{7,8,9}};
        // int[] test = matrixSumColumns(C);
        // for (int i = 0; i < test.length; i++) {
        //     System.out.println(test[i]);
        // }

        // int[] D ={1,2,3,4,5};
        // int[] E ={1,2,3,5,5};

        // System.out.println(equalArrays(D, E));

        int[] F = {1,2,3,4,1,3,5};
        numberOfDuplicatesValues(numberOfDuplicates(F));
        int[] ex3 = removeDuplicates(F);
        for (int i = 0; i < ex3.length; i++) {
            System.out.println(ex3[i]);
        }
    }


    // Ex 7.1.
    static double scalarProduct(double[] A, double[] B){
        if(A.length != B.length) throw new IllegalArgumentException("Invalid Input");
        double sum = 0.0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[i];
        }
        return sum;
    }
    
    // Ex7.2.
    static int[] intersection(int[] A, int[] B){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i] == B[j]){
                    list.add(A[i]);
                }
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
    
    /// Ex 7.3.
    static double[][] transposeMatrix(double[][] M){
        double[][] result = M;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                result[i][j] = M[j][i];
            }
        }
        return result;
    }

    // Ex.7.4.
    static int[] matrixSumColumns(int[][] M ){
        int[] result = new int[M.length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                result[i] += M[j][i];
            }
        }
        return result;
    }

    // Ex. 7.5.
    static boolean equalArrays(int[] A, int[] B){
        for (int i = 0; i < A.length; i++) {
            if(A[i] != B[i]) return false;
        }
        return true;
    }

    // Ex 7.6.
    static int[] numberOfDuplicates(int[] A){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if(A[i] == A[j]) list.add(A[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    static void numberOfDuplicatesValues(int[] A){
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    // Ex 7.7.
    static int[] removeDuplicates(int[] A){
        //list에는 primitive type을 못 넣기 때문에 stream.boxed로 int를 integer로 바꿔준다.
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> set = list.stream().distinct().collect(Collectors.toList());

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    // Ex 7.8.
    // -> 정수 배열 에서 홀수 들의 합이다.
    public static int mystery(int[] A){
        int x = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] % 2 ==1) x++;
        }
        return x;
    }

    // Ex 7.9.
    static boolean symmetric(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if(M[i][j] != M[j][i]) return false;
            }
        }
        return true;
    }

    // Ex 7.10.
    static boolean lowerTriangular(int[][] M){
        for (int i = 0; i < M[0].length; i++) {
            for (int j = i+1; j < M.length; j++) {
                if(M[i][j] != 0) return false;
            }
        }
        return true;
    }

    // Ex 7.11.
    static boolean digonal(int[][] M){
        for (int i = 0; i < M[0].length; i++) {
            for (int j = 0; j < M.length; j++) {
                if(i != j){
                    if(M[i][j] != 0) return false;
                }
            }
        }
        return true;
    }
}
