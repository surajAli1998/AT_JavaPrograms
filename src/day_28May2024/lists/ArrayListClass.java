package day_28May2024.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
//        List ls = new ArrayList<>();
        // Above initialization is parent referencing and below is normal, we can use any one
        ArrayList ls = new ArrayList<>();
        ls.add("suraj");
        ls.add("karar");
        ls.add(15);
        ls.add(45.58);
        ls.add("patwa");
//        System.out.println(ls);
        // printing using for each loop
        for(Object obj:ls){
            System.out.println(obj);
        }

        System.out.println("-----------------------");

        // this will only take Integer values
        ArrayList<Integer> ls1 = new ArrayList<>();
        ls1.add(12);
        ls1.add(45);
        ls1.add(48);
//        System.out.println(ls1);
        // printing using normal for loop
        for(int i=0; i<ls1.size(); i++){
            System.out.println(ls1.get(i));
        }

        System.out.println("Printing using iterator");

        // printing using iterator
        Iterator<Integer> it = ls1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("---------------------");

        Iterator it1 = ls.iterator();
        while (it1.hasNext()){
            // in case of iterator we cannot add alything to list while iterating, it will give concurrent exception
//            ls.add(5);
            System.out.println(it1.next());
        }

    }
}
