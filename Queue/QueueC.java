package Queue;

import java.util.*;

public class QueueC {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
