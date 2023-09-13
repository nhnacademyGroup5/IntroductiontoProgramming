package Algorithm;

public class Lcd {

    private static final int[][] TEST_CASES = {
            {1, 1},
            {98, 49},
            {2, 81},
            {3, 7},
            {19, 87}
    };

    private static final int[] TEST_CASES_RESULT = {
            1, 98, 162, 21, 1653
    };


    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {

            System.out.println("{" + TEST_CASES[i][0] + "," + TEST_CASES[i][1] + "}" + " = " +
                    TEST_CASES_RESULT[i] + ": " + test(TEST_CASES[i][0], TEST_CASES[i][1],
                    TEST_CASES_RESULT[i]));
        }
        System.out.printf("정답률 = %d%%", (int) ((correct / TEST_CASES.length) * 100));
    }

    private static double correct = 0; //int correct or 형변환

    private static boolean test(int first, int second, int result) {
        if (solution(first, second) == result) {
            correct++;
            return true;

        }

        return false;

    }


    private static int solution(int first, int second) {


        return first * second / gcd(first, second);
    }

    // solution
    private static int gcd(int first, int second) {

        if (first == 0) {
            return second;
        }

        return gcd(second % first, first);
    }

}
