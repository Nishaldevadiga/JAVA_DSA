package Greedy;

import java.util.ArrayList;

public class MaxActivities {

    public static int countMax(int[] starting, int[] ending) {

        int acount = 0;
        ArrayList<Integer> list = new ArrayList<>();

        // take 1 activity
        acount = 1;
        list.add(0);
        int end = ending[0];

        for (int i = 1; i < starting.length; i++) {
            if (starting[i] >= end) {
                acount++;
                list.add(i);
                end = ending[i];
            }
        }

        return acount;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 2, 5 };
        int[] end = { 2, 3, 4, 6 };

        System.out.print(countMax(start, end));
    }

}
