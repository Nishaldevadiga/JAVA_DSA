package Sliding_Window;

public class Substringwiththree {

    public static int NumberofSub(String str){
        int lastseen[]={-1,-1,-1};
        int count=0;
        
        
        for(int i=0;i<str.length();i++){
        lastseen[str.charAt(i)-'a']=i;

        if(lastseen[0]!=-1 && lastseen[1]!=-1&&lastseen[2]!=-1){
          count=count+(1+Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2])));
        }
        }

        return count;
    }

    public static void main(String[] args) {
        String str="bbacba";
        int result=NumberofSub(str);
        System.out.print(result);


    }
    
}
