package Arrays;
//print number of 7's that are in the 2d array
public class CountNumber {

    public static int Count(int[][]arr,int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
return count;
    }
    public static void main(String args[]){
        int[][] arr={
            {4,7,8},
            {8,8,7}
        };

        int count=Count(arr,8);
        System.out.println(count);
    }
}
