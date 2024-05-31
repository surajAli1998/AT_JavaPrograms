package day_30May2024;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This is normal sorting, its working because integers will be sorted with respect to their natural values
 */

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> ls1 = new ArrayList<>();
        ls1.add(45);
        ls1.add(53);
        ls1.add(76);
        ls1.add(23);
        Collections.sort(ls1);
//        System.out.println(ls1);

        ArrayList<Student> ls2 = new ArrayList<>();
        Student st1 = new Student(92,"suraj");
        Student st2 = new Student(42,"karar");
        Student st3 = new Student(52,"patwa");
        ls2.add(st1);
        ls2.add(st2);
        ls2.add(st3);
        Collections.sort(ls2);
        System.out.println(ls2);

    }
}
