package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int len = data.length * data[0].length;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                    len--;
                }
            }
        }
        int index = 0;
        int[] result = new int[len];
        for (int[] row : data) {
            for (int cell : row) {
                if (cell != 0) {
                    result[index] = cell;
                    index++;
                }
            }
        }
        return result;
    }
}