package Unit5;

public class Exercise5_3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int c = 5;

        if (a == b && b == c) {
            System.out.println("equilateral triangle");
        } else if (a != b && a == c) {
            System.out.println("isosceles triangle");
        } else if (b == a && b != c) {
            System.out.println("isosceles triangle");
        } else if (c == b && c != a) {
            System.out.println("isosceles triangle");
        } else {
            System.out.println("triangle");
        }

    }
}