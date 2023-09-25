package jinwoo.assignment.search_word;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Dictionary {
    List<Word> dict = new ArrayList<>();

    public List<Word> getDict() {
        return dict;
    }

    public Dictionary(String fileName) {
        String path = "jinwoo/assignment/search_word/" + fileName + ".txt";
        try (
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
        ) {
            String line = br.readLine();
            while(line != null){
                String setLine = line.replaceAll("\\s+", " ");
                StringTokenizer st = new StringTokenizer(setLine);
                String num = st.nextToken();
                String name = st.nextToken();
                String means = st.nextToken("\n");
                Word word = new Word(num, name, means);
                dict.add(word);
                line = br.readLine();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void search(String name){
        try {
            boolean active = true;
            for (Word word : dict) {
                if(word.getName().equals(name)){
                    System.out.println(word);
                    active = false;
                    break;
                }
            }
            if(active) throw new IllegalArgumentException("찾는 값이 없습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
