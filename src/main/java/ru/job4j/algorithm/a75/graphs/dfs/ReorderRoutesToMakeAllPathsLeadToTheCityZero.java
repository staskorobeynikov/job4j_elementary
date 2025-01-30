package ru.job4j.algorithm.a75.graphs.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public static class Edge {
        int node;
        boolean isDirected;

        public Edge(int node, boolean isDirected) {
            this.node = node;
            this.isDirected = isDirected;
        }
    }

    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int[] connection : connections) {
            int from = connection[0], to = connection[1];
            graph.computeIfAbsent(from, k -> new ArrayList<>()).add(new Edge(to, true));
            graph.computeIfAbsent(to, k -> new ArrayList<>()).add(new Edge(from, false));
        }
        boolean[] visited = new boolean[n];
        return dfs(0, graph, visited);
    }

    private int dfs(int currentNode, Map<Integer, List<Edge>> graph, boolean[] visited) {
        visited[currentNode] = true;
        int reorderCount = 0;
        List<Edge> edges = graph.getOrDefault(currentNode, Collections.emptyList());
        for (Edge edge : edges) {
            int nextNode = edge.node;
            boolean isDirected = edge.isDirected;
            if (!visited[nextNode]) {
                if (isDirected) {
                    reorderCount++;
                }
                reorderCount += dfs(nextNode, graph, visited);
            }
        }
        return reorderCount;
    }
}
