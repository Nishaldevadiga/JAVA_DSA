package test;

import java.util.Arrays;

public class Anagrams {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        for (int i = 0; i < char1.length; i++) {

            if (char1[i] != char2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "nishal";
        String str2 = "alhsin";

        System.out.print(isAnagram(str1, str2));

    }

}
