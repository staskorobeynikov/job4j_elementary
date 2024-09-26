package ru.job4j.algorithm.a75.string;

public class RemoveTrailingZerosFromAString {
    public String removeTrailingZeros(String num) {
        int n = num.length();
        int index = 0;
        for (int i = n - 1; i >= 1; i--) {
            if (num.charAt(i) > '0') {
                index = i;
                break;
            }
        }
        return num.substring(0, index + 1);
    }
}