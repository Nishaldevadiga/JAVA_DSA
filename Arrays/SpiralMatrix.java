package Arrays;

import java.util.Scanner;

public class SpiralMatrix {
     public static void main(String args[]){
       // int arr[][]=new int[4][4];
         int[][] arr= {
            {1, 2, 3, 4},      // Row 1
            {5, 6, 7, 8},      // Row 2
            {9, 10, 11, 12},   // Row 3
            {13, 14, 15, 16}   // Row 4
        };

 int startrow=0,endrow=arr.length-1,startcol=0,endcol=arr[0].length-1;
    while(startrow<=endrow && startcol<=endcol){
           
        //top
        for(int i=startrow;i<=endcol;i++){
            System.out.print(arr[startcol][i]+" ");
        }
        //right
        for(int i=startrow+1;i<=endrow;i++){
            System.out.print(arr[i][endcol]+" ");
        }
        //bottom
        for(int i=endcol-1;i>=startcol;i--){
            System.out.print(arr[endrow][i]+" ");
        }

        //left
        for(int i=endrow-1;i>=startrow+1;i--){
            System.out.print(arr[i][startcol]+" ");
       }

        startrow++;
        startcol++;
        endrow--;
        endcol--;
    }


    }


}
