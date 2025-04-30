package Stacks;

import java.util.Stack;

public class StackPushAtBottom {

    public static void PushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        PushBottom(s, data);
        s.push(top);

    }

    public static void ReverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        ReverseStack(s);
        PushBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        PushBottom(s, 5);
        ReverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }

}
