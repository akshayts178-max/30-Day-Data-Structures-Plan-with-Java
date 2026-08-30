package hashmap;

import java.util.HashMap;
import java.util.Map;

import common.AppConstants;

public class Anagrams {
    private Anagrams() {}

    // Check if two strings are anagrams
    public static void checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println(AppConstants.NOT_ANAGRAM);
            return;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println(AppConstants.NOT_ANAGRAM);
                return;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) < 0) {
                System.out.println(AppConstants.NOT_ANAGRAM);
                return;
            }
        }

        System.out.println("Anagram");
    }
}
