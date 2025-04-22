package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



public class MaxActivitiesUnSorted {

    public static int MaxCount(int starting[],int ending[]){
          
       int acount=0;
       ArrayList<Integer> list=new ArrayList<>();
        //end array is unsorted
      int[][] activities=new int[starting.length][3];

      for(int i=0;i<starting.length;i++){
        activities[i][0]=i;
        activities[i][1]=starting[i];
        activities[i][2]=ending[i];
          }

          //sorting
          Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

          //taking first activity
          acount=1;
          list.add(activities[0][0]);
          int end=activities[0][2];

          for(int i=1;i<starting.length;i++){
            if(activities[i][1]>=end){
                acount++;
                list.add(activities[i][0]);
                end=activities[i][2];
            }
          }
          return acount;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 2, 5 };
        int[] end = { 2, 4, 3, 6 };
        System.out.println(MaxCount(start, end));
    }
    
}
