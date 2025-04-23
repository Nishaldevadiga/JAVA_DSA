package Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class JobSeq {

    public static class jobs {
        int id;
        int deadline;
        int profit;

        public jobs(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static int Maxjobs(int arr[][]) {
        ArrayList<jobs> job = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            job.add(new jobs(i, arr[i][0], arr[i][1]));
        }

        Collections.sort(job, (obj1, obj2) -> obj2.profit - obj1.profit); // descending
        int time = 0;
        ArrayList<Integer> seq = new ArrayList<>();
        for (int i = 0; i < job.size(); i++) {
            if (job.get(i).deadline > time) {
                time++;
                seq.add(job.get(i).id);
            }
        }
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i));
        }
        return seq.size();
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        System.out.print(Maxjobs(arr));
    }

}
