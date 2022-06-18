package ru.job4j.condition;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        int rsl = (int) (percent * prize - pay);
        return rsl > 0 ? rsl : 0;
    }
}
