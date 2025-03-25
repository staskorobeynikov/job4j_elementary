package ru.job4j.algorithm.bits;

public class MinimumBitFlipsToConvertNumber {
    public int minBitFlips(int start, int goal) {
        int checkNumber = start ^ goal;
        return Integer.bitCount(checkNumber);
    }
}