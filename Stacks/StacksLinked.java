package Stacks;

public class StacksLinked {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class stack {

        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void Push(int data) {
            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;

        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {


        stack s=new stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);

        s.pop();

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
