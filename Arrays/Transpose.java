package Arrays;

public class Transpose {

    public static void Trans(int[][] arr){
        int [][] trans=new int[arr[0].length][arr.length];
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                    trans[j][i]=arr[i][j];
            }
         }
         System.out.print(trans[2][1]);
    }
    public static void main(String args[]){
        int[][] arr={
            {4,7,8},
            {8,8,7}
        };
        Trans(arr);
    }
}
