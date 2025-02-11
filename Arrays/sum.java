package Arrays;

public class sum {
    public static int Sum(int arr[][]){
        int row=1,sum=0;
        for(int i=0;i<arr[0].length;i++){
             sum+=arr[row][i];
        }
        return sum;
    }
    public static void main(String args[]){
   int[][] arr={
    {1,4,9},
    {11,4,4},
    {2,2,3}
   };

   int sum=Sum(arr);
   System.out.println(sum);
    }
}
