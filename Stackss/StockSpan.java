package Stackss;

import java.util.Stack;

public class StockSpan {

    public static void Span(int stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1;i<stocks.length;i++){

            int curprice=stocks[i];
         while(!s.isEmpty()&&curprice>=stocks[s.peek()]){
              s.pop();
         }

         if(s.isEmpty()){
            span[i]=i+1;
         }else{
            span[i]=i-s.peek();
         }

         s.push(i);

        }
    
    }

    public static void main(String[] args) {
        int stocks[]={100,80,60,70,85,100};
        int span[]=new int[stocks.length];

        Span(stocks,span);

        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }
    }
    
}
