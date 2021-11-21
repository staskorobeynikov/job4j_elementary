package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (check(x1, x2, y1, y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean validate(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static boolean check(int... coordinates) {
        for (int c : coordinates) {
            if (c < 0 || c > 7) {
                return false;
            }
        }
        return true;
    }
}
