package Sliding_Window;

import java.util.HashMap;

public class longestsubstring {
    public static int longest(String str, int k) {

        int l = 0, r = 0, maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < str.length()) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            if (map.size() > k) {

                while (map.size() > k) {
                    map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
                    if (map.get(str.charAt(l)) == 0) {
                        map.remove(str.charAt(l));
                    }
                    l++;
                }

            }
            if (map.size() <= k) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args) {

        String str = "abbbbbcccccadg";
        int result = longest(str, 2);
        System.out.print(result);
    }

}
