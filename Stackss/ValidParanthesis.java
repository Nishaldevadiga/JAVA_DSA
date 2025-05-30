package Stackss;

import java.util.Stack;

public class ValidParanthesis {

    public static boolean ValidParanthesis(String str) {

        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else {
                if (!s.isEmpty() && ((s.peek() == '{' && str.charAt(i) == '}')
                        || (s.peek() == '[' && str.charAt(i) == ']')
                        || (s.peek() == '(' && str.charAt(i) == ')'))) {
                    s.pop();
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "{}([])";
        System.out.println(ValidParanthesis(str));
    }

}
