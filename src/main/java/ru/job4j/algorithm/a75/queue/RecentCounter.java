package ru.job4j.algorithm.a75.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCounter {
    final Deque<Integer> queue = new ArrayDeque<>();

    public RecentCounter() {
    }

    public int ping(int t) {
        queue.offer(t);
        while (!queue.isEmpty() && queue.peekFirst() < t - 3000) {
            queue.pollFirst();
        }
        return queue.size();
    }
}
