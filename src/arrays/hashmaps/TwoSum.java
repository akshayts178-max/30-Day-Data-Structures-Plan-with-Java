package arrays.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Two Sum (find pair summing to a target)
    public static void findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int key = target - arr[i];

            if (map.containsKey(key)) {
                System.out.println("Two Sum pair: [" + key + "," + arr[i] + "]");
                System.out.println("Indices: [" + map.get(key) + "," + i + "]");
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found for the target: " + target);
    }
}
