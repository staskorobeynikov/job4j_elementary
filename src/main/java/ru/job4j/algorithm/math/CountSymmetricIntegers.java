package ru.job4j.algorithm.math;

public class CountSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int result = 0;
        for (int i = low; i <= high; i++) {
            result += isSymmetric(i);
        }
        return result;
    }

    private int isSymmetric(int num) {
        String numStr = Integer.toString(num);
        int len = numStr.length();
        if (len % 2 != 0) {
            return 0;
        }
        int startSum = 0, lastSum = 0;
        for (int i = 0; i < len / 2; i++) {
            startSum += numStr.charAt(i) - '0';
        }
        for (int i = len / 2; i < len; i++) {
            lastSum += numStr.charAt(i) - '0';
        }
        return startSum == lastSum ? 1 : 0;
    }
}
