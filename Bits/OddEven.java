package Bits;

public class OddEven {
    public static String IsEven(int num){
        int bitmask=1;
        if((num & bitmask)==0){
            return "Even Number";
        }
        return "Odd Number";

    }
    public static void main(String[] args) {
        int num=10;
        String result= IsEven(num);
        System.out.println(result);
    }
}
