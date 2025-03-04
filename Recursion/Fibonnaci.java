package Recursion;

public class Fibonnaci {
public static int  fib(int n){

    if(n==0||n==1){
        return n;
    }
    int fibj=fib(n-1);
    int fibk=fib(n-2);
    return fibj+fibk;
}
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    
}
