package ArrayList;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //add to list 
        list.add(1);
        list.add(3);
        list.add(5);
        //System.out.println(list);

        //remove from list
        list.remove(0);
        //System.out.println(list);

        //update the list
        list.set(0,4);
      //  System.out.println(list);

        //get the list
        System.out.println(list.get(0));

        //contains
        System.out.println(list.contains(6));
       
    }
    
}
