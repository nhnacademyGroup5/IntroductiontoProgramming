package Unit10;

public class Exercise10_3 {
    public static void main(String[] args) {
        System.out.println(ackermann(3, 1));
    }

    public static long ackermann(long m, long n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }
}
