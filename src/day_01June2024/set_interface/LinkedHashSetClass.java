package day_01June2024.set_interface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        ls.add("mango");
        ls.add("apple");
        ls.add("grapes");
        ls.add("orange");
        Iterator<String> it = ls.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
