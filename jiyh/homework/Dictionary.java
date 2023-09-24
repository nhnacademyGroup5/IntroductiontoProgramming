package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary{

    public static void main(String[] args) throws IOException {
        
        Map<String, String> wordList = readWordFile("./words.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("검색한 단어를 입력하세요 : ");
        String input = br.readLine();

        while(!input.equals("exit()")){
            System.out.println(serachWordListbyInput(wordList, input));

            System.out.print("검색한 단어를 입력하세요 : ");
            input = br.readLine();
        }
    }
    
    public static String serachWordListbyInput(Map<String, String> wordList, String input){
        if(wordList == null || input == null)
            throw new NullPointerException();

        String result = wordList.get(input);
        if(result == null)
            throw new IllegalArgumentException("단어를 찾을 수 없습니다.");

        return result;
    }  

    public static Map<String, String> readWordFile(String filename) throws IOException {
        if(!new File(filename).isFile())
            throw new FileNotFoundException();

        Map<String, String> dictionary = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line = br.readLine();
            while (line != null){
                String english = readStringRegularExpression(line, "[a-zA-Z()]+").trim();
                String korean = readStringRegularExpression(line, "[가-힣-()]+").trim();

                dictionary.put(english, korean);
                line = br.readLine();
            }
            
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        if(dictionary.size() != 1000) 
            throw new IllegalArgumentException("입력값과 결과값이 다름");

        return dictionary;
        

    }

    public static String readStringRegularExpression(String readString, String regex){
        if(readString == null|| regex == null)
            throw new NullPointerException("입력이 잘못 되엇습니다");

        Pattern p = Pattern.compile(regex);
        Matcher r = p.matcher(readString);

        StringBuilder sb = new StringBuilder();
        while(r.find()){
            sb.append(r.group()).append(" ");
        }

        return sb.toString();

    }

}