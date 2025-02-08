package Arrays;

public class BinarySearch {
    public static int BinarySearchs(int arr[],int target){
      for(int i=0;i<arr.length;i++){

        int start=i;
        int last=arr.length-1;

        while(start<=last){

            int mid=(start+last)/2;
            if(target==arr[i]){
                return i;
            }
            if(target>arr[mid]){
                start++;
            }
            else{
                last--;
            }
            
        }
        
      }
      return -1;
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4};
        int result=BinarySearchs(arr,5);
        if(result!=-1){
            System.out.println(result);
        }else{
            System.out.println("Not found"); 
        }


    }
}
