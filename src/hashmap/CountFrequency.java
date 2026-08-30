package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    private CountFrequency() {}

    // Count frequency of each element using a dictionary
    public static void countFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        System.out.println("Element Frequencies" + map);
    }
}
