package GreedyAlogs;

import java.util.Arrays;

public class MinAbsDiff {

    public static int MinAbsDiff(int a[],int b[]){
         
        Arrays.sort(a);
        Arrays.sort(b);

        int sum=0;

        for(int i=0;i<a.length;i++){
            sum+=Math.abs(a[i]-b[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        int a[]={4,1,8,7};
        int b[]={2,3,6,5};

       int result= MinAbsDiff(a,b);
       System.out.print(result);
    }    
}
