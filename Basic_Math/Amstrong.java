package Basic_Math;

public class Amstrong {
public static String Amstrong(int n){

    int numdigit=String.valueOf(n).length();

    if(n>=0 && n<10){
        return "Amstrong Number";
    }
int lastdigit=0,originalnum=n,amnum=0;
    while(n>0){
        lastdigit=n%10;
        amnum=(int) (amnum+Math.pow(lastdigit,numdigit));
        n=n/10; 
    }
    if(amnum==originalnum){
        return "Amstrong number";
    }
return "Not a Amstrong number";
}
    public static void main(String[] args) {
        System.out.print(Amstrong(1633));
    }
    
}
