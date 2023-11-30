package Task3;

import java.util.Stack;

public class MyTest {
    public static boolean myTest(String mainTest) {
        Stack<Character> test = new Stack<>();
        for (int i = 0; i < mainTest.length(); i++) {
            char sybmol = mainTest.charAt(i);

            if (sybmol == '(' || sybmol == '[' || sybmol == '{') {
                test.push(sybmol);
            } else if (sybmol == ')' || sybmol == ']' || sybmol == '}') {
                if (test.isEmpty()) {
                    return false;
                }

                char delete = test.pop();
                if ((sybmol == ')' && delete != '(') || (sybmol == ']' && delete != '[') || (sybmol == '}' && delete != '{')) {
                    return false;
                }
            }
        }
        return test.isEmpty();
    }
}
