package Greedy;

import java.util.Arrays;

public class Minabs {

    public static int CalMinabs(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        int minabs = 0;

        for (int i = 0; i < a.length; i++) {
            minabs += Math.abs(a[i] - b[i]);
        }

        return minabs;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3 };
        int[] B = { 2, 1, 3 };

        System.out.println(CalMinabs(A, B));
    }

}
