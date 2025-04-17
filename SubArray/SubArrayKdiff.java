package SubArray;

import java.util.HashMap;


public class SubArrayKdiff {

    public static int Count(int arr[], int k) {

        return Counter(arr, k) - Counter(arr, k - 1);

    }

    public static int Counter(int arr[], int k) {
     HashMap<Integer,Integer> map=new HashMap<>();

        if(k<0){
            return 0;
        }
        int l = 0, r = 0, count = 0;
        while (r < arr.length) {
            map.put(arr[r],map.getOrDefault(arr[r], 0)+1);
            while(map.size()>k){
                map.put(arr[l],map.getOrDefault(arr[l], 0)-1);
               if(map.get(arr[l])==0){
                map.remove(arr[l]);
               }
               l++;
            }
         count+=(r-l+1);
             r++;
        }
    

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4 };
        System.out.println(Count(arr, 3));

    }

}
