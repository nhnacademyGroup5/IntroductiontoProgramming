package Unit4;

public class Exercise4_10 {
    public static void main(String[] args) {
        String s = "abcdefg";
        char c = lastCharacter(s);
        System.out.println(c);
    }

    public static char lastCharacter(String s) {


        return s.charAt(s.length() - 1);

    }
}
