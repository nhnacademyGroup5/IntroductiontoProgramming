package Unit10;

public class Exercise10_4 {
    public static void main(String[] args) {
        System.out.println(gcd(10, 4));
        System.out.println(isPrime(10, 4));
        System.out.println(isRest(10, 4));
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    static boolean isPrime(int x, int y) {
        if (x == 1 || y == 1) {
            return true;
        } else if (x == y) {
            return false;
        } else if (x < y) {
            return isPrime(x, y - x);
        } else {
            return isPrime(x - y, y);
        }
    }

    static int isRest(int x, int y) {
        if (x < 0) {
            return isRest(x + y, y);
        } else if (x >= 0 || x < y) {
            return x;
        } else {
            return isRest(x - y, y);

        }
    }


}
