package Arrays;

public class SearchSortedmat {
    public static void Search(int arr[][],int key){
        int row=0, col=arr[0].length-1;
        
      while(row<arr.length && col>=0){
        int point=arr[row][col];
        if(point==key){
            System.out.println("here= "+row+" "+col);
            break;
        }
             if(key<point){
                col--;
             }else if(key>point){
                row++;
             }
             
      }
      
    }
    public static void main(String args[]){
        int[][] arr= {
           // {10, 20, 30,
           {40}     // Row 1
            //{15, 25, 35,45},      // Row 2
           // {27, 29, 37,48}, 
            //{32, 33, 39,50}   // Row 3
           
        };
         Search(arr,40);
    }
}
