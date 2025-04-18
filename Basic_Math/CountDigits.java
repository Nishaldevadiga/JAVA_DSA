package Basic_Math;

public class CountDigits {

    public static int count(int num){
        int count=0;
        
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(count(778));
    }
    
}
