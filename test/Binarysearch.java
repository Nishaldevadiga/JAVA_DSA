package test;

public class Binarysearch {

    public static int Binarysearch(int arr[],int key){
      int start=0;
      int end=arr.length-1;
      while(start<=end){
        int mid=(start+end)/2;

        if(arr[mid]==key){
            return mid;
        }
        if(key>arr[mid]){
            start=mid+1;
        }else{
            end=mid-1;
        }
      }
      return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int result=Binarysearch(arr, 4);
        System.out.print(result);

        
        
    }
    
}
