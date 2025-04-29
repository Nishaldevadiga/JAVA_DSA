package Stacks;

import java.util.ArrayList;

public class Stacks {

    static class stack {
       static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            int ele = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return ele;
        }

        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);

        s.pop();
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }

}
