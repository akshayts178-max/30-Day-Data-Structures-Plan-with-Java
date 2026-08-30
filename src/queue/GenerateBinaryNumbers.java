package queue;

import java.util.LinkedList;
import java.util.Queue;

import common.AppConstants;

public class GenerateBinaryNumbers {
    private GenerateBinaryNumbers() {}

    // Generate binary numbers 1..n using a queue
    public static void generateBinaryNumbers(int n){
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");
        System.out.println("Binaries");

        for (int i = AppConstants.FIRST_BINARY_NUMBER + 1; i <= n; i++){
            String binary = queue.poll();
            System.out.println(binary);
            queue.offer(binary + "0");
            queue.offer(binary + "1");
        }
    }
}
