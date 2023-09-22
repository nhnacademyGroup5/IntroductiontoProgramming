package jinwoo.unit9;

import java.io.File;

public class Exercise7 {
    static boolean fileExists(String input){
        File file = new File(input);
        return file.exists();
    }

    static boolean isInt(String input){
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        };
        return true;
    }

    static boolean isDouble(String input){
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(fileExists("hahaha"));
    }
}
