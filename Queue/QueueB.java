package Queue;

public class QueueB {
static class Queue{
     int arr[];
    int size;
    int rear;

    Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }
       int front=arr[0];

       for(int i=0;i<rear;i++){
        arr[i]=arr[i+1];
       }
       rear=rear-1;
       return front;
    }

    public void add(int data){
        if(rear==arr.length-1){
           System.out.println("Queue is full");
           return;
        }
       rear=rear+1;
       arr[rear]=data;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int top=arr[0];
        return top;
    }


}
    public static void main(String[] args) {
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.remove();
        }
    }
    
}
