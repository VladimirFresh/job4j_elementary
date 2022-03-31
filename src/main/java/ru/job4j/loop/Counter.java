package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (sum = 0; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (sum = 0; start <= finish; start ++) {
            if (start % 2 == 0) {
                sum = sum + start;
            }
        }
        return sum;
    }
}
