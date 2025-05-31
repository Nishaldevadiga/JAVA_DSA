package queuess;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueC {

    public static void createQueue(Stack<Integer> s1, Stack<Integer> s2, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (s1.isEmpty()) {
                s1.push(arr[i]);
            } else {
                while (!s1.isEmpty()) {
                    s2.push(s1.peek());
                    s1.pop();
                }
                s1.push(arr[i]);
                while (!s2.isEmpty()) {
                    s1.push(s2.peek());
                    s2.pop();
                }
            }
        }

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
            
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int arr[] = { 1,2 };

        createQueue(s1, s2, arr);

    }

}
