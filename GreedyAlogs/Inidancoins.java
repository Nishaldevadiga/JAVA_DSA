package GreedyAlogs;

public class Inidancoins {

    public static int totalchange(int coins[],int money){

        int count=0;


        for(int i=0;i<coins.length;i++){
            while(money>=coins[i]){
                 money=money-coins[i];
                 System.out.print("coins:"+coins[i]+" ");
                 count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int coins[]={2000,500,100,50,20,10,5,2,1};
        int money=590;

        int result=totalchange(coins,money);
        System.out.print(result);
    }
    
}
