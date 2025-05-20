package ru.job4j.algorithm.a75.string;

public class MinimumNumberOfPushesToTypeWordI {
    public int minimumPushes(String word) {
        int length = word.length();
        int result = 0;
        int multiplier = 1;
        for (int i = 0; i < length / 8; i++) {
            result += multiplier * 8;
            multiplier++;
        }
        result += multiplier * (length % 8);
        return result;
    }
}
