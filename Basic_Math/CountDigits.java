package Basic_Math;

public class CountDigits {

    public static int count(int num){
        if(num==0){
            return 1;
        }
        return (int)Math.floor(Math.log10(Math.abs(num)))+1;

    }

    public static void main(String[] args) {
        System.out.print(count(77568));
    }
    
}
