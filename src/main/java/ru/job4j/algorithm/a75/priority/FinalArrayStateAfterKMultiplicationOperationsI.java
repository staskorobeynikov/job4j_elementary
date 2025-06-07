package ru.job4j.algorithm.a75.priority;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<Pair<Integer, Integer>> queue = new PriorityQueue<>(
                Comparator.comparingInt(Pair<Integer, Integer>::getNumber)
                        .thenComparingInt(Pair::getIndex)
        );
        for (int i = 0; i < nums.length; i++) {
            queue.add(new Pair<>(nums[i], i));
        }
        while (k > 0) {
            Pair<Integer, Integer> pair = queue.poll();
            int number = pair.number * multiplier;
            nums[pair.index] = number;
            queue.offer(new Pair<>(number, pair.index));
            k--;
        }
        return nums;
    }

    private static class Pair<T, Y> {
        int number;

        int index;

        Pair(int number, int index) {
            this.index = index;
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public int getIndex() {
            return index;
        }
    }
}
