package buoi13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter paragraph: ");
        String paragraph = sc.nextLine();

        String[] words = paragraph.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
            if(!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Number of each word: \n");
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();
    }
}
