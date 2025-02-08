package Arrays;

public class LargeSmall {
// Linear search
    public static void Extremes(int arr[]){
        int largest= Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        
        }
        System.out.println("largest= "+largest);
        System.out.println("Smallest="+smallest);
    
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4};
         Extremes(arr);


    }
}
