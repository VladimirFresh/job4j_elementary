package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int max = ints[0];
        int result = 0;
        for (int i : ints) {
            if (i > max) {
                max = i;
            }
        }
        int min = ints[0];
        for (int i : ints) {
            if (i < min) {
                min = i;
            }
        }
        result = max - min;
        return result;
    }
}