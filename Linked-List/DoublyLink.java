public class DoublyLink {

    public static class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            size++;
            head = tail = newNode;
            return;

        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addLast(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;

    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        }
        size--;
    }

    public void Reverse() {

        if (head == null) {
            System.out.println("empty list");
            return;
        }
        if (size == 1) {
            System.out.println("Invalid size");
            return;
        }

        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev=curr;
            curr=next;
        }

        head=prev;

        if(head!=null){
            tail=head;
            while(tail!=null){
                tail=tail.next;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLink ll = new DoublyLink();

        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.removeFirst();
        ll.print();
        System.err.println("size= " + size);
        ll.addLast(4);
        ll.print();
        System.err.println("size= " + size);
        ll.removeLast();
        ll.print();
        System.err.println("size= " + size);
        System.out.println("_____________");
        ll.Reverse();
        ll.print();

    }

}
