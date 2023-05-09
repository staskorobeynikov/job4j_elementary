package ru.job4j.loop;

public class Task95 {
    public static void loop(int[] math, int[] info) {
        int mathI = 0;
        int mathF = 0;
        int counter = 0;
        for (int i = 0; i < math.length; i++) {
            if ((math[i] + info[i]) / 2 >= 7) {
                if (math[i] > info[i]) {
                    mathF++;
                } else {
                    mathI++;
                }
                counter++;
            }
        }
        System.out.printf("Зачислено: %s, ФМ: %s, ФИ: %s%n", counter, mathF, mathI);
    }
}