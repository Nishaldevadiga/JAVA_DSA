package Backtracking;

public class Permutations {

    public static void Permutations(String str, String ans){

        //edge case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            Permutations(newstr, ans+ch);

        }
    }

    public static void main(String[] args) {
        Permutations("abc","");
    }
    
}
