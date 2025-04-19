package Basic_Math;

public class Palindrome {
    public static String Palindrome(int n) {

        if (n >= 0 && n < 10) {
            return "Palindrome";
        }
        int lastdigit = 0, revnum = 0, originalnum=n;
        while (n > 0) {
            lastdigit = n % 10;
            n = n / 10;
            revnum = revnum * 10 + lastdigit;
        }

        if (originalnum == revnum) {
            return "Palindrome";
        }
        return "Not a Palindrome";

    }

    public static void main(String[] args) {

        System.out.println(Palindrome(122));

    }

}
