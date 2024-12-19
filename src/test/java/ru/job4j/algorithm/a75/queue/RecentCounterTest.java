package ru.job4j.algorithm.a75.queue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecentCounterTest {

    @Test
    void testSinglePing() {
        RecentCounter recentCounter = new RecentCounter();
        int result = recentCounter.ping(1);
        assertEquals(1, result, "Expected 1 ping in the time frame");
    }

    @Test
    void testPingsWithin3000ms() {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);
        recentCounter.ping(100);
        recentCounter.ping(3001);
        int result = recentCounter.ping(3002);
        assertEquals(3, result, "Expected 3 pings in the time frame (100, 3001, 3002)");
    }

    @Test
    void testNoPingsInitially() {
        RecentCounter recentCounter = new RecentCounter();
        assertEquals(0, recentCounter.queue.size(), "Queue should initially be empty");
    }

    @Test
    void testMultipleRapidPings() {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);
        recentCounter.ping(2);
        recentCounter.ping(3);
        int result = recentCounter.ping(4);
        assertEquals(4, result, "All 4 pings are within the 3000ms window");
    }

    @Test
    void testSparsePings() {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);
        recentCounter.ping(1000);
        recentCounter.ping(2000);
        int result = recentCounter.ping(3000);
        assertEquals(4, result, "All pings are within the 3000ms window");
    }

    @Test
    void testEmptyQueueAfterLongTime() {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);
        recentCounter.ping(2);
        recentCounter.ping(3);
        int result = recentCounter.ping(10000);
        assertEquals(1, result, "Queue should only contain the most recent ping at 10000");
    }
}
