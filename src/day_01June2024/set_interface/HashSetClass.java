package day_01June2024.set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("suraj");
        s1.add("karar");
        s1.add("trigu");
        s1.add("Munia");
        System.out.println(s1);

        Iterator<String> it = s1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
