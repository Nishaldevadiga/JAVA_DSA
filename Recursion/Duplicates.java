package Recursion;

import java.rmi.server.RemoteObject;

public class Duplicates {
public static void RemoveDup(String str, StringBuilder newStr, int index, boolean map[]){

    //edge case
    if(index==str.length()){
        System.out.println(newStr);
        return;
    }

    char ch=str.charAt(index);
    if(map[ch-'a']==true){
        RemoveDup(str,newStr,index+1,map);
    }else{
        map[ch-'a']=true;
        RemoveDup(str, newStr.append(ch), index+1, map);
    }
}
public static void main(String[] args) {
    RemoveDup("nnishal", new StringBuilder(), 0, new boolean[26]);

}
    
}
