package Backtracking;

public class Subsets {
public static void Subsets(String str, int i , String ans){

    //base case
    if(i==str.length()){
        if(str.length()==0){
            System.out.println("null");
        }{
        System.out.println(ans);
        }

        return;
        }

    

    
    //yes choice
    Subsets(str, i+1, ans+str.charAt(i));
    //No choice
    Subsets(str, i+1, ans);
    
}
    public static void main(String[] args) {
        Subsets("abc", 0, "");
    }
    
}
