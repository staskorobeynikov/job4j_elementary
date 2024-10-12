package ru.job4j.algorithm.sliding;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingSubstringWithReplacement {
    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> store = new HashMap<>();
        int result = 0;
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            store.put(s.charAt(j), store.getOrDefault(s.charAt(j), 0) + 1);
            max = Math.max(max, store.get(s.charAt(j)));
            if (j - i + 1 - max > k) {
                store.put(s.charAt(i), store.getOrDefault(s.charAt(i), 0) - 1);
                i++;
            }
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}
