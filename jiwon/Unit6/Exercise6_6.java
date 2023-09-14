package Unit6;

public class Exercise6_6 {
    public static void main(String[] args) {


        String s = "kim jiwon";
        int d = 1;


        System.out.println(decodeString(s, d));
    }

    // Exercise 6.6
    public static String decodeString(String s, int d) {
        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                char de = (char) ((int) c - d);
                decoded.append(de);
            } else {
                decoded.append(c);
            }
        }

        return decoded.toString();
    }
}

