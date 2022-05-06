package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        int size = 0;
        int count = 0;
        int rest = number;
        while (rest > 0) {
         rest = rest / 10;
         size++;
        }
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[count] = number % 10;
            number = number / 10;
            count++;
        }
        return result;
    }
}