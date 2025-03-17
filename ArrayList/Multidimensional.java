package ArrayList;

import java.util.ArrayList;

public class Multidimensional {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(2);

        list1.add(3);

       list1.add(4);

       list2.add(6);
       list2.add(2);

       mainList.add(list1);
       mainList.add(list2);

       for(int i=0;i<mainList.size();i++){
         ArrayList<Integer> newlist=mainList.get(i);
         for(int j=0;j<newlist.size();j++){
            System.out.println(newlist.get(j));
         }
       }

       System.out.println(mainList);
    }
    
}
