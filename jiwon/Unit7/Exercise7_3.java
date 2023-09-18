package Unit7;

public class Exercise7_3 {
    public static void main(String[] args) {
        double[][] m = {
                {1, 2},
                {3, 4}
        };
        double[][] trans = transposeMatrix(m);
        print(trans);

    }

    public static void print(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] transposeMatrix(double[][] M) {
        int r = M.length;
        int c = M[0].length;

        double[][] transposeMatrix = new double[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transposeMatrix[j][i] = M[i][j];
            }

        }
        return transposeMatrix;
    }
}
