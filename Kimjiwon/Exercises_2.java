package Kimjiwon;

public class Exercises_2 {

    public static String Ex2(String s) {
        String name1 = s;
        return name1.charAt(0) + " " + name1.charAt(name1.length() - 1);
    }

    public static String Ex4(String s) {

        String name2 = s;
        String name2Init = "";
        name2Init = name2.charAt(name2.length() - 1) + name2.substring(1, name2.length() - 1) +
                name2.charAt(0);
        return name2Init;
    }

    public static String Ex5(String s) {

        StringBuffer name5 = new StringBuffer(s);
        name5.replace(0, 1, s.substring(6, 7));
        name5.replace(6, 7, s.substring(0, 1));
        return name5.toString();
    }

    public static void main(String[] args) {

        System.out.println(Ex2("jiwon kim"));
        System.out.println(Ex4("abcd"));
        System.out.println(Ex5("abcdefg"));

    }
}
