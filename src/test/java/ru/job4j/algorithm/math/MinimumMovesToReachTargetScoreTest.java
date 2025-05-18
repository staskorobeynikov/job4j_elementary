package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumMovesToReachTargetScoreTest {

    @Test
    void testTargetIsOne() {
        MinimumMovesToReachTargetScore solver = new MinimumMovesToReachTargetScore();
        assertEquals(0, solver.minMoves(1, 0), "Already at target = 1, no moves needed.");
        assertEquals(0, solver.minMoves(1, 10), "Already at target = 1, even with maxDoubles.");
    }

    @Test
    void testNoDoubles() {
        MinimumMovesToReachTargetScore solver = new MinimumMovesToReachTargetScore();
        assertEquals(4, solver.minMoves(5, 0), "Only decrement operations: 5 - 1 = 4 moves.");
        assertEquals(999999999, solver.minMoves(1_000_000_000, 0), "Should take target - 1 moves.");
    }

    @Test
    void testWithDoublesAndOddTarget() {
        MinimumMovesToReachTargetScore solver = new MinimumMovesToReachTargetScore();
        assertEquals(5, solver.minMoves(10, 1));
    }

    @Test
    void testWithDoublesAndEvenTarget() {
        MinimumMovesToReachTargetScore solver = new MinimumMovesToReachTargetScore();
        assertEquals(4, solver.minMoves(10, 2));
    }

    @Test
    void testMaxDoublesEnoughToHalveTo1() {
        MinimumMovesToReachTargetScore solver = new MinimumMovesToReachTargetScore();
        assertEquals(4, solver.minMoves(16, 5), "Ideal path using all divides: 16 → 8 → 4 → 2 → 1");
    }

    @Test
    void testMaxDoublesTooMany() {
        MinimumMovesToReachTargetScore solver = new MinimumMovesToReachTargetScore();
        assertEquals(8, solver.minMoves(31, 100), "Use all divisions possible until target == 1");
    }

    @Test
    void testMaxValues() {
        MinimumMovesToReachTargetScore solver = new MinimumMovesToReachTargetScore();
        int result = solver.minMoves(1_000_000_000, 100);
        assertTrue(result > 0 && result < 1_000_000_000, "Should compute large input without overflow");
    }

    @Test
    void testMaxDoublesLimited() {
        MinimumMovesToReachTargetScore solver = new MinimumMovesToReachTargetScore();
        assertEquals(8, solver.minMoves(100, 5));
    }
}
