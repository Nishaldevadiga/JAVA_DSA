package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Indiancoins {

    public static int CountNote(Integer[] coins,int amount){

        Arrays.sort(coins,Comparator.reverseOrder());
         int moneycount=0;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    moneycount++;
                    amount=amount-coins[i];
                }
            }
        }
      return moneycount;
    }

    public static void main(String[] args) {
        Integer[] coins={1,2,5,10,20,50,100,500,2000};
        System.out.print(CountNote(coins, 590));
        


    }
    
}
