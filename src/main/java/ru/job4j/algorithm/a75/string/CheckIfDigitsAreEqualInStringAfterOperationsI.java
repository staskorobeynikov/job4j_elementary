package ru.job4j.algorithm.a75.string;

public class CheckIfDigitsAreEqualInStringAfterOperationsI {
    public boolean hasSameDigits(String s) {
        char[] digits = s.toCharArray();
        int length = digits.length;
        for (int k = length - 1; k > 1; k--) {
            for (int i = 0; i < k; i++) {
                digits[i] = (char) ((digits[i] - '0' + digits[i + 1] - '0') % 10 + '0');
            }
        }
        return digits[0] == digits[1];
    }
}