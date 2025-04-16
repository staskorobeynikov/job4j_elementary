package ru.job4j.algorithm.a75.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DetermineColorOfAChessboardSquareTest {

    @Test
    void testBlackCornerA1() {
        DetermineColorOfAChessboardSquare solver = new DetermineColorOfAChessboardSquare();
        assertFalse(solver.squareIsWhite("a1"), "Expected 'a1' to be black.");
    }

    @Test
    void testWhiteCornerH1() {
        DetermineColorOfAChessboardSquare solver = new DetermineColorOfAChessboardSquare();
        assertTrue(solver.squareIsWhite("h1"), "Expected 'h1' to be white.");
    }

    @Test
    void testWhiteCenterD5() {
        DetermineColorOfAChessboardSquare solver = new DetermineColorOfAChessboardSquare();
        assertTrue(solver.squareIsWhite("d5"), "Expected 'd5' to be white.");
    }

    @Test
    void testWhiteH8() {
        DetermineColorOfAChessboardSquare solver = new DetermineColorOfAChessboardSquare();
        assertFalse(solver.squareIsWhite("h8"), "Expected 'h8' to be black.");
    }

    @Test
    void testBlackC8() {
        DetermineColorOfAChessboardSquare solver = new DetermineColorOfAChessboardSquare();
        assertTrue(solver.squareIsWhite("c8"), "Expected 'c8' to be white.");
    }

    @Test
    void testBlackG7() {
        DetermineColorOfAChessboardSquare solver = new DetermineColorOfAChessboardSquare();
        assertFalse(solver.squareIsWhite("g7"), "Expected 'g7' to be black.");
    }

    @Test
    void testWhiteB2() {
        DetermineColorOfAChessboardSquare solver = new DetermineColorOfAChessboardSquare();
        assertFalse(solver.squareIsWhite("b2"), "Expected 'b2' to be black.");
    }

    @Test
    void testWhiteG6() {
        DetermineColorOfAChessboardSquare solver = new DetermineColorOfAChessboardSquare();
        assertTrue(solver.squareIsWhite("g6"), "Expected 'g6' to be white.");
    }
}
