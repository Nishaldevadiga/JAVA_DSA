package Stackss;

import java.util.Stack;

public class Duplicatepara {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                int count = 0;
                while (!s.isEmpty() && !(s.peek() == '(')) {
                    s.pop();
                    count++;
                }
                if (count == 0) {
                    return true;
                }
                s.pop();
            } else {
                s.push(str.charAt(i));
            }
          
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(isValid(str));
    }

}
