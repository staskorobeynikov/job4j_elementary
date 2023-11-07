package ru.job4j.condition;

public class Task54 {
    public static void transform(int number) {
        StringBuilder buffer = new StringBuilder();
        if (number % 2 == 0) {
            for (int num : getNumbers(number)) {
                if (num % 2 == 0) {
                    if (num >= 0) {
                        num++;
                    } else {
                        num--;
                    }
                } else {
                    if (num > 0) {
                        num--;
                    } else {
                        num++;
                    }
                }
                if (num != 0) {
                    buffer.append(num);
                }
            }
        } else {
            for (int num : getNumbers(number)) {
                if (num % 2 == 0) {
                    if (num != 0) {
                        if (num > 0) {
                            num--;
                        } else {
                            num++;
                        }
                    }
                } else {
                    if (num != 9) {
                        if (num > 0) {
                            num++;
                        } else {
                            num--;
                        }
                    }
                }
                buffer.append(num);
            }
        }
        System.out.println(buffer);
    }

    static int[] getNumbers(int number) {
        int[] result = new int[3];
        for (int i = 0; i < result.length; i++) {
            int temp = number % 10;
            if (i == 0 && temp < 0) {
                temp = Math.abs(temp);
            }
            result[result.length - 1 - i] = temp;
            number /= 10;
        }
        return result;
    }
}
