package ru.job4j.algorithm.a75.twopointers;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int result = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int length = j - i;
            int area = Math.min(height[i], height[j]) * length;
            result = Math.max(result, area);
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}