package ru.job4j.algorithm.math;

public class FindTheStudentThatWillReplaceTheChalk {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long[] prefixSum = new long[n + 1];
        prefixSum[1] = chalk[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + chalk[i];
        }
        k %= prefixSum[n];
        int left = 0, right = n;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (prefixSum[mid] > k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left - 1;
    }
}
