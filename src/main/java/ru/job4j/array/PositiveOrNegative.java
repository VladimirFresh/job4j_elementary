package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        boolean result = false;
        int number = 0;
        for (int i : data) {
            if (i < 0) {
                number++;
            }
        }
        if (number % 2 == 0) {
            return result;
        } else {
            result = true;
            return result;
        }
    }
}