package Queue;

public class QueueL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Queue {

        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            // if the queue is empty
            if (isEmpty()) {
                head = tail = newNode;
            } else {

                tail.next = newNode;
                tail = newNode;
            }
            tail.next = null;
        }

        public int remove() {
            // if the queue has one element
            if (head == tail) {
                head = tail = null;
            }
            int front = head.data;
            head = head.next;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            int front = head.data;
            return front;
        }
    }

    public static void main(String[] args) {

       Queue q=new Queue();
       q.add(1);
       q.add(22);
       q.remove();
       System.out.print(q.peek());

    }

}
