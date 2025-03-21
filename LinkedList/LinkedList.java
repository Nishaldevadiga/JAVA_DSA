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
//add at mid
        public static void addMid(int data, int idx){
            Node addNewNode=new Node(data);

            if(idx==0){
                addNewNode.next=head;
                head=addNewNode;
                return;
            }

            Node temp=head;
            int i=0;

            while(i<idx-1){
                temp=temp.next;
                i++;
            }

             addNewNode.next=temp.next;
             temp.next=addNewNode;

        }
    public static void print(){
        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
    
            ll.head=new Node(1);
            ll.head.next=new Node(2);

            addMid(7,0);
            print();

        
        
    }
    
}
