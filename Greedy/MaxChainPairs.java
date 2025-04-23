package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxChainPairs {

    public static int MaxChain(int[][] arr) {

        int chainlen = 0;

        // Sort the Second index
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));

        // consider 1 chain
        chainlen = 1;
        int pairend = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] > pairend) {
                chainlen++;
                pairend = arr[i][1];
            }
        }
        return chainlen;
    }

    public static void main(String[] args) {
        int[][] arr = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        System.out.print(MaxChain(arr));
    }

}
