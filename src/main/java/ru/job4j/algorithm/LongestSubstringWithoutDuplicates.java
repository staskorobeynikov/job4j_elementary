package ru.job4j.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicates {
    public static int lengthOfLongestSubstring1(String s) {
        Set<Character> storage = new HashSet<>();
        int result = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            while (storage.contains(s.charAt(i))) {
                storage.remove(s.charAt(j));
                j++;
            }
            storage.add(s.charAt(i));
            result = Math.max(result, i - j + 1);
        }
        return result;
    }
}
