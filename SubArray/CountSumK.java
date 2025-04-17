package SubArray;

import java.util.HashMap;

public class CountSumK {
    public static int Count(int arr[],int k) {
        int count = 0;
        int prefixsum = 0;
        int r = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);// initial sum=0;
        while (r < arr.length) {
            prefixsum+=arr[r];
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);  
            }
            map.put(prefixsum,map.getOrDefault(prefixsum, 0)+1);
            r++;
        }

        return count; 
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        System.out.println(Count(arr, 3));
    }

}
