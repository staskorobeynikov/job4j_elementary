package ru.job4j.algorithm.math;

public class CountIntegersWithEvenDigitSum {
    public int countEven(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            if (isSumEven(i)) {
                result++;
            }
        }
        return result;
    }

    private boolean isSumEven(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum % 2 == 0;
    }
}
