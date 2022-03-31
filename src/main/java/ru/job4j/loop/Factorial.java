package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        int counter = 1;
        for (result = 1; counter <= n; counter++) {
            result = result * counter;
        }
        return result;
    }
}
