package Unit7;

public class Exercise7_9 {
    public static void main(String[] args) {

        int[][] matrix1 = new int[][] {
                {1, 2},
                {3, 4}
        };

        int[][] matrix2 = new int[][] {
                {1, 2},
                {2, 4}
        };

        System.out.println(symmertic(matrix1));
        System.out.println(symmertic(matrix2));
    }


    public static boolean symmertic(int[][] M) {
        boolean t = true;
        int b[][] = new int[M.length][M.length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                b[j][i] = M[i][j];
            }
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (M[i][j] != b[i][j]) {
                    t = false;
                    break;
                }
            }


        }


        return t;
    }
}
