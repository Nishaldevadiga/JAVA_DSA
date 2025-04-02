public class DoublyLink {

    public static class Node{

       
        int data;
        Node next;
        Node prev;

        public Node(int data){
             this.data=data;
             this.next=null;
             this.prev=null;
        }


    }

    public static Node head;
    public static Node tail;
    public static int size=0;

    public void addFirst(int data){
        Node newNode=new Node(data);

        if(head==null){
            size++;
            head=tail=newNode;
            return;
         
        }
    
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
         size++;
    }

    public void print(){
        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void addLast(int data){

Node newNode=new Node(data);

    }

    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        if(size==1){
            head=tail=null;
            size--;
            return;
        }

        head=head.next;
        head.prev=null;
        size--;
    }

    public static void main(String[] args) {
        DoublyLink ll=new DoublyLink();

        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

ll.removeFirst();
        ll.print();
        System.err.println("size= "+size);


    


    }
    
}
