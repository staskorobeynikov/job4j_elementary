package ru.job4j.algorithm.math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividing(int number) {
        for (int remaining = number; remaining != 0; remaining /= 10) {
            int digit = remaining % 10;
            if (digit == 0 || number % digit != 0) {
                return false;
            }
        }
        return true;
    }
}
