package Arrays;

import java.util.Scanner;

public class TwoDArray {

    public static void Search(int arr[][],int key){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){

                    System.out.print("Found at"+i+" "+j);
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[][]=new int[3][3];

         Scanner sc=new Scanner(System.in);
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=sc.nextInt();
        }
      }

      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){ 
            System.out.print(arr[i][j]+" ");
 }
 System.out.println();
}   
Search(arr,3);
}

}
