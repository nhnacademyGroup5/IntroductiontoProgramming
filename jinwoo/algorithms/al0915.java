package jinwoo.algorithms;

public class al0915 {
    private static int[] TEST_CASE = {1, 3, 5, 10, 15};
    private static long[] FACTORIAL_TEST_RESULT = {1, 6, 120, 3628800, 1307674368000L};
    private static long[] FIBONACCI_TEST_RESULT = {1, 2, 5, 55, 610};

    public static void main(String[] args) {
        System.out.println("Factorial Test");
        factorialTest(TEST_CASE, FACTORIAL_TEST_RESULT);
        System.out.println("Fibonacci Test");
        fibonacciTest(TEST_CASE, FIBONACCI_TEST_RESULT);
    }

    public static void factorialTest(int[] test, long[] result) {
        for (int i = 0; i < result.length; i++) {
            if(factorial(test[i]) == result[i]){
                System.out.println("Test " + (i + 1) + " : " + "Passed!");
            } else{
                System.out.println("Test " + (i + 1) + " : " + "Failed!");
            }
        }
    }

    public static void fibonacciTest(int[] test, long[] result) {
        for (int i = 0; i < result.length; i++) {
            if(fibonacci(test[i]) == result[i]){
                System.out.println("Test " + (i + 1) + " : " + "Passed!");
            } else{
                System.out.println("Test " + (i + 1) + " : " + "Failed!");
            }
        }
    }

    public static long factorial(int number) {
        if(number < 0) throw new IllegalArgumentException("Invalid Input");
        switch (number) {
            case 0:
                return 1;
            default:
                return number * factorial(number -1);
        }
    }

    public static long fibonacci(int number) {
        if(number < 0) throw new IllegalArgumentException("Invalid Input");
        switch (number) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
