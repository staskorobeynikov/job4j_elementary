package ru.job4j.algorithm.bits;

import java.util.Set;

public class PrimeNumberOfSetBitsInBinaryRepresentation {

    private static final Set<Integer> NUMBERS = Set.of(2, 3, 5, 7, 11, 13, 17, 19);

    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (NUMBERS.contains(Integer.bitCount(i))) {
                result++;
            }
        }
        return result;
    }
}
