package Unit5;

public class Exercise5_2 {
    public static void main(String[] args) {

        int a, b, c;
        a = 5;
        b = 4;
        c = 4;

        if ((a != b) && (b != c)) {
            System.out.println("it is irregular");
        } else if ((a != b) && b == c) {
            System.out.println("it is symmetric");
        } else {
            System.out.println("it is regular");
        }
    }
}
