package arrays;

import java.util.Arrays;

public class MaxAndMinArray {
    private MaxAndMinArray() {}

    public static void findMaxAndMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
