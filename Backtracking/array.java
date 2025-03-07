package Backtracking;

public class array {
  public static void ModifyArray(int arr[], int start, int val){

//base case
if(start==arr.length){
    PrintArr(arr);
    return;
}
arr[start]=val;
ModifyArray(arr,start+1,val+1);
arr[start]=arr[start]-2;
}

  public static void PrintArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
  }
    public static void main(String[] args) {
     int arr[]=new int[5];   
     ModifyArray(arr, 0, 1);
     System.out.println();
     PrintArr(arr);
    }
    
}
