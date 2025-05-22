package ru.job4j.algorithm.a75.string;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for (char bit : s.toCharArray()) {
            if (bit == '1') {
                count++;
            }
        }
        return "1".repeat(count - 1) + "0".repeat(s.length() - count) + "1";
    }
}