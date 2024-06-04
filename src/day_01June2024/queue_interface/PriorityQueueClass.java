package day_01June2024.queue_interface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(23);
        pq.offer(13);
        pq.offer(78);
        pq.offer(4);
//        System.out.println(pq);
//        System.out.println("The head element is: "+pq.peek());
//        pq.poll();
//        System.out.println(pq);

        // in case we want to give priority to largest element
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(10);
        pq2.offer(8);
        pq2.offer(7);
        pq2.offer(98);
        System.out.println(pq2);
        System.out.println("The head element is: "+pq2.peek());
        pq2.poll();
        System.out.println(pq2);
    }
}
