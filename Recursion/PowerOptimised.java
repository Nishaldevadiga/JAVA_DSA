package Recursion;

public class PowerOptimised {

    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }

        int powersq= Power(x,n/2);
        int powersquared= powersq*powersq;

        if(n%2!=0){
            powersquared=x*powersquared;
        }
        return powersquared;
    }
    public static void main(String[] args) {
        System.out.println(Power(2,5));
    }
    
}
