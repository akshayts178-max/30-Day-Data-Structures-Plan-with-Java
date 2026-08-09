package arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    private RemoveDuplicates() {}

    // Remove duplicates from a sorted array
    public static void removeDuplicates(int[] arr){
        Set<Integer> uniqueElements = new LinkedHashSet<>();

        for (int num : arr) {
            uniqueElements.add(num);
        }

        System.out.println("Array after removing duplicates: " + uniqueElements);
    }
}
