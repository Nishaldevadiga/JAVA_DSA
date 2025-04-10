package Strings;

import java.util.HashSet;

public class LongestSubString {
public static int LongestSubString(String str){

int l=0,r=0,maxlen=0,n=str.length();
HashSet<Character> hash=new HashSet<>();

while(r<n){
    if(!hash.contains(str.charAt(r))){
        hash.add(str.charAt(r));
r++;
maxlen=Math.max(maxlen,hash.size());
    }else{
        hash.remove(str.charAt(l));
        l++;
    }
}
return maxlen;
}
    public static void main(String[] args) {
        String str="abcabcbb";
        int result=LongestSubString(str);
        System.out.println(result);

    }
    
}
