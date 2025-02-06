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

public static void SelectionSort(int arr[]){
    for(int i=0;i<=arr.length-1;i++){
        int smallest=i;
        for(int j=i+1;j<=arr.length-1;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }
        }

        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}


    public static void main(String args[]){
        int[] arr={4,5,3,1,2};
        BubbleSort(arr);
        SelectionSort(arr);
    }
    
}
