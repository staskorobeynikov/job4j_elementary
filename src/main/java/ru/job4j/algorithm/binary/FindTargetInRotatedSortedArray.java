package ru.job4j.algorithm.binary;

public class FindTargetInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int i = (l + r) / 2;
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] >= nums[l]) {
                if (nums[i] < target || nums[l] > target) {
                    l = i + 1;
                } else {
                    r = i - 1;
                }
            } else {
                if (nums[i] > target || nums[r] < target) {
                    r = i - 1;
                } else {
                    l = i + 1;
                }
            }
        }
        return -1;
    }
}
