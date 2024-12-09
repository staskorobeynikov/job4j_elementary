package ru.job4j.algorithm.a75.hashmap;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        int[] frequencies1 = new int[26];
        int[] frequencies2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            frequencies1[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            frequencies2[word2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < frequencies1.length; i++) {
            if ((frequencies1[i] > 0 && frequencies2[i] == 0)
                || (frequencies1[i] > 0 && frequencies1[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(frequencies1);
        Arrays.sort(frequencies2);
        for (int i = 0; i < frequencies1.length; i++) {
            if (frequencies1[i] != frequencies2[i]) {
                return false;
            }
        }
        return true;
    }
}
