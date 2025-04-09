package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tests {

public static void RemoveDup(ArrayList<Integer> list){

Set<Integer> set=new HashSet<>(list);
List<Integer>  uniqueList=new ArrayList<>(set);

System.out.println(uniqueList);
}

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);

        list.add(1);
        list.add(2);
        RemoveDup(list);
       
    }
    
}
