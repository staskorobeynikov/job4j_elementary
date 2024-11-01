package ru.job4j.algorithm.a75.arraystring;

import java.util.Set;

public class ReverseVowelsOfAString {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public static String reverseVowels(String s) {
        char[] result = new char[s.length()];
        int i = 0;
        int j = result.length - 1;
        while (i <= j) {
            if (!VOWELS.contains(s.charAt(i))) {
                result[i] = s.charAt(i);
                i++;
            } else if (!VOWELS.contains(s.charAt(j))) {
                result[j] = s.charAt(j);
                j--;
            } else {
                result[j] = s.charAt(i);
                result[i] = s.charAt(j);
                i++;
                j--;
            }
        }
        return new String(result);
    }
}
