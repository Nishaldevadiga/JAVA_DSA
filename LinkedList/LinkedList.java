package LinkedList;

public class LinkedList {

    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

        
    }
    public static Node head;
        public static Node tail;
  //addfirst
        public static void addFirst(int data) {
            // Create new node
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }

            // newnode next to head
            newNode.next = head;

            // head-newnode
            head = newNode;
        }
//addLast
        public static void addLast(int data){
            //Create a node
            Node newNode=new Node(data);

            if(head==null){
                head=tail=newNode;
                return;
            }

            tail.next=newNode;
            tail=newNode;

           
        }
    
        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
    
            ll.head=new Node(1);
            ll.head.next=new Node(2);
        
    }
    
}
