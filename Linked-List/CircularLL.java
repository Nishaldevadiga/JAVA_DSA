public class CircularLL {

    class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;

    public void addFirst(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            tail.next=head;
            size++;
            return;
        }

            newNode.next=head;
            head=newNode;
            tail.next=newNode;
            size++;


    }
    public static void print(){
        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
            return;
        }
    }

    public static void main(String[] args) {
        CircularLL ll=new CircularLL();

        ll.addFirst(1);
        ll.print();


    }
}
