package ch09;

import java.io.IOException;

public class Exercise7 {
    public static void main(String[] args) throws IOException{
        // 파일 존재 확인 테스트
        System.out.println(ExceptionHandling.fileExists("test"));
        System.out.println(ExceptionHandling.fileExists("exception.txt"));


        // String to Integer check
        System.out.println(ExceptionHandling.isInt("12"));
        System.out.println(ExceptionHandling.isInt("aa"));

        // String to Double check
        System.out.println(ExceptionHandling.isDouble("1.423"));
        System.out.println(ExceptionHandling.isDouble("asv"));
    }
}
