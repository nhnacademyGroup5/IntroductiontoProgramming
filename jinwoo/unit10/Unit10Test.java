package jinwoo.unit10;

import java.io.BufferedReader;
import java.io.IOException;

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
        if(a % b == 0){
            return b;
        } else{
            return gcd(b, a % b);
        }
    }

    public static boolean prime(int x, int y){
        if(x < 0 || y < 0) throw new IllegalArgumentException("Invalid Input");
        if(x == 1 || y == 1) return true;
        if(x > y ){
            return prime(x - y ,y);
        } else if (x < y ){
            return prime(x, y - x);
        } else {
            return false;
        }
    }

    public static int rest(int x, int y){
        if(y < 0) throw new IllegalArgumentException("Invalid Input");
        if(x < 0) return rest(x + y, y);
        if(x < y) return x;
        else return rest(x - y, y);
    }

    // Ex 10.5.
    public static int occurrencesOfOne(BufferedReader br, int count) throws IOException{
        if(br.readLine() == null) return count;
        if(br.readLine().equals("1")) count++;
        return occurrencesOfOne(br, count);
    }

    // Ex 10.6.
    public static int maxCountOfChar(String input, char c, int max, int count){
        if(input.length() == 0) return max;
        if(max < count){
            return maxCountOfChar(input, c, count, count);
        }
        if(input.charAt(0) == c){
            return maxCountOfChar(input.substring(1), c, max, count++);
        }
        return maxCountOfChar(input.substring(input.indexOf(c)), c, max, 0);
    }

    public static void main(String[] args) {
        String ex = "aaabbbcccc";
        System.out.println(maxCountOfChar(ex, 'b', 0, 0));
    }
}
