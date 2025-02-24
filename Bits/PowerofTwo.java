package Bits;

public class PowerofTwo {
    public static boolean isPow(int num){
        return (num&(num-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPow(8));
    }
    
}
