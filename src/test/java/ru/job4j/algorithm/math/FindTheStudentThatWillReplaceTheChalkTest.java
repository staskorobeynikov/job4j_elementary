package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheStudentThatWillReplaceTheChalkTest {

    @Test
    void testBasicCase() {
        FindTheStudentThatWillReplaceTheChalk solver = new FindTheStudentThatWillReplaceTheChalk();
        int[] chalk = {5, 1, 5};
        int k = 22;
        assertEquals(0, solver.chalkReplacer(chalk, k), "Expected student 0 to replace the chalk.");
    }

    @Test
    void testExactConsumption() {
        FindTheStudentThatWillReplaceTheChalk solver = new FindTheStudentThatWillReplaceTheChalk();
        int[] chalk = {3, 4, 1, 2};
        int k = 10;
        assertEquals(0, solver.chalkReplacer(chalk, k), "Expected student 0 to replace the chalk.");
    }

    @Test
    void testFirstStudentNeedsChalk() {
        FindTheStudentThatWillReplaceTheChalk solver = new FindTheStudentThatWillReplaceTheChalk();
        int[] chalk = {1, 1, 1};
        int k = 3;
        assertEquals(0, solver.chalkReplacer(chalk, k), "Expected student 0 after complete cycle.");
    }

    @Test
    void testLastStudentNeedsChalk() {
        FindTheStudentThatWillReplaceTheChalk solver = new FindTheStudentThatWillReplaceTheChalk();
        int[] chalk = {1, 2, 3};
        int k = 5;
        assertEquals(2, solver.chalkReplacer(chalk, k), "Expected student 2 to replace the chalk.");
    }

    @Test
    void testLargeK() {
        FindTheStudentThatWillReplaceTheChalk solver = new FindTheStudentThatWillReplaceTheChalk();
        int[] chalk = {2, 4, 6, 8};
        int k = 100;
        assertEquals(0, solver.chalkReplacer(chalk, k), "Expected student 0 after many full rounds.");
    }

    @Test
    void testOnlyOneStudent() {
        FindTheStudentThatWillReplaceTheChalk solver = new FindTheStudentThatWillReplaceTheChalk();
        int[] chalk = {3};
        int k = 10;
        assertEquals(0, solver.chalkReplacer(chalk, k), "Expected student 0 in single-student case.");
    }

    @Test
    void testTwoStudents() {
        FindTheStudentThatWillReplaceTheChalk solver = new FindTheStudentThatWillReplaceTheChalk();
        int[] chalk = {1, 2};
        int k = 3;
        assertEquals(0, solver.chalkReplacer(chalk, k), "Expected student 0 after exact full round.");
    }

    @Test
    void testBinarySearchBoundary() {
        FindTheStudentThatWillReplaceTheChalk solver = new FindTheStudentThatWillReplaceTheChalk();
        int[] chalk = {1, 2, 3, 4};
        int k = 6;
        assertEquals(3, solver.chalkReplacer(chalk, k), "Expected student 3 just after prefix sum match.");
    }
}
