package ru.job4j.algorithm.binary;

public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return nums[l];
            }
            int i = (l + r) / 2;
            if (nums[i] >= nums[l]) {
                l = i + 1;
            } else {
                r = i;
            }
        }
        return 0;
    }
}
