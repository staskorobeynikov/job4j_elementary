package ru.job4j.algorithm.a75.twopointers;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int i = 0;
        for (char c : t.toCharArray()) {
            if (s.charAt(i) == c) {
                i++;
            }
            if (i == s.length()) {
                return true;
            }
        }
        return false;
    }
}
