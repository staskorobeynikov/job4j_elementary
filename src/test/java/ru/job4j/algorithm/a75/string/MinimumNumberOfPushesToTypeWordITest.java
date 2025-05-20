package ru.job4j.algorithm.a75.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfPushesToTypeWordITest {

    @Test
    void testSingleLetter() {
        MinimumNumberOfPushesToTypeWordI solver = new MinimumNumberOfPushesToTypeWordI();
        assertEquals(1, solver.minimumPushes("a"));
    }

    @Test
    void testExactlyEightLetters() {
        MinimumNumberOfPushesToTypeWordI solver = new MinimumNumberOfPushesToTypeWordI();
        assertEquals(8, solver.minimumPushes("abcdefgh"));
    }

    @Test
    void testNineLetters() {
        MinimumNumberOfPushesToTypeWordI solver = new MinimumNumberOfPushesToTypeWordI();
        assertEquals(10, solver.minimumPushes("abcdefghi"));
    }

    @Test
    void testSixteenLetters() {
        MinimumNumberOfPushesToTypeWordI solver = new MinimumNumberOfPushesToTypeWordI();
        assertEquals(24, solver.minimumPushes("abcdefghijklmnop"));
    }

    @Test
    void testTwentySixLetters() {
        MinimumNumberOfPushesToTypeWordI solver = new MinimumNumberOfPushesToTypeWordI();
        assertEquals(56, solver.minimumPushes("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void testRemainderOne() {
        MinimumNumberOfPushesToTypeWordI solver = new MinimumNumberOfPushesToTypeWordI();
        assertEquals(27, solver.minimumPushes("abcdefghijklmnopq"));
    }

    @Test
    void testRemainderSeven() {
        MinimumNumberOfPushesToTypeWordI solver = new MinimumNumberOfPushesToTypeWordI();
        assertEquals(45, solver.minimumPushes("abcdefghijklmnopqrstuvw"));
    }
}
