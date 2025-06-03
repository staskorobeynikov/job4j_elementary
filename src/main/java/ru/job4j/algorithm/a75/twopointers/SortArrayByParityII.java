package ru.job4j.algorithm.a75.twopointers;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        while (i < nums.length) {
            if ((nums[i] & 1) != 0) {
                while ((nums[j] & 1) != 0) {
                    j += 2;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i += 2;
        }
        return nums;
    }
}