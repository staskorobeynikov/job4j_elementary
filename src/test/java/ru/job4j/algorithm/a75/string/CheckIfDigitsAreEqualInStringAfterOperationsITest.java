package ru.job4j.algorithm.a75.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckIfDigitsAreEqualInStringAfterOperationsITest {

    @Test
    void testSimpleCaseTrue() {
        CheckIfDigitsAreEqualInStringAfterOperationsI solver = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertFalse(solver.hasSameDigits("123"));
    }

    @Test
    void testSimpleCaseFalse() {
        CheckIfDigitsAreEqualInStringAfterOperationsI solver = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertFalse(solver.hasSameDigits("124"));
    }

    @Test
    void testAllZeros() {
        CheckIfDigitsAreEqualInStringAfterOperationsI solver = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertTrue(solver.hasSameDigits("00000"));
    }

    @Test
    void testLongTrueCase() {
        CheckIfDigitsAreEqualInStringAfterOperationsI solver = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertFalse(solver.hasSameDigits("1234567890".repeat(10).substring(0, 100)));
    }

    @Test
    void testLongFalseCase() {
        CheckIfDigitsAreEqualInStringAfterOperationsI solver = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertFalse(solver.hasSameDigits("1".repeat(99) + "2"));
    }

    @Test
    void testMinimumLengthTrue() {
        CheckIfDigitsAreEqualInStringAfterOperationsI solver = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertTrue(solver.hasSameDigits("121"));
    }

    @Test
    void testMinimumLengthFalse() {
        CheckIfDigitsAreEqualInStringAfterOperationsI solver = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertFalse(solver.hasSameDigits("129"));
    }

    @Test
    void testAlternatingDigits() {
        CheckIfDigitsAreEqualInStringAfterOperationsI solver = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertTrue(solver.hasSameDigits("1010101010"));
    }
}