package Task2;

import java.util.Map;

//На вход поступает массив непустых строк, создайте и верните Map<String,
//String> следующим образом: для каждой строки добавьте ее первый символ
//в качестве ключа с последним символом в качестве значения. Пример:
//pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//pairs(["man", "moon", "main"]) → {"m": "n"}
//pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
public class mainOne {
    public static void main(String[] args) {

        String[] test = {"code", "bug"};
        String[] test1 = {"man", "moon", "main"};
        String[] test2 = {"man", "moon", "good", "night"};
        Map<String, String> result = MyWord.mainWord(test);
        Map<String, String> result1 = MyWord.mainWord(test1);
        Map<String, String> result2 = MyWord.mainWord(test2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
