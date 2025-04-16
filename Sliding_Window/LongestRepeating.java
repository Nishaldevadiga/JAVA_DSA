package Sliding_Window;

import java.util.Collections;
import java.util.HashMap;

public class LongestRepeating {

    public static int Longest(String str, int k) {

        int l = 0, r = 0, maxlen = 0, maxfreq = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (r < str.length()) {

            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            maxfreq = Math.max(maxfreq, map.get(str.charAt(r)));
            if ((r - l + 1) - maxfreq > k) {
                map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
                if (map.get(str.charAt(l)) == 0) {
                    map.remove(str.charAt(l));
                }
                l++;

                maxfreq=Collections.max(map.values());
            }
          
            maxlen = Math.max(maxlen, r - l + 1);
      
            r++;

        }
        return maxlen;
    }

    public static void main(String[] args) {
      String str="AABABBBA";

      int result=Longest(str,2);
      System.out.println(result);
    }

}
