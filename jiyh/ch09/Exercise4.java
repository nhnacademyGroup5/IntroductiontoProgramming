package ch09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise4 {
    
    public static void main(String[] args) throws IOException{
        
        int n = 10;
        int idx = 0;
        int[] v = new int[n];


        try {
            BufferedReader br = new BufferedReader(new FileReader("dati1.txt"));

            String line = br.readLine();
            while(line != null){
                v[idx++] = Integer.parseInt(line);
                line = br.readLine();
            }
            br.close();

        } catch (FileNotFoundException e1) {
            System.out.println("존재하지 않은 파일의 접근.");
        } catch (NumberFormatException e2){
            System.out.println("숫자가 아닌 값은 처리할 수 없음.");
        } catch (ArrayIndexOutOfBoundsException e3){
            System.out.println("더 이상 추가할 수 없음.");
        }

        
    }
}
