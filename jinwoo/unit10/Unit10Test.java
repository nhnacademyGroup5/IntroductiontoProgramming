package jinwoo.unit10;

public class Unit10Test {
    // Ex 10.1. / Ex 10.2.
    public static long fibonacci(int n){
        if(n < 0) throw new IllegalArgumentException("Invalid Input");
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Ex 10.3.
    public static int ackemann(int m, int n){
        if (n < 0 || m < 0) throw new IllegalArgumentException("Invalid Input");
        if(m == 0) return n + 1;
        if(n == 0) return ackemann(m - 1, 1);
        return ackemann(m - 1, ackemann(m, n - 1));
    }

    // Ex 10.4.
    public static int gcd(int a, int b){
        int result;
        if(a % b == 0){
            return b;
        } else{
            result = a % b;
        }
        return gcd(b, result);
    }

    public static boolean prime(int x, int y){
        if (x < 0 || y < 0) throw new IllegalArgumentException("Invalid Input");
        if(x !=1 && y != 1){
            if(x > y ){
                return prime(x - y ,y);
            } else if (x < y ){
                return prime(x, y - x);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public static int rest(int x, int y){
        if(y < 0) throw new IllegalArgumentException("Invalid Input");
        if(x < 0) return rest(x + y, y);
        if(0 <= x && x < y) return x;
        else return rest(x - y, y);
    }
}
