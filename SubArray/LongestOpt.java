package SubArray;

import java.util.HashMap;

public class LongestOpt {
public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer,Integer> map=new HashMap<>();
// sum=0, occuring 1 time
        map.put(0,1);
     for(int num:nums){
        sum+=num;

        if(map.containsKey(sum-k)){
            count=count+map.get(sum-k);
        }

        map.put(sum, map.getOrDefault(sum,0)+1);
     }
     return count;
}
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1 };
        System.out.print(subarraySum(arr,3));
    }
    
}
