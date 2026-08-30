package hashmap;

import java.util.HashMap;
import java.util.Map;

public class NonRecurring {
    private NonRecurring() {}

    // Find the first non-repeating character in a string
    public static void findNonRecurring(String str){
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // find the first character
        for (char ch : str.toCharArray()) {
            if (frequencyMap.get(ch) == 1) {
                System.out.println("First non repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non repeating character found");
    }
}
