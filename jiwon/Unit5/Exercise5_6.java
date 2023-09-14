package Unit5;

public class Exercise5_6 {

    public static void rule(String s) {
        String[] arr;
        char[] v = {'a', 'i', 'u', 'e', 'o'};


        for (int i = 0; i < v.length; i++) {
            if (s.charAt(0) == v[i]) {
            }
            System.out.println("MAYBE");
            break;
        }

        for (int i = 0; i < v.length; i++) {
            if (s.charAt(s.length() - 1) == v[i]) {
                System.out.println("yes");
                break;
            } else {
                System.out.println("no");
                break;
            }
        }


    }


    public static void main(String[] args) {
        rule("abababab");

    }
}
