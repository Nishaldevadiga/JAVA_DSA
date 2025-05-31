package queuess;

public class queueB {

    static class queue{
        static class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
                this.next=null;
            }

        }
        static Node head=null;
        static Node tail=null;


        //check if queue is empty
        public static boolean isEmpty(){
            return head==null;
        }
        

        public static void add(int data){
            Node newNode=new Node(data);
            //first ele
            if(tail==null){
                head=tail=newNode;
            }

            tail.next=newNode;
            tail=newNode;
            
        }

        public static void remove(){
            if(isEmpty()){
                System.out.println("empty");
                return;
            }
            head=head.next;
            if(head==null){
                tail=null;
            }
        
        }

        public static int peek(){
            if(isEmpty()){
                 System.out.println("empty");
                return -1; 
            }
          return head.data;
        }

    }

    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.remove();

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
