package Arrays;

public class MaximumPoints {

    public static int MaxPoint(int arr[],int k){
        int lsum=0,rsum=0,maxsum=0,rightind=arr.length-1;

        for(int i=0;i<k;i++){
            maxsum+=arr[i];
        }
        lsum=maxsum;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-arr[i];
             rsum+=arr[rightind];
             maxsum=Math.max(maxsum,lsum+rsum);
             rightind=rightind-1;
        }
        return maxsum;
    
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,4,7};
       int k=3;
       int result=MaxPoint(arr, k);
       System.out.println(result);
       
}
}