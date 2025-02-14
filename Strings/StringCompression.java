package Strings;

public class StringCompression {
    public  static int compress(char[] chars) {
 
        StringBuilder sb=new StringBuilder("");
        if(chars.length==1){
            sb.append(chars[0]);
        }else{
        for(int i=0;i<chars.length;i++){
            int count=1;
           while(i<chars.length-1 && chars[i]==chars[i+1])
           {
               i++;
               count++;
           }
           sb.append(chars[i]);
           if(count>0){
            sb.append(count);
           }
        }
    }
        
        for(int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i)+" ");
        }
        return sb.length();
           }

    public static void main(String[] args) {
       char[] chars={'a'};
       int result=compress(chars);
       
       
}
}
