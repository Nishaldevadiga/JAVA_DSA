package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack {

    public static int MaxValue(int[] weight, int[] value, int sackweight) {

        // find the ratio
        double[][] ratio = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }

        //sorting arrays
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int maxval = 0;
        int totalweight = sackweight;

        for (int i = 0; i < ratio.length; i++) {
            if (weight[i] <= totalweight) {
                maxval += value[i];
                totalweight =totalweight- weight[i];
            } else {
                maxval += ratio[i][1] * totalweight;
                totalweight=0;
                break;
            }
        }

        return maxval;
    }

    public static void main(String[] args) {
        int[] weight = { 10, 20, 30 };
        int[] value = { 60, 100, 120 };
        System.out.println(MaxValue(weight, value, 50));
    }

}
