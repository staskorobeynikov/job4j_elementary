package ru.job4j.algorithm.a75.twopointers;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            if (nums[i] == 0) {
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }
                if (j < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
