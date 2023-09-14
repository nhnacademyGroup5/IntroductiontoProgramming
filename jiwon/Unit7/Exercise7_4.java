package Unit7;

public class Exercise7_4 {
    public static int[] matrixSumColumns(int[][] m) {


        int r = m.length;
        int c = m[0].length;
        int[] sum = new int[c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[j] += m[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] sum = matrixSumColumns(m);


        for (int s : sum) {
            System.out.println("Column Sum: " + s);
        }
    }
}