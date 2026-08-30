package queue;

import common.AppConstants;

public class ImplementCircularQueue {
    private ImplementCircularQueue() {}

    // Implement a circular queue
    public static void implementCircularQueue(){
        int[] queue = new int[AppConstants.CIRCULAR_QUEUE_CAPACITY];
        int front = 0;
        int rear = 0;
        int size = 0;

        queue[rear] = 10;
        rear = (rear + 1) % queue.length;
        size++;

        queue[rear] = 20;
        rear = (rear + 1) % queue.length;
        size++;

        queue[rear] = 30;
        rear = (rear + 1) % queue.length;
        size++;

        System.out.println("Queue elements:");

        for(int i = 0; i < size; i++){
            System.out.println(queue[(front + i) % queue.length]);
        }

        int removed = queue[front];
        front = (front + 1) % queue.length;
        size--;

        System.out.println("Removed elements:" + removed);

        queue[rear] = 40;
        size++;

        System.out.println("Queue after circular insertion:");

        for (int i = 0; i < size; i++){
            System.out.println(queue[(front + i) % queue.length]);
        }
    }
}
