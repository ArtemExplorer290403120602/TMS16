package Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
//строка является ключом, и ее значение равно true, если эта строка встречается в
//массиве 2 или более раз. Пример:
//wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//wordMultiple(["c", "c", "c", "c"]) → {"c": true}
public class mainOne {
    public static void main(String[] args) {
        String[] words = {"a", "b", "a", "c", "b"};
        String[] words1 = {"c", "b", "a"};
        Map<String, Boolean> result = MyWord.mainWord(words);
        System.out.println(result);
        Map<String, Boolean> result1 = MyWord.mainWord(words1);
        System.out.println(result1);
    }
}
