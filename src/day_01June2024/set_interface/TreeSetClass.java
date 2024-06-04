package day_01June2024.set_interface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet <> ();
        ts.add(12);
        ts.add(34);
        ts.add(65);
        ts.add(24);
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        TreeSet<Object> ts2 = new TreeSet<>();
        ts2.add(45);

        //we cannot store diff type of objects in case of tree set, only similar objects are allowed
//        ts2.add("Suraj");
//        System.out.println(ts2);

    }
}
