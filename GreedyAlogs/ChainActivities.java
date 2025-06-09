package GreedyAlogs;

import java.util.Arrays;
import java.util.Comparator;

public class ChainActivities {

    public static void main(String[] args) {
        int arr[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));

        int chain=1;
        int firstend=arr[0][1];

        for(int i=1;i<arr.length;i++){
            if(firstend<arr[i][0]){
                chain++;
                firstend=arr[i][1];
            }
        }
        System.out.print(chain);
        }
    
}
