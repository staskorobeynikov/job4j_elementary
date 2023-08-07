package ru.job4j.loop;

public class Task150 {
    public static void loop(int overdraft, int account, int[] transfers) {
        int count = 0;
        for (int transfer : transfers) {
            if (transfer == 0) {
                break;
            }
            if (transfer < 0 && account + transfer < overdraft) {
                break;
            }
            account += transfer;
            count++;
        }
        System.out.printf("Остаток: %s, операций: %s%n", account, count);
    }
}
