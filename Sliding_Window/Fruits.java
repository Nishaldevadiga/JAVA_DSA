package Sliding_Window;

import java.util.HashMap;
import java.util.HashSet;

public class Fruits {
public static int maxFruits(int arr[],int k){

    int l=0,r=0,maxlen=0;

   
    HashMap<Integer,Integer> map = new HashMap<>();

    while(r<arr.length){
        map.put(arr[r],map.getOrDefault(arr[r],0)+1);
        if(map.size()>k){
          while(map.size()>k){
            map.put(arr[l],map.get(arr[l])-1);
            if(map.get(arr[l])==0){
                map.remove(arr[l]);
            }
             l++;
          }
        }
        if(map.size()<=k){
            maxlen=Math.max(maxlen,r-l+1);
        }
        r++;
    }

    return maxlen;
}


public static void main(String args[]){

        int arr[]={3,3,3,1,2,1,1,2,3,3,4};
        int result=maxFruits(arr, 2);
        System.out.println(result);
    }
    
}
