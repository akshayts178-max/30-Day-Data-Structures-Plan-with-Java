package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueue {
    private ImplementQueue() {}

    // Implement a queue using a list or deque
    public static void implementQueue(){
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("Queue: " + queue);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
