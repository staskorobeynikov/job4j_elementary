package ru.job4j.array;

public class Task83 {
    public static int[] sumOfTwo(int[] numbers, int goal) {
        if (numbers.length == 0) {
            return null;
        }
        int i = 0;
        int j = numbers.length - 1;
        while (i != j) {
            int sum = numbers[i] + numbers[j];
            if (sum == goal) {
                return new int[]{i, j};
            }
            if (sum < goal) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
