package GreedyAlogs;

import java.util.ArrayList;

public class Activities {

    public static int NumberActivity(int start[], int end[]) {

        ArrayList<Integer> list=new ArrayList<>();
        int count=1;
        int starts=start[0];
        int ends=end[0];
        list.add(0);
        for(int i=1;i<start.length;i++){
            if(start[i]>=ends){
                count++;
                list.add(i);
                ends=end[i];
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
