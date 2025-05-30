package ru.job4j.algorithm.a75.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheKthCharacterInStringGameITest {

    @Test
    void testFirstCharacter() {
        FindTheKthCharacterInStringGameI solver = new FindTheKthCharacterInStringGameI();
        assertEquals('a', solver.kthCharacter(1));
    }

    @Test
    void testSecondCharacter() {
        FindTheKthCharacterInStringGameI solver = new FindTheKthCharacterInStringGameI();
        assertEquals('b', solver.kthCharacter(2));
    }

    @Test
    void testThirdCharacter() {
        FindTheKthCharacterInStringGameI solver = new FindTheKthCharacterInStringGameI();
        assertEquals('b', solver.kthCharacter(3));
    }

    @Test
    void testFourthCharacter() {
        FindTheKthCharacterInStringGameI solver = new FindTheKthCharacterInStringGameI();
        assertEquals('c', solver.kthCharacter(4));
    }

    @Test
    void testCharacterAt10() {
        FindTheKthCharacterInStringGameI solver = new FindTheKthCharacterInStringGameI();
        assertEquals('c', solver.kthCharacter(10));
    }

    @Test
    void testCharacterAt26() {
        FindTheKthCharacterInStringGameI solver = new FindTheKthCharacterInStringGameI();
        assertEquals('d', solver.kthCharacter(26));
    }

    @Test
    void testCharacterAtMaxBoundary() {
        FindTheKthCharacterInStringGameI solver = new FindTheKthCharacterInStringGameI();
        assertEquals('h', solver.kthCharacter(500));
    }

    @Test
    void testCycleWrapAround() {
        FindTheKthCharacterInStringGameI solver = new FindTheKthCharacterInStringGameI();
        assertEquals('e', solver.kthCharacter(26 * 3));
    }
}