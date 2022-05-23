package ru.job4j.array;

public class Divider {
    public static boolean check(int num, int[] ints) {
        boolean result = false;
        for (int i : ints) {
            if (num % i == 0) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}