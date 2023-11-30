package Task3;

import java.util.regex.Pattern;

//Задана строка, которая может иметь внутри себя следующие символы: «(»,
//«)», «[», «]», «{», «}». Проверить правильность расстановки скобок в этой
//строке.
public class mainOne {
    public static void main(String[] args) {
        String text = "([{{])";
        boolean result = MyTest.myTest(text);
        System.out.println(result);
    }
}
