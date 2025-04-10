package ArrayList;

import java.util.ArrayList;

public class Consecutiveone {

    public static int Consecutive(ArrayList<Integer> list, int k) {
        int l = 0, r = 0, maxlen = 0, zero = 0;

        while (r < list.size()) {
            if (list.get(r) == 0) {
                zero++;
            }

            while (zero > k) {
                if (list.get(l) == 0) {
                    zero--;
                }
                l++;
            }

            maxlen = Math.max(maxlen, (r - l) + 1);
            r++;
        }
        return maxlen;
    }

    public static int ConsecutiveCus(ArrayList<Integer> list, int k){
        int l=0,r=0,maxlen=0,zero=0;
       

        while(r<list.size()){
            if(list.get(r)==0){
                zero++;
            }
           if(zero<=k){
            maxlen=Math.max(maxlen, (r-l)+1);
           }
           if(zero>k){
            if(list.get(l)==0){
                zero--;
            }
            l++;
           }
           r++;
        }

        return maxlen;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        int result = Consecutive(list, 2);
        System.out.println(result);
        int result1=ConsecutiveCus(list, 2);
        System.out.println(result1);
    }

}
