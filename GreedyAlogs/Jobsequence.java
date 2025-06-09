package GreedyAlogs;

import java.util.ArrayList;
import java.util.Collections;

public class Jobsequence {

    static class jobs {
        int id;
        int time;
        int profit;

        public jobs(int id, int t, int p) {
            this.id = id;
            this.time = t;
            this.profit = p;

        }
    }

    public static void main(String[] args) {
        int jobs[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<jobs> list = new ArrayList<>();

        for (int i = 0; i < jobs.length; i++) {
            list.add(new jobs(i, jobs[i][0], jobs[i][1]));
        }

        Collections.sort(list, (a, b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;

        for (int i = 0; i < list.size(); i++) {
            jobs curr = list.get(i);
            if (curr.time > time) {
                time++;
                seq.add(i);
            }

        }
        System.out.println("no of jobs " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i));
        }

    }

}
