package ru.job4j.algorithm.a75.queue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Dota2SenateTest {

    @Test
    void testBasicRadiantVictory() {
        String senate = "RD";
        String result = Dota2Senate.predictPartyVictory(senate);
        assertEquals("Radiant", result, "Radiant should win for input 'RD'");
    }

    @Test
    void testBasicDireVictory() {
        String senate = "DR";
        String result = Dota2Senate.predictPartyVictory(senate);
        assertEquals("Dire", result, "Dire should win for input 'DR'");
    }

    @Test
    void testAllRadiants() {
        String senate = "RRRR";
        String result = Dota2Senate.predictPartyVictory(senate);
        assertEquals("Radiant", result, "Radiant should win when all senators are Radiant");
    }

    @Test
    void testAllDires() {
        String senate = "DDDD";
        String result = Dota2Senate.predictPartyVictory(senate);
        assertEquals("Dire", result, "Dire should win when all senators are Dire");
    }

    @Test
    void testAlternatingVictory() {
        String senate = "RDRD";
        String result = Dota2Senate.predictPartyVictory(senate);
        assertEquals("Radiant", result, "Radiant should win for input 'RDRD'");
    }

    @Test
    void testAlternatingLoss() {
        String senate = "DRDR";
        String result = Dota2Senate.predictPartyVictory(senate);
        assertEquals("Dire", result, "Dire should win for input 'DRDR'");
    }

    @Test
    void testEqualNumbers() {
        String senate = "RDRDR";
        String result = Dota2Senate.predictPartyVictory(senate);
        assertEquals("Radiant", result, "Radiant should win for input 'RDRDR'");
    }
}
