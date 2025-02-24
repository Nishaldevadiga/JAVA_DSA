package Bits;

public class ITheBit {
    public static int setBit(int num,int i){
        int bitmask=1<<i;
        return num|bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setBit(10, 2));
    }
}
