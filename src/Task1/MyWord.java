package Task1;

import java.util.HashMap;
import java.util.Map;

public class MyWord {
    public static Map<String,Boolean> mainWord(String[] myWord){
        Map<String,Boolean> wordMap=new HashMap<>();
        for(String word : myWord){
            if(wordMap.containsKey(word)){
                wordMap.put(word,true);
            }
            else {
                wordMap.put(word,false);
            }
        }
        return wordMap;
    }
}
