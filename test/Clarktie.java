package test;

public class Clarktie {

    public static String format(String str) {
       
    String clean=str.replace("-", "");

    StringBuilder newstr=new StringBuilder();

    for(int i=0;i<clean.length();i++){
        if(i>0 && i%3==0){
            newstr.append('-');
        }
        newstr.append(clean.charAt(i));
    }
return newstr.toString();

    }

    public static void main(String[] args) {
        String str = "1-23-4567-980";
        System.out.print(format(str));
        
    }
}
