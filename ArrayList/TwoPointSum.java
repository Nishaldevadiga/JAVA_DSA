package ArrayList;

import java.util.ArrayList;

public class TwoPointSum {
public static boolean FindTarget(ArrayList<Integer> list, int target){
  
int bp=-1;
    for(int i=0;i<list.size()-1;i++){
        if(list.get(i)>list.get(i+1)){
            bp=i;
        }
    }

    int lp=bp+1;
    int rp=bp;
    int n=list.size();

    while(lp!=rp){
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }

        if(list.get(lp)+list.get(rp)<target){
            lp=(lp+1)%n;

        }else{
            rp=(rp-1+n)%n;
        }
    }
    return false;
}
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
      list.add(11);
      list.add(15);
      list.add(6);
      list.add(8);
      list.add(9);
      list.add(10);

      System.out.println(FindTarget(list,13));
    }
    
}
