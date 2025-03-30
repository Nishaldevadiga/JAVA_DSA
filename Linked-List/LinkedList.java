

class LinkedList {
    
    public class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public  void addFirst(int data){
        //create node
        
        Node newNode=new Node(data);
        size++;
        
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        //assign next
        
        newNode.next=head;
        
        //assign head
        head=newNode;
    }
    
    public void addLast(int data){
        
        //create a node
        Node newNode=new Node(data);
        size++;
        
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        tail.next=newNode;
        
        tail=newNode;
        
    }
    public void print(){
        
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
        }
    } 

    public void removeFirst(){
      
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
       if(head==null){
        tail=null;
       }
    }    

    public void removeLast(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }else if(size==1){

            head=tail=null;
            size--;
            return;
        }
        Node temp=head;

        for(int i=0;i<size-2;i++){
temp=temp.next;
        }

        temp.next=null;
        tail=temp;
        size--;
    }
    public void add(int idx, int data){
    if(idx==0){
       addFirst(data);
        return;
    }
    
    int i=0;
    Node temp=head;
    
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    
    Node newNode=new Node(data);
    size++;
    newNode.next=temp.next;
    temp.next=newNode;
    
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        
        ll.addFirst(1);
          ll.addLast(2);
          ll.add(1,7);
          ll.print();
          System.out.println();
        //ll.removeFirst();
        ll.removeLast();
        ll.print();
        System.out.println();
        System.out.println("Size= "+ll.size);
    }
}