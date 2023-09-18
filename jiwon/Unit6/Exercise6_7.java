package Unit6;

public class Exercise6_7 {
    public static void main(String[] args) {
        String input = "Kimjiwon";
        char c = 'i';


        System.out.println(longest(input, c));

    }


    public static String longest(String input, char c) {


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                System.out.println(i);
                break;
            } else {
                System.out.println(-1);
            }


        }
        return null;
    }
}