package Queue;

public class QueueB {
    static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isfull() {
            return (rear + 1) % size == front;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public void add(int data) {
            if (isfull()) {
                System.out.println("Queue is full");
                return;
            }
            // adding element for the first time
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = arr[front];
            return top;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        

    }

}
