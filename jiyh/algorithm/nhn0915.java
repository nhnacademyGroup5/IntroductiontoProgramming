public class nhn0915 {
    
    static int[] TEST_CASE = {
        1,
        2,
        3,
        5,
        8
    };
    static int[] TEST_RESULT_FACT = {
        1,
        2,
        6,
        120,
        40320
    };
    static int[] TEST_RESULT_FIBO = {
        1,
        2,
        3,
        8,
        34
    };

    public static void main(String[] args) {
        for(int i=0 ; i<TEST_CASE.length; i++){
            System.out.println("fact test case"+(i+1) + " : " + succeseFactorialResult(i));
        }
        for(int i=0 ; i<TEST_CASE.length; i++){
            System.out.println("fibo test case"+(i+1) + " : " + succeseFiboResult(i));
        }
    }

    public static boolean succeseFactorialResult(int idx){
        if(factorial(TEST_CASE[idx]) == TEST_RESULT_FACT[idx]) return true;
        return false;
    }

    public static boolean succeseFiboResult(int idx){
        if(fibonacci(TEST_CASE[idx]) == TEST_RESULT_FIBO[idx]) return true;
        return false;
    }

    public static int factorial(int n){
        if(n <= 1) return 1;

        return n * factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n == 1) return n;
        if(n == 2) return 1 + fibonacci(n-1);
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
