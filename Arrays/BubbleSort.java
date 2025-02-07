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

public static void InsertionSort(int arr[]){


for(int i=1;i<arr.length-1;i++){
    int curr=arr[i];
    int prev=i-1;
    while(prev>=0 && arr[prev]>arr[curr])
    {
        arr[prev+1]=arr[prev];
        prev--;
    }

    //insertion
    arr[prev+1]=curr;
}
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]);
}
}

public static void CountingSort(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        largest=Math.max(largest,arr[i]);
    }

    //freq matrix
    int[] freq=new int[largest+1];
    for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;
    }

    //sorting 
    int j=0;
    for(int i=0;i<freq.length;i++){
        while(freq[i]>0){
            arr[j]=i;
            j++;
            freq[i]--;
        }
    }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
}


    public static void main(String args[]){
        int[] arr={4,5,3,1,2};
        BubbleSort(arr);
        SelectionSort(arr);
        InsertionSort(arr);
        CountingSort(arr);
    }
    
}
