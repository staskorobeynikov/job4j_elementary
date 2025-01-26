package ru.job4j.algorithm.a75.graphs.dfs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class KeysAndRoomsTest {

    @Test
    void testAllRoomsAccessible() {
        KeysAndRooms keysAndRooms = new KeysAndRooms();
        List<List<Integer>> rooms = List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of()
        );
        assertTrue(keysAndRooms.canVisitAllRooms(rooms), "All rooms should be accessible");
    }

    @Test
    void testSomeRoomsNotAccessible() {
        KeysAndRooms keysAndRooms = new KeysAndRooms();
        List<List<Integer>> rooms = List.of(
                List.of(1, 3),
                List.of(3, 0, 1),
                List.of(2),
                List.of(0)
        );
        assertFalse(keysAndRooms.canVisitAllRooms(rooms), "Some rooms are not accessible");
    }

    @Test
    void testSingleRoom() {
        KeysAndRooms keysAndRooms = new KeysAndRooms();
        List<List<Integer>> rooms = List.of(
                List.of()
        );
        assertTrue(keysAndRooms.canVisitAllRooms(rooms), "Single room should be accessible");
    }

    @Test
    void testEmptyKeysInRooms() {
        KeysAndRooms keysAndRooms = new KeysAndRooms();
        List<List<Integer>> rooms = List.of(
                List.of(),
                List.of(),
                List.of()
        );
        assertFalse(keysAndRooms.canVisitAllRooms(rooms), "Multiple rooms with no keys should not be accessible");
    }

    @Test
    void testCircularKeys() {
        KeysAndRooms keysAndRooms = new KeysAndRooms();
        List<List<Integer>> rooms = List.of(
                List.of(1),
                List.of(2),
                List.of(0)
        );
        assertTrue(keysAndRooms.canVisitAllRooms(rooms), "All rooms should be accessible in circular key structure");
    }

    @Test
    void testDisconnectedGraph() {
        KeysAndRooms keysAndRooms = new KeysAndRooms();
        List<List<Integer>> rooms = List.of(
                List.of(1),
                List.of(0),
                List.of()
        );
        assertFalse(keysAndRooms.canVisitAllRooms(rooms), "Disconnected rooms should not be accessible");
    }
}
