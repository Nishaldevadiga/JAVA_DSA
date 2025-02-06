package Arrays;

public class Stocks {
 
  public static int Profit(int arr[]){
    int maxProfit=0,buyPrice=Integer.MAX_VALUE;

    for(int i=0;i<arr.length;i++){
        if(buyPrice<arr[i]){
            int profit=arr[i]-buyPrice;
            maxProfit=Math.max(profit,maxProfit);
        }else{
            buyPrice=arr[i];
        }
      
    }

    return maxProfit;


  }

    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        int result=Profit(arr);
        System.out.println(result);


    }
    
}
