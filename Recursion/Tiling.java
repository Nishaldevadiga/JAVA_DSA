package Recursion;

public class Tiling {
 public static int Tiling(int n){

    if(n==0 ||n ==1){
        return 1;
    }

    //vertical choice
    int vert=Tiling(n-1);

    //horizontal choice
    int hor=Tiling(n-2);

    int total= vert+hor;

    return total;
 }
    public static void main(String[] args) {
        System.out.println(Tiling(3));
    }
    
}
