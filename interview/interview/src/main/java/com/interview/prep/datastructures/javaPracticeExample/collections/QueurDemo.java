package main.java.com.practice.javaPracticeExample.collections;

import java.util.PriorityQueue;

public class QueurDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i=10; i>0; i--) {
            queue.add(i);
        }
        // 10,9,8,7,6,5,4,3,2,1
        // this is how data inserted in queue
        // but priority Queue sorts data for us.
        System.out.println(queue.peek()); // peek is the head of queue
        queue.poll();// poll remove head
        System.out.println(queue.poll());
        System.out.println( queue.size());
    }
}
