package ru.job4j.algorithm.math;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = 0;
        int copy = x;
        while (copy != 0) {
            temp = temp * 10 + copy % 10;
            copy /= 10;
        }
        return temp == x;
    }
}
