package Task2;

import java.util.HashMap;
import java.util.Map;

public class MyWord {
    public static Map<String, String> mainWord(String[] Myword) {
        Map<String, String> wordMap = new HashMap<>();
        for (String word : Myword) {
            wordMap.put(String.valueOf(word.charAt(0)), word.substring(word.length() - 1));
        }
        return wordMap;
    }
}
