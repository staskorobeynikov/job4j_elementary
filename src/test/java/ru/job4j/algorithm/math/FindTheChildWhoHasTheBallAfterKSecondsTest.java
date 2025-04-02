package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheChildWhoHasTheBallAfterKSecondsTest {

    @Test
    void testBasicForwardDirection() {
        FindTheChildWhoHasTheBallAfterKSeconds solver = new FindTheChildWhoHasTheBallAfterKSeconds();
        assertEquals(2, solver.numberOfChild(5, 2), "Expected child 2 after 2 seconds in group of 5.");
    }

    @Test
    void testBasicBackwardDirection() {
        FindTheChildWhoHasTheBallAfterKSeconds solver = new FindTheChildWhoHasTheBallAfterKSeconds();
        assertEquals(2, solver.numberOfChild(5, 6), "Expected child 2 after 6 seconds in group of 5.");
    }

    @Test
    void testBackToStart() {
        FindTheChildWhoHasTheBallAfterKSeconds solver = new FindTheChildWhoHasTheBallAfterKSeconds();
        assertEquals(0, solver.numberOfChild(4, 6), "Expected child 0 after full cycle (6 seconds, 4 children).");
    }

    @Test
    void testOneCycleAndHalfForward() {
        FindTheChildWhoHasTheBallAfterKSeconds solver = new FindTheChildWhoHasTheBallAfterKSeconds();
        assertEquals(3, solver.numberOfChild(6, 7), "Expected child 3 after 7 seconds in group of 6.");
    }

    @Test
    void testOneCycleAndHalfBackward() {
        FindTheChildWhoHasTheBallAfterKSeconds solver = new FindTheChildWhoHasTheBallAfterKSeconds();
        assertEquals(1, solver.numberOfChild(6, 11), "Expected child 1 after 11 seconds in group of 6.");
    }

    @Test
    void testZeroSeconds() {
        FindTheChildWhoHasTheBallAfterKSeconds solver = new FindTheChildWhoHasTheBallAfterKSeconds();
        assertEquals(0, solver.numberOfChild(10, 0), "Expected child 0 at time 0.");
    }

    @Test
    void testTwoChildrenAlternating() {
        FindTheChildWhoHasTheBallAfterKSeconds solver = new FindTheChildWhoHasTheBallAfterKSeconds();
        assertEquals(1, solver.numberOfChild(2, 1), "Expected child 1 after 1 second in 2-child group.");
        assertEquals(0, solver.numberOfChild(2, 2), "Expected child 0 after 2 seconds in 2-child group.");
        assertEquals(1, solver.numberOfChild(2, 3), "Expected child 1 after 3 seconds in 2-child group.");
    }

    @Test
    void testLargeK() {
        FindTheChildWhoHasTheBallAfterKSeconds solver = new FindTheChildWhoHasTheBallAfterKSeconds();
        assertEquals(6, solver.numberOfChild(10, 123456), "Expected result for large K and n = 10.");
    }
}
