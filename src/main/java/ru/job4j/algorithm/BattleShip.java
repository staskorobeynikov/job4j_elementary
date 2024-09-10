package ru.job4j.algorithm;

public class BattleShip {
    public int countAliveShips(int[][] sea) {
        int shipCount = 0;
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[i].length; j++) {
                if (sea[i][j] == 1 && isTail(sea, i, j)) {
                    shipCount++;
                }
            }
        }
        return shipCount;
    }

    boolean isTail(int[][] sea, int row, int col) {
        if (row - 1 < 0 && col - 1 < 0) {
            return true;
        }
        if (row - 1 < 0 && sea[row][col - 1] == 0) {
            return true;
        }
        if (col - 1 < 0 && sea[row - 1][col] == 0) {
            return true;
        }
        return sea[row][col - 1] == 0 && sea[row - 1][col] == 0;
    }
}
