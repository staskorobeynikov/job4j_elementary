package ru.job4j.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task80 {
    public static int[] array(int[] nums) {
        Map<Integer, Integer> temp = new LinkedHashMap<>();
        for (int num : nums) {
            temp.put(num, temp.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (temp.get(nums[i]) == 1) {
                result[counter++] = i;
            }
        }
        return Arrays.copyOf(result, counter);
    }
}
