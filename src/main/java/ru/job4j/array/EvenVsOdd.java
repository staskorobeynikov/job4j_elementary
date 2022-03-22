package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int one = 0;
        int two = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                one += players[i];
            } else {
                two += players[i];
            }
        }
        if (one == two) {
            return 0;
        }
        return one > two ? 1 : 2;
    }
}
