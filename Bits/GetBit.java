package Bits;

public class GetBit {
    public static int getBit(int num,int i){
       int bitmask=1<<i;
       if((num&bitmask)==0){
        return 0;
       }else{
        return 1;
       }
    }
    public static void main(String[] args) {
       System.out.println(getBit(10, 3));
    }
    
}
