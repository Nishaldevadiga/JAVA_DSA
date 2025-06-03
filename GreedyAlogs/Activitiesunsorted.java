package GreedyAlogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activitiesunsorted {

    public static int NumberActivity(int start[], int end[]) {

        int[][] activities=new int[start.length][3];


        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        //sorting
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));



     ArrayList<Integer> list=new ArrayList<>();
        int count=1;

        int ends=activities[0][2];
        list.add(activities[0][0]);

        for(int i=1;i<start.length;i++){
            if(activities[i][1]>=ends){
                count++;
                list.add(activities[i][0]);
                ends=activities[i][2];
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println("A"+list.get(i));
        }
        return count;
    }

    public static void main(String[] args) {

        int start[] = { 1,3,0,5,8,5 };
        int end[] = { 2,4,6,7,9,9};

        int result = NumberActivity(start, end);
        System.out.print("Maximum Activities = "+result);
    }

    
}
