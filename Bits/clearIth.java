package Bits;

public class clearIth {

    public static int clear(int num,int i){
        int bitmask=1<<i;

        return ~(bitmask)&num;
    }
    public static void main(String[] args) {
        System.out.println(clear(10, 1));
    }
    
}
