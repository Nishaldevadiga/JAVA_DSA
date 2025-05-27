package Stackss;

import java.util.Stack;

public class StackC {

    public static void main(String[] args) {
        Stack<Integer> s=new Stack();

        s.push(1);
        s.push(2);
s.pop();
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
