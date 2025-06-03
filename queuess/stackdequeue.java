package queuess;

import java.util.Deque;
import java.util.LinkedList;

public class stackdequeue {

    static class Stack{
       static Deque<Integer> q=new LinkedList<>();

        public static void push(int data){
            q.addLast(data);
        }
        public static void pop(){
            q.removeLast();
        }

        public static int peek(){
            return q.getLast();
        }

        public static boolean isEmpty(){
            return q.size()==0;
        }

    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
    
}
