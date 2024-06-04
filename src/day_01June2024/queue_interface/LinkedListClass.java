package day_01June2024.queue_interface;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.offer(45);
        ll.offer(43);
        ll.offer(12);
        System.out.println(ll);
        System.out.println("The head element is: "+ ll.peek());
        ll.poll();
        System.out.println(ll);
    }
}
