package Arrays;

public class DiagonalSum {
    public static int DiagonalSum(int arr[][]){
 int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i][i];

        if(i!=arr.length-1-i){
            sum+=arr[i][i];
        }
    }

    return sum;
}
    public static void main(String args[]){
      
          int[][] arr= {
             {1, 2, 3},      // Row 1
             {5, 6, 7},      // Row 2
             {9, 10, 11},   // Row 3
            
         };
int result=DiagonalSum(arr);
System.out.print(result);

 
}
}
