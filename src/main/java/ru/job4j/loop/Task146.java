package ru.job4j.loop;

public class Task146 {
    public static void loop(int[] nums) {
        int count = 0;
        int weight = 0;
        boolean check = false;
        for (int num : nums) {
            if (weight + num > 300) {
                check = true;
                break;
            }
            if (count == 4) {
                break;
            }
            weight += num;
            count++;
        }
        String message;
        if (check && count == 4 && count < nums.length) {
            message = "Много людей и перегруз";
        } else if (check) {
            message = "Перегруз";
        } else if (count < nums.length) {
            message = "Много людей";
        } else {
            message = "Нет";
        }
        System.out.printf(
                "Людей: %s, вес: %s, отказ: %s%n",
                count,
                weight,
                message
        );
    }
}
