package Recursion;

public class SumNumbers {
public static int Sum(int n){
    if(n==1){
        return 1;
    }
    return n+Sum(n-1);
}
    public static void main(String[] args) {
        int n=5;
        int result=Sum(n);
        System.out.println(result);
    }
    
}
