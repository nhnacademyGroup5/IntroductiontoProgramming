package jinwoo.unit9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise6 {
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new FileReader("jinwoo/unit9/Example.txt"));    
        ) {
            String line = br.readLine();
            while(line != null){
                if(line.length() > 10) throw new ExceptionLineTooLong("문장이 10자 이상입니다.");
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            
            // printStackTrace System.err 로 쓰여서 리소스 비용이 비싸고 제어하기 힘들다.
            // 이외 여러가지 이유로 printStackTreace는 사용을 지양해야 한다. (더 공부가 필요함.)
            // 대체로 getStackTrace가 있다고 한다.
            e.printStackTrace();
        } catch (ExceptionLineTooLong e){
            System.out.println(e.getMessage());
        }
    }
}
