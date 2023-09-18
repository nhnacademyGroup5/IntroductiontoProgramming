package Unit6;

public class Exercise6_3 {
    public static int factorial(int n) {
        int a = 0;
        if (n == 0) {
            a = 1;
        } else {

            a = factorial(n - 1);
            a *= n;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));

    }
}
