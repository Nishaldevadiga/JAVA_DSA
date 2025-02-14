package Strings;

public class VowelCountLower {

    public static int count(String str){
        int count=0;
        String vowels="aeiou";
 for(int i=0;i<str.length();i++){
    if(vowels.indexOf(str.charAt(i))!=-1){
    count++;
    }
 }
 return count;
    }

    public static void main(String[] args) {
        String input="hll";
        int result=count(input);
        System.out.println(result);
    }
    
}
