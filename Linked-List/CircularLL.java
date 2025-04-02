public class CircularLL {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            size++;
            return;
        }else{

        newNode.next = head;
        head = newNode;
        tail.next = newNode;
        size++;
        }

    }

    public static void addLast(int data){
        Node newNode= new Node(data);

        if(head==null){
            head=tail=newNode;
            tail.next=head;
            size++;
            return;
            
        }else{

        tail.next=newNode;
        tail=newNode;
        tail.next=head;
        size++;
        }
    }

    public static void print() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;

        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Head)");
    }

    public static void main(String[] args) {
        CircularLL ll = new CircularLL();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();

    }
}
