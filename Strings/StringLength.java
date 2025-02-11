package Strings;

public class StringLength {

    public static void DisplayLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str1="hello World";

        System.out.println(str1.length());
        DisplayLetters(str1);

    }
    
}
