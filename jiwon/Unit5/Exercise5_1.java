package Unit5;

public class Exercise5_1 {
    public static void main(String[] args) {
        double g = 21;
        if (40 < g) {
            System.out.println("extra stong liquor");
        } else if (20 < g) {
            System.out.println("strong liquor");
        } else if (15 < g) {
            System.out.println("liquor");
        } else if (12 < g) {
            System.out.println("Strong vine");
        } else if (10.5 < g) {
            System.out.println("normal vine");
        } else {
            System.out.println("light vine");
        }
    }
}
