package Arrays;

public class ConstantWindow {
public static int MaxSum(int arr[],int k){
int maxsum=0;
int start=0, end=k;
for(int i=0;i<k;i++){
    maxsum+=arr[i];
}
int sum=maxsum;
while(end<arr.length){
    sum=sum+arr[end]-arr[start];
    maxsum=Math.max(sum,maxsum);
        start++;
        end++;
   
    }
return maxsum;
}
    public static void main(String args[]){
      int arr[]={5,4,3,1,10,12,50};
      int sum=MaxSum(arr,2);
      System.out.print(sum);
    }
    
}
