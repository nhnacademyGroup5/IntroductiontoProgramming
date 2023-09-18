package Unit7;

public class Exercise7_1 {
    public static void main(String[] args) {
        double[] a = {1, 2, 3};
        double[] b = {6, 5, 4};
        System.out.println(scalar(a, b));
    }


    public static double scalar(double[] a, double[] b) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }
}
