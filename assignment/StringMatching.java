package assignment;

public class StringMatching {

    public static void StringMatchAlgo(String text, String pattern) {

    }

    public static void main(String[] args) {
        String text = "HappyBirthday";
        String pattern = "Birthday";

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {

            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }

            if (j == m) {
                System.out.print("found " + i);
                break;
            }
        }
    }

}
