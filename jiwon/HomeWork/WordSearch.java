package HomeWork;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) throws IOException {

        List<String> dictionary = saveDictionary();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("input word: ");
            String input = scanner.nextLine().trim();

            if (input.equals("exit()")) {
                break;
            }

            String meaning = null;

            for (String entry : dictionary) {
                if (entry.startsWith(input + "-")) {
                    meaning = entry.substring(entry.indexOf("-") + 2);
                    break;
                }
            }

            if (meaning != null) {
                System.out.println(input + " - " + meaning);
            } else {
                System.out.println("input word again.");
            }
        }

        System.out.println("exit program.");
    }

    private static List<String> saveDictionary() throws IOException {
        List<String> dictionary = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 2) {
                    String word = parts[0].split("\\d+\\. ")[1].trim();
                    String meaning = parts[1].trim();
                    dictionary.add(word + "- " + meaning);
                }
                if (parts.length == 3) {
                    String word = parts[0].split("\\d+\\. ")[1].trim();
                    String meaning = parts[2].trim();
                    dictionary.add(word + "- " + meaning);
                }

            }
        } finally {
            reader.close();
        }

        return dictionary;
    }
}
