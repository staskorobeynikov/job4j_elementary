package ru.job4j.algorithm.binary;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int i = (l + r) / 2;
            if (nums[i] == target) {
                return i;
            }
            int num = nums[i];
            if (num > target) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
        return -1;
    }
}
