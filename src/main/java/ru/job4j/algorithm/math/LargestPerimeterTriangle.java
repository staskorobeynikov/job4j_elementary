package ru.job4j.algorithm.math;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int sumOfShorterSides = nums[i - 1] + nums[i - 2];
            if (sumOfShorterSides > nums[i]) {
                return sumOfShorterSides + nums[i];
            }
        }
        return 0;
    }
}
