package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>(); 
      
      list.add(5);
      list.add(7);
      list.add(6);
      list.add(4);
      System.out.println(list);
   // Collections.sort(list);
Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);
    }
    
}
