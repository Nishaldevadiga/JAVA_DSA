package Stackss;

import java.util.Stack;

public class ReverseString {

    public static String Reverse(String str) {
        Stack<Character> s = new Stack();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            char top = s.pop();
            sb.append(top);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        String result=Reverse(str);
        System.out.print(result);

    }

}
