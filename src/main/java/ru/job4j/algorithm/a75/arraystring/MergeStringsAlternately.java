package ru.job4j.algorithm.a75.arraystring;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int first = 0;
        int second = 0;
        int k = 0;
        while (first < word1.length() && second < word2.length()) {
            if (k % 2 == 0) {
                result.append(word1.charAt(first));
                first++;
            } else {
                result.append(word2.charAt(second));
                second++;
            }
            k++;
        }
        while (first < word1.length()) {
            result.append(word1.charAt(first));
            first++;
        }
        while (second < word2.length()) {
            result.append(word2.charAt(second));
            second++;
        }
        return result.toString();
    }
}
