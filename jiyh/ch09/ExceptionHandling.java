package ch09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
    
    public static boolean fileExists(String filename) throws IOException{
        try (FileInputStream f = new FileInputStream(new File(filename))){}
        catch (FileNotFoundException e) {
            return false;
        }
        return true;
    }

    public static boolean isInt(String str){
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형태가 아닙니다");
            return false;
        }

        return true;
    }

    public static boolean isDouble(String str){
        try{
            Double.parseDouble(str);
        } catch(NumberFormatException e){
            System.out.println("실수 형태가 아닙니다");
            return false;
        }
        return true;
    }

}
