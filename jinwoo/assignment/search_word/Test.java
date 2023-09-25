package jinwoo.assignment.search_word;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test { 
    public static void main(String[] args) {
        try {
            Dictionary dict = new Dictionary("words");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("검색할 단어를 입력하세요 : ");
            String keyword = br.readLine();
            while(!keyword.equals("exit()")){
                dict.search(keyword);
                System.out.print("검색할 단어를 입력하세요 : ");
                keyword = br.readLine();
            }
            System.exit(0);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
