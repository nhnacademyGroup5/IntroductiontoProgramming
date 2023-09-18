package ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    
    public static void main(String[] args) throws ExceptionLineTooLong, IOException {
        
        StringBuilder sb = new StringBuilder();
        readFile(sb, "exception.txt");
        
        if(sb.length() >= 80){
            throw new ExceptionLineTooLong("The strings is too long");
        }
        
    }

    public static void readFile(StringBuilder sb, String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));

        String line = br.readLine();
        sb.append(line);
        while(line != null){
            sb.append(line);
            line = br.readLine();
        }
        br.close();
    }
}
