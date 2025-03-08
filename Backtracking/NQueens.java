package Backtracking;


public class NQueens {
     public static void nQueens(char[][] board,int row){
           //edge case
           if(row==board.length){
            count++;
            PrintBoard(board);
            return;
           }

           //columns loop
           for(int j=0;j<board.length;j++){
            if(isQueen(board,row,j)){
            board[row][j]='Q';//placing the queen
            nQueens(board, row+1);//Recursion
            board[row][j]='x'; //backtracking
            }
           }
     }

     public static boolean isQueen(char board[][],int row,int col){

        //check for upper
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //check for righthand side
        for(int i=row-1,j=col+1;i>=0&& j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //check for lefthand side 
        for(int i=row-1,j=col-1;i>=0 &&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
     }

     public static void PrintBoard(char board[][]){
        System.out.println("------------------------------");
           for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
           }
     }

     public static int count=0;
     
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }  
        nQueens(board, 0);
        System.out.println("Total ways for nQueens is "+count);
    }
    
}
