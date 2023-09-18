package Unit5;

import java.util.Arrays;

//Exercise 5.4
public class triangle {

    public static String lengthOfSide(int min, int mid, int max) {
        return min + " " + mid + " " + max;
    }

    public static String determines(int a, int b, int c) {
        if (a == b && b == c) {
            return "equilateral triangle";
        } else if (a != b && a == c) {
            return "isosceles triangle";
        } else if (b == a && b != c) {
            return "isosceles triangle";
        } else if (c == b && c != a) {
            return "isosceles triangle";
        } else {
            return "triangle";
        }

    }

    public static double area(int min, int mid, int max) {
        double s = (min + mid + max) / 2;
        double sqrt = Math.sqrt(s * (s - min) * (s - mid) * (s - max));
        return sqrt;
    }

    public static boolean canBeTriangle(int max, int mid, int min) {
        if (max > min + mid) {
            return false;
        }
        return true;
    }

    public static int round(int min, int max, int mid) {
        return min + max + mid;
    }

    public static void main(String[] args) {
        int a[] = {3, 4, 5};
        Arrays.sort(a);
        int min = a[0];
        int mid = a[1];
        int max = a[2];
        System.out.println(lengthOfSide(min, mid, max));
        System.out.println(round(min, mid, max));
        System.out.println(canBeTriangle(min, mid, max));
        System.out.println(area(min, mid, max));
        System.out.println(determines(min, mid, max));
    }

}
