package test;

import java.util.Arrays;

public class Median {

    public static double Median(int arr[]) {

        Arrays.sort(arr);
        double med=0;
        if(arr.length%2==0){
           med=(arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
        }else{
             med=arr[arr.length/2];
        }
        return med;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4,5};

        Double median=Median(arr);
        System.out.print(median);


        

    }
}
