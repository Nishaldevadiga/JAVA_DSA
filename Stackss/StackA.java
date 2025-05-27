package Stackss;

import java.util.ArrayList;

public class StackA {

    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }

         static void push(int data){
            list.add(data);
        }

         static int pop(){
            int pop=list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            return pop;
        }

         static int peek(){
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
       Stack s=new Stack();
       s.push(1);
       s.push(2);
       s.push(3);

       s.pop();

       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }
    }
    
}
