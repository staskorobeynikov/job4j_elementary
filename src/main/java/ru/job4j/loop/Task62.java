package ru.job4j.loop;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int counter = 0;
        for (int grade : grades) {
            if (grade < 3) {
                counter++;
            }
        }
        String result = counter > amount / 2 ? "Да" : "Нет";
        System.out.println(result);
    }
}
