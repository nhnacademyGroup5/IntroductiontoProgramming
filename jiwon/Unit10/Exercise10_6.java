package Unit10;

public class Exercise10_6 {
    public static void main(String[] args) {
        String s = "abbcccddddeeeee";
        char c = 'd';
        System.out.println(findLength(s, c, 0, 0));
    }

    public static int findLength(String s, char c, int index, int length) {

        if (index == s.length()) {
            return length;
        }


        if (s.charAt(index) == c) {
            length++;
        } else {
            length = 0;
        }
        return Math.max(length, findLength(s, c, index + 1, length));
    }
}