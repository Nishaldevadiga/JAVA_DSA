package queuess;

import java.util.Deque;
import java.util.LinkedList;

public class dequeues {

    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();

        q.addFirst(1);
        q.addFirst(2);
        q.addLast(4);
        System.out.println(q);
        q.removeLast();
        System.out.println(q);
        System.out.println(q.getLast());

    }

}
