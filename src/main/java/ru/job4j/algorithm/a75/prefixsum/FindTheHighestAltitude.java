package ru.job4j.algorithm.a75.prefixsum;

public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int[] prefixes = new int[gain.length + 1];
        int index = 1;
        int result = prefixes[0];
        for (int i = 0; i < gain.length; i++) {
            int sum = gain[i] + prefixes[i];
            prefixes[index++] = sum;
            result = Math.max(result, sum);
        }
        return result;
    }
}
