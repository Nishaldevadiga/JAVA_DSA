package Arrays;

public class BubbleSort {
public static void BubbleSort(int arr[]){
   for(int i=0;i<=arr.length-2;i++){
    for(int j=0;j<=arr.length-2-i;j++){
        if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        }
    }
   }    
   for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
}


    public static void main(String args[]){
        int[] arr={4,5,3,1,2};
        BubbleSort(arr);
      
    }
    
}
