package HashSet;

import java.util.HashSet;

public class Count {
public static boolean dup(int arr[]){

    HashSet<Integer> set=new HashSet<>();

    for(int i=0;i<arr.length;i++){
        if(set.contains(arr[i])){
            return true;
        }else{
            set.add(arr[i]);
        }
    }
    return false;

}
    public static void main(String[] args) {
        int arr[]={1,2,5,4};
        System.out.print(dup(arr));
    }
    
}
