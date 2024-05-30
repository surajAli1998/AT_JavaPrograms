package day_28May2024.lists;

import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List ls = List.of("Suraj",12,true);
        System.out.println(ls.size());
        System.out.println(ls);

        // this will give exception because List is an interface and add method inside it is a non static method,
        // so we cannt call it with ls. For this we need to use ArrayList object, because ArrayList class has
        // implemented List interface
//        ls.add(45);

    }
}
