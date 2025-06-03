package GreedyAlogs;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack {

    public static int MaxVal(int val[], int wieght[], int W) {

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) wieght[i];
        }

        // sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // we need max value of ratio so we need to retrieve from backwards
         int capacity=W;
         int maxvals=0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx=(int)ratio[i][0];
         if(capacity>=wieght[idx]){
            maxvals+=val[idx];
            capacity-=wieght[idx];
         }else{
             maxvals+=ratio[i][1]*capacity;
             capacity=0;
         }
        }

        return maxvals;
    }

    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        int result = MaxVal(val, weight, W);
        System.out.print(result);
    }

}
