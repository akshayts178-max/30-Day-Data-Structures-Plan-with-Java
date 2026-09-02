package arrays;

import java.util.Arrays;

public class MoveZeros {
    // Move all zeros to the end of an array
    public static void moveZeros(int[] arr) {
        int nonZeroIndex = 0;
        System.out.println("Before moving zeros: " + Arrays.toString(arr));

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
        System.out.println("After moving zeros: " + Arrays.toString(arr));
    }
}
