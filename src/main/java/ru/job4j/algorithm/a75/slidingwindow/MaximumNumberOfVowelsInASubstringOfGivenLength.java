package ru.job4j.algorithm.a75.slidingwindow;

import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public static int maxVowels(String s, int k) {
        int result = 0;
        int left = 0;
        int vowels = 0;
        for (int r = 0; r < s.length(); r++) {
            if (VOWELS.contains(s.charAt(r))) {
                vowels++;
            }
            if (r - left + 1 > k) {
                if (VOWELS.contains(s.charAt(left))) {
                    vowels--;
                }
                left++;
            }
            result = Math.max(result, vowels);
        }
        return result;
    }
}
