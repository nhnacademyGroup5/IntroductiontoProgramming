package jinwoo.unit4;

public class Ex_4 {

    // Ex 4.1.
    public static double convertLireEuro(int x){
        return 0.035 * x;
    }
    // Ex 4.2.
    public static boolean sumOverflow(byte x, byte y){
        return x + y >= -128 && x + y <= 128;
    }
    // Ex 4.3.
    public static int arithmetic(int x, int y){
        return (x + y) / 2;
    }

    public static int geometric(int x, int y){
        return (int) Math.sqrt((x * y));
    }

    // Ex 4.4.
    public static boolean even(long x){
        return x % 2 == 0;
    }

    // Ex. 4.10.
    public static char lastCharacter(String s){
        return s.charAt(s.length()-1);
    }

    public static void main(String[] args) {
        // Ex 4.5.
        short x = 22;
        byte y = (byte) x;
        System.out.println(y);    
    }

    // Ex 4.6.
    // byte b;
    //  short s;
    //  int i;
    //  long l;
    //  float f;
    //  double d;
    //  char c;
    //  boolean b1, b2;
    // 1. b+10L -> long
    // 2. (b+i)*l -> long
    // 3. (b+i)*l+f -> float
    // 4. s/f + Math.sin(f) -> float
    // 5. c == ’b’ -> true
    // 6. l+1.5f -> float
    // 7. i<10 -> true
    // 8. b1 == (f >= 5.0) -> false;
    // 9. b1 && !b2 -> false;

    // Ex 4.7.
    // 1. s = 65L;
    // 2. f = i+100;
    // 3. i = 2*b + l;
    // 4. b1 = s;
    // 5. b2 = s >= 57;
    // 6. c = b;
    // 7. c = ’b’;
    // -> 1, 3, 4
}
