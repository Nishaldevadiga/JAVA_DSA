package Backtracking;

public class GridWays {

    public static int ways(int i,int j,int m,int n){

        //base case

        if(i==m-1&&j==n-1){
            return 1;
        }else if(i==m || j==m){
            return 0;
        }

        //recursion
        int rightways=ways(i, j+1, m, n);
        int leftways=ways(i+1,j,m,n);

        int totalways=rightways+leftways;

        return totalways;

    }

public static void main(String[] args) {
    System.out.println(ways(0,0,3,3));
}
    
}
