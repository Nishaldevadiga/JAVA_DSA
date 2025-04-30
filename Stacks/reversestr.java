package Stacks;

import java.util.*;

public class reversestr {

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        while (!s.empty()) {
            char currchar = s.pop();
            sb.append(currchar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        String newstr = reverse(str);
        System.out.print(newstr);
    }

}
