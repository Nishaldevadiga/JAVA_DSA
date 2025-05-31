package queuess;

public class queueA {

    static class queue {
        static int size;
        static int arr[];
        static int rear;

        queue(int n) {
            this.size = n;
            arr = new int[n];
            this.rear = -1;
        }

        // check if queue is empty
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add to the queue(FIFO)
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.print("queue full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove from queue
        public static void remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return;
            }

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];

            }
            rear = rear - 1;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.print("queue is empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {

        queue q = new queue(3);
        q.add(1);
        q.add(2);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
