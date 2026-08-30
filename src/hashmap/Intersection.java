package hashmap;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    private Intersection() {}

    // Find intersection of two arrays
    public static void findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}
