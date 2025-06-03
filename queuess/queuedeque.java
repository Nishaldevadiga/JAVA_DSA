package queuess;

import java.util.Deque;
import java.util.LinkedList;

public class queuedeque {

    static class queue {
        static Deque<Integer> q = new LinkedList<>();

        public static boolean isEmpty() {
            return q.size() == 0;
        }

        public static void add(int data) {
            q.addLast(data);
        }

        public static void remove() {
            q.removeFirst();
        }

        public static int peek() {
            return q.getFirst();
        }
    }

    public static void main(String[] args) {
        queue q = new queue();

        q.add(1);
        q.add(2);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}
