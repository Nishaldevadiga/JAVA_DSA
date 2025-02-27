package Recursion;

public class PrintNumbers {
public static void Recursion(int n){
        if(n==1){
        System.out.println(n+" ");
        return;
        }
        System.out.print(n+" ");
        Recursion(n-1);
    

}
    public static void main(String[] args) {
       int n=10;
       Recursion(n);
    }
    
}
