package ru.job4j.algorithm.a75.arraystring;

public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int left = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > middle) {
                return true;
            }
            if (num <= left) {
                left = num;
            } else {
                middle = num;
            }
        }
        return false;
    }
}
