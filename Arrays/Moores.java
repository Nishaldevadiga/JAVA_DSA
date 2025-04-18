package Arrays;

import java.util.HashMap;

public class Moores {

    public static int Max(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0 )+1);

            if((map.getOrDefault(arr[i], 0)+1)>arr.length/2){
                return arr[i];
            }
        }
return -1;
       
    }

    public static void main(String[] args) {

        int arr[]={2,3,3,3,1,3,2};

        System.out.println(Max(arr));

        
    }
    
}
