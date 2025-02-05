package Arrays;

import java.util.*;

public class TrappingRain{

public static int TrappingRain(int[] arr){
      int leftmax[]=new int[arr.length];
     leftmax[0]=arr[0];
     int cumSum=0;
    //calculate left side side max
    for(int i=1;i<arr.length;i++){
          leftmax[i]=Math.max(leftmax[i-1],arr[i]);
    }


    //calculate right side max
    int rightmax[]=new int[arr.length];
    rightmax[arr.length-1]=arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--){
        rightmax[i]=Math.max(rightmax[i+1],arr[i]);
    }

    for(int i=0;i<arr.length;i++){
        int waterlvl=Math.min(leftmax[i],rightmax[i]);
        cumSum+=waterlvl-arr[i];
    }

    return cumSum;
}

   
    
    public static void main(String args[]){
    int arr[]={4,2,0,6,3,2,5};

    int result=TrappingRain(arr);

    System.out.println(result);

     
    }

}
