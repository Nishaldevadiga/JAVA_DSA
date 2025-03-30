package test;

import java.util.ArrayList;

public class Tests {

public static void RemoveDup(ArrayList<Integer> list){

    ArrayList<Integer> nlist= new ArrayList<>();

    for(int i=0;i<list.size()-1;i++){
        if(list.get(i)!=list.get(i+1)){
            nlist.add(i);
        }
    }
    for(int i=0;i<nlist.size();i++){
        System.out.println(nlist.get(i));
    }

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
