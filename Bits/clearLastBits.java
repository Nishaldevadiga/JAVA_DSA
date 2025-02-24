package Bits;

public class clearLastBits {

    public static int clearLast(int n,int i){
        int bitmask=-1<<i;

        return bitmask&n;
    }
    public static void main(String[] args) {
        System.out.println(clearLast(15, 2));
    }
}
