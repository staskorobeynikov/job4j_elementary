package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {
    @Test
    void testHappyNumber() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(19), "19 is a happy number");
    }

    @Test
    void testUnhappyNumber() {
        HappyNumber happyNumber = new HappyNumber();
        assertFalse(happyNumber.isHappy(20), "20 is not a happy number");
    }

    @Test
    void testSmallHappyNumber() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(1), "1 is a happy number");
    }

    @Test
    void testSmallUnhappyNumber() {
        HappyNumber happyNumber = new HappyNumber();
        assertFalse(happyNumber.isHappy(2), "2 is not a happy number");
    }

    @Test
    void testLargeHappyNumber() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(100), "100 is a happy number");
    }

    @Test
    void testLargeUnhappyNumber() {
        HappyNumber happyNumber = new HappyNumber();
        assertFalse(happyNumber.isHappy(999), "999 is not a happy number");
    }

    @Test
    void testZero() {
        HappyNumber happyNumber = new HappyNumber();
        assertFalse(happyNumber.isHappy(0), "0 is not a happy number");
    }
}