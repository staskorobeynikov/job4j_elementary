package ru.job4j.algorithm.a75.graphs.dfs;

public class NumberOfProvinces {
    private int[][] connectionGraph;
    private boolean[] visited;

    public int findCircleNum(int[][] isConnected) {
        connectionGraph = isConnected;
        int numCities = connectionGraph.length;
        visited = new boolean[numCities];
        int result = 0;
        for (int i = 0; i < numCities; i++) {
            if (!visited[i]) {
                dfs(i);
                result++;
            }
        }
        return result;
    }

    private void dfs(int cityIndex) {
        visited[cityIndex] = true;
        for (int destination = 0; destination < connectionGraph.length; destination++) {
            if (!visited[destination] && connectionGraph[cityIndex][destination] == 1) {
                dfs(destination);
            }
        }
    }
}
