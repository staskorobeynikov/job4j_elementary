package ru.job4j.algorithm.a75.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExitFromEntranceInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        int steps = 0;
        int[] directions = {-1, 0, 1, 0, -1};
        while (!queue.isEmpty()) {
            steps++;
            for (int count = queue.size(); count > 0; count--) {
                int[] current = queue.poll();
                for (int i = 0; i < directions.length - 1; i++) {
                    int newX = current[0] + directions[i];
                    int newY = current[1] + directions[i + 1];
                    if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && maze[newX][newY] == '.') {
                        if (newX == 0 || newX == rows - 1 || newY == 0 || newY == cols - 1) {
                            return steps;
                        }
                        queue.offer(new int[]{newX, newY});
                        maze[newX][newY] = '+';
                    }
                }
            }
        }
        return -1;
    }
}
