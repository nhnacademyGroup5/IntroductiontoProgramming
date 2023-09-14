package Unit6;

public class Exercise6_9 {
    public static void main(String[] args) {
        int h = 4;
        pyramid(h);
    }

    public static void pyramid(int h) {

        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}




