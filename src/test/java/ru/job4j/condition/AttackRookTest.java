package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class AttackRookTest {
    @Test
    public void checkTrue() {
        boolean check = AttackRook.check("A8", "E8");
        assertTrue(check);
    }

    @Test
    public void checkTrue1() {
        boolean check = AttackRook.check("H4", "H3");
        assertTrue(check);
    }

    @Test
    public void checkFalse() {
        boolean check = AttackRook.check("A1", "B2");
        assertFalse(check);
    }

    @Test
    public void checkFalse1() {
        boolean check = AttackRook.check("F5", "C8");
        assertFalse(check);
    }
}