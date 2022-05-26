package ru.job4j.array;

import java.util.Arrays;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        int[][] result = new int[array.length][array.length];
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == row && j == column) {
                    break;
                } else if (i < row) {
                    if (j == column) {
                        array[i][j] = array[i + 1][j];
                    }
                } else {
                    array[i][j] = array[i][j + 1];
                    }
                }
            }
        for (int i = array.length - 1; i >= row; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (i == row && j == column) {
                    break;
                } else if (i > row) {
                    if (j == column) {
                        array[i][j] = array[i - 1][j];
                    }
                } else {
                    array[i][j] = array[i][j - 1];
                }
            }
        }
        array[row][column] = 0;

    }
}