package Basic_Math;

public class CountDigits {

    public static int count(int num){
        if(num==0){
            return 1;
        }
        return (int)Math.floor(Math.log10(Math.abs(num)))+1;

    }

    public static int reverseDigits(int num){
        int revnum=0,lastdigit=0,n=0;

        while(num>0){
            lastdigit=num%10;
             num=num/10;
             revnum=revnum*10+lastdigit;
        }

        return revnum;
    }

    public static void main(String[] args) {
        //System.out.print(count(77568));
        System.out.print(reverseDigits(4567));
    }
    
}
