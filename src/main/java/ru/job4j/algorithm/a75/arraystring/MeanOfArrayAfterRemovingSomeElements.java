package ru.job4j.algorithm.a75.arraystring;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int x = (int) (n * 0.05);
        int sum = 0;
        for (int i = x; i < n - x; i++) {
            sum += arr[i];
        }
        return (double) sum / (n - 2 * x);
    }
}
