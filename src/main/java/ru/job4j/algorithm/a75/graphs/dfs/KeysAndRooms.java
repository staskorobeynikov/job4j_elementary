package ru.job4j.algorithm.a75.graphs.dfs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {
    List<List<Integer>> rooms;

    Set<Integer> visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        this.rooms = rooms;
        visited = new HashSet<>();
        dfs(0);
        return visited.size() == rooms.size();
    }

    void dfs(int i) {
        if (visited.contains(i)) {
            return;
        }
        visited.add(i);
        for (int nextI : rooms.get(i)) {
            dfs(nextI);
        }
    }
}
