package Unit6;

public class Exercise6_8 {
    public static void main(String[] args) {
        int n = 10; // Change this value to set the size of the table

        multiplicationTable(n);
    }

    public static void multiplicationTable(int n) {
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }


    }

}


