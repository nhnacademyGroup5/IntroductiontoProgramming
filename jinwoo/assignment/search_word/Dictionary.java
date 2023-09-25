package jinwoo.assignment.search_word;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary {
    HashMap<String, String> dict = new HashMap<>();

    public Dictionary(String fileName) {
        String path = "jinwoo/assignment/search_word/" + fileName + ".txt";
        try (
            BufferedReader br = new BufferedReader(new FileReader(path));
        ) {
            String line = br.readLine();
            while(line != null){
                String setLine = line.replaceAll("\\s+", " ");
                String name = convertRedex(line, "[a-zA-Z]+\\s?[a-zA-Z]+");
                int index = setLine.indexOf(name) + name.length();
                String means = setLine.substring(index + 1).replaceAll("\\s?\\d+&", "");
                dict.put(name, means);
                line = br.readLine();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public String convertRedex(String input, String redex){
        Pattern pattern = Pattern.compile(redex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) return matcher.group();
        throw new IllegalStateException("찾는 문자열이 없습니다.");
    }

    // public String filterMeans(String input){
    //     input.split(",")
    // }

    public void search(String name){
        try {
            boolean exists = false;
            for (String key : dict.keySet()) {
                if(key.equals(name)) {
                    System.out.println(dict.get(name));
                    exists = true;
                    break;
                }
            }
            if(!exists) throw new IllegalArgumentException("찾는 값이 없습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // public void sort(){
    //     List<String> key = new ArrayList<>(dict.keySet());
    //     key.sort((a, b) -> a.compareTo(b));
    // }
}
