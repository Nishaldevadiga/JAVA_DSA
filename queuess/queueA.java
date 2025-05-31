package queuess;

public class queueA {

    static class queue {
        static int size;
        static int arr[];
        static int rear;
        static int front;

        queue(int n) {
            this.size = n;
            arr = new int[n];
            this.rear = -1;
            this.front = -1;
        }

        // check if queue is empty
        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // check if the queue is full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add to the queue(FIFO)
        public static void add(int data) {
            if (isFull()) {
                System.out.print("queue full");
                return;
            }
            // adding the first ele
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

        }

        // remove from queue
        public static void remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return;
            }
          //if there is last 1 ele
          if(front==rear)
          {
            rear=front=-1;
          }else{
            front=(front+1)%size;
          }
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.print("queue is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {

        queue q = new queue(3);
        q.add(1);
        q.add(2);
        q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
