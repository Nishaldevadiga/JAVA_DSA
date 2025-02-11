package Strings;

public class Palindrome {

    public static String CheckPal(String str){
      for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return "Not a Palindrome";
            }
      }
      return "Palindrome";
    }
    public static void main(String[] args) {
        String str1="ana";
        String result=CheckPal(str1);
        System.out.println(result);


    }
    
}
