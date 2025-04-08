package ru.job4j.algorithm.bits;

public class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int number = start + i * 2;
            result ^= number;
        }
        return result;
    }
}
