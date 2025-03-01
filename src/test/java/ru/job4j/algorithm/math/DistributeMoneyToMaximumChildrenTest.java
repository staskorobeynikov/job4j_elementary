package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DistributeMoneyToMaximumChildrenTest {

    @Test
    void testNotEnoughMoney() {
        DistributeMoneyToMaximumChildren solver = new DistributeMoneyToMaximumChildren();
        assertEquals(-1, solver.distMoney(5, 6), "Expected -1 when money is less than children.");
    }

    @Test
    void testMaximumDistributedChildren() {
        DistributeMoneyToMaximumChildren solver = new DistributeMoneyToMaximumChildren();
        assertEquals(1, solver.distMoney(9, 2), "Expected 1 when money allows distributing max to some children.");
    }

    @Test
    void testExactMoneyForEachChild() {
        DistributeMoneyToMaximumChildren solver = new DistributeMoneyToMaximumChildren();
        assertEquals(1, solver.distMoney(8, 1), "Expected 0 when money exactly divides among children.");
    }

    @Test
    void testMoreThanMaxPossibleMoney() {
        DistributeMoneyToMaximumChildren solver = new DistributeMoneyToMaximumChildren();
        assertEquals(2, solver.distMoney(25, 3), "Expected 2 when money exceeds max possible distribution.");
    }

    @Test
    void testEdgeCaseMoneyEqualTo8TimesChildrenMinus4() {
        DistributeMoneyToMaximumChildren solver = new DistributeMoneyToMaximumChildren();
        assertEquals(2, solver.distMoney(28, 4), "Expected children - 2 when money == 8 * children - 4.");
    }

    @Test
    void testMoneyLessThan8PerChild() {
        DistributeMoneyToMaximumChildren solver = new DistributeMoneyToMaximumChildren();
        assertEquals(1, solver.distMoney(10, 3), "Expected 1 when money is slightly more than children.");
    }

    @Test
    void testLargeNumbers() {
        DistributeMoneyToMaximumChildren solver = new DistributeMoneyToMaximumChildren();
        assertEquals(50, solver.distMoney(400, 50), "Expected maximum number of children to receive 8.");
    }
}
