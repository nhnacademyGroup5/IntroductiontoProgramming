package Unit5;

public class Exercise5_5 {
    public static double real(int a, int b, int c) {
        if ((b * b) - 4 * a * c > 0) {
            return (((b * -1) + Math.sqrt(b * b - (4 * a * c))) / (2 * a));
        } else if ((b * b) - 4 * a * c == 0) {
            return -1 * b / 2;
        } else {
            
        }
        return 0;
    }

    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = -10;
        c = 25;
        System.out.println(real(a, b, c));

    }


}
