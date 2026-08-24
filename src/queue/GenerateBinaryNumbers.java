package queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    // Generate binary numbers 1..n using a queue
    public static void generateBinaryNumbers(int n){
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");
        System.out.println("Binaries");

        for (int i = 2; i <= n; i++){
            String binary = queue.poll();
            System.out.println(binary);
            queue.offer(binary + "0");
            queue.offer(binary + "1");
        }
    }
}
